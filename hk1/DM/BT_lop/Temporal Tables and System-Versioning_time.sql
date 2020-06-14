use db1908_QLSV
go
create database vd_01
go
use vd_01
go

-- tao 1 bang co chua cac cot ghi nhan thoi gian hoat dong
create table tbTemporal(
	bookID varchar(5) primary key nonclustered,
	title varchar(30) not null,
	price int not null default 100,
	vBegin datetime2 generated always as row start hidden not null,
	vEnd datetime2 generated always as row end hidden not null,
	period for system_time(vBegin, vEnd)
)
go

-- open chuc nang danh so phien ban 
alter table tbTemporal
set(system_versioning=on(history_table=dbo.tbTempoHistory))
go
-- them 1 so mau tin vo bang thoi gian tbTemporal
insert tbTemporal values
('B01','Lap trinh C',120),
('B02','Thiet ke web_HTML',100),
('B03','Thiet ke web_CSS3',80),
('B04','Lap trinh Java',220),
('B05','Thiet ke CSDL',170)
go
-- truy van :xem tat ca cac quyen sach trong bang thoi gian tpTemporal (vBEGIN,vEnd la hisden nen ko thay)
select*from tbTemporal
go
--truy van :xem tat ca cac quyen trong bang tbTemporal bao gom 2 cot thoi gian vBEGIN,vEnd(no cho ra gio UTC :gio Anh,chu ko lay h location)
select bookId,title,price,vBEGIN,vEnd FROM tbTemporal
GO
-- doi gia quyen sach lap trinh java 300
update tbTemporal set price=300 where bookID like 'B04'
go
--truy van lai :xem tat ca cac quyen trong bang tbTemporal bao gom 2 cot thoi gian vBEGIN,vEnd(no cho ra gio UTC :gio Anh,chu ko lay h location)
select bookId,title,price,vBEGIN,vEnd FROM tbTemporal
GO
--xoa quyen sach co ma so B03
delete from tbTemporal where bookID like 'B03'
go
--truy van lai :xem tat ca cac quyen trong bang tbTemporal bao gom 2 cot thoi gian vBEGIN,vEnd(no cho ra gio UTC :gio Anh,chu ko lay h location)
select bookId,title,price,vBEGIN,vEnd FROM tbTemporal
GO
--truy van lai :xem tat ca cac quyen trong bang tbTemporal bao gom 2 cot thoi gian vBEGIN,vEnd(phan bang H end ,B04 dc lap lai 2 lan do update ,B03 bi delete thi ko lap lai)
select bookId,title,price,vBEGIN,vEnd FROM tbTemporal
    for system_time from '2020-03-21 02:04' To '2020-03-21 15:00' 
  --for system_time between'2020-03-21 02:04'and '2020-03-21 15:00'
  --for system_time CONTAINED IN ('2020-03-21 02:04','2020-03-21 15:00')
	 order by 1
GO
/*
 phai dieu chinh t/g theo (bang vbegin ,vend) 
select bookId,title,price,vBEGIN,vEnd FROM tbTemporal
    for system_time from '2020-04-01 11:00' To '2020-04-07 12:00' 
	 order by 1
GO
*/
-- tim mau tin bi xoa
select bookID from tbTemporal
	for system_time CONTAINED in ('2020-03-19' , '2020-03-22')
group by bookID
except
select bookID from tbTemporal
	for system_time from '2020-03-19' to '9999-12-31'
group by bookID
having count(*)>1
go
/*
tim B03 bi xoa: 
--Cho ra B03,B04
select bookID from tbTemporal
	for system_time CONTAINED in ('2020-04-01' , '2020-04-07')
group by bookID
except -- ngoai truy -- cho ra ket qua cuoi cung B03 tap tin bi xoa 
--Cho ra B04 tap tin update
select bookID from tbTemporal
	for system_time from '2020-04-06' to '9999-12-31'
group by bookID
having count(*)>1
go
*/