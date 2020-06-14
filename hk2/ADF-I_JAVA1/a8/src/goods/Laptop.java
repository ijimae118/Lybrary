/*
Create class Laptop derives from Computer, in package Goods, consists of:
- Field webcam (y/n), QoH (số lượng tồn kho)
- Constructors to initialize the all fields.
- Override methods:
- accept() : allow user to input details for a laptop:
Recall method accept() of super class.
- printInfo() : display details of an laptop.
- toString() : return a string presenting all the details of a product as follows:

id, name, webcam, price, QoH, amount (= price*QoH)
*/
package goods;

import java.util.Scanner;

public class Laptop extends Computer {

    public String webcam;
    public int qoh;

    public Laptop() {
    }

    @Override
    public void accept() {
        super.accept(); //goi ham nhap accept cua lop Computer(ma so,ten,don gia)

        // nhap them giá trị webcam va qoh
        Scanner sc = new Scanner(System.in);

        //nhap webcam, hoặc y hoac n
        while (true) {
            System.out.print(" Nhap webcam[y/n]?: ");
            webcam = sc.nextLine().trim().toLowerCase();

            if (webcam.equals("y") || webcam.equals("n")) {
                break;
            }
            System.out.println("Du lieu ko hop le.Vui long nhap lai");

        }

        while (true) {
            try {
                System.out.print("Nhap so luong ton kho>=0:");
                qoh = Integer.parseInt(sc.nextLine().trim());
                if (qoh >= 0) {
                    break;
                }
                System.out.println("So lg ton kho ko hop le.Vui long nhap lai");

            } catch (Exception e) {
                System.err.println("Loi sai: " + e.getMessage());
            }

        }

    }

    @Override
    public void printInfo() {
        System.out.println("Thong tin Laptop");
        System.out.println("id: "+id);
        System.out.println("ten: "+name);
        System.out.println("gia: "+price);
        System.out.println("webcam: "+webcam);
        System.out.println("so luong ton kho: "+qoh);
    }

    @Override
    public String toString() {
        return String.format("Id: %s,Name: %s,Webcam: %s,Price: %d,QOH: %d, Amount: %d\n",id,name,webcam,price,qoh,price*qoh);
    }
    
    

}
