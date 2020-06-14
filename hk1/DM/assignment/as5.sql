create database Db_Ass5
on
(name='Ass5',filename='E:\data\Ass5.mdf', size=5,maxsize=5, filegrowth = 10%)
log on
(name='Ass5_lg',filename='E:\data\Ass5_lg.ldf', size=5,maxsize=5, filegrowth = 10%)
go

use Db_ass5
go

create table tbCustomer
(
	CUSTID varchar(5) not null primary key  nonclustered,
	Fullname varchar(30),
	[Address] varchar(50),
	Phone tinyint
)
go

create TABLE tbCategory
(
	CATID varchar(3) not null primary key nonclustered,
	CatName varchar(10)
)
go

create table tbProduct
(
	PROID varchar(5) not null primary key nonclustered,
	ProName varchar(30),
	UnitPrice int not null check(UnitPrice between 1 and 200),
	Unit varchar(5),
	CATID varchar(3) foreign key references tbCategory(CATID)
)
go

create table tbOrder
(
	ORDERID int identity(300,1) not null primary key nonclustered,
	OrderDate smalldatetime,
	Comment varchar(50),
	CUSTID varchar(5) foreign key references tbCustomer
)
go

create table tbOrderDetail
(
	ORDERID int not null foreign key references tbOrder,
	PROID varchar(5) not null foreign key references tbProduct,
	Quantity int default 1
	primary key (ORDERID,PROID)
)
go

alter table tbCustomer
alter column Phone int 
go 

insert tbCustomer values
('CT01', 'Nguyen van Huy', 'CMT8', 0901010101),
('CT02', 'Bui Dinh Hung', 'Nam Ky Khoi Nghia', 09999991),
('CT03', 'Nguyen Ngoc Thien Kim', 'Pham Ngu Lao', 09999992),
('CT04', 'Loi Buu Buu', 'Quang Trung', 09999993),
('CT05', 'Nguyen Thi Phuong Huyen', 'Cu Chi', 09999994),
('CT06', 'Le Ba Hung', 'Ngo Quyen', 09999995),
('CT07', 'Hoang Minh Tam', 'Go Vap ', 09999996)
go 

insert tbCategory values
('FO', 'FOOD'),
('BE','BEVERAGE'),
('OT', 'OTHER')
GO 

INSERT tbProduct VALUES
('P01', 'Coca cola', 2, 'can', 'BE'),
('P02', 'Beer 333', 4, 'can', 'BE'),
('P03', 'Chocolate', 9, 'pack', 'FO'),
('P04', 'Chocopie Cake', 4, 'pack', 'FO'),
('P05', 'Cheese', 10, 'pack', 'FO'),
('P06', 'Sampoo', 8, 'can', 'OT')
go 

insert tbOrder values 
('20140830', 'Nothing', 'CT01'),
('20141031', 'Nothing', 'CT01'),
('20140711', 'Nothing', 'CT03'),
('20140711', 'Nothing', 'CT02')
go 

insert tbOrderDetail values
(300,'P01', 3),
(300,'P03', 1),
(301,'P02', 8),
(301,'P03', 1),
(301,'P05', 15),
(302,'P06', 5),
(303,'P02', 4)
go 

--4a
select *
from tbCustomer
go 

--4b
select *
from tbProduct
order by UnitPrice
go 

--4c
select a.ORDERID ,a.OrderDate,c.Fullname,d.ProName,b.Quantity,d.UnitPrice,(d.UnitPrice*b.Quantity) as [Amount] 
from (tbOrder a join tbCustomer c on a.CUSTID=c.CUSTID) 
	join 
	(tbOrderDetail b join tbProduct d on b.PROID=d.PROID)
	on a.ORDERID=b.ORDERID
go

--4d
select *
from tbProduct
where CATID like 'FO'
go

--4e
select CATID,count(*) as [So san pham]
from tbProduct
group by CATID
go 

--4f
select a.*
from tbCustomer a join tbOrder b on a.CUSTID=b.CUSTID
where b.ORDERID=302
go 

--4g
select ORDERID,count(*) as [so san pham dat hang]
from tbOrderDetail 
group by ORDERID
having count(*)>=2
go 

--4h
select top 2 PROID,sum(quantity) as [so luong ban ra]
from tbOrderDetail
group by PROID
order by 2 desc
go
