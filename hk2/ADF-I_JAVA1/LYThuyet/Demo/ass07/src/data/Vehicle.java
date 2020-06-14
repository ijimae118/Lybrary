package data;

import java.util.*;

/**
 * Creates Void
 * @author THUYLM
 */
public class Vehicle {

    protected String id, name, brand;
    protected int price, speed, weight;

    public Vehicle() {
    }

    

    protected void accept() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhap ID : ");
                id = sc.nextLine().trim();
                if (id.length() > 0) {
                    break;
                }
            //    System.out.println("ID khong dc de trong");
                throw new Exception("ID k duoc de trong ");
            } catch (Exception e) {
                System.out.println("Loi~ : !!!" + e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhap ten : ");
                name = sc.nextLine().trim();
                if (name.length() > 0) {
                    break;
                }
                throw new Exception("ten k duoc de trong ");
            } catch (Exception e) {
                System.out.println("Loi~ : !!!" + e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhap nhan hieu : ");
                brand = sc.nextLine().trim();
                if (brand.length() > 0) {
                    break;
                }
                throw new Exception("Nhan hieu k duoc de trong ");
            } catch (Exception e) {
                System.out.println("Loi~ : !!!" + e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhap price: ");
                price = sc.nextInt();
                if (price > 0) {
                    break;
                }
                throw new Exception("Price khong duoc be hon khong");
            } catch (Exception e) {
                System.out.println("Loi: " + e.getMessage());
                sc = new Scanner(System.in);
            }
        }
        while (true) {
            try {
                System.out.print("Nhap weight: ");
                weight = sc.nextInt();
                if (weight >= 0) {
                    break;
                }
                throw new Exception("weight khong duoc be hon khong");
            } catch (Exception e) {
                System.out.println("Loi: " + e.getMessage());
                sc = new Scanner(System.in);
            }
        }
        while (true) {
            try {
                System.out.print("Nhap Speed: ");
                speed = sc.nextInt();
                if (speed > 0) {
                    break;
                }
                throw new Exception("Speed khong duoc be hon khong");
            } catch (Exception e) {
                System.out.println("Loi: " + e.getMessage());
                sc = new Scanner(System.in);
            }
        }
    }

    public void printInfo() {
        System.out.println("---Thong tin Xe ---");
        System.out.printf("Ma so: %s\n", id);
        System.out.printf("Ten sp: %s\n", name);
        System.out.printf("Nhan hieu sp: %s\n", brand);
        System.out.printf("Don gia : %d\n", price);
        System.out.printf("Khoi luong: %d\n", weight);
        System.out.printf("Toc do : %d\n", speed);

    }
}
