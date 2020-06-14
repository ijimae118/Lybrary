create database tbThi
go
use tbThi
go

create table tbMonHoc (
maso int identity(1,1) primary key,
tenNgan varchar(5),
tenDai varchar(50),
soTiet int
)
go

SELECT *FROM tbMonHoc
GO