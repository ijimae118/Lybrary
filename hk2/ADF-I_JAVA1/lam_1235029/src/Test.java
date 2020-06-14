
import java.util.Scanner;
import product.Invoice;


public class Test {

    public static void main(String[] args) {
        Invoice a = new Invoice();
        Scanner sc = new Scanner(System.in);
        String op;

        while (true) {
            System.out.println("=====MENU list of items=====");
            System.out.println("1. Create new item: ");
            System.out.println("2. Search and display item: ");
            System.out.println("3. Exit.");
            System.out.print("Vui long chon chuc nang [1-3]: ");
            op = sc.nextLine().trim();

            switch (op) {
                case "1":
                    a.addItem();
                    break;
                case "2":
                    System.out.println("Enter item name: ");
                    String item = sc.nextLine().trim();
                    a.searchItem(item);
                    break;
                case "3":
                    return;
            }
        }
    }

}
