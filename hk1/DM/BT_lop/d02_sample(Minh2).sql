create database dbMinh2
go

use dbMinh2
go

create table tbSinhVien
(
	id varchar(10) not null primary key,
	[name] varchar(20),
	gender bit,
	dob date
);
go

-- them du lieu vo bang tbSinhVien
insert tbSinhVien values
('s1', 'Le Minh', 1, '19921225'); --ngay sinh 25-12-1992
go

-- truy van du lieu sinh vien
select * from tbSinhVien
go

-- nhap them 1 so sinh vien khac
insert tbSinhVien values
('s2', 'Luu Hoang Hai', 1, '20000412'),
('s3', 'Quach Gia Lam', 1, '20000815'),
('s4', 'Huynh Thuan', 1, '19980310'),
('s5', 'Dao Xuan Huy', 1, '20000829')
go
