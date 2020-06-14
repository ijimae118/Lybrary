/*
* Mo ta cau truc hinh chu nhat,la con cua lop Shape
* Co 2 thuoc tinh chieu daai va chieu rong
 */
package data;

import java.util.Scanner;

public class Rectangle extends Shape {

    public int width, length;
//    String a = "chu nhat";//default

    @Override// them extends vào nhấn crtl+pase tự hiện ra 
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPeripheral() {
        return (width + length) * 2;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhap chieu dai HCN: ");
        length = Integer.parseInt(sc.nextLine().trim());
        System.out.print(" nhap chieu rong HCN: ");
        width = Integer.parseInt(sc.nextLine().trim());
    }

//    @Override
//    public String name() {
//        return a;
//    }

    @Override
    public void output() {
        if (length==width) {
            System.out.println("Hinh vuong");
        } else {
            System.out.println("Hinh chu nhat");
        }
    //    System.out.println("Hinh chu nhat");
        super.output(); //To change body of generated methods, choose Tools | Templates.
    }

//   public boolean isSquare(){
//   return width==length;
//   }

}
