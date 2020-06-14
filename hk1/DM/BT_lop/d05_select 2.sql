use db1908_QLSV
go


-- xem ds sv , sep xep theo ma lop hoc
select * from tbSinhVien order by MaLopHoc
go

-- nhom sv theo ma lop va dem so luong sinh vien
select MaLopHoc, count(*) [so luong sinh vien] from tbSinhVien 
group by MaLopHoc
order by MaLopHoc
go

select MaLopHoc, count(*) [so luong sinh vien] 
	from tbSinhVien 
	where MaLopHoc like '1910-M0'
	group by MaLopHoc
	order by MaLopHoc
go

select MaLopHoc, count(*) [so luong sinh vien] 
	from tbSinhVien 
	where MaLopHoc like '1910-M0'
	group by all MaLopHoc
	order by MaLopHoc
go

-- dem so bai thi cua tung mon hoc
select MaMH, count(*) [so bai thi] from tbDiemKQ
group by MaMH
go

-- tim cac mon hoc hoc co so bai thi >=9
select MaMH, count(*) [so bai thi] from tbDiemKQ
group by MaMH
having count(*)>=9
go

-- tinh diem binh quan cua moi sinh vien theo tung mon hoc
select MaSV, MaMH, AVG(Diem) as [diem BQ]
	from tbDiemKQ
	group by MaSV, MaMH
go

select MaSV, MaMH, AVG(Diem) as [diem BQ]
	from tbDiemKQ
	group by MaSV, MaMH with cube
go

select MaSV, MaMH, AVG(Diem) as [diem BQ]
	from tbDiemKQ
	group by MaSV, MaMH with rollup
go

-- tim cac bai thi co diem kq cao nhat
select top 1 with ties *
	from tbDiemKQ
	order by Diem desc
go

-- tim cac bai thi co diem kq cao nhat (SU DUNG SUB QUERY)
select * from tbDiemKQ
	where Diem = (select max(Diem) from tbDiemKQ)
go

-- tim cac bai thi khong thuoc nhom co diem kq cao nhat (SU DUNG SUB QUERY)
select * from tbDiemKQ
	where Diem < (select max(Diem) from tbDiemKQ)
go

-- ds cac mon hoc da to chuc thi
select distinct MaMH from tbDiemKQ
go

-- ds cac mon hoc chua tung duoc to chuc thi
select * from tbMonHoc
where MaMonHoc not in (select distinct MaMH from tbDiemKQ)
go

select * from tbMonHoc a
where not exists (select MaMH from tbDiemKQ b where b.MaMH=a.MaMonHoc)
go

