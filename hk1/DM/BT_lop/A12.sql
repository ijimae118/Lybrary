/*  assignment 12  */

/*
    1. Tạo CSDL “Kinhdoanh” - co Thuy
*/
create database dbKinhDoanh
go
use dbKinhDoanh
go 

/* Cau 2: Lam
	Tạo các bảng sau:
	a. DMNSX (MANSX varchar(2) PK, TENNSX nvarchar(40), THANHPHO nvarchar(40),
	PHONE int unique)
	b. HANGHOA (MAHH varchar(4) PK, TENHH nvarchar(40), MANSX varchar(2) FK, SL
	int default 10, DONGIA int )
	DONGIA > 100
	c. Add thêm vào DMNSX 1 field có tên là EMAIL varchar(30).
	d. Add thêm vào HANGHOA 1 field có tên là NGAYNH datetime.
	NGAYNH <= ngày hiện tại

*/
create table DMNSX(
MANSX varchar(2) primary key nonclustered,
TENNSX nvarchar(40),
THANHPHO nvarchar(40),
PHONE int unique 
)
go
create table HANGHOA(
MAHH VARCHAR (4) PRIMARY KEY nonclustered ,
TENHH NVARCHAR(40),
MANSX VARCHAR(2) FOREIGN KEY REFERENCES DMNSX,
SL int default 10,
DONGIA int check(DONGIA>100)
)

alter table DMNSX 
add EMAIL VARCHAR(30)

alter table HANGHOA 
add NGAYNH DATE check(NGAYNH<=GETDATE())
go


/*cau 3 : Chèn các mẫu tin sau vào các bảng: - Huy */
insert DMNSX values
('NK','Nokia','SaiGon','0993111111','nokia@yaho.com'),
('SS','SamSung','CanTho','0993111112','samsung@yaho.com'),
('MT','Motorola','Hanoi','0993111113','motorola@yaho.com'),
('LG','LG','SaiGon','0993111114','lg@yaho.com'),
('SM','Seimens','SaiGon','0993111115','Sm@yaho.com')
go

insert HANGHOA values
('NK01','nokia 6630','NK','20','1000','20161220'),
('SS01','samsung 1170','SS','50','800','20160101'),
('MT01','motorola 7732','MT','35','4000','20160105'),
('NK02','nokia 7700','NK','60','1200','20170110'),
('LG02','LG 2009','LG','40','2000','20171223'),
('SS02','samsung 7800','SS','30','3000','20160111'),
('SS03','samsung 9000','SS','15','4500','20161120'),
('NK03','nokia 2009','NK','40','5500','20160113'),
('SM01','seimens 7766','SM','50','1300','20170102'),
('SM03','seimens 776','SM','35','5500','20180107')
go


/*cau 4: tao noncluster index  - PHAT */
create index ixTENNSX
	on DMNSX(TENNSX)


/* cau 5: tao clustered index : trong 1 bang chi co duy nhat 1 cluster index - PHAT */
create clustered index ixTENHH
	on HANGHOA (TENHH desc)
go


/* cau 7 : tao view - PHAT - Tạo view vwNSX liệt kê tất cả các NSX không ở thành phố “Sài Gòn” */
create view vwNSX
as select *
from DMNSX
where THANHPHO != 'saigon'
go

-- test view
select * from vwNSX
go


/* cau 8: tao store - THANG */
create proc uspDONGIA
@TangGia int=100
as
begin
	--a. In danh sách các sản phẩm
	select * from HANGHOA

	--b. Tăng đồng loạt đơn giá của các sản phẩm có đơn giá dưới 2,000 lên thêm x đồng (với x là tham số của store – mặc định là 100)
	update HANGHOA set DONGIA=DONGIA+@TangGia where DONGIA<2000

	--c. In ra số sản phẩm đã được tăng giá
	select @@ROWCOUNT as [so SP da Tang Gia]

	--d. In lại danh sách các sản phẩm sau khi tang giá
	select * from HANGHOA 
end

exec uspDONGIA		-- tang gia cac san pham voi muc mac dinh 100

exec uspDONGIA 500	-- tang gia cac san pham voi so tien duoc cung cap la 500
go

/*cau 9: THUAN - tao trigger - Viết trigger tgTENNSX cấm đổi tên nhà sản xuất */
create trigger tgTENNSX
on DMNSX
for update
as begin
	if update(TENNSX)
	begin
		print 'Khong the doi ten nha san xuat. Tu choi thao tac!'
		rollback transaction
	end
end
go

-- test trigger
-- doi ten nha sx -> bao loi
select * from DMNSX
go
update DMNSX set TENNSX = 'gols star' where MANSX='LG'
go

/*CAU 10: Viết trigger tgTENHH, không cho phép tên hàng hóa ít hơn 3 ký tự. */
create trigger tgTenHH on HANGHOA
for insert, update
as begin
	declare @tensanpham nvarchar(40)
	--lay ten san pham moi duoc them hoac thay doi
	select @tensanpham = Trim(TENHH) from inserted
	--kiem tra
	if ( LEN(@tensanpham) <3 )
	begin
		print 'Ten san pham phai nhieu hon 2 ky tu. Tu choi thao tac ! '
		rollback
	end
end
go


-- test trigger :

-- truong hop dung :
select * from HANGHOA
go
update HANGHOA set TENHH = 'LG 2009 - hang out ! ' where MAHH = 'LG02'
go
select * from HANGHOA
go


-- truong hop sai: 
select * from HANGHOA
go
update HANGHOA set TENHH = 'LG' where MAHH = 'LG02'
go
select * from HANGHOA
go


-- tuong tu cho truong hop insert
-- truong hop sai :
insert HANGHOA values ('LG10','AB','LG',10, 200,'20200314')
go
-- truong hop dung:
insert HANGHOA values ('LG10','Phone AB','LG',10, 200,'20200314')
go
select * from HANGHOA
go

--Neu co gi ko ro trong bai tap hay bai hoc - cac ban goi cau hoi len Group FB nhe
--tao trigger de huy cac lan insert chi co 2 ky tu
create trigger tgTenHH2 on HANGHOA
for insert, update
as begin
    declare @dem int ;
	select @dem= count(*) from inserted --tinh so lan insert vao tenhh co ky tu <3 
		where len(trim(tenhh))<3
	if (@dem >0) -- if so lan dem lon hon 0 
		rollback -- huy cau lenh
end
go

