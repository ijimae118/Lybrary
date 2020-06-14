/*
- Lop Thu vien co 2 chuc nang:
  1. Load driver sqljdbc
  2. Mo ket noi tu ung dung java den SQL Server
 */
package data;

import java.sql.*;


public class MyLib {
    public static void loadDriver(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public static Connection getConnect(){
        Connection cn = null;
        String url = "jdbc:sqlserver://localhost:1433;database=sem2_demo";
        
        try {
            cn = DriverManager.getConnection(url, "sa", "123");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return cn;
    }
}
