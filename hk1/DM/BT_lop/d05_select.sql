

-- vi du ve select
-- khai bao bien sinhvien, kieu varchar, co gia tri Quach Gia Lam
declare @sinhvien varchar(50) = 'Quach Gia Lam'
select LEFT(@sinhvien,5) as [ho], RIGHT(@sinhvien,3) as [ten]
select SUBSTRING(@sinhvien,7,3) as [ten lot]
go


--open CSDL 
use db1908_QLSV
go

-- xem danh sach sinh vien trong CSDL db1908_QLSV
select * from tbSinhVien
go

--xem ds sv bao gom: ma so, ten, dc email
select MaSV, TenSV, email from tbSinhVien
go

--xem ds ten sv va email
select TenSV + ': ' + email as [Ten SV: Email]
from tbSinhVien
go

--xem ds sv bao gom: ma so, ten, dc email - doi ten cot trong ket qua truy van
select MaSV as [Ma so SV], TenSV [Ten Sinh Vien], email  from tbSinhVien
go

--xem ds sv : ma so, ten, ngay thang nam sinh, tuoi
select MaSV, TenSV, NgaySinh, DATEDIFF(yy,NgaySinh,GETDATE()) as [Tuoi] 
from tbSinhVien
go


-- xem noi dung ket qua thi
select * from tbDiemKQ
go

-- xem ds cac mon hoc da to chuc thi
select MaMH from tbDiemKQ
go

select distinct MaMH from tbDiemKQ
go

-- xem kq thi 
select * from tbDiemKQ
go

-- xem kq thi cua 3 dong dau tien
select top 3 * from tbDiemKQ
go

-- xem kq thi, duoc sap xep theo thu tu giam dan cua cot diem
select * 
from tbDiemKQ 
order by Diem desc
go

-- xem ket qua cua 3 bai thi co diem cao nhat
select top 3 * 
from tbDiemKQ 
order by Diem desc
go

-- xem ket qua cua 3 bai thi co diem cao nhat (bao gom cac kq dong hang)
select top 3 with ties *
from tbDiemKQ 
order by Diem desc
go

-- xem ds cac mon hoc va luu vo CSDL voi ten tbTemp
select * into tbTEMP from tbMonHoc
go

select * from tbTEMP
go

-- xoa bang tbTemp
drop table tbTEMP
go

-- xem ds sinh vien 
select * from tbSinhVien
-- xem ds sinh vien cua lop 1910-M1
select * from tbSinhVien where MaLopHoc = '1910-M1'
go
-- xem ds sinh vien nam
select * from tbSinhVien where GioiTinh=1
go
-- xem ds sinh vien nam cua lop 1910-M0
select * from tbSinhVien where (GioiTinh=1 and MaLopHoc='1910-M0') 
go

-- xem ds sinh vien co ho 'Nguyen'
select * from tbSinhVien where TenSV like 'nguyen%'
go

--xem ds sv sinh nam 2000
select * from tbSinhVien where year(NgaySinh)=2000
go

--xem ds sv nho hon 20 tuoi
select * from tbSinhVien where DATEDIFF(yy,NgaySinh,GETDATE())<=20
go

--dem so sinh vien nam, nu 
select count(*) as [so sinh vien nam ] from tbSinhVien where GioiTinh=1
go
select count(*) as [so sinh vien nu ] from tbSinhVien where GioiTinh=0
go
-- viet cach khac
select GioiTinh, count(*) [so luong sv] from tbSinhVien group by GioiTinh
go

select case GioiTinh
		   when 0 then 'nu'
		   when 1 then 'nam'
        end as [Gioi Tinh]
       , count(*) [so luong sv] from tbSinhVien group by GioiTinh
go
