/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import data.VehicleCatalog;
import java.util.Scanner;

/**
 *
 * @author THUYLM
 */
public class testCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        testCar o = new testCar();
        o.menu();
    }

    public void menu() {
        VehicleCatalog v = new VehicleCatalog();
        Scanner sc = new Scanner(System.in);
//      String op;
        while (true) {
            System.out.println("==========Menu===========");
            System.out.println("1: Them xe ");
            System.out.println("2: Hien thi danh sach xe");
            System.out.println("3: Tim xe theo hang");
            System.out.println("4: Tim xe co GPS");
            System.out.println("5: Tim xe High rank");
            System.out.println("6: Thoat");
            System.out.print("Nhap tu 1 - 6 de thuc hien:  ");
        String op = sc.nextLine();
            switch (op) {
                
                case "1":
                    v.addCar();
                    break;

                case "2":
                    v.displayAll();
                    break;
                    
                case "3":
                    System.out.print("Nhap hang can tim : ");
                    String brands = sc.nextLine().trim();
                    v.searchByBrand(brands);
                    break;

                case "4":
                    v.displayAllGpsCar();
                    break;

                case "5":
                    v.displayHighRank();
                    break;

                case "6":
                    return;
                    
                default:// mac dinh
                    System.out.println("Thao tac khong hop le!");

            }
        }
    }
}
