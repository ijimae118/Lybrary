/*
- nap driver sqljdbc42
- tao 1 ket noi (connection) tu ung dung Java den CSDL(vi du,sem2_demo)
 */
package data;

import java.sql.*;

public class MyLIB {

    public static Connection getCN() {
        Connection cn = null;

        try {
            //1. load LDBC (ko cần vì đã add jdbc4.2 vào C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext)
            //2.tao ket noi den CSDL,cu the co ten sem2_demo
            String url = "jdbc:sqlserver://localhost:1433;database=tbThi";//ko dc de space (dau cach)
            cn = DriverManager.getConnection(url, "sa", "123");

        } catch (SQLException ex) {
            System.out.println("loi: " + ex.getMessage());
        }
        return cn;
    }
 /* Test connection xong thi bỏ    
    public static void main(String[] args) {
        if (MyLIB.getCN() != null) {
            System.out.println("Thanh cong !!!");
        } else {
            System.out.println("That bai !!!");
        }
    }
*/
}
