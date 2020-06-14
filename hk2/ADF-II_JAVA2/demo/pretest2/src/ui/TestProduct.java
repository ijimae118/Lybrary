/*
Quan ly danh sach cac san pham
 */
package ui;

import java.util.*;
import model.*;

public class TestProduct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op = "";

        while (true) {
            System.out.println("\n == MENU ==");
            System.out.println("1. Xem danh sach cac san pham");
            System.out.println("2. Them 1 san pham moi");
            System.out.println("3. Tim san pham theo ten");
            System.out.println("4. Thoat");
            System.out.print(" CHON CHUC NANG MUON THUC HIEN [1-4]: ");
            op = sc.nextLine();

            switch (op) {
                case "1":
                    List<Product> ds = ProductDAO.getList();
                    ds.forEach(System.out::println);
                    break;

                case "2":
                    add();
                    break;

                case "3":
                    search();
                    break;

                case "4":
                    return;
            }
        }
    }

    private static void add() {
        Product b = new Product();
        b.input();
        if (ProductDAO.insert(b) > 0) {
            System.out.println(" >> Da them san pham moi thanh cong");
        } else {
            System.out.println(" >> Loi: Them san pham that bai <<");
        }
    }

    private static void search() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhap ten san pham muon tim: ");
        String ten = sc.nextLine();
        
        List<Product> ds = ProductDAO.getList(ten);
        if(ds.isEmpty()){
            System.out.println(" >> Ko tim thay !!! ");
        }
        else{
            System.out.println("\n >> Danh sach san pham co ten "+ ten);
            ds.forEach(System.out::println);
        }
    }

   

}
