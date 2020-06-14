use db1908_QLSV
go

-- tao ra 1 bang tk nguoi dung, ma hoa tren cac cot password, email, address
create table tbAccount(
	username varchar(10) not null primary key nonclustered,
	[password] varchar(10) MASKED WITH (FUNCTION = 'default()') not null,  
	email varchar(30) MASKED WITH (FUNCTION = 'email()') not null,  
	[address] varchar(50) MASKED WITH (FUNCTION = 'partial(3,"XXXXXX",0)') not null
)
go


-- them du lieu vo bang tai khoan nguoi dung
insert tbAccount values
('admin', 'admin','admin@fe.edu.vn','590 CMT8 HCMC'),
('guest', 'guest','guest@yahoo.com','unknown ...'),
('staff', '123','staff@fe.edu.vn','590 CMT8 HCMC'),
('thach', 'abc','thach@fe.edu.vn','Go Vap - HCMC')
go

-- truy van danh sach tai khoan nguoi dung
select * from tbAccount
go

-- tao tai khoan nguoi dung moi [thang], va cap quyen select bang tbAccount cho user [thang]
CREATE USER thang WITHOUT LOGIN;
GRANT SELECT ON tbAccount TO thang;
go

-- thuc hien lenh truy van bang tbAccount voi SQL-user [thang]
EXECUTE AS USER = 'thang';
SELECT * FROM tbAccount;
go

revert
SELECT * FROM tbAccount;
go