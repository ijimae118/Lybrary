/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.util.Scanner;
import Goods.*;

/**
 *
 * @author THUYLM
 */
public class Inventory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LaptopCatalog lc = new LaptopCatalog();
        String op;
        while (true){
            System.out.println("---MENU---");
            System.out.println("1. Them laptop moi");
            System.out.println("2. Tim kiem laptop bang ten");
            System.out.println("3. In toan bo ds laptop");
            System.out.println("4. Xoa laptop theo ma so");
            System.out.println("5. Thoat");
            System.out.print("Vui long chon chuc nang: ");
            op = sc.nextLine();
            switch(op){
                case "1":
                    lc.addLaptop();
                    break;
                case "2":
                    System.out.print("Nhap ten laptop can tim: ");         
                    lc.search(sc.nextLine().trim().toLowerCase());
                    break;
                case "3":
                    lc.displayAll();
                    break;
                case "4":
                    System.out.print("Nhap ma so laptop can xoa: ");
                    lc.remove(sc.nextLine());
                    break;
                case "5":
                    return;
            }
        }
    }
    
}
