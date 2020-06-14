use db1908_QLSV
go

-- xem ket qua thi
select * from tbDiemKQ
go

-- xem ket qua thi bao gom luon ten sv : su dung ky thuat noi bang -join
select *
from tbDiemKQ a join tbSinhVien b on a.MaSV=b.MaSV
go

select SoTT, a.MaSV, TenSV, MaLopHoc, MaMH, Diem
from tbDiemKQ a join tbSinhVien b on a.MaSV=b.MaSV
go

/* xem ket qua thi bao gom luon ten sv va ten mon hoc : 
   su dung ky thuat noi 3 bang : tbDiemKQ (diem thi), 
                                 tbStudent (ten sinh vien)
								 tbMonHoc (ten mon hoc)
 */

 select SoTT, a.MaSV, b.TenSV, b.MaLopHoc, a.MaMH, c.TenMonHoc, Diem
 from (tbDiemKQ a join tbSinhVien b on a.MaSV = b.MaSV) 
                  join tbMonHoc c on c.MaMonHoc = a.MaMH
go

select sott, c.MaSV, TenSV, MaLopHoc, b.MaMH, TenMonHoc, Diem
from (tbMonHoc a join tbDiemKQ b on a.MaMonHoc= b.MaMH) 
	 join tbSinhVien c on c.MaSV= b.MaSV
	 go

-- demo left join 
--xem ds cac mon hoc chua duoc to chuc thi : sub query
select * 
from tbMonHoc 
where MaMonHoc not in (select distinct MaMH from tbDiemKQ)
go

--xem ds cac mon hoc chua duoc to chuc thi : left join
select *
from tbMonHoc a left join tbDiemKQ b on a.MaMonHoc= b.MaMH
go

select *
from tbMonHoc a left join tbDiemKQ b on a.MaMonHoc= b.MaMH
where SoTT is null
go

select a.*
from tbMonHoc a left join tbDiemKQ b on a.MaMonHoc= b.MaMH
where SoTT is null
go

--xem ds cac mon hoc chua duoc to chuc thi : right join
select b.*
from  tbDiemKQ a right join tbMonHoc b on b.MaMonHoc= a.MaMH
where SoTT is null
go

-- xem ds giao vien
select * from tbGiangVien
go

-- bo sung them cot leader trong giao vien
alter table tbGiangVien
add leader varchar(10)
go

-- cap nhat du lieu cua cot leader = F1 cho cac gv co ma khac F1
update tbGiangVien set leader='F1'
where MaGV != 'F1'
go

-- xem ds giang vien, bao gom ten leader
select a.*, b.TenGV as [Ten Truong nhom]
from tbGiangVien a  left join tbGiangVien b on a.leader=b.MaGV
go


-- xem lai ds giang vien
select * from tbGiangVien
go

-- tao bang giangvien2 tu bang giangvien
select * into tbGiangVien2 from tbGiangVien where leader is not null
go

select * from tbGiangVien2
go

-- them vai vi giao vien vo bang giangvien2
insert tbGiangVien2 values
('F5','Quach Gia Lam','lam@gmail.com', 'F2'),
('F6','Dao Cong Duong','duong@gmail.com', 'F2')
go
select * from tbGiangVien2
go

-- cap nhat cot leader cua gv co ma so F2 thanh NULL
update tbGiangVien2 set leader=null where MaGV='F2'
go
select * from tbGiangVien2
go

-- xem lai ds giao vien cua 2 bang giangvien va giangvien2
select * from tbGiangVien
select * from tbGiangVien2

-- them 2 giao vien moi vo bang giaovien
insert tbGiangVien values
('F10','Nguyen Ngoc Thach', 'thach@gmail.com', 'F2'),
('F5','Nguyen Toan Thang', 'thang@gmail.com', 'F2')
go

select * from tbGiangVien
select * from tbGiangVien2
go

-- dong bo hoa du lieu cua bang giangvien2 voi bang giangvien
merge tbGiangvien2 as bk
using tbGiangVien as so
on bk.maGV = so.maGV
when matched then update set bk.tenGV=so.tenGV, 
							 bk.eMail=so.email,
							 bk.leader = so.leader
when not matched then insert (maGV, tenGV, email, leader) 
                      values (so.MaGv, so.TenGV, so.Email, so.leader)
when not matched by source then delete
output $action, inserted.magv, inserted.tengv, inserted.email, inserted.leader,
                deleted.magv, deleted.tengv, deleted.email, deleted.leader;
go


select * from tbGiangVien2 order by MaGV
select * from tbGiangVien order by MaGV
go

-- demo CTE
-- xem ds ten cac sinh vien da du thi nhieu lan (>=2)
select * from tbDiemKQ order by MaSV
go

select MaSV, count(*) [so luot thi] from tbDiemKQ group by MaSV
go

select MaSV, count(*) [so luot thi] 
	from tbDiemKQ 
	group by MaSV
	having count(*) >=2
	order by 2
go

-- lay them ten sv
select b.MaSV, b.TenSV, count(*) [so luot thi] 
	from tbDiemKQ a join tbSinhVien b on a.MaSV=b.MaSV
	group by b.MaSV, b.TenSV
	having count(*) >=2
	order by 2
go

-- lay them ten sv bang ky thuat CTE
with dsSV as
(select MaSV, count(*) [so luot thi] from tbDiemKQ 
                                     group by MaSV having count(*) >=2 )
select b.MaSV, b.TenSV, a.[so luot thi] 
       from dsSV a join tbSinhVien b on a.MaSV= b.MaSV
go

-- demo union

-- lay ket qua thi mon C
select * from tbDiemKQ 
	where MaMH ='C'

-- lay ket qua thi mon HTML
select * from tbDiemKQ 
	where MaMH ='HTML'

-- => ds ket qua thi mon C va mon HTML
select * from tbDiemKQ  where MaMH ='C'
union
select * from tbDiemKQ  where MaMH ='HTML'
go 

select * from tbDiemKQ
where MaMH ='C' or MaMH='HTML' order by MaSV
go

-- demo INTERSECT
-- lay ds sv thi du 2 mon C va HTML
with dsthiC_HTML as
(
	select MaSV from tbDiemKQ  where MaMH ='C'
	intersect
	select MaSV from tbDiemKQ  where MaMH ='HTML'
)
select b.* from dsthiC_HTML a join tbSinhVien b on a.MaSV=b.MaSV
go


-- demo EXCEPT
-- lay ds sv da thi mon C nhung chua thi mon HTML
with dsthiC_Not_HTML as
(
	select MaSV from tbDiemKQ  where MaMH ='C'
	except
	select MaSV from tbDiemKQ  where MaMH ='HTML'
)
select b.* from dsthiC_Not_HTML a join tbSinhVien b on a.MaSV=b.MaSV
go

-- tim ds sv chua tung tham du 1 ky thi nao het
-- cach 1. su dung sub query
select * from tbSinhVien 
		where masv not in ( select distinct MaSV from tbDiemKQ )
go 

-- cach 2. su dung left join
select a.* from tbSinhVien a left join tbDiemKQ b on a.MaSV = b.MaSV
		where SoTT is null
go

-- cach 3. su dung toan tu except
with dsSVchuaThi as 
(
	select MaSV from tbSinhVien
	except 
	select distinct MaSV from tbDiemKQ
)
select b.* from dsSVchuaThi a join tbSinhVien b on a.MaSV=b.MaSV
go


 