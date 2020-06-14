/*
Create class Cylinder derives from Shape, implements IGeometry in package data, consists of:
- Fields : radius, height
- Constructors to initialize the all fields
- Override methods of Shape and IGeometry:
-accept() :
using try-catch exception for validation: radius, height must be greater than zero.
- printInfo() : display detailed information of a cylinder including radius, height, peripheral,
area, volume
- toString() : return a string presenting all the details of a cylinder */
package data;

import java.util.Scanner;

/**
 *
 * @author lam
 */
public class Cylinder extends Shape implements IGeometry {

    public double radius, height;
    Scanner sc = new Scanner(System.in);

    @Override
    public void accept() {
        while (true) {
            try {
                System.out.println("Enter radius: ");
                radius = sc.nextDouble();
                if (radius > 0) {
                    break;
                }
                System.out.println("moi nhap lai");
            } catch (Exception e) {
                System.out.println("loi:" + e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter height: ");
                height = sc.nextDouble();
                if (height > 0) {
                    break;
                }
                System.out.println("moi nhap lai");
            } catch (Exception e) {
                System.out.println("loi:" + e.getMessage());
            }
        }
    }

    @Override
    public void printinfo() {
        System.out.println("===Circles===");
        System.out.println("radius: "+radius);
        System.out.println("height: "+height);
        System.out.printf("peripheral: %.2f \n",peripheral());
        System.out.printf("area: %.2f \n",area());
        System.out.printf("volume: %.2f \n",volume());
    }

    @Override
    public double area() {
        double Stp = 2*PI*radius*(radius+height);
        return Stp;
    }

    @Override
    public double peripheral() {
        double Sxq=2*PI*radius*height;
        return Sxq;
    }

    @Override
    public double volume() {
        double V=PI*radius*radius*height;
        return V;
    }

    @Override
    public String toString() {
        return String.format("%.2f,%.2f,%.2f,%.2f,%.2f",radius,height,peripheral(),area(),volume());
    }
    
    

}
