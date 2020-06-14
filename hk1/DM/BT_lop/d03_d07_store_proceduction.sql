--open db
use db1908_QLSV
go
--xem danh sach cac bang trong db1908_QLSV
exec sp_tables
go

--kiem tra xem tap tin data.txt co trong thu muc goc cua o dia c?
exec xp_fileexist 'c:\data.txt'
go
-- demo user-defined stored procedure / custom stored procedure

-- vidu1:  tao store liet ke va dem so sinh vien nam
create proc usp_NamSinh as
begin
  --linh 1: liet ke danh sach nam sinh
  select * from tbSinhVien where GioiTinh=1
  --linh 2: dem so sinh vien nam
  select count(*) [so sinh vien nam] from tbSinhVien where GioiTinh=1
end
go
--chay store usp_NamSinh(kiem thu store)
exec usp_NamSinh
go

-- vidu2:  tao store liet ke va dem so sinh vien nu
create proc usp_NuSinh as
begin
  --linh 1: liet ke danh sach nu sinh
  select * from tbSinhVien where GioiTinh=0 
  --linh 2: dem so sinh vien nu
  select count(*) [so sinh vien nu] from tbSinhVien where GioiTinh=0
end
go
--chay store usp_NamSinh(kiem thu store)
exec usp_NuSinh
go

-- vidu 3: tao store liet ke va dem so sinh vien - theo gioi tinh duoc yeu cau ( duoc truyen cho store duoi hinh thuc input parameter). 
create proc usp_SinhVien 
@gt int = 1   -- tham so cua store, default la 1
as
begin
--linh 1: liet ke danh sach sinh vien theo gioi tinh
  select * from tbSinhVien where GioiTinh=@gt
  --linh 2: dem so sinh vien theo gioi tinh
  select count(*)[so sinh vien] from tbSinhVien where GioiTinh=@gt
end
go
-- thu nghiem viec thi hanh store voi 3 case sau:
-- case 1. co tham so la 1 : liet ke ds sinh vien nam
exec usp_SinhVien 1
go
-- case 2. co tham so la 0 : liet ke ds sinh vien nu
exec usp_SinhVien 0
go
-- case 3. ko co tham so : liet ke ds sinh vien nam - do nhan gia tri default
exec usp_SinhVien
go

-- vidu 3: tao 1 store xem kq va giam diem thi cua 1 mon hoc bat ky(tham so input),sau do cho biet co bao nhieu ket qua bi thay doi(tham so output)
create proc uspGiamDiem
@maMH varchar(10),       --tham so input
@soKQThayDoi int Output --tham so output
as begin
--linh1:xem kq cua 1 mon hoc bat ky:
select*from tbDiemKQ where MaMH like @maMH;
--linh2:giam 2 diem kq voi cac bai thi thuoc mon hoc bat ky:
update tbDiemKQ set Diem=Diem-2 
       where MaMH like @maMH and (Diem between 50 and 60);
--linh3:dem so bai thi bi giam diem
select @soKQThayDoi=@@ROWCOUNT
--linh1:xem kq cua 1 mon hoc bat ky:
select*from tbDiemKQ where MaMH like @maMH;
end
go
--chay kiem thu store uspGiamDiem voi mon c
declare @SoBT int
exec uspGiamDiem 'C',@SoBT output
print'so bai thi bi giam diem:'+convert(varchar(5),@soBT)--in ra thong bao ben messenger
select @SoBT as 'so bai thi bi giam diem'
go

--xem lai noi dung viet trong store usp_SinhVien
exec sp_helptext'usp_SinhVien'
go
exec sp_helptext'usp_NamSinh'
go
--modify lai dinh nghia cua usp_NamSinh
alter proc usp_NamSinh with encryption--ko cho xem code dinh nghia  
as begin
  --linh 1: liet ke danh sach nam sinh
  select * from tbSinhVien where GioiTinh=1
  --linh 2: dem so sinh vien nam
  select count(*) [so sinh vien nam] from tbSinhVien where GioiTinh=1
end
go
-- thu nghiem store usp_NamSinh :kq ra binh thg thoi
exec usp_NamSinh
go
--nhung ko xem dc phan code dinh nghia store!!!
exec sp_helptext'usp_NamSinh'
go
-- bo store ussp_nusinh ra database
drop proc usp_NuSinh
go
--xem cac du lieu bang he thong
select name ,OBJECT_ID,type,type_desc
from sys.tables
go
--xem du lieu bang+view ,kieu data
SELECT TABLE_CATALOG, TABLE_SCHEMA, TABLE_NAME, TABLE_TYPE
FROM INFORMATION_SCHEMA.TABLES;
go
--phien ban bay to :64-bit
SELECT SERVERPROPERTY('EDITION') AS EditionName;
go
