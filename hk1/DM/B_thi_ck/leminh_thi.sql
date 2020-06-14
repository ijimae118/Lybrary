--1.
create database SchoolDB
on primary
(name='SchoolDB',filename='M:\data\SchoolDB.mdf',size=10,maxsize=unlimited,filegrowth=1)
go


use SchoolDB
go

--2.
create table tbBatch
(
BatchNo varchar(10) primary key nonclustered,
Size int check(Size>0 and Size<5),
TimeSlot varchar(20)
)

create table tbStudent
(
RollNo int identity(100,1) primary key nonclustered,
LastName varchar(20),
FirstName varchar(20),
Gender varchar(1) check(Gender = 'M' or Gender = 'F'),
DOB date,
BatchNo varchar(10) foreign key references tbBatch
)


--5.
insert tbBatch values
('C01','3','abcdef'),
('C02','4','zxcvbnm')

insert tbStudent (LastName,FirstName,Gender,DOB,BatchNo) values
('Le','Minh','M','19990202','C01'),
('Vu','Hoang','M','19981223','C02'),
('Huynh','Vu','F','20001010','C02'),
('Truong','Giang','F','19990217','C01')

SELECT * FROM tbBatch
SELECT * FROM tbStudent

--6.
create clustered index idxName on tbStudent(FirstName)
go

--7.
create view v_SchoolGirl
as
select * from tbStudent
where Gender = 'F'
with check option

select * from v_SchoolGirl
go

--8.
create proc sp_SpecificSizeIncrease
@num int
as
begin
	select * from tbBatch
	update tbBatch set Size = Size + @num
	select * from tbBatch
end
go

--9. test case
exec sp_SpecificSizeIncrease -1
go

--10.
create trigger t_Count 
on tbStudent
for insert
as
begin
	declare @count int, @size int, @batchNo varchar(10)
	select @batchNo=BatchNo from inserted
	select @count = count(*) from tbStudent where BatchNo = @batchNo
	select @size = Size from tbBatch
	where BatchNo = @batchNo
	if(@count>@size)
	begin
		print 'Number of students can not be greater than size of a class'
		rollback
	end
end

--10.test case
--fail
insert tbStudent values
('Hoang','Minh','M','19990202','C01')

--success
insert tbStudent values
('Hoang','Minh','M','19990202','C02')

