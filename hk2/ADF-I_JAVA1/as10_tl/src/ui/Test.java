/*
Create main class TEST in package ui that allows user to manage the customers accepted into
system through the menu system as follows:
1. Add a new customer
2. Search customers by name
3. Display all customers
4. Exit
 */
package ui;

import data.CustomerCatalog;
import java.util.Scanner;


public class Test {

    public static void main(String[] args) {
        Test o= new Test();
        o.menu();
       
    }
    
    void menu(){
        Scanner sc = new Scanner(System.in);
        CustomerCatalog lc = new CustomerCatalog();
        String op;
        while (true){
            System.out.println("---MENU---");
            System.out.println("1. Them khach hang moi");
            System.out.println("2. Tim kiem khach hang bang ten");
            System.out.println("3. In toan bo ds khach hang");
            System.out.println("4. Thoat");
            System.out.print("Vui long chon chuc nang: ");
            op = sc.nextLine();
            switch(op){
                case "1":
                    lc.add();
                    break;
                case "2":
                    System.out.print("Nhap ten khach hang can tim: ");         
                    lc.searchByName(sc.nextLine().trim());
                    break;
                case "3":
                    lc.displayAll();
                    break;
                case "4":
                    return;
            }
        }
    
    }
    
}
