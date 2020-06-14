/*
Creates an abstract class named Computer in package Goods.
- Fields ID, name, price
- Default constructor to initialize the above fields.
- Method
- void accept() : allow user input data into data fields.
Made validation for : ID, name is not null. Price must be greater than zero.
- void printInfo() : this is an abstract method used to print details of an product.
 */
package goods;

import java.util.Scanner;

public abstract class Computer {

    public String id, name;
    public int price;

    public Computer() {
    }

    public  void accept() {
        Scanner sc = new Scanner(System.in);
        // Nhap ma so,ko dc de trong
        while (true) {
            System.out.print("Nhap ma so:");
            id = sc.nextLine().trim();
            if (id.length() > 0) {
                break;
            }
            System.out.println("Ma so ko hop le.Vui long nhap lai");
        }

        while (true) {
            System.out.print("Nhap ten:");
            name = sc.nextLine().trim();
            if (name.length() > 0) {
                break;//thoát vòng lặp
            }
            System.out.println("Ten ko hop le.Vui long nhap lai");
        }

        //Nhap don ko dc<=0
        while (true) {
            try {
                System.out.print("Nhap don gia:");
                price =Integer.parseInt( sc.nextLine().trim());
                if (price > 0) {
                    break;
                }
                System.out.println("Don gia ko hop le.Vui long nhap lai");

            } catch (Exception e) {
                System.err.println("Loi sai: Don gia ko hop le!!!"+e.getMessage());
            }

        }
        
       
    }
     public abstract void printInfo();

}
