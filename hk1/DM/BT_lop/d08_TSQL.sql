--open database 
use db1908_QLSV
go

--xem ds cac bang co trong CSDL db1908_QLSV
exec sp_tables
go

--xem ds cac bang do nguoi dung tao ra co trong CSDL db1908_QLSV
select * from INFORMATION_SCHEMA.TABLES
go

--tao 1 store thong ke so luong sinh vien nam, nu - dat ten store usp_TKNN
create proc usp_TKNN
as begin
	-- khai bao 2 bien chua so luong sv nam va sv nu
	declare @nam int;
	declare  @nu int;

	-- dem so luong sv nam, luu vao bien @nam
	select @nam = count(*) from tbSinhVien where GioiTinh=1

	-- dem so luong sinh vien nu, luu vo bien @nu
	select @nu=count(*) from tbSinhVien where GioiTinh=0

	-- in ra so luong sv nu va nam
	select @nu as [so nu sinh], @nam as [so nam sinh]
	
	-- in ket luan nhom sinh vien nao nhieu hon
	if (@nam > @nu)
		print 'So nam sinh nhieu hon nu sinh'
	else if (@nam < @nu)
		print 'so nam sinh it hon nu sinh'
    else
		print 'so nam sinh va nu sinh bang nhau'
end
go


-- thi hanh store
exec usp_TKNN
go

-- viet 1 ham tinh giai thua cua 1 so nguyen N
create function dbo.ufn_Giaithua(@n int)
returns bigint
as
begin
	declare @kq bigint = 1;
	declare @i int = 1;
	while(@i<=@n)
	begin
		set @kq = @kq * @i;
		set @i +=1;
	end
	RETURN  @kq;
end
go

-- goi ham dbo.ufn_Giaithua, de tinh giai thua cua so 5
select dbo.ufn_giaithua(5) 

go

/* vi du ve window function */
-- xem ket qua thi
select * from tbDiemKQ
go

-- sap xep kq thi tu cao den thap
select * from tbDiemKQ order by Diem desc

-- sap xep kq thi tu cao den thap va them cot xep hang
select sott, masv, mamh, diem,
	rank() over (order by diem desc ) [xep hang] 
	from tbDiemKQ
go

select sott, masv, mamh, diem,
	rank() over (partition by mamh order by diem desc ) [xep hang] 
	from tbDiemKQ
go

select sott, masv, mamh, diem,
	dense_rank() over (order by diem desc ) [xep hang] 
	from tbDiemKQ
go