/*
Su dung bieu thuc qui tac ,kiem tra nhap ma so Trung Tam co hop le hay ko.
ma so hop le:
 HN or SG or DN or CT
neu nhap sai -> thong bao loi va yeu cau nhap lai.
 */
package demo;

/**
 *
 * @author PC
 */
import java.util.*;
import java.util.regex.*;

public class Vidu4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String center;
        Pattern p;
        Matcher m;

        p = Pattern.compile("(HN|SG|HCMC|CT|DN)", Pattern.CASE_INSENSITIVE);// pattern :xay dung cau truc,matcher:Xo khop. 
        while (true) {
            System.out.print("Nhap so ma so: ");
            center = sc.nextLine().trim();

            //khoi tao m 
            m = p.matcher(center); //chổ này ko đc đổi matcher
            //kiem tra mau p co khop voi chuoi nhap phone ?
            if (m.matches()) {    // đổi lookingAt() or find() ở đây
                break;// ra khoi vong lap vi da nhap dung
            }
            System.out.println("loi: CenterID ko hop le!");
            System.out.println("Hoac HN,HCMC,SG,CT,DN!!!");
        }
        System.out.println("Ma so: " + center);
        
        // de kiem tra ,chung ta co the su dung ham
        //- lookingAt() :luat p xuat hien o dau chuoi center    vidu:"HN,Quan Hoan kiem"==true;ở đầu thì đúng,còn ở sau thì "Quan Hoan kiem,HN"==false;
        
        //-find()       :luat p xuat hien trong chuoi center    vidu:"SG,quan3","Quan3,SG.FPTAptech"==true; tìm giống thì ok
        
        //-matches()    :luat p phai giong y chang chuoi center vidu:"SG"==true;tìm giống y chang mới đúng

    }

}
