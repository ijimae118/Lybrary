-- open db 
use db1908_QLSV
go

-- xem danh sach cac bang trong db1908_QLSV
exec sp_tables
go

-- kiem tra xem tap tin data.txt co trong thu muc goc cua o dia C ?
exec xp_fileexist 'c:\data.txt'
go

exec xp_fileexist 'E:\aptech\presentation\6715\sem1\6. DM\SQL Server 2012\d06_View_Stored, Index\pretest.pdf'
go

exec xp_fileexist 'E:\aptech\presentation\6715\sem1\6. DM\SQL Server 2012\d06_View_Stored, Index'
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

-- chay store usp_NamSinh (kiem thu store)
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

-- chay store usp_NuSinh (kiem thu store)
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
  select count(*) [so sinh vien] from tbSinhVien where GioiTinh=@gt
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


-- vidu 3: tao 1 store xem ket qua va giam diem thi (2 diem voi nhung bai thi co so diem tu 50-60) cua 1 mon hoc bat ky (tham so input), sau do cho biet co bao nhieu ket qua bi thay doi (tham so output)
create proc uspGiamDiem 
   @maMH varchar(10),		 -- tham so input
   @soKQThayDoi int OUTPUT   -- tham so output
as begin
   --linh 1: xem ket qua thi cua 1 mon hoc bat ky:
   select * from tbDiemKQ where MaMH like @maMH;

   --linh 2: giam 2 diem ket qua voi cac bai thi thuoc mon hoc bat ky:
   update tbDiemKQ set Diem = Diem - 2 
          where MaMH like @maMH and (Diem between 50 and 60);

   --linh 3: dem so bai thi bi giam diem
   select @soKQThayDoi = @@ROWCOUNT

   --linh 4: xem ket qua thi cua 1 mon hoc bat ky sau khi da giam diem :
   select * from tbDiemKQ where MaMH like @maMH;
end
go

-- chay kiem thu store uspGiamDiem voi mon C
declare @SoBT int
exec uspGiamDiem 'C', @SoBT output
print 'So bai thi bi giam diem : ' + convert(varchar(5), @soBT)
select @SoBT as 'So bai thi bi giam diem'
go 

-- xem lai noi dung viet trong store usp_SinhVien
exec sp_helptext 'usp_SinhVien'
go


-- xem noi dung duoc lap trinh cho store usp_NamSinh
exec sp_helptext 'usp_NamSinh'
go

-- modify lai dinh nghia cua usp_NamSinh - don gian la ma hoa code noi dung
alter proc usp_NamSinh with encryption--ngan chan ko cho xem phan code dinh nghia
as begin
  --linh 1: liet ke danh sach nam sinh
  select * from tbSinhVien where GioiTinh=1
  --linh 2: dem so sinh vien nam
  select count(*) [so sinh vien nam] from tbSinhVien where GioiTinh=1
end
go

-- thu nghiem store usp_NamSinh : ket qua ra binh thuong thoi
exec usp_NamSinh
go
-- nhung ko xem duoc phan code dinh nghia store !!!
exec sp_helptext 'usp_Namsinh'
go


-- bo (xoa) store usp_nusinh ra khoi database
drop proc usp_NuSinh
go


SELECT name, object_id, type, type_desc
  FROM sys.tables;
  go

  SELECT TABLE_CATALOG, TABLE_SCHEMA, TABLE_NAME, TABLE_TYPE
FROM INFORMATION_SCHEMA.TABLES;
go

SELECT SERVERPROPERTY('EDITION') AS EditionName;
go
