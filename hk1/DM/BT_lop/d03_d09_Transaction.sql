--open database
use db1908_QLSV
go

--xem danh sach giao vien
select * from tbGiangVien
go

--them 1 vi giao vien moi : thanh cong
insert tbGiangVien values ('F6','Le Minh','minh@yahoo.com','F10')
go
--xem danh sach giao vien
select * from tbGiangVien
go

--them 1 vi giao vien moi (cung co ma F6): that bai
insert tbGiangVien values ('F6','Quach Gia Lam','lam@yahoo.com','F10')
go
--xem danh sach giao vien
select * from tbGiangVien
go

-- them vao 1 luc 3 giang vien moi
insert tbGiangVien values
('F11','Quach Gia Lam','lam@gmail.com','F10'),
('F12','Hoang Duc Quang','quang@gmail.com','F1'),
('F13','Le Thanh Nhan','nhan@gmail.com','F1');
go
select * from tbGiangVien
go

-- tiep tuc them vao 1 luc 3 giang vien moi
insert tbGiangVien values
('F14','Nguyen thi Lanh','lanh@gmail.com','F2'),
('F15','Tran Tuan Cat','cat@gmail.com','F1'),
('F13','Tran Thi Huong','huong@gmail.com','F1');
go
select * from tbGiangVien
go

/* == vi du minh hoa ve explicit transaction ==*/
/* case study: moi giao vien chi co the lead toi da 2 giao vien khac 
   solution : 
   cach 1: tao trigger insert / update
   cach 2: dung transaction (*)
*/
begin tran
	insert tbGiangVien values ('F14', 'Dao Cong Duong','duong@yahoo.com','F2')
	declare @dem int = 0;
	select @dem = count(*) from tbGiangVien where leader like 'F2'
	if(@dem <3 )
		commit tran
    else
	begin
	   print 'Mot GV khong the lead nhieu hon 2 giao vien !'
	   rollback tran
	end
go