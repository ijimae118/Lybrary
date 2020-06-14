--ctrl+f5 de ktra lenh ghi dung chua

-- tao csdl1 don gian
create database dbTam
go
/* tao csdl ten dbTam2 voi cac qui uoc day
-data:ten dbTam2, noi luu tru du lieu d:\data\,ten tap tin:dbTam2.mdf
      kich thuoc ban dau: 10M, KT tang:50M, kt toi da ko gioi han
	  thuoc nhom PRIMARY
-nhat ky:ten dbTam2, noi luu tru du lieu d:\data\,ten tap tin:dbTam2_log.ldf
         kich thuoc ban dau: 10M, KT tang:10%, kt toi da :100MB
*/
create database dbTam2
on primary
(
name='dbTam2', filename='d:\data\dbTam2.mdf', size=10, filegrowth=50, maxsize=unlimited
)
log on
(
name='dbTam2_log', filename='d:\data\dbTam2_log.ldf', size=10, filegrowth=10%, maxsize=100
)
go

/* tao csdl ten dbTam3 (co them dinh nghia filegroup) voi cac qui uoc sau day
- data: - ten dbTam3, noi luu du lieu e:\data\, ten tap tin: dbTam3.mdf
        kich thuoc ban dau: 10M, kt tang :50M, kt toi da: ko gioi han
		thuoc nhom PRIMARY
		- ten dbTam3b, noi luu du lieu e:\data\, ten tap tin: dbTam3b.mdf
		- ten dbTam3c, noi luu du lieu e:\data\, ten tap tin: dbTam3c.mdf
		thuoc nhom DATA

- nhat ky : ten dbTam3_log, noi luu du lieu e:\data\, ten tap tin: dbTam2_log.ldf
        kich thuoc ban dau: 10M, kt tang :10%, kt toi da: 100MB
*/
create database dbTam3
on primary
(name='dbTam3', filename='d:\data\dbTam3.mdf', size=10, filegrowth=50, maxsize=unlimited),
(name='dbTam3b', filename='d:\data\dbTam3b.ndf'),
filegroup data
(name='dbTam3c', filename='d:\data\dbTam3c.ndf',size=20, filegrowth=20)
log on
(name='dbTam3_log', filename='d:\data\dbTam3_log.ldf', size=10, filegrowth=10%, maxsize=100)
go
--xoa csd1 dbTam
drop database dbTam
go
drop database dbTam2
go