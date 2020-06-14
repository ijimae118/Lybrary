/*
Mo ta cau truc bang tbProduct trong database sem2_dem
Day la thuc the lop hoc
 */
package model;

import java.util.Scanner;

public class Product {
    public int id; //int (identity) - ma so san pham
    public String name; //varchar(50)
    public int price; // 
    public int qoh;

    @Override
    public String toString() {
        return String.format("%5d, %-20s, %6d, %6d", id, name, price, qoh);
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin san pham: ");
        System.out.print(" - nhap ten san pham: ");
        name = sc.nextLine();
        System.out.print(" - nhap don gia: ");
        price = Integer.parseInt(sc.nextLine());  
        System.out.print(" - nhap so luong ton kho: ");
        qoh = Integer.parseInt(sc.nextLine());   
    }
    
}
