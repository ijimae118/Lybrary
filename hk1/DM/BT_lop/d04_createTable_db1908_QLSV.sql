/*
 Tao 1 CSDL chua thong tin quan ly co so du lieu quan he sinh vien, bao gom cac quan he (thuc the) sau:
 - khoa hoc : ma khoa hoc (pk) string10, hoc phi sint[100-10000], dien giai string250
 - lop hoc : ma lop (pk) string10, khoa hoc (FK - khoahoc.ma khoa hoc)
 - sinh vien : ten string30, ngay sinh date[tuoi>14], email string50, lop (FK - lophoc.ma lop), ma so sv(pk), gioi tinh bit[default 1]
 - mon hoc: ten mon hoc string30, tong so gio hoc tinyint [4,50], hoc phi sint[10-300], ma mon hoc string10 (pk)
 - giang vien: ma so gv  string10(pk), ten string30, email string30

 - bang diem: ma sv (FK), ma mon hoc (FK), diem ket qua tinyint[0,100] (pk: so thu tu tang tu dong) 
 - mon hoc - giang vien: ma mon hoc (FK), ma giang vien(FK) (pk : ma mon hoc + ma gv)

 */

 --1. Tao CSDL :
 create database db1908_QLSV
 go

 -- open database
 use db1908_QLSV
 go

 --2. Tao bang khoa hoc : ma khoa hoc (pk) string10, hoc phi sint[100-10000], dien giai string250
 create table tbKhoaHoc
 (
	MaKhoaHoc varchar(10) not null primary key,
	HocPhi smallint check(HocPhi >=100 and HocPhi<=10000),
	[Dien Giai] nvarchar(250) 
 )
 go

 --3. tao bang lop hoc : ma lop (pk) string10, khoa hoc (FK - khoahoc.ma khoa hoc)
 create table tbLopHoc
 (
	MaLop varchar(10) primary key,
	KhoaHoc varchar(10) not null foreign key references tbKhoaHoc(MaKhoaHoc)
 )
 go

 --4. tao bang sinh vien : ten string30, ngay sinh date[tuoi>14], email string50, lop (FK - lophoc.ma lop), ma so sv(pk), gioi tinh bit[default 1]
 create table tbSinhVien(
	MaSV varchar(10) not null,
	NgaySinh date null ,
	email varchar(50),
	GioiTinh bit not null default 1,
	MaLopHoc varchar(10)
	constraint [PK_SinhVien] primary key (MaSV)
 )
 go

 --4a. Them cot ten sv vo bang tbSinhVien
alter table tbSinhVien
	add TenSV varchar(30) not null
go

--4b. Them khoa ngoai cho bang tbSinhVien
alter table tbSinhVien
    add constraint [FK_Lop] foreign key(MaLopHoc) references tbLopHoc(MaLop)
go

--4c. Them rang buoc kiem tra tuoi phai >13
alter table tbSinhVien
    add constraint [CK_Tuoi] check(DateDiff(yy, NgaySinh, getdate())>13)
go


--5. tao bang mon hoc: ten mon hoc string30, tong so gio hoc tinyint [4,50], hoc phi sint[10-300], ma mon hoc string10 (pk)
create table tbMonHoc
(
	MaMonHoc varchar(10) not null primary key,
	TenMonHoc varchar(30) not null,
	TongGioHoc tinyint not null check( TongGioHoc between 4 and 50),
	                          --check( TongGioHoc>=4 and and TongGioHoc<=50)
	HocPhiMon smallint not null check ( HocPhiMon>=10 and HocPhiMon<=300)
)
go


--6. tao bang giang vien: ma so gv  string10(pk), ten string30, email string30
create table tbGiangVien
(
	MaGV varchar(10) primary key,
	TenGV varchar(30) not null,
	eMail varchar(50) 
)
go

--7. Tao bang bang diem: ma sv (FK), ma mon hoc (FK), diem ket qua tinyint[0,100] (pk: so thu tu tang tu dong) 
create table tbDiemKQ
(
	SoTT int identity(100,1) primary key,
	MaSV varchar(10) foreign key references tbSinhVien,
	MaMH varchar(10) foreign key references tbMonHoc,
	Diem tinyint check(Diem between 0 and 100)
)
go

--8. Tao bang mon hoc - giang vien: ma mon hoc (FK), ma giang vien(FK) (pk : ma mon hoc + ma gv)
create table tbMonHocGV
(
	MonHoc varchar(10) not null foreign key references tbMonHoc, 
	GiangVien varchar(10) not null foreign key references tbGiangVien
	constraint [PK_MHGV] primary key (MonHoc, GiangVien)
)
go


--9. Nhap du lieu cho bang Khoa hoc
/*
create table tbKhoaHoc
 (
	MaKhoaHoc varchar(10) not null primary key,
	HocPhi smallint check(HocPhi >=100 and HocPhi<=10000),
	[Dien Giai] nvarchar(250) 
 )
*/
insert tbKhoaHoc(MaKhoaHoc,HocPhi,[Dien Giai]) values('ACCP 2000', 800, N'Chuong Trinh ACCP nam 2000')
go

insert tbKhoaHoc(MaKhoaHoc,[Dien Giai]) values('ACCP 2001',  N'Chuong Trinh ACCP nam 2002')
go

insert tbKhoaHoc(MaKhoaHoc,HocPhi) values('ACCP 2010', 300)
go

insert tbKhoaHoc values('6715', 1400, N'Chuong Trinh ACCP moi 2019')
go

select * from tbKhoaHoc
go

-- sua lai hoc phi cua khoa ACCP 2001 thanh 500
update tbKhoaHoc set HocPhi = 500 where MaKhoaHoc = 'ACCP 2001'
go

select * from tbKhoaHoc
go

-- bo chuong trinh hoc ACCP 2010
delete from tbKhoaHoc where MaKhoaHoc = 'ACCP 2010'
go

select * from tbKhoaHoc
go


--10. Them du lieu cho bang lop hoc
/*
create table tbLopHoc
 (
	MaLop varchar(10) primary key,
	KhoaHoc varchar(10) not null foreign key references tbKhoaHoc(MaKhoaHoc)
 )
 go
*/
insert tbLopHoc values
('1908-M0', 'ACCP 2000'),
('1908-M1', 'ACCP 2000'),
('1909-M0', '6715'),
('1910-M0', '6715'),
('1910-M1', '6715')
go
select * from tbLopHoc
go

--11. nhap du lieu cho bang sinh vien
 insert tbSinhVien values
 ('s1','20001231','lam@gmail.com',1,'1910-M1','Quach Gia Lam')
 go

 select * from tbSinhVien
 go

 -- truong hop loi neu nhap tuoi duoi 14 : ko insert duoc
 insert tbSinhVien values
 ('s2','20101231','phat@gmail.com',1,'1910-M1','Huynh Phat')
 go

 insert tbSinhVien values
 ('s2','20011004','phat@gmail.com',1,'1910-M1','Huynh Phat')
 go

 select * from tbSinhVien
 go

 insert tbSinhVien values
 ('s3','19981004','sang@gmail.com',0,'1910-M1','Thanh Sang'),
 ('s4','20011104','huy@gmail.com',1,'1910-M1','Xuan Huy'),
 ('s5','20010404','y@gmail.com',0,'1910-M1','Thien Y'),
 ('s6','20011204','minh@gmail.com',1,'1910-M1','Le Minh'),
 ('s7','20001204','thuan@gmail.com',1,'1910-M1','Huynh Thuan'),
 ('s8','20000804','thang@gmail.com',1,'1910-M0','Nguyen Thang'),
 ('s9','20001204','thach@gmail.com',1,'1910-M0','Nguyen Thachh'),
 ('s10','20001204','chuan@gmail.com',0,'1910-M0','Minh Chuan'),
 ('s11','20001002','phong@gmail.com',0,'1910-M0','Thanh Phong'),
 ('s12','20001204','long@gmail.com',1,'1910-M0','Van Long'),
 ('s13','20011204','chinh@gmail.com',1,'1910-M0','Duc Chinh'),
 ('s14','20011104','hai@gmail.com',1,'1910-M1','Hoang Hai'),
 ('s15','19971204','tuan@gmail.com',1,'1910-M0','Quoc Tuan')
 go
 select * from tbSinhVien


 -- 12. Them so lieu cho bang mon hoc
 select * from tbMonHoc
 go

 insert tbMonHoc values
 ('C', 'Lap Trinh C', 50, 200),
 ('HTML', 'Lap Trinh Web', 50, 200),
 ('BSJ', 'Lap Trinh Web - BS va JQUERY', 20, 120),
 ('ePRO1', 'Project HK 1', 40, 300),
 ('CSDL', 'Phan tich thiet ke CSDL', 30, 150),
 ('SQL2012', 'SQL server 2012', 50, 300)
 go

 select * from tbMonHoc
 go