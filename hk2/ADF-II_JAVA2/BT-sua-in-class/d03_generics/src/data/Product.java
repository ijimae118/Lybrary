/*
Mo ta 1 san pham, bao gom
thuoc tinh: ma so, ten, don gia
ham dung
phuong thuc: input(), toString()
 */
package data;

import java.util.Scanner;



public class Product implements java.io.Serializable{//java.io.Serializable thong bao file này có thể rã ra đc (bắc buộc if ko thì nó ko thể đọc đc) 

    public String id, name;
    public int price;

    public Product() {
    }

    public Product(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap id: ");
        id = sc.nextLine().trim();
        
        System.out.print("nhap ten: ");
        name = sc.nextLine().trim().toLowerCase();
        
        System.out.print("nhap don gia: ");
        price = Integer.parseInt(sc.nextLine().trim());
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d", id, name, price);
    }

}
