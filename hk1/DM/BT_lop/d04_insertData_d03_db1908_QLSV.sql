/* 
Tiep tuc them du lieu cho cac bang: 
diem thi, giao vien, mon hoc giao vien trong CSDL db1908_QLSV
*/
use db1908_QLSV
go

--13. them du lieu cho bang ket qua thi, luu y ko nhap du lieu cot STT (vi la so thu tu tang tu dong)
insert tbDiemKQ values
('s1','C',40),
('s1','BSJ',60),
('s2','C',90),
('s2','BSJ',60),
('s2','HTML',90),
('s2','ePRO1',70),
('s4','C',50),
('s4','BSJ',80),
('s4','HTML',30),
('s4','ePRO1',90),
('s5','C',100),
('s5','BSJ',60),
('s5','ePRO1',80),
('s6','C',33),
('s6','BSJ',25),
('s6','HTML',100),
('s6','ePRO1',75),
('s7','C',20),
('s7','BSJ',40),
('s7','ePRO1',70),
('s8','C',100),
('s8','BSJ',80),
('s8','HTML',100),
('s8','ePRO1',85),
('s9','C',70),
('s9','BSJ',80),
('s9','HTML',75),
('s9','ePRO1',85),
('s12','BSJ',30),
('s13','HTML',25),
('s14','C',30),
('s14','ePRO1',100)
go
select * from tbDiemKQ
go

--14. them du lieu cho bang giang vien
insert tbGiangVien values
('F1', 'Dao Ngoc Anh','anhdn@fe.edu.vn'),
('F2', 'Le Gia Minh','minhlm@gmail.com'),
('F3', 'Dang Tran Tho','thodt@hotmail.com'),
('F4', 'Nguyen Van Binh','binhnv@yahoo.com')
go
select * from tbGiangVien
go

--15. Them du lieu cho bang mon hoc - giang vien
insert tbMonHocGV values
('C','F1'),
('C','F2'),
('C','F3'),
('C','F4'),
('BSJ','F1'),
('BSJ','F4'),
('CSDL','F2'),
('CSDL','F3'),
('HTML','F1'),
('ePRO1','F1'),
('ePRO1','F4')
go
select * from tbMonHocGV
go
