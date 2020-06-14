/*
*Mo ta cau truc mot doi tuong laptop
*Day la lop co cua lop computer- dc ke thua cac thuoc tinh 
*va phuong thuc cua lop cha
-bo sung them thuoc tinh kich thuoc ,trong luong
 */
package data;

import java.util.Scanner;

public class laptop extends Computer {

    public float size, weight;

    @Override
    public void input() {
        super.input();//goi ham nhap imput() cua lop cha Computer de thuc hien lan nhap gia trị cho 3 thuoc tinh id ,brand va price
        // nhap them gia tri cho 2 thuoc tinh moi
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap kich thuoc: ");
        size = Float.parseFloat(sc.nextLine().trim());

        System.out.print("nhap trong luong: ");
        weight = Float.parseFloat(sc.nextLine().trim());
    }

    @Override
    public void display() {
        super.display();// goi ham display cua lop cha computer de in ra gia tri cua 3 thuoc tinh id,brand,price
        //in them 2 thuoc tinh moi cua lop con Laptop
        System.out.println("kich thuoc: " + size);
        System.out.println("can nang: " + weight);
    }

}
