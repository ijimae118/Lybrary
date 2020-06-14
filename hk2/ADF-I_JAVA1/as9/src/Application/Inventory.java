/*
Create main class Inventory in package Application that allows user to manage the
televisons accepted into system through the menu system as follows:
1. Add a new television
2. Search televisions by brand
3. Display all televisions
4. Display high-valued televisions
5. Exit
 */
package Application;

import Electronics.TelevisionCatalog;
import java.util.Scanner;

public class Inventory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TelevisionCatalog lc = new TelevisionCatalog();

        String op;
        while (true) {
            System.out.println("---MENU---");
            System.out.println("1. Them tv moi: ");
            System.out.println("2. Tim kiem tv bang nhan hieu: ");
            System.out.println("3. In toan bo ds tv: ");
            System.out.println("4. In ra tv co gia lon hon 500: ");
            System.out.println("5. Thoat.");
            System.out.print("Vui long chon chuc nang[1-5]: ");
            op = sc.nextLine();
            switch (op) {
                case "1":
                    lc.add();
                    break;
                case "2":
                    System.out.print("Nhap ten brand tv can tim: ");
                    lc.searchByBrand(sc.nextLine().trim());
                    break;
                case "3":
                    lc.displayAll();
                    break;
                case "4":
                    lc.displayHighValue();
                    break;
                case "5":
                    return;
            }
        }
    }

}
