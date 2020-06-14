/*
 *
 */
package app;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        ShapeCatalog o = new ShapeCatalog();
        //  String op ="";
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n MENU");
            System.out.println("1. them hinh chu nhat");
            System.out.println("2. them hinh tron");
            System.out.println("3. in danh sach cac doi tuong hinh hoc");
            System.out.println("4. in ds hinh vuong: ");
            System.out.println("5. thoat");

            System.out.print(" vui long chon chuc nang [1-4]: ");
            String op = sc.nextLine().trim();

            switch (op) {
                case "1":
                    o.addRect();
                    break;
                case "2":
                    o.addCircle();
                    break;
                case "3":
                    o.display();
                    break;
                case "4":
                    o.displaySquare();
                    break;
                case "5":
                    return;
                case "6":
                    o.Square();
            }
        }
    }

}
