
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/*
 *Tao cau truc vector de luu danh sach ten sinh vien
 vector==arraylist
 */


public class Vidu2 {

    public static void main(String[] args) {
        List ds = new Vector();
        ds.add("Le Minh");
        ds.add("Anh Tuan");
        ds.add("Gia Lam");
        ds.add(null);
        ds.add("Anh Tuan");
        ds.add(12345);

        System.out.println("Danh sach ten sinh vien: ");
        for (Object ten : ds) {
            System.out.println(ten);//dc dinh dang theo toString
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien muon xoa ");
        String s = sc.nextLine().trim();
        ds.remove(s);

        System.out.println("Danh sach ten sinh vien: ");
        for (Object ten : ds) {
            System.out.println(ten);//dc dinh dang theo toString
        }
        
        //doi ten sinh vien dong thu2
        ds.set(1, "Thien Y");
        System.out.println("Danh sach ten sinh vien: ");
        for (Object ten : ds) {
            System.out.println(ten);//dc dinh dang theo toString
        }
    }

}
