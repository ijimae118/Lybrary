
package data;
import java.util.*;
public class Test {

    public static void main(String[] args) {
     Test t= new Test();
     t.menu();
    }
    void menu(){
    ProductList p= new ProductList();
    p.LoadFileTest();
    Scanner sc=new Scanner(System.in);
    String op=null;
     
        while (true) {            
            System.out.println("\n Menu");
            System.out.println("1.them san pham");
            System.out.println("2.xem danh sach");
            System.out.println("3.luu du lieu");
            System.out.println("4.thoat");
            System.out.println("Vui long chon chuc nang [1-4]:");
            
            op=sc.nextLine().trim();
            switch(op){
             case"1": p.add(); break;
             case"2": p.display(); break;
             case"3": p.SaveFileText(); break;
             case"4":  return;
            }
        }
    }
}
