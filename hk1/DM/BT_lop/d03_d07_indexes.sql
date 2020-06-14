--open database
use db1908_QLSV
go

--xem ds cac bang trong database db1908_QLSV
select *from sys.tables
go

select name ,object_id from sys.tables
go

--xem ds sv
select*from tbSinhVien
go

--tao index tren cot tensv cua bang tbSinhVien
create index ixTenSV on tbSinhVien(TenSV)
go
--tao index tren cot malophoc cua bang tbSinhVien
create index ixMaLop on tbSinhVien(MaLopHoc desc)
go

-- tao ra 1 bang moi luu tru thong tin cua nhan vien (inique ,nonclustered)
create table tbNhanVien
(
maNhanVien int identity(200,10) primary key nonclustered,
tenNhanVien nvarchar(50) not null,
salary int not null default 100,
[status] bit not null default 1 --dang lam viec
)
go
-- va chung ta tao ra 1 clustered index tren cot ten nhan vien
create clustered index ixTenNhanVien on tbNhanVien(tenNhanVien)
go
-- vi du sau se bao loi!!! vì chi duy nhat 1 lustered va nhieu noncluster
create clustered index ixMaNhanVien on tbNhanVien(maNhanVien)
go