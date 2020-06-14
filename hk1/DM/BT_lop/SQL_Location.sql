SELECT 'ResourceDB' AS 'Database Name'
    , NAME AS [Database File]
    , FILENAME AS [Database File Location] 
FROM sys.sysaltfiles 
    WHERE DBID = 32767 
	go
