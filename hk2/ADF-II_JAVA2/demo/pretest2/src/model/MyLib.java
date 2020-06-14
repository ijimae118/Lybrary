package model;

import java.sql.*;

public class MyLib {

    public static void loadDriver(){
        try {
            //nap driver loai 4
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            //System.out.println("Load driver succeeded !");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public static Connection getCN(){
        Connection cn = null;       
        String url = "jdbc:sqlserver://127.0.0.1:1433;database=sem2_demo";
        
        try {
            cn = DriverManager.getConnection(url, "sa", "123");
            //System.out.println("Ket noi thanh cong !!!");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cn;
    }
}
