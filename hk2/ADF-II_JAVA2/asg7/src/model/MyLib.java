
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MyLib {
        public static java.sql.Connection getCN() throws SQLException {
        Connection cn = null;

        try {
            //1.load driver sqljdbc42
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//can co de may khach chay

            //2.tao ket noi den CSDL,cu the co ten sem2_demo
            String url = "jdbc:sqlserver://localhost:1433;database=javaDB";
            cn = DriverManager.getConnection(url, "sa", "123");

        } catch (SQLException ex) {
            System.out.println("loi: " + ex.getMessage());
        }

        return cn;
    }
}
