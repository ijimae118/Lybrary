/*
Lop tuong tac voi bang tbBatch, thuc hien cac chuc nang xem, the, xoa , sua 
 */
package data;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BatchDAO {

    static {
        //load driver
        MyLib.loadDriver();
    }

    //tra ve 1 danh sach cac lop hoc - truy van tu bang tbBatch
    public static ArrayList<Batch> getList() {
        ArrayList<Batch> ds = new ArrayList<>();

        //1. tao ket noi den DB
        Connection cn = MyLib.getConnect();

        try {
            //2. tao doi tuong Statment chua linh select-sql
            Statement st = cn.createStatement();

            //3. cho thuc hien linh truy van 
            // - doc het noi dung bangt tbBatch
            String sql = "select * from tbBatch";
            ResultSet rs = st.executeQuery(sql);

            //4. Xu ly ket qua - doc het cac dong trong resultset
            //   dua vo arraylist ds
            while (rs.next()) {
                Batch b = new Batch();
                b.batchno = rs.getString("batchno"); // index 1
                b.description = rs.getString(2);
                b.fee = rs.getInt(3);
                
                ds.add(b);
            }

            //5. dong ket noi, dong tai nguyen
            cn.close();
            st.close();
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return ds;
    }
    
    
    //them 1 lop hoc moi vo bang tbBatch
    public static int insert(Batch b){
        int r = 0;
        
        //1. tao ket noi
        Connection cn = MyLib.getConnect();
        
        //2. tao doi tuong Preparestatement chua linh insert-sql
        String sql = "insert tbBatch values(?, ? , ?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            //thay the cac place holder ? bang cac gia tri tuong ung
            pst.setString(1, b.batchno);
            pst.setString(2, b.description);
            pst.setInt(3, b.fee);
            
            //3. thuc hien linh sql
            r = pst.executeUpdate();
            
            //4. dong ket noi
            cn.close();
            pst.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return r;
    }

}
