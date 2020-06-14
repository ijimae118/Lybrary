package model;

import java.sql.*;
import java.util.*;
import myLib.MyConnection;

public class EmpoyeeDAO {

    public static List<Employee> getList() {
        List<Employee> ds = new ArrayList<>();

        Connection cn = MyConnection.getCN();
        try {
            Statement sta = cn.createStatement();

            String sql = "select*from tbEmployee";
            ResultSet rs = sta.executeQuery(sql);

            while (rs.next()) {
                Employee e = new Employee();
                e.id = rs.getString(1);
                e.fullname = rs.getString(2);
                e.gender = rs.getBoolean(3);
                e.salary = rs.getInt(4);

                ds.add(e);

            }

            rs.close();
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }

    public static List<Employee> getList(String eName) {
        List<Employee> ds = new ArrayList<>();
        Connection cn = MyConnection.getCN();
        try {
            String sql = "select * from tbEmployee where fullname like ?";
            PreparedStatement sta = cn.prepareStatement(sql);
            sta.setString(1, "%" + eName + "%");

            ResultSet rs = sta.executeQuery();

            while (rs.next()) {
                Employee e = new Employee();
                e.id = rs.getString(1);
                e.fullname = rs.getString(2);
                e.gender = rs.getBoolean(3);
                e.salary = rs.getInt(4);

                ds.add(e);
            }

            rs.close();
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }

    public static int insert(Employee e) {
        Connection cn = MyConnection.getCN();
        int n = 0;
        try {
            String sql = "insert tbEmployee values(?,?,?,?)";
            PreparedStatement pre = cn.prepareStatement(sql);
            pre.setString(1, e.id);
            pre.setString(2, e.fullname);
            pre.setBoolean(3, e.gender);
            pre.setInt(4, e.salary);
            n=pre.executeUpdate();
            pre.close();
            cn.close();
        } catch (Exception ex) {
            System.out.println("loi sai " + ex.getMessage());
            n = -1;
        }
        return n;
    }
    public static boolean update(String manv, int luongmoi){
        Connection cn = MyConnection.getCN();
        String sql = "update tbEmployee set salary=? where id=?";
        int n = 0;
        
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setInt(1,luongmoi);
            pstm.setString(2,manv);
            n = pstm.executeUpdate();
            pstm.close();
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return n>0;
    }
}
