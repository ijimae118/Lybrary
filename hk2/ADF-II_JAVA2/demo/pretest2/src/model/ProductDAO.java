/*
Mo ta cac xu ly lien quan den CSDL doi voi doi tuong san pham:
- them 1 san pham vo bang tbProduct
- xoa 1 san pham trong bang tbProduct theo ma so
- xem danh sach cac san pham trong tbProduct
 */
package model;

import java.sql.*;
import java.util.*;


public class ProductDAO {

    static {
        MyLib.loadDriver();
    }

    //phuong thuc tra ve 1 danh sach tat ca cac san pham trong tbProduct
    public static List<Product> getList() {
        List<Product> ds = new ArrayList<>();

        //1. tao ket noi den database sem2_demo
        Connection cn = MyLib.getCN();

        try {
            //2. tao doi tuong chua linh sql
            String sql = "select * from tbProduct";
            Statement st = cn.createStatement();

            //3. cho thi hanh linh select
            ResultSet rs = st.executeQuery(sql);

            //4. duyet ket qua trong resultset -> ds            
            Product b = null;
            while (rs.next()) {
                b = new Product();
                
                b.id = rs.getInt(1);
                b.name = rs.getString(2);
                b.price = rs.getInt(3);
                b.qoh = rs.getInt(4);

                ds.add(b);
            }
            //5. dong ket noi
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return ds;
    }

    //them 1 san pham moi vo bang tbProduct
    public static int insert(Product b) {
        int n = -1;
        //1. tao ket noi
        Connection cn = MyLib.getCN();

        try {
            //2. tao doi tuong thi hanh linh insert
            String sql = "insert tbProduct values(?, ?, ?) ";
            PreparedStatement pst = cn.prepareStatement(sql);

            //3. gan gia tri cho cac tham so ?
            pst.setString(1, b.name);
            pst.setInt(2, b.price);
            pst.setInt(3, b.qoh);

            //4. thi hinh linh insert
            n = pst.executeUpdate();

            //5. dong ket noi
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return n;
    }

    
    //pthuc tim san pham theo ten
    public static List<Product> getList(String sName) {
        List<Product> ds = new ArrayList<>();

        //1. tao ket noi den database sem2_demo
        Connection cn = MyLib.getCN();

        try {
            //2. tao doi tuong chua linh sql
            String sql = "select * from tbProduct where name like ?";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, "%" + sName + "%");
            
            //3. cho thi hanh linh select
            ResultSet rs = st.executeQuery();

            //4. duyet ket qua trong resultset -> ds            
            Product b = null;
            while (rs.next()) {
                b = new Product();
                
                b.id = rs.getInt(1);
                b.name = rs.getString(2);
                b.price = rs.getInt(3);
                b.qoh = rs.getInt(4);

                ds.add(b);
            }
            //5. dong ket noi
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return ds;
    }
      
    
}
