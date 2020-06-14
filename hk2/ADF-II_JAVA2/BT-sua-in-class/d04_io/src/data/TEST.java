
package data;

import java.util.*;
public class TEST {

    public static void main(String[] args) {
       TEST o = new TEST();
       o.menu();
    }
    
    void menu(){
        ProductList p = new ProductList();
        p.LoadFileText();
        
        Scanner sc =new Scanner(System.in);
        String op=null;
        
        while(true){
            System.out.println("\n  MENU");
            System.out.println("1. them san pham");
            System.out.println("2. xem danh sach");
            System.out.println("3. luu du lieu");
            System.out.println("4. Thoat");
            System.out.print(" Vui long nhap chuc nang [1-4]: ");
            
            op = sc.nextLine().trim();
            switch(op){
                case "1": p.add(); break;
                case "2": p.display();break;
                case "3": p.SaveFileText();break;
                case "4": return;
            }
        }
    }
}
