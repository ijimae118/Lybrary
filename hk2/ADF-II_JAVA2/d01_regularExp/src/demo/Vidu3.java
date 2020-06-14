package demo;

/*
Su dung bieu thuc qui tac ,kiem tra nhap ma so sinh vien co hop le hay ko.
ma so hop le:
 co ky tu bat dau la S or H
 sau do la 5-8
neu nhap sai -> thong bao loi va yeu cau nhap lai.
 */

import java.util.*;
import java.util.regex.*;

public class Vidu3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id;
        Pattern p;
        Matcher m;

        p = Pattern.compile("[SH]\\d{5,8}");
        while (true) {
            System.out.print("Nhap ma so sinh vien: ");
            id = sc.nextLine().trim();

            //khoi tao m 
            m = p.matcher(id);
            //kiem tra mau p co khop voi chuoi nhap phone ?
            if (m.matches()) {
                break;// ra khoi vong lap vi da nhap dung
            }
            System.out.println("loi: id ko hop le .Phai co dinh dang Sxxxxx[xxx] or Hxxxxx[xxx] !!!");
        }
        System.out.println("Ma so: " + id);
    }

}
