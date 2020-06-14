/*
- nap driver sqljdbc42
- tao 1 ket noi (connection) tu ung dung Java den CSDL(vi du,sem2_demo)
 */
package data;

import java.sql.*;

public class MyLIB {

    public static java.sql.Connection getCN() {
        Connection cn = null;

        try {
            //1.nap driver sqljdbc42
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//can co de may khach chay

            //2.tao ket noi den CSDL,cu the co ten sem2_demo
            String url = "jdbc:sqlserver://localhost:1433;database=sem2_demo";
            cn = DriverManager.getConnection(url, "sa", "123");

        } catch (ClassNotFoundException ex) {
            System.out.println("loi: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("loi: " + ex.getMessage());
        }

        return cn;
    }
}
