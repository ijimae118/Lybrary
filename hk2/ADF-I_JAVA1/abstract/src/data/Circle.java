/*
*Mo ta cau truc 1 doi tuong hinh tron , la con lop Shape,
*co them thuoc tinh ban kinh
--lop con--
 */
package data;

import java.util.Scanner;

public class Circle extends Shape {

    public float radius;
    //   String a = "tron";

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPeripheral() {
        return 2 * 3.14 * radius;
    }

    @Override// ko có cũng ko sao
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        radius = Float.parseFloat(sc.nextLine().trim());

    }

//    @Override
//    public String name() {
//        return a;
//    }
    @Override
    public void output() {
        System.out.println("Hinh tron");
        super.output(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
