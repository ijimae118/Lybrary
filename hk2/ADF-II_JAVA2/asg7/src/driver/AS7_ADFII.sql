create database javaDB
go
use javaDB
go
create table tbProject (
ID int identity(100,1) primary key,
projectName varchar(30) not null,
startDate varchar(10) not null ,    /*check(startDate like'[0-9]{4}[0-9]{2}[0-9]{2}'),*/
[value] int not null check([value] >0),
completed bit not null default 0
)
go
drop table tbProject
go

select * from tbProject where completed=1
go
