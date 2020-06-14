/*
Lop tuong tac thuc hien cac chuc nang CRUD (Create,Read (Select),Update,Delete) tren bang [tbBatch] cua database [sem2_demo]
 */
package data;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BatchDAO {

    //ham thuc hien chuc nang truy van du lieu (Read) trong bang [tbBatch] va tra ve 1 arrayList
    public static ArrayList<Batch> getList() {
        ArrayList<Batch> ds = new ArrayList<>();

        // mo ket noi
        Connection cn = MyLIB.getCN();//tinh ra phai kiem tra if(cn==null){la sai},o day chi la dat cn ket noi thanh cong  
        try {
            //tao doi tuong statement chua linh Select sql
            Statement st = cn.createStatement();  //lenh nay yeu cau try catch

            // cho thuc hien linh select
            String sql = "select * from tbBatch";
            ResultSet rs = st.executeQuery(sql);

            // vong lap,doc tung dong ket qua 
            while (rs.next()) {
                //trong mot dong ,doc tung cot - va tao ra 1 doi tuong Batch ->dua cao ds
                Batch b = new Batch();
                b.maLop = rs.getString("batchno");            //rs.getString(1) theo dung thu tu cot
                b.chuongTrinh = rs.getString("description");  //rs.getString(2)
                b.hocPhi = rs.getInt("fee");                  //rs.getInt(3)

                //dua doi tuong b vo arraylist ds
                ds.add(b);
            }

            //dong ket noi
            cn.close();

        } catch (SQLException ex) {
            System.out.println("loi: " + ex.getMessage());
        }

        return ds;
    }

    //ham them 1 lop hoc moi vo bang [tbBatch],tra ve 1 so nguyen
    public static int insert(Batch b) {
        int r = 0;

        //1.mo ket noi
        Connection cn = MyLIB.getCN();

        //2.Tao doi tuong PrepareStatement chua cau linh insert SQL
        String sql = "insert tbBatch values(?,?,?)";

        try {
            PreparedStatement st = cn.prepareStatement(sql);

            //3.dien gia tri cua cac thuoc tinh trong doi tuong lop hoc b cho cac tham so ?
            st.setString(1, b.maLop); //xep theo thu tu cot
            st.setString(2, b.chuongTrinh);
            st.setInt(3, b.hocPhi);

            //4.thi hanh linh insert
            r = st.executeUpdate();

            //5.dong ket noi
            cn.close();

        } catch (SQLException ex) {
            System.out.println("loi: " + ex.getMessage());
        }

        return r;
    }

    //ham xoa 1 lop hoc theo ma so
    public static int delete(String maso) {
        int r = 0;

        //1.mo ket noi
        Connection cn = MyLIB.getCN();

        //2.Tao doi tuong PrepareStatement chua cau linh insert SQL
        String sql = "delete from tbBatch where batchno=?";

        try {
            PreparedStatement st = cn.prepareStatement(sql);

            //3.dien gia tri cua maso cho tham so ?
            st.setString(1, maso); //xep theo thu tu cot

            //4.thi hanh linh delete
            r = st.executeUpdate();

            //5.dong ket noi
            cn.close();

        } catch (SQLException ex) {
            System.out.println("loi: " + ex.getMessage());
        }

        return r;
    }
}
