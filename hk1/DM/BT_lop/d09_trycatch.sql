--open database
use db1908_QLSV
go

-- vi du ve try catch 
--1. ko co bay bat loi try-catch
declare @x int = 10, @y int = 0, @z int
set @z = @x + @y
print 'ket qua phep cong : '
print cast(@x as varchar(10)) + ' + ' + cast(@y as varchar(10)) + ' = ' +   cast(@z as varchar(10))

print 'ket qua phep chia: '
set @z = @x / @y
print cast(@x as varchar(10)) + ' / ' + cast(@y as varchar(10)) + ' = ' + cast(@z as varchar(10))

print 'ket thuc phep toan !'
go


--2. Co bay bat loi try-catch cho phep chia (de phong truong hop chia cho zero)
declare @x int = 6, @y int = 6, @z int
set @z = @x + @y
print 'ket qua phep cong : '
print cast(@x as varchar(10)) + ' + ' + cast(@y as varchar(10)) + ' = ' +   cast(@z as varchar(10))

print 'ket qua phep chia: '
begin try
	set @z = @x / @y
	print cast(@x as varchar(10)) + ' / ' + cast(@y as varchar(10)) + ' = ' + cast(@z as varchar(10))
end try
begin catch
	print '>>> Khong the thuc hien phep chia cho zero !!!'
end catch
print 'ket thuc phep toan !'
go


declare @x int = 10, @y int = 0, @z int
set @z = @x + @y
print 'ket qua phep cong : '
print cast(@x as varchar(10)) + ' + ' + cast(@y as varchar(10)) + ' = ' +   cast(@z as varchar(10))

print 'ket qua phep chia: '
begin try
	set @z = @x / @y
	print cast(@x as varchar(10)) + ' / ' + cast(@y as varchar(10)) + ' = ' + cast(@z as varchar(10))
end try
begin catch
	print '>>> Khong the thuc hien phep chia cho zero !!!'
end catch
print 'ket thuc phep toan !'
go


-- vi du ve @@error
-- case study : nhap 1 mon hoc moi co ma so trung voi mon hoc hoc cu , vi du C
select * from tbMonHoc
go
insert tbMonHoc values ('C', 'Lap trinh C++', 40, 250)
go

select * from tbMonHoc
go
begin try
	insert tbMonHoc values ('C', 'Lap trinh C++', 40, 250)
	select * from tbMonHoc
end try
begin catch
	print 'Loi sai : ' + cast(@@error as varchar(10))
	print 'Thong bao loi: ' + error_message()
	print 'Dong loi: ' + cast(error_line() as varchar(10))
	print 'Ma loi: ' + cast(error_number() as varchar(10) )
end catch
