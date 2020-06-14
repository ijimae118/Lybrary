-- open dbMinh2
use dbMinh2
go
--truy van danh sach hoc sinh
select*from tbSinhVien
go
--nhap them 1 so sinh vien moi ,dung linh insert
insert tbSinhVien values
('s6','Vo Duc Chinh',0,'20000530'),
('s7','Van long',0,'20000425'),
('s8','Nguyen Thang',1,'19900901'),
('s9','Nguyen Thach',1,'19920131'),
('s10','Hoang Giang Chuan',0,'20000228'),
('s11','Van long',1,'20020330')
go
--truy van ds sinh vien
select*from tbSinhVien
go
-- tim ds sinh vien nam
select*
  from tbSinhVien
  where gender = 1
go
-- tim ds sinh vien nu
select*
  from tbSinhVien
  where gender = 0
go
-- cac sinh vien trong cai ho ten co chua ky tu a
select*from tbSinhVien
where [name] like '%a%'
go
--tim cac sinh vien co ho 'nguyen'
select*from tbSinhVien
where [name] like 'nguyen%'
go
--tim cac sinh vien co nam sinh 1990
select*from tbSinhVien
where year(dob)=1990
go
--xuat ds sv theo thu tu cua ngay sinh theo thu tu giam dan
select*from tbSinhVien
order by dob desc
go
--xuat ds sv theo thu tu cua ngay sinh theo thu tu giam dan ,bo sung them cot tuoi 
select*,datediff(yy,dob,getdate())as[tuoi]
   from tbSinhVien
   order by dob desc
go
--dem so sv nam 
select count(*)as[tong so sv nam]
from tbSinhVien
where gender=1
go
--dem so sv nu
select count(*)as[tong so sv nam]
from tbSinhVien
where gender=0
go
--nhom du lieu theo gioi tinh de dem so
select gender, count(*) as [so luong sv]
from tbSinhVien
group by gender
go
select case when gender=1 then 'nam'
            when gender=0 then 'nu'
       end as[gioi tinh],
count(*) as [so luong sv]
from tbSinhVien
group by gender
go
-- dem hoc vien theo do tuoi - va sap xep theo thu tu tang dan
select datediff(yy,dob,getdate())as[age],       count(*) as [number of student] --kqfrom tbsinhviengroup by datediff(yy,dob,getdate())
order by 2
go
-- dem hoc vien theo do tuoi - va chi lay cac nhom co tu 2sv tro len
select datediff(yy,dob,getdate())as[age],-- cot        count(*) as [number of student] --kqfrom tbsinhviengroup by datediff(yy,dob,getdate())
having count(*)>=2 --kq cho ra: phai lon hon or = 2
order by 2 desc
go