package data;

import java.util.Scanner;



public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op ;

        ProductList p = new ProductList();
        p.readFile();

        while (true) {
            System.out.println("\n *** MENU ***");
            System.out.println("1. Them san pham");
            System.out.println("2. Xoa san pham theo ma so");
            System.out.println("3. Xem danh sach san pham");
            System.out.println("4. Tim san pham theo ten");
            System.out.println("5. Thoat");
            System.out.print(" Vui long nhap chuc nang [1-5]: ");

            op = sc.nextLine().trim();
            switch (op) {
                case "1":
                    p.add();
                    break;
                case "2":
                    System.out.print(" nhap ma so sp: ");
                    p.delete(sc.nextLine().trim());
                    break;
                case "3":
                    p.display();
                    break;
                case "4":
                    System.out.print(" nhap ten san pham: ");
                    p.display(sc.nextLine().trim());
                    break;
                case "5":
                    //save danh sach du lieu truoc khi ket thuc ct
                    p.saveFile();
                    return;
            }
        }
    }

}
