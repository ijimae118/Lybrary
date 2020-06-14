-- open database
use db1908_QLSV
go

-- xem ds cac bang trong database db1908_qlsv
select * from sys.tables
go

select name, OBJECT_ID from sys.tables
go

-- xem ds sinh vien
select * from tbSinhVien
go

-- tao index tren cot tensv cua bang tbsinhvien
create index ixTenSV on tbSinhVien(TenSV)
go

---- tao index tren cot ma lop hoc -theo thu tu giam dan-cua bang tbsinhvien
create index ixMaLop on tbSinhVien(MaLopHoc Desc)
go

-- tao ra 1 bang moi luu tru thong tin nhan vien
create table tbNhanVien
(
	maNhanVien int identity(200,10) primary key nonclustered,
	tenNhanVien nvarchar(50) not null,
	salary int not null default 100,
	[status] bit not null default 1 
)
go

-- va chung ta tao ra 1 clustered index tren cot ten nhan vien
create clustered index ixTenNhanVien on tbNhanVien(tenNhanVien)
go

-- vi du sau se bao loi !!!
create clustered index ixMaNhanVien on tbNhanVien(maNhanVien)
go