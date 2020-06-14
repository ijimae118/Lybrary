create database dbMinh
go

create table tbSinhVien
(
id varchar(10) not null primary key,
[name] varchar(20),
gender bit,
dob date
);
go
use dbMinh;
go
-- them du lieu vo bang tbSinhVien
insert tbSinhVien values
('s1','Le Minh',1,'19921225');--ngay sinh 25-12-1992
go
-- truy van du lieu sinh vien
select*from tbSinhVien
go
-- nhap them 1 so sinh vien khac
insert into tbSinhVien values
('s2','gia lam',1,'19971201'),
('s3','NgoTan',1,'20000912'),
('s4','Chi Thanh',1,'20120630'),
('s5','Tuan Vy',1,'19940719');
go