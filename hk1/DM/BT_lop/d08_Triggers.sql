use db1908_QLSV
go

/* muon ap dung qui tac cho viec nhap diem thi : 
   moi sinh vien chi co the thi mot mon hoc toi da 2 lan
   => phai viet trigger de cai dat qui tac tren
   => tao trigger insert cho bang diem thi 
*/
create trigger tg_Thi
on tbDiemKQ
for insert as begin
    -- khai bao 2 bien chua ma so sinh vien va ma so mon hoc cua ket qua thi moi nhap
	declare @sv varchar(10), @monthi varchar(10);

	-- lay gia tri cua 2 cot ma sinh vien va ma mon hoc cua ket qua thi moi nhap vo bang
	select @sv=MaSV, @monthi=MaMH from inserted

	-- dem so lan thi cua mon hoc moi nhap doi voi ban sv nay
	declare @solanthi int = 0
	select @solanthi = count(*) from tbDiemKQ
		where MaSV like @sv and MaMH like @monthi

    -- kiem tra neu ban sv nay thi 1 mon tren 2 lan: tu choi them kq vo db
	if (@solanthi>2)
	begin
		print 'Ko the thi 1 mon hoc qua 2 lan . Tu choi thao tac !!!'
		rollback transaction  -- huy linh insert
	end
end
go

-- thu xem trigger hoat dong nhu the nao ?
select * from tbDiemKQ order by MaSV
go

-- them kq thi mon C cho sv s1 voi so diem 60 : thanh cong
insert tbDiemKQ values('s1','C',60)
go
select * from tbDiemKQ order by MaSV, MaMH
go

-- them kq thi mon C cho sv s1 voi so diem 100 =>  that bai, bi tu choi 
insert tbDiemKQ values('s1','C',100)
go
select * from tbDiemKQ order by MaSV, MaMH
go

/*
case study: ko cho phep doi diem thi cua sinh vien
solution: tao update trigger ngan ko cho thay doi diem thi
*/
create trigger tg_DoiDiemThi on tbDiemKQ
for update as
begin
	if update(diem) 
	begin
		print 'Ko duoc phep thay doi diem ket qua thi cua sinh vien. Tu choi thao tac '
		rollback transaction  -- huy linh update
	end
end
go

/* kiem tra cach trigger tg_DoiDiemThi lam viec */
-- xem ket qua thi cua sinh vien s1
select * from tbDiemKQ where MaSV like 's1' order by MaMH
go
-- doi lai ket qua thi cua luot 1101 dv mon C thanh mon HTML : thanh cong !
update tbDiemKQ set MaMH='HTML' where SoTT =1101
go
select * from tbDiemKQ where MaSV like 's1' order by MaMH
go

-- doi diem thi cua mon HTML =100 cua luot thi 1101 : that bai !!!
update tbDiemKQ set Diem=100 where SoTT = 1101
go
select * from tbDiemKQ where MaSV like 's1' order by MaMH
go

/*
case study: ko cho phep xoa ket qua thi cua sinh vien co ma so s1
solution: tao delete trigger ngan ko cho xoa ket qua thi cua sv nay
*/
create trigger tg_xoaKQ_S1 on tbDiemKQ
for delete as begin
	if 's1' in (select MaSV from deleted)
	begin
		print 'Ko duoc phep xoa ket qua thi cua sinh vien S1. Tu choi thao tac !'
		rollback transaction -- huy linh delete
	end 
end
go


/* kiem tra cach hoat dong cua trigger tg_xoaKQ_S1 */
-- xem kq thi cua tat ca cac sinh vien
select * from tbDiemKQ order by MaSV
go

-- xoa tat ca cac ket qua thi cua sinh vien co ma so s12 : thanh cong.
delete from tbDiemKQ where MaSV ='s12'
go
select * from tbDiemKQ order by MaSV
go

-- xoa tat ca cac ket qua thi cua sinh vien co ma so s1 : bao loi !!!
delete from tbDiemKQ where MaSV ='s1'
go
select * from tbDiemKQ order by MaSV
go
