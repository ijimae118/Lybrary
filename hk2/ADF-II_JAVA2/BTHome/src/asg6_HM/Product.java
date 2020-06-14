package asg6_HM;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Product {

    String id, name;
    int price;
    float in_qty = 0, out_qty = 0, qoh , amt ;

    public void input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter id: ");
            id = sc.nextLine().trim();
            if (Pattern.matches("P\\d{3}", id)) {
                break;
            }
            System.out.println("Moi nhap lai Id:Pxxx ,voi x la ky so.");
        }
        while (true) {
            System.out.print("Enter name: ");
            name = sc.nextLine().trim();
            if (name.length() > 0) {
                break;
            }
            System.out.println("name ko dc de trong");
        }
        while (true) {
            try {
                System.out.print("Enter price: ");
                price = Integer.parseInt(sc.nextLine().trim());
                if (price > 0) {
                    break;
                }
                System.out.println(" Price > 0");
            } catch (NumberFormatException e) {
                System.out.println("loi:" + e.getMessage());
            }

        }
        
        
    }

    public float getQoh() {
        qoh=in_qty-out_qty;
        return qoh;
    }

    public float getAmt() {
        amt=qoh*price;
        return amt;
    }



    public void output() {
        System.out.printf("%-5s,%-5s,%-5d,%10.2f,%5.2f,%10.2f,%5.2f", id, name, price, in_qty, out_qty,qoh=in_qty-out_qty,amt=qoh*price);
        System.out.println("");
    }

    @Override
    public String toString() {
        return String.format("%-5s,%-5s,%-5d,%10.2f,%5.2f,%10.2f,%5.2f", id, name, price, in_qty, out_qty,qoh=in_qty-out_qty,amt=qoh*price);
    }

}
