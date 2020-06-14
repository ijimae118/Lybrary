
package data;

import java.util.*;
public class TEST {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String op ="";
        
        DoctorList p = new DoctorList();
        
        
        while(true){
            System.out.println("\n *** MENU ***");
            System.out.println("1. Them bac si");
            System.out.println("2. Xoa bac si theo ma so");
            System.out.println("3. Danh sach bac si ck 2");
            System.out.println("4. Tim bac si theo ten");
            System.out.println("5. Thoat");
            System.out.print(" Vui long nhap chuc nang [1-5]: ");
            
            op = sc.nextLine().trim();
            switch(op){
                case "1":
                    p.add(); break;
                case "2":
                    System.out.print(" nhap ma so bac si: ");
                    p.remove(sc.nextLine().trim());
                    break;
                case "3":
                    p.display(); break;
                case "4":
                    System.out.print(" nhap ten bac si: ");
                    p.display(sc.nextLine().trim());
                    break; 
                case "5":
                    break;
            }
        }
        
    }
    
    void test(){
        ArrayList a = new ArrayList();
        HashSet b = new HashSet();
        TreeMap c = new TreeMap();
    }
    
}
