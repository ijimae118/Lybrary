package ui;

import java.sql.SQLException;
import model.MyLib;

public class TestConnect {

    public static void main(String[] args) throws SQLException {
        if (model.MyLib.getCN() == null) {
            System.out.println("Thoi roi,buon oi chao mi!!! :( ");
        } else {
            System.out.println(">>Thanh cong roi!!! :) ");
        }

    }
}
