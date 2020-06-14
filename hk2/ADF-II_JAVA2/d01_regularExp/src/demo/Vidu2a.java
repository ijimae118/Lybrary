/*
Su dung bieu thuc qui tac ,kiem tra nhap so dien thoai co hop le hay ko.
so dt hop le:
chi chua ky tu so 0-9 va co it nhat 3 so
neu nhap sai -> thong bao loi va yeu cau nhap lai.
 */
package demo;

import java.util.*;
import java.util.regex.*;
public class Vidu2a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phone;
        Pattern p;
        Matcher m;
        
        p = Pattern.compile("\\d{3,}");
        while (true) {            
            System.out.print("Nhap so dien thoai: ");
            phone =sc.nextLine().trim();
            
            //khoi tao m 
            m=p.matcher(phone);//matcher chi sai cho String ko sai cho int
            //kiem tra mau p co khop voi chuoi nhap phone ?
            if (m.matches()) {
                break;// ra khoi vong lap vi da nhap dung
            }
            System.out.println("loi: Phone ko hop le .It nhat la 3 ky so !!!");
        }
        System.out.println("So dien thoai: "+ phone);
    }
    
}
