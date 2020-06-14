/*
*mo ta cau truc 1 doi tuong may tinh
*thuoc tinh: id ,thuong hieu,don gia
*phuong thuc xu ly: input(),display()
 */
package data;

import java.util.Scanner;

public class Computer {
    //khai bao ca thoc tinh
    public String id,brand;
    public int price;
    
    //ham dung ko tham so
    public Computer(){
        id="c01";
        brand="Asus";
        price=100;
    }
    
    //ham nhap du lieu cho 1 may tinh
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap ma so: ");
        id= sc.nextLine().trim();
        System.out.print("nhap thuong hieu: ");
        brand=sc.nextLine().trim();
        // nhap don gia tu 50-5000
        while (true) {            
            System.out.print("nhap don gia [50-5000]: ");
            price=Integer.parseInt(sc.nextLine().trim());
            if (price>=50 && price <=5000) {
                break;// ket thuc vong lap nhap don gia
            }
            System.out.println(">> don gia ko hop le .Vui long nhap lai!");
        }
    }
    // ham xuat thong tin len man hinh
    public void display(){
        System.out.println("Thong tin may tinh");
        System.out.println("Id: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}
