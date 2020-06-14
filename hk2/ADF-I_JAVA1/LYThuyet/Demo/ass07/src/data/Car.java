/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
--ADDs Void--
 */
package data;

import java.util.Scanner;

/**
 *
 * @author THUYLM
 */
public class Car extends Vehicle {

    private boolean gps;
/*do biến private bên trên ,nên if muốn truy cập vào nó thì ta tao thêm ham = cách nhấn chuột trái chọn insert code ,nhấp chon booleans để hiện 2 dòng dưới
    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }
*/
    public Car() {
        super();//?
        gps = false;
    }

    @Override
    protected void accept() {
        super.accept();
        System.out.print("Nhap Gps (Y/N): ");
        Scanner sc = new Scanner(System.in);
        gps = sc.nextLine().trim().equalsIgnoreCase("y");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Gps: " + (gps ? "Co" : "Khong"));
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Brand: %s, Speed: %d, Weight: %d, Price: %d, GPS: %s", id, name, brand, speed, weight, price, gps ? "Co" : "Khong");
    }

    public boolean getGps() {
        return gps;
    }
}
