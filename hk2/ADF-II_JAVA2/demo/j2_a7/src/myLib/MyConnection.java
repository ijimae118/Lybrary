package myLib;
/*
day la class load driver jdbc, va thiet lap ket noi den CSDL sem2_demo
*/

import java.sql.*;

public class MyConnection {
    public static Connection getCN(){
        String url="jdbc:sqlserver://127.0.0.1:1433; database=sem2_demo";
        String uid = "sa";
        String pwd = "123";
        Connection cn = null;
        try {
            //1. load driver            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     
            //2. mo ket noi den sqlserver, open db sem2_demo
            cn = DriverManager.getConnection(url, uid, pwd);
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }       
        return cn;
    }
}
