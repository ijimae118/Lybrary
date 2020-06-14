/* Tao 1 CSDL chua thong tin quan ly co so du lieu quan he sinh vien, bao gom cac quan he (thuc the) sau: - khoa hoc : ma khoa hoc (pk:not null) string10, hoc phi sint[100-10000] null, dien giai string250 - lop hoc : ma lop (pk) string10, khoa hoc (FK - khoahoc.ma khoa hoc) - sinh vien : ten string30, ngay sinh date[tuoi>14], email string50, lop (FK - lophoc.ma lop), ma so sv(pk), gioi tinh bit[default 1] - mon hoc: ten mon hoc string30, tong so gio hoc tinyint [4,50], hoc phi sint[10-300], ma mon hoc string10 (pk) - giang vien: ma so gv  string10(pk), ten string30, email string30 - bang diem: ma sv (FK), ma mon hoc (FK), diem ket qua tinyint[0,100] (pk: so thu tu tang tu dong)  - mon hoc - giang vien: ma mon hoc (FK), ma giang vien(FK) (pk : ma mon hoc + ma gv) */
 --1.Tao CSDL:
 create database db1908_QLSV
 go
 use db1908_QLSV
 go
 --2.Tao bang khoa hoc : ma khoa hoc (pk) string10, hoc phi sint[100-10000], dien giai string250
 create table tbKhoaHoc
 ( 
 MaKhoaHoc varchar(10) primary key,
 HocPhi smallint check(HocPhi>=100 and HocPhi<=10000),
 [Dien Giai] varchar(250)
 )
 go
 --3.tao bang lop hoc : ma lop (pk) string10, khoa hoc (FK - khoahoc.ma khoa hoc)
 create table tbLopHoc
 (
  MaLop varchar (10) primary key,
  KhoaHoc varchar(10) not null foreign key references tbKhoaHoc(MaKhoaHoc)
 )
 go
 --4.tao bang sinh vien : ten string30, ngay sinh date[tuoi>=14], email string50, lop (FK - lophoc.ma lop), ma so sv(pk), gioi tinh bit[default 1]
 create table tbSinhVien(
 MaSV varchar(10) not null,
 NgaySinh date null,
 email varchar(50),
 GioiTinh bit not null default 1,
 MaLopHoc varchar(10)
 constraint [PK_SinhVien] primary key (MaSV)
 )
 go
  --4a. Them cot ten sv vo bang tbSinhVienalter table tbSinhVien	add TenSV varchar(30) not nullgo--4b. Them khoa ngoai cho bang tbSinhVienalter table tbSinhVien    add constraint [FK_Lop] foreign key(MaLopHoc) references tbLopHoc(MaLop)go--4c. Them rang buoc kiem tra tuoi phai >13alter table tbSinhVien    add constraint [CK_Tuoi] check(DateDiff(yy, NgaySinh, getdate())>13)
go
--5. tao bang mon hoc: tên môn học string30, học phí sint[10-300], số giờ tinyint[4>50], mã môn học (pk), học phí
CREATE TABLE tbMonHoc(
	MaMonHoc VARCHAR(10) primary key,
	TenMonHoc VARCHAR(30) NOT NULL,
	TongGioHoc tinyint not null check(TongGioHoc between 4 and 50),
	HocPhiMon smallint NOT NULL CHECK(HocPhiMon >=10 and HocPhiMon<=300),

)
GO
--6. tao bang giang vien: mã số (pk), tên string30, email string30, sdt
CREATE TABLE tbGiangVien(
	MaGV VARCHAR(10) PRIMARY KEY,
	TenGV VARCHAR(30) NOT NULL,
	eMail VARCHAR(50)
)
GO
--7.Tao bang diem :ma sv (FK), ma mon hoc(FK),diem ket qua tinint
create table tbDiemKQ(	SoTT int identity(100,1) primary key,	MaSV varchar(10) foreign key references tbSinhVien,	MaMH varchar(10) foreign key references tbMonHoc,	Diem tinyint check(Diem between 0 and 100))
go
--8.Tao bang mon hoc- giang vien: ma mon hoc (FK),ma giang vien
create table tbMonHocGV
(
 MonHoc varchar(10) not null foreign key references tbMonHoc,
 GiangVien varchar(10) not null foreign key references tbGiangVien
 constraint [PK_MHGV] primary key (MonHoc,GiangVien)
)
go
--9. Nhap du lieu cho bang Khoa hoc/*create table tbKhoaHoc (	MaKhoaHoc varchar(10) not null primary key,	HocPhi smallint check(HocPhi >=100 and HocPhi<=10000),	[Dien Giai] nvarchar(250)  )*/insert tbKhoaHoc(MaKhoaHoc,HocPhi,[Dien Giai]) values('ACCP 2000', 800, N'Chuong Trinh ACCP nam 2000')goinsert tbKhoaHoc(MaKhoaHoc,[Dien Giai]) values('ACCP 2001',  N'Chuong Trinh ACCP nam 2002')goinsert tbKhoaHoc(MaKhoaHoc,HocPhi) values('ACCP 2010', 300)goinsert tbKhoaHoc values('6715', 1400, N'Chuong Trinh ACCP moi 2019')goselect * from tbKhoaHocgo-- sua lai hoc phi cua khoa ACCP 2001 thanh 500update tbKhoaHoc set HocPhi = 500 where MaKhoaHoc = 'ACCP 2001'goselect * from tbKhoaHocgo-- bo chuong trinh hoc ACCP 2010delete from tbKhoaHoc where MaKhoaHoc = 'ACCP 2010'goselect * from tbKhoaHocgo

--10. Them du lieu cho bang lop hoc/*create table tbLopHoc (	MaLop varchar(10) primary key,	KhoaHoc varchar(10) not null foreign key references tbKhoaHoc(MaKhoaHoc) ) go*/insert tbLopHoc values('1908-M0', 'ACCP 2000'),('1908-M1', 'ACCP 2000'),('1909-M0', '6715'),('1910-M0', '6715'),('1910-M1', '6715')go

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
 go

--11.them so lieu cho bang mon hoc
select *from tbMonHoc
go
insert tbMonHoc values
 ('C', 'Lap Trinh C', 50, 200),
 ('HTML', 'Lap Trinh Web', 50, 200),
 ('BSJ', 'Lap Trinh Web - BS va JQUERY', 20, 120),
 ('ePRO1', 'Project HK 1', 40, 300),
 ('CSDL', 'Phan tich thiet ke CSDL', 30, 150),
 ('SQL2012', 'SQL server 2012', 50, 300)
go

insert tbDiemKQ values
('s1','C',40),
('s1','BSJ',60),
('s2','C',90),
('s2','BSJ',60),
('s2','HTML',90),
('s2','ePRO1',70),
('s4','C',50),
('s4','BSJ',80),
('s4','HTML',30),
('s4','ePRO1',90),
('s5','C',100),
('s5','BSJ',60),
('s5','ePRO1',80),
('s6','C',33),
('s6','BSJ',25),
('s6','HTML',100),
('s6','ePRO1',75),
('s7','C',20),
('s7','BSJ',40),
('s7','ePRO1',70),
('s8','C',100),
('s8','BSJ',80),
('s8','HTML',100),
('s8','ePRO1',85),
('s9','C',70),
('s9','BSJ',80),
('s9','HTML',75),
('s9','ePRO1',85),
('s12','BSJ',30),
('s13','HTML',25),
('s14','C',30),
('s14','ePRO1',100)
go
select *from tbDiemKQ
go

insert tbGiangVien values
('F1', 'Dao Ngoc Anh','anhdn@fe.edu.vn'),
('F2', 'Le Gia Minh','minhlm@gmail.com'),
('F3', 'Dang Tran Tho','thodt@hotmail.com'),
('F4', 'Nguyen Van Binh','binhnv@yahoo.com')
go
select * from tbGiangVien
go
insert tbMonHocGV values
('C','F1'),
('C','F2'),
('C','F3'),
('C','F4'),
('BSJ','F1'),
('BSJ','F4'),
('CSDL','F2'),
('CSDL','F3'),
('HTML','F1'),
('ePRO1','F1'),
('ePRO1','F4')
go
select * from tbMonHocGV
go
--vi du ve select
--khai bao bien sinh vien ,kieu varchar ,co gia tri Quach Gia Lam
--o giua :substring
declare @sinhvien varchar(50) = 'Quach Gia Lam'
select LEFT(@sinhvien,5) as [ho], RIGHT(@sinhvien,3) as [ten]
select SUBSTRING(@sinhvien,7,3) as [ten lot]
go

-- xem bang tbSinhVien
select*from tbSinhVien
go
--xem ds sv bao gom:maso,ten,dc email
select MaSV,TenSV,email from tbSinhVien
GO
--xem ds ten sv va email
select TenSV+':'+email as [Ten SV:Email]
from tbSinhVien
go
-- xem ds sv bao gom :ma so ,ten ,dc email-doi ten cot trong ket qua truy van
select MaSV as[Ma so SV], TenSV[Ten Sinh Vien],email from tbSinhVien
go
--xem ds sv:ma so ,ten ,ngay thang ,nam sinh,tuoi
select MaSV,TenSV,NgaySinh,Datediff(yy,NgaySinh,getdate())as[Tuoi]
from tbSinhVien
go
-- xem noi dung ket qua thi 
select * from tbDiemKQ
go
--xem ds cac mon hoc da to chuc thi
select distinct MaMH from tbDiemKQ
go
--xem kq thi 
select *from tbDiemKQ
go
-- xem kq thi cua 3 dong dau tienselect top 3 * from tbDiemKQgo-- xem kq thi, duoc sap xep theo thu tu giam dan cua cot diemselect * from tbDiemKQ order by Diem descgo-- xem ket qua cua 3 bai thi co diem cao nhatselect top 3 * from tbDiemKQ order by Diem descgo-- xem ket qua cua 3 bai thi co diem cao nhat (bao gom cac kq dong hang)select top 3 with ties *from tbDiemKQ order by Diem descgo

--xem ds cac mon hoc va luu vo CSDL voi ten tbTemp
select * into tbTEMP from tbMonHoc
go

select*from tbTEMP
go

--xoa bang tbTemp
Drop table tbTEMP
go
--xem ds sinhvien
select*from tbSinhVien
go
--xem ds sv cua lop 1910-M1
select*from tbSinhVien
where MaLopHoc='1910-M1'
go
--xem ds sv nam
select*from tbSinhVien
where GioiTinh=1
go
--xem ds sv nam cua lop 1910-M0
select*from tbSinhVien
where GioiTinh=1 and MaLopHoc='1910-M0'
go
--xem ds sv co ho 'Nguyen'
select*from tbSinhVien
where TenSV like 'Nguyen%'
go
--xem ds sv sinh nam 2000
select * from tbSinhVien where year(NgaySinh)=2000
go
--xem ds sv sinh nho hon 20 tuoi
select * from tbSinhVien
where datediff(yy,NgaySinh,getdate())<=20
go
--dem so sv nam,nu
select count(*) as[sv nam]from tbSinhVien 
where GioiTinh=1
go
select count(*) as[sv nu]from tbSinhVien 
where GioiTinh=0
go

-- viet cach khacselect GioiTinh, count(*) [so luong sv] from tbSinhVien group by GioiTinhgoselect case GioiTinh		   when 0 then 'nu'		   when 1 then 'nam'        end as [Gioi Tinh]       , count(*) [so luong sv] from tbSinhVien group by GioiTinh
go
--xem ds sv ,sep xep theo ma lop hoc
select*from tbSinhVien order by MaLopHoc
go
-- nhom sv theo ma lop va dem so luong sv
select MaLopHoc,count(*)[so lg sv] from tbSinhVien 
group by MaLopHoc
order by MaLopHoc
go
select MaLopHoc,count(*)[so lg sv] from tbSinhVien 
where MaLopHoc like '1910-M0'
group by MaLopHoc
order by MaLopHoc
go
select MaLopHoc,count(*)[so lg sv] from tbSinhVien 
where MaLopHoc like '1910-M0'
group by all MaLopHoc
order by MaLopHoc
go

--dem so bai thi cua tung mon hoc
select MaMH,COUNT(*)[So bai thi] from tbDiemKQ
group by MaMH
go
--tim cac mon hoc co so bai thi >=9
select MaMH,COUNT(*)[So bai thi] from tbDiemKQ
group by MaMH
having count(*)>=9
go
--tinh diem bing quan cuamoi sv theo tung mon hoc
select MaSV,MaMH,AVG(Diem)as [diemBQ]
  from tbDiemKQ
  group by MaSV,MaMH with cube
go
select MaSV,MaMH,AVG(Diem)as [diemBQ]
  from tbDiemKQ
  group by MaSV,MaMH
go
select MaSV,MaMH,AVG(Diem)as [diemBQ]
  from tbDiemKQ
  group by MaSV,MaMH with rollup
go
--tim cac bai thi co diem kq cao nhat
select top 1 with ties *
from tbDiemKQ
order by Diem desc
go
--tim cac bai thi co diem kq cao nhat(su dung Sub Query)
select * from tbDiemKQ
where Diem=(select max(Diem)from tbDiemKQ)
go
--tim cac bai thi ko co diem kq cao nhat(su dung Sub Query)
select * from tbDiemKQ
where Diem<(select max(Diem)from tbDiemKQ)
go
--ds cac mon hoc da to chuc thi
select distinct MaMH from tbDiemKQ
go
--ds cac mon hoc chua tung dc to chuc thi 
select * from tbMonHoc
where MaMonHoc not in(select distinct MaMH from tbDiemKQ)
go
select * from tbMonHoc a
where not exists(select MaMH from tbDiemKQ b where b.MaMH=a.MaMonHoc) 
go