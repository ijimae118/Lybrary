/*
Create main class Inventory in package Application that allows user to manage the laptops
accepted into system through the menu system as follows:
1. Add a new laptop
2. Search laptop by name
3. Display all laptops
4. Remove a laptop by id
5. Exit
 */
package Application;

import goods.LaptopCatalog;
import java.util.Scanner;

public class Inventory {

    public static void main(String[] args) {

        LaptopCatalog a=new LaptopCatalog();
        Scanner sc = new Scanner(System.in);
        String op;

        while (true) {
            System.out.println("=====MENU=====");
            System.out.println("1. ADD laptop: ");
            System.out.println("2. Search laptop by name: ");
            System.out.println("3. Display all laptop: ");
            System.out.println("4. Remove laptop by id : ");
            System.out.println("5. Exit.");
            System.out.print("Vui long chon chuc nang [1-5]: ");
            op = sc.nextLine().trim();

            switch (op) {
                case "1":
                    a.addLaptop();
                    break;
                case "2":
                    System.out.println("Enter laptop name: ");
                    String lapname=sc.nextLine().trim();
                    a.search(lapname);
                    break;
                case "3":
                   a.displayAll();
                    break;
                case "4":
                    System.out.println("Enter laptop id: ");
                    String lapid=sc.nextLine().trim();
                    a.remove(lapid);
                    break;
                case "5":
                    return;
            }
        }
    }

}
