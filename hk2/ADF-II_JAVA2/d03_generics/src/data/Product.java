/*
 *Mo ta 1 san pham bao gom:
thuoc tinh : ma so ,ten,don gia
ham dung
phuong thuc :input(),toString()
*/
package data;

import java.util.Scanner;

public class Product implements java.io.Serializable {
    public String id,name;
    public int price;

    public Product() {
    }

    public Product(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap id: ");
        id =sc.nextLine().trim();
        System.out.println("nhap ten: ");
        name =sc.nextLine().trim();
        System.out.println("nhap don gia: ");
        price =Integer.parseInt(sc.nextLine().trim());
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", id,name,price);
    }
    
}
