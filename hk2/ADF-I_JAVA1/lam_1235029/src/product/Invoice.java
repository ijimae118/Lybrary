package product;

import java.util.Scanner;

public class Invoice {

    final int maxItem = 10;
    int nextItem = 0;
    Item[] arrItem = new Item[maxItem];

    public void addItem() {
        if (nextItem==maxItem) {
            System.out.println("full memory");
            return;
        }
        Scanner sc = new Scanner(System.in);
        Item i = new Item();
        while (true) {
            System.out.println("Enter name: ");
            i.name = sc.nextLine().trim();
            if (i.name.length() > 0) {
                break;
            }
            System.out.println("Ten ko hop le.Moi nhap lai.");
        }
        while (true) {
            try {
                System.out.println("Enter price: ");
                i.price = Integer.parseInt(sc.nextLine().trim());
                if (i.price > 0) {
                    break;
                }
                System.out.println("Price ko hop le.Moi nhap lai.");

            } catch (NumberFormatException e) {
                System.out.println("loi: " + e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter quantity: ");
                i.quantity = Integer.parseInt(sc.nextLine().trim());
                if (i.quantity > 0) {
                    break;
                }
                System.out.println("Quantity ko hop le.Moi nhap lai.");

            } catch (NumberFormatException e) {
                System.out.println("loi: " + e.getMessage());
            }
        }
        
        arrItem[nextItem]=i;
        nextItem++;
    }
    public void searchItem(String name){
        if (nextItem==0) {
            System.out.println("Chua co data");
        } else {
            int n=0;
            for (int i = 0; i < nextItem; i++) {
                if (arrItem[i].name.contains(name)) {
                    arrItem[i].displayDetails();
                    n++;
                }
            }
            if (n==0) {
                System.out.println("No item to Display");
            }
        }
    }
}
