package data;

import java.util.Scanner;

public class Cylinder extends Shape implements IGeometry {

    public double radius, height;

    public Cylinder() {
    }

    @Override
    public void accept() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("\tNhap ban kinh: ");
                radius = Double.parseDouble(sc.nextLine().trim());
                if (radius < 0) {
                    throw new NumberFormatException("Ban kinh phai lon hon 0 !!! ");
                }
                break;

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true){
            try {
                System.out.print("\tNhap chieu cao: ");
                height = Double.parseDouble(sc.nextLine().trim());
                if (height < 0) {
                    throw new NumberFormatException("Chieu cao phai lon hon 0 !!! ");
                }
                break;

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Ban kinh: " + radius);
        System.out.println("Chieu cao: " + height);
        System.out.printf("Dien tich hinh tru: %7.2f \n", area());
        System.out.printf("peripheral: %7.2f \n",peripheral());
        System.out.printf("The tich: %7.2f \n" , volume());
       
    }

    @Override//Diện tích hình trụ
    public double area() {                          // Dien tich toan phan = Dien tich xung quanh + Dien tich hai day
        double dtday = PI * radius * radius;        // Dien tich toan phan = 2*pi*r*h             + 2*pi*r^2 
        double dtxq = height * peripheral();        // Dien tich toan phan = 2*pi*r(r+h)
        return dtxq + dtday * 2;    // 
    }

    @Override
    public double peripheral() {
        return radius * 2 * PI;
    }

    @Override
    public double volume() {// V = pi*r^2(r*r)*h thể tích hình trụ
        double dtday = PI * radius * radius;
        return dtday * height;
    }

    @Override
    public String toString() {
        return String.format("%7.2f, %7.2f, %12.2f, %12.2f", radius, height, area(), volume());
    }

}
