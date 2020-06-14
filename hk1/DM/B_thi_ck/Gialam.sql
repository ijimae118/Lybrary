create database SchoolDB 
on primary 
(
name='SchoolDB', filename='d:\data\SchoolDB.mdf',size=10 mb, filegrowth=1, maxsize=unlimited
)
go
use SchoolDB
go
create table tbBatch(
BatchNo varchar(10) primary key,
Size int check(Size>0 and Size<5),
TimeSlot varchar(20)
)
go
create table tbStudent(
Rollno int identity(100,1) primary key nonclustered,
LastName varchar(20),
FristName varchar(20),
Gender varchar(1) check(Gender='M' or Gender='F'),
DOB Date,
BatchNo varchar(10) foreign key references tbBatch
)
go
insert tbBatch values
('01','1','8:00am-12:00am'),
('02','2','8:00am-12:00am'),
('03','3','12:00pm-4:00pm'),
('04','4','12:00pm-4:00pm')
go
insert tbStudent values
('Quach','lam','M','19970717','01'),
('Bao','Nhi','F','19940716','02'),
('Quoc','Tuan','M','19950615','03'),
('Ngoc','laN','F','19960712','04')
go
Create clustered index idxName on tbStudent(FristName)
go
--7
create view v_SchoolGirl as
select  a.*,b.TimeSlot
from tbStudent a,tbBatch b
with check option 
go
select *from v_SchoolGirl
go
--8: increase change
create proc sp_SpecificSizeIncrease
@number int=10 ,--default 10:ko thanh cong 
@BatchNo int
as
begin
 select*from tbBatch
 update tbBatch set Size= Size+@number
 where BatchNo=@BatchNo
 select*from tbBatch
end
go

--9 test tore: thanh cong
exec sp_SpecificSizeIncrease 2,02
go
--10
create trigger t_Count on tbStudent
for insert,update
as
begin
 declare @count int,@size int
 select @count=count(*) from tbStudent where BatchNo in(select BatchNo from inserted)
 select @size = Size from tbBatch where BatchNo in(select BatchNo from inserted)
	if(@count>@size)
	begin
		print 'Number of students can not be greater than size of a class'
		rollback
	end
end
go

--11 test trigger
--can test lai
--fail
insert tbStudent values
('lu','Dinh','M','19970202','01')

--success
insert tbStudent values
('Lu','Dinh','M','19970202','02')