/*
Set:(hashset,treeset):ko chua dc cac phan tu trung lap
* Tao 1 cau truc hashset chua danh sach ten sinh vien
HashSet không duy trì thứ tự nào, trong khi TreeSet duy trì thứ tự tăng dần.
HashSet ko chua phan tu trung lap.
TreeSet ko chua phan tu trung lap vs null (vi no phai sap xep cac phan tu).
 */
import java.util.*;

public class Vidu1 {

    public static void main(String[] args) {
       String[] dsTen={"Minh","lam","Huy","Phong","Duong",null,"Chuan","Huy"};
       
       Set ds1 = new HashSet();
       
        for (String item : dsTen) {
            ds1.add(item);
        }
        
        System.out.println("Danh sach ten sinh vien [array dsTen]: ");
        for (String item : dsTen) {
            System.out.printf("%s ",item);
        }
        
        System.out.println("\n Danh sach ten sinh vien [hashset dsTen]: ");
        for (Object item : ds1) {
            System.out.printf("%s ",item);
        }
        
        System.out.println("");
        
        Set ds2= new TreeSet();
        for (String item : dsTen) {
            if (item==null) {
                continue;
            }
            ds2.add(item);
        }
        System.out.println("\n Danh sach ten sinh vien [Tree dsTen]: ");
        for (Object item : ds2) {
            System.out.printf("%s ",item);
        }
        
        System.out.println("");
    }
    
}
