/*
Create class Car is derived from Vehicle, in package data, consists of:
- Private Field GPS (y/n)
- Public Constructors to initialize the all fields.
- Override methods:
- Protected void accept() : allow user to input additional details for a Car:
invoke method accept() of super class.

- Public void printInfo() : display all details of an car.
- Public String toString() : return a string presenting all details of a Car
 */
package data;

import java.util.Scanner;

public class Car extends Vehicle {

    private boolean gps;

    public Car() {//3 dòng này có hay ko cũng đc
       // super();
    }

    @Override
    protected void accept() {
        super.accept();
        System.out.print("Nhap Gps (Y/N): ");
        Scanner sc = new Scanner(System.in);
        gps = sc.nextLine().trim().equalsIgnoreCase("y");

    }
    
    
    @Override
    public void printinfo() {
        super.printinfo();
        System.out.println("GPS:" + (gps?"yes":"no"));

    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%d,%d,%d",id,name,brand,speed,weight,price);
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

  

}
