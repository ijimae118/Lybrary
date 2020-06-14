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
