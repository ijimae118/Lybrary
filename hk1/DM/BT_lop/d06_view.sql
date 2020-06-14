use db1908_QLSV
go

-- lay ds sinh vien nam
select * from tbSinhVien where GioiTinh=1;
go

-- tao view chua ds sv nam
create view vwSinhVienNam
as
select * from tbSinhVien where GioiTinh=1
go

-- xem ds sv nam tu view vwSinhVienNam
select * from vwSinhVienNam
go

-- xem ds sinh vien da du thi mon C
select a.*, b.Diem 
	from tbSinhVien a join tbDiemKQ b on a.MaSV=b.MaSV 
	where MaMH='C';
go

-- tao view vwSinhVienThiC chua ds cac sinh vien da du thi mon c
create view vwSinhVienThiC as
select a.*, b.Diem 
	from tbSinhVien a join tbDiemKQ b on a.MaSV=b.MaSV 
	where MaMH='C';
go

-- xem ds sinh vien da du thi mon C (thong qua view vwSinhVienThiC)
select * from vwSinhVienThiC
go

exec sp_helptext vwSinhVienThiC
go

-- them 1 sinh vien nam vo bang tbSinhVIEN 
insert vwSinhVienNam values ('s20','20001230','nghia@gmail.com',1,'1910-M1','Huu Nghia')
go


select * from tbSinhVien
go

select * from vwSinhVienNam
go

-- them 1 sinh vien nu vo bang tbSinhVIEN thong qua view vwSinhVienNam : vo ly chua? 
insert vwSinhVienNam values ('s21','20011230','giang@gmail.com',1,'1910-M1','Nguyen Thi Giang')
go
-- cap nhat nhat lai gioi tinh cua ban ma so S21
update vwSinhVienNam set GioiTinh=0 where MaSV='s21'
go

-- sua lai dinh nghia view nam sinh them dk with check option: ko cho phep them 1 nu sinh vo DB thong qua view nam sinh
alter view vwSinhVienNam
as
select * from tbSinhVien where GioiTinh=1 with check option
go

-- thu them 1 nu sinh vo DB thong qua view nam sinh : nhan thong bao loi !!!
insert vwSinhVienNam values
('s22','20011020','chi@gmail.com',0,'1910-M0','Dang Tieu Chi')
go



