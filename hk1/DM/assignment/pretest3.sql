/*1. Create a database named Pretest3DB with the following specifications :
a. Primary file group with the data file pretest3.mdf. The size, maximum size, and file
growth should be 5, unlimited and 20 respectively.
b. Log file pretest3_log.ldf. The size, maximum size, and file growth should be 2, 50,
and 10% respectively.*/
create database Pretest3DB
on primary
(name='pretest3', FILENAME='d:\data\pretest3.mdf',SIZE=5,MAXSIZE=unlimited,FILEGROWTH=20)
log on
(name='pretest3_log', FILENAME='d:\data\pretest3_log.ldf',SIZE=2,MAXSIZE=50,FILEGROWTH=10%)
go

use Pretest3DB
go
--2. Create the table tbEmpDetails, tbLeaveDetails as follows:
create table tbEmpDetails
(
	Emp_Id varchar(5) not null primary key nonclustered,
	FullName varchar(30) not null,
	PhoneNumber varchar(20) not null,
	Designation varchar(30) check(Designation='Manager' or Designation='Staff'),
	Salary money check(Salary >=0 and Salary <=3000),
	Join_date datetime
)
go

create table tbLeaveDetails
(
	Leave_ID int identity primary key nonclustered,
	Emp_Id varchar(5) foreign key references tbEmpDetails,
	LeaveTaken int check(LeaveTaken>0 and LeaveTaken<15),
	FromDate datetime not null,
	ToDate Datetime not null,
	Reason varchar(50) not null,
	check (ToDate > FromDate),
	check (LeaveTaken = DATEDIFF(day,FromDate,ToDate)+1)
)
go

--3. Insert at least five records to each table
insert tbEmpDetails values
('NV001','Nguyen Trong Nghia', 0963179601,'Staff',1000,'20181212'),
('NV002','Nguyen Ngoc Thien Kim', 0963179602,'Manager',1100,'20181212'),
('NV003','Loi Buu Buu', 0963179603,'Manager',1200,'20181212'),
('NV004','Le Ba Hung', 0963179604,'Manager',1300,'20181212'),
('NV005','Le Thanh An', 0963179605,'Staff',1400,'20181212'),
('NV006','Nguyen Thai Binh', 0963179606,'Manager',1500,'20181212'),
('NV007','Hoang Minh Tam', 0963179607,'Staff',1700,'20181212')
go

insert tbLeaveDetails values
('NV001',3,'20181223 00:00:00','20181225 00:00:00','Have a new job'),
('NV002',8,'20181101 00:00:00','20181108 00:00:00','Nothing'),
('NV004',9,'20181102 00:00:00','20181110 00:00:00','Nothing 1'),
('NV005',10,'20181103 00:00:00','20181112 00:00:00','Nothing 2'),
('NV003',2,'20181104 00:00:00','20181105 00:00:00','Nothing 3'),
('NV007',7,'20181105 00:00:00','20181111 00:00:00','Nothing 4')
go

insert tbLeaveDetails values
('NV003',3,'20181204 00:00:00','20181206 00:00:00','wedding')
go
--4 Create a clustered index IX_Fullname for fullname column on tbEmployeeDetails table. (finished)
create clustered index IX_Fullname on tbEmpDetails(FullName)
go

--4 Create an index IX_EmpID for Emp_ID column on tbLeaveDetails table (finished)
create index IX_EmpID on tbLeaveDetails(Emp_ID)
go


--5 Create a view vwManager to retrieve the number of leaves taken by employees having designation as Manager Note: this view will need to check for domain integrity and encryption. 
create view vwMannager with encryption as
select a.*, b.LeaveTaken
from tbEmpDetails a right join tbLeaveDetails b on a.Emp_Id=b.Emp_Id
where Designation = 'Manager'
with check option
go

alter view vwMannager with encryption as
select a.Emp_Id, a.FullName, a.PhoneNumber, a.Salary, sum(b.LeaveTaken) as [Total Leaves]
from tbEmpDetails a left join tbLeaveDetails b on a.Emp_Id=b.Emp_Id
where Designation = 'Manager'
group by a.Emp_Id, a.FullName, a.PhoneNumber, a.Salary
with check option
go


select * from vwMannager
go

--6 Create a store procedure uspChangeSalary to increase salary of an employee by a given value (Hint: using input parameters) (finished)
CREATE PROC uspChangeSalary
@masonv varchar(5),
@luong INT =NULL
AS
BEGIN
	--Nếu không nhập luong thì sẽ lấy Default =100
	IF @luong IS NULL 
		SET @luong=100  --Giá trị Default =100
	--Lệnh 1
	SELECT * FROM tbEmpDetails where Emp_Id = @masonv
	--Lệnh 2
	UPDATE tbEmpDetails SET Salary+=@luong where Emp_Id = @masonv
	--Lệnh 3
	SELECT * FROM tbEmpDetails where Emp_Id = @masonv
END 
GO 

exec uspChangeSalary 
@masonv = 'NV001' , @luong = 200
go

exec uspChangeSalary 
@masonv = 'NV002' 
go


--7 Create a trigger tgInsertLeave for table tbLeaveDetails which will perform rollback transaction if total of leaves taken by employees in a year greater than 15 and display appropriate error message.
CREATE TRIGGER tgInsertLeave
ON dbo.tbLeaveDetails
FOR INSERT AS
BEGIN
	if exists (select Emp_Id, sum(LeaveTaken) from tbLeaveDetails 
		where Emp_Id in ( select Emp_Id from inserted )
		group by Emp_Id
		having sum(LeaveTaken) > 15) 
	begin
		PRINT 'Error!!! Can not leave more than 15 days !'
		ROLLBACK
	end
end
go

select * from vwMannager
go

-- case nay : FAIL 
insert tbLeaveDetails values
('NV003',11,'20181004 00:00:00','20181014 00:00:00','wedding')
go

-- case thanh cong
insert tbLeaveDetails values
('NV003',5,'20181004 00:00:00','20181008 00:00:00','wedding')
go

--8 Create a trigger tgUpdateEmploee for table tbEmployeeDetails which removes the employee if new salary is reset to zero.
create trigger tgUpdateEmploee
on tbEmpDetails
for update as
begin
	select * from tbEmpDetails order by Salary
	if exists (select * from tbEmpDetails where Salary = 0)
	begin
		delete from tbLeaveDetails where Emp_Id in (select Emp_Id 
													from inserted where Salary = 0) 
		delete from tbEmpDetails where Emp_Id in (select Emp_Id 
													from inserted where Salary = 0)
	end
	select * from tbEmpDetails order by Salary
end

select * from tbEmpDetails
go

-- case 1: salary 300
update tbEmpDetails set Salary = 300 where Emp_Id ='NV004'
go

-- case 2: salary 0 => remove 
update tbEmpDetails set Salary = 0 where Emp_Id ='NV004'
go

select * from vwMannager
go

