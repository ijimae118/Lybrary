--open database
use db1908_QLSV
go
--xem ds cac bang trong CSDL db1908_QLSV
exec sp_tables
go
--xem ds cac bang do nguoi dung tao ra co trong CSDL db1908_QLSV
select *from INFORMATION_SCHEMA.TABLES
go
--tao 1 store thong ke so lg sv nam,nu -dat ten store usp_TKSV
create proc usp_TKNN
as begin
--khai bao 2 bien chua so luong sv nam va sv nu
declare @nam int,@nu int;
--dem so luong sv nam ,luu vao bien @nam
select @nam=count(*)from tbSinhVien where GioiTinh=1
--dem so lg sv nu,luu vao bien @nu
select @nu=count(*)from tbSinhVien where GioiTinh=0
--in ra so lg sv nam ,nu
select @nu[so nu sinh],@nam[so nam sinh]
--in ket luan nhom sv nao nhieu hon
  if(@nam>@nu)
     print'so nam sinh nhieu hon nu sinh'
  else if(@nam<@nu)
     print'so nam sinh it hon nu sinh'
  else
     print'so nam sinh va nu sinh bang nhau'
end
go

--thi hanh store
exec usp_TKNN
go
--VD:viet 1 ham tinh giai thua cua 1 so nguyen N
create function dbo.ufn_GiaiThua(@n int)
returns bigint
as
begin
    declare @kq bigint=1;
	declare @i int=1;
	while(@i<=@n)
	Begin
	 set @kq*=@i;
	 set @i+=1;
    End
  Return @kq;
end
/*
drop function  ufn_GiaiThua
go
*/
--goi ham dbo.ufn_GiaiThua,de tinh giai thu cua so 5
select dbo.ufn_GiaiThua(5)
go
/* vd ve window function */
--xem kq thi
select *from tbDiemKQ
go
--sap xep kq thi tu cao den thap
select * from tbDiemKQ order by 4
-- sap xep kq thi tu cao den thap va them cot xep hang
select sott,masv,mamh,diem,
	rank() over(order by diem desc)[xep hang]
	from tbDiemKQ
go
select sott,masv,mamh,diem,
	rank() over(partition by mamh order by diem desc)[xep hang]
	from tbDiemKQ
go

select sott,masv,mamh,diem,
	dense_rank() over(order by diem desc)[xep hang]
	from tbDiemKQ
go
select sott,masv,mamh,diem,
	dense_rank() over(partition by mamh order by diem desc)[xep hang]
	from tbDiemKQ
go
