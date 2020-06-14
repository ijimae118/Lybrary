package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProjectDAO {
    //ham thuc hien chuc nang truy van du lieu (Read) trong bang [tbProject] va tra ve 1 arrayList

    public static ArrayList<Project> getList() throws SQLException {
        ArrayList<Project> ds = new ArrayList<>();

        // mo ket noi
        Connection cn = MyLib.getCN();//tinh ra phai kiem tra if(cn==null){la sai},o day chi la dat cn ket noi thanh cong  
        try {
            //tao doi tuong statement chua linh Select sql
            Statement st = cn.createStatement();  //lenh nay yeu cau try catch

            // cho thuc hien linh select
            String sql = "select * from tbProject";
            ResultSet rs = st.executeQuery(sql);

            // vong lap,doc tung dong ket qua 
            while (rs.next()) {
                //trong mot dong ,doc tung cot - va tao ra 1 doi tuong Batch ->dua cao ds
                Project b = new Project();
                b.id = rs.getInt(1);            //rs.getString(1) theo dung thu tu cot
                b.projectName = rs.getString(2);  //rs.getString(2)
                b.startDate = rs.getString(3);
                b.value = rs.getInt(4);                  //rs.getInt(3)
                b.completed = rs.getBoolean(5);
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
    public static int insert(Project pro) throws SQLException {
        int r = 0;

        //1.mo ket noi
        Connection cn = MyLib.getCN();

        //2.Tao doi tuong PrepareStatement chua cau linh insert SQL
        String sql = "insert tbProject values(?,?,?,?)";

        try {
            PreparedStatement st = cn.prepareStatement(sql);

            //3.dien gia tri cua cac thuoc tinh trong doi tuong lop hoc b cho cac tham so ?
            st.setString(1, pro.projectName); //xep theo thu tu cot
            st.setString(2, pro.startDate);
            st.setInt(3, pro.value);
            st.setBoolean(4, pro.completed);

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
    public static int delete(String pID) throws SQLException {
        int r = 0;

        //1.mo ket noi
        Connection cn = MyLib.getCN();

        //2.Tao doi tuong PrepareStatement chua cau linh insert SQL
        String sql = "delete from tbProject where ID=?";

        try {
            PreparedStatement st = cn.prepareStatement(sql);

            //3.dien gia tri cua maso cho tham so ?
            st.setString(1, pID); //xep theo thu tu cot

            //4.thi hanh linh delete
            r = st.executeUpdate();

            //5.dong ket noi
            cn.close();

        } catch (SQLException ex) {
            System.out.println("loi: " + ex.getMessage());
        }

        return r;
    }

    public static void getCompletedProject() throws SQLException {
    //    getList().stream().filter(item->item.completed==true).forEach(System.out::println);
        for (Project project : getList()) {
            if (project.completed==true) {
                System.out.println(project);
            }
        }

    }
}
