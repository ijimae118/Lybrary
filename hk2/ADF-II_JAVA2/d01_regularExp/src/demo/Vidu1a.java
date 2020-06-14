/*
Su dung bieu thuc qui tac ,kiem tra nhap ten co hop le hay ko.
ten hop le - duoc mo ta trong Vidu1.
neu nhap sai -> thong bao loi va yeu cau nhap lai.
 */
package demo;

import java.util.regex.Pattern;//tham chieu goi con
import java.util.regex.Matcher;
import java.util.Scanner;//chi tham chieu class

public class Vidu1a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tenSV;
        Pattern p;
        Matcher m;
        
        
        while (true) {
            p = Pattern.compile("[a-z ]{4,30}",Pattern.CASE_INSENSITIVE);//CASE_INSENSITIVE ko phan biet chu :viet hoa ,viet thuong.
            
            System.out.print("Nhap ten sinh vien: ");
            tenSV =sc.nextLine().trim();
            //khoi tao doi tuong so khop [m]de so sanh chuoi [tenSV] voi mau [p]
            m=p.matcher(tenSV);
            //"thuc hien" viec so khop doi chieu bang ham matches() cua doi tuong [m]
            if (m.matches()) {
                break;// nhap dung -> thoat vong lap while
            }
            System.out.println("Ten ko hop le !(chi chua ky tu 4-5 ky tu chu)! ");           
        }
        
        System.out.println("Ten sinh vien: "+tenSV);
    }

}
