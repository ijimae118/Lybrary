use db1908_QLSV
go
--cac trigger ben duoi la after trigger:
/*muon ap dung qui tac cho viec nhap diem thi:
1 sinh vien chi co the thi 1 mon hoc toi da 2 lan
=>phải viết trigger de cai dat qui tac tren
=>tao trigger insert cho bang diem thi
*/
select* from tbDiemKQ
go
create trigger tg_Thi
on tbDiemKQ
for insert as 
	begin
    --khai bao 2 bien chua ma so sv va ma so mon hoc cua ket qua thi moi nhap 
	declare @sv varchar(10),@monthi varchar(10);
	--lay gia tri cua 2 cot ma sinh vien va ma mon hoc cua kq thi moi nhap vo bang 
	select @sv=MaSV,@monthi=MaMH from inserted
    --dem so lan thi cua mon hoc moi nhap doi voi ban sv nay
	declare @solanthi int=0
	select @solanthi=count(*) from tbDiemKQ
	where MaSV like @sv and MaMH like @monthi
    --kiem tra if ban sv nay thi tren 2 la: thu choi them kq vo database
	if(@solanthi>2)
	begin
	print'Ko the thi 1 mon hoc qua 2 lan.Tu choi thao tac'
	rollback transaction -- huy lệnh insert(if ko co dong nay thi no van dua vao database mac du co bao loi)
	end
end
--thu xem trigger hoat dong nhu the nao?
select*from tbDiemKQ order by MaSV
go
-- them kq thi mon c cho sv s1 voi so diem 60:thanh cong
insert tbDiemKQ values('s1','C',60)
go

select*from tbDiemKQ order by MaSV,MaMH
go
-- them kq thi mon c cho sv s1 voi so diem 100:that bai,bi tu choi
insert tbDiemKQ values('s1','C',100)
go

select*from tbDiemKQ order by MaSV,MaMH
go
/*
case ko cho phep doi diem thi cua sinh vien
solution:tao update trigger ngan ko cho thay doi diem thi
*/
create trigger tg_DoiDiemThi on tbDiemKQ
for update as
begin
	if update(diem)
	begin
	print'Ko dc phep thay doi diem ket qua thi cua sinh vien. Tu choi thao tac'
	rollback transaction--huy lenh update
	end
end
go
-- drop de thu thi nghiem tru diem benh store proceduces
/*drop trigger  tg_DoiDiemThi
go*/

/*ktra cach trigger tg_DoiDiemThi lam viec*/
--xem kq thi cua sinh vien S1
select*from tbDiemKQ where MaSV='s1' order by MaMH
go
--doi lai kq thi cua luot 260 dv mon C thanh mon HTML:thanh cong
update tbDiemKQ set MaMH='HTML'where SoTT=260
go
select*from tbDiemKQ where MaSV='s1' order by MaMH
go

--doi diem thi cua mon HTML=100 cua luot thi 260:that bai!!!
update tbDiemKQ set Diem=100 where SoTT=260
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
/*ktra cach hoat dong cua trigger tg_xoaKQ_s1*/
--xem kq thi cua ca cac sinh vien
select*from tbDiemKQ order by MaSV
-- xoa tat ca cac ket qua thi cua sinh vien co ma so s12:thanh cong
delete from tbDiemKQ where MaSV='s12'
go
select*from tbDiemKQ order by MaSV
go
-- xoa tat ca cac ket qua thi cua sinh vien co ma so s1:ko thanh cong
delete from tbDiemKQ where MaSV='s1'
go
select*from tbDiemKQ order by MaSV
go
