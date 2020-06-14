/*
1. Create
*/
drop database SchoolDB

create database SchoolDB
on primary
	(name='SchoolDB', filename='D:\Data\SchoolDB.mdf', size=10, maxsize=unlimited, filegrowth=1)
	log on
	(name='SchoolDB_log', filename='D:\Data\SchoolDB_log.ldf', size=2, maxsize=5, filegrowth=1)
go

use SchoolDB
go

/*
2. and 4. and 3.
*/
create table tbBatch
(
	BatchNo varchar(10) primary key nonclustered,
	size int check (size>0 and size<5),
	TimeSlot varchar(20)
)
go

create table tbStudent
(
Rollno int identity(100,1) primary key nonclustered,
LastName varchar(20),
FirstName varchar(20),
Gender varchar(1) check(Gender in ('M','F')),
DOB Date,
BatchNo varchar(10) foreign key references tbBatch
)
go

/*
5.
*/
insert tbBatch values
('B01',2,'2019Q1'),
('B02',3,'2019Q2')
go

select * from tbBatch
go

insert tbStudent values
('Thang','Hoang','M','19750101','B01'),
('Minh','Le','M','19950721','B01'),
('Hoa','Huynh','F','20001111','B02'),
('Tuan','Phan','M','19990801','B02')
go

select * from tbStudent
go

/*
6.
*/
create clustered index idxName on tbStudent(FirstName)
go

/*
7.
*/
create view v_SchoolGirl
as
select Rollno,LastName,FirstName,DOB,b.BatchNo,TimeSlot 
from tbBatch b join tbStudent s on b.BatchNo=s.BatchNo with check option
go

select * from v_SchoolGirl
go

/*
8.
*/
create proc sp_SpecificSizeIncrease
@class varchar(10)=null,
@SizeChange int=0
as
begin
	select * from tbBatch
	if @class is not null
	update tbBatch set size=size+@SizeChange where BatchNo=@class
	select * from tbBatch
end
go

--drop proc sp_SpecificSizeIncrease

/*
9.
*/
	--success case1
	exec sp_SpecificSizeIncrease
	go

	--success case2
	exec sp_SpecificSizeIncrease 'B01',1
	go
	--fail
	exec sp_SpecificSizeIncrease 'B01',5
	go

/*
10.
*/
create trigger t_Count on tbStudent
for insert, update
as
begin
	declare @STcount int, @size int, @bn varchar(10)
	select @bn=BatchNo from inserted
	select @STcount=count(*) from tbStudent where BatchNo=@bn
	select @size=size from tbBatch where BatchNo=@bn
	if @STcount>@size
	begin
		print 'this class is full. The operation is aborted!'
		rollback transaction
	end
	print '@STcount='+cast(@stcount as varchar)
	print '@size='+cast(@size as varchar)
end
go

--drop trigger t_Count
/*
11.*/
	--success case1
	insert tbStudent values
	('Huyen','Hoang','F','19760201','B02')
	go

	--success case2
	update tbStudent set BatchNo='B01' where LastName='Huyen'
	go

	select * from tbBatch
	select * from tbStudent
	go

	--fail case
	update tbStudent set BatchNo='B01' where LastName='Hoa'


	select * from tbBatch
	select * from tbStudent
	go