// nhấn ctrl+H để đổi Batch->MonHoc
package data;
import java.sql.*;
import java.util.*;
public class MonHocDAO {
       //ham thuc hien chuc nang truy van du lieu (Read) trong bang [tbMonHoc] va tra ve 1 arrayList
    public static ArrayList<MonHoc> getList() {
        ArrayList<MonHoc> ds = new ArrayList<>();

        // mo ket noi
        Connection cn = MyLIB.getCN();//tinh ra phai kiem tra if(cn==null){la sai},o day chi la dat cn ket noi thanh cong  
        try {
            //tao doi tuong statement chua linh Select sql
            Statement st = cn.createStatement();  //lenh nay yeu cau try catch

            // cho thuc hien linh select
            String sql = "select * from tbMonHoc";
            ResultSet rs = st.executeQuery(sql);

            // vong lap,doc tung dong ket qua 
            while (rs.next()) {
                //trong mot dong ,doc tung cot - va tao ra 1 doi tuong MonHoc ->dua cao ds
                MonHoc b = new MonHoc();
                b.ma = rs.getInt(1);            //rs.getString(1) theo dung thu tu cot
                b.tenNgan = rs.getString(2);  //rs.getString(2)
                b.tenDai = rs.getString(3);                  //rs.getInt(3)
                b.soTiet=rs.getInt(4);

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
    public static int insert(MonHoc b) {
        int r = 0;

        //1.mo ket noi
        Connection cn = MyLIB.getCN();

        //2.Tao doi tuong PrepareStatement chua cau linh insert SQL
        String sql = "insert tbMonHoc values(?,?,?)";

        try {
            PreparedStatement st = cn.prepareStatement(sql);

            //3.dien gia tri cua cac thuoc tinh trong doi tuong lop hoc b cho cac tham so ?
            st.setString(1, b.tenNgan); //xep theo thu tu cot
            st.setString(2, b.tenDai);
            st.setInt(3, b.soTiet);

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
    public static int delete(int maso) {
        int r = 0;

        //1.mo ket noi
        Connection cn = MyLIB.getCN();

        //2.Tao doi tuong PrepareStatement chua cau linh insert SQL
        String sql = "delete from tbMonHoc where maso=?";

        try {
            PreparedStatement st = cn.prepareStatement(sql);

            //3.dien gia tri cua maso cho tham so ?
            st.setInt(1, maso); //xep theo thu tu cot

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
