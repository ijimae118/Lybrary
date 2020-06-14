/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
-----Create a list----- 
 */
package data;

import java.util.Scanner;

/**
 *
 * @author THUYLM
 */
public class VehicleCatalog {

    int max = 5;
    int count = 0;
    Car[] VehicleList = new Car[max];

    public void addCar() {
        if (count == max) {
            System.out.println("He thong da day!");
        } else {
            Car c = new Car();// Object=reference
            c.accept();
            VehicleList[count] = c;
            count++;
        }
    }

    public void displayAll() {
        if (count == 0) {
            System.out.println("He thong chua co du lieu");
        } else {
            for (int i = 0; i < count; i++) {
                VehicleList[i].printInfo();
            }
        }
    }

    public void searchByBrand(String sBrand) {
        if (count == 0) {
            System.out.println("He thong chua co du lieu");
        } else {
            int dem = 0;
            for (int i = 0; i < count; i++) {
                if (VehicleList[i].brand.equalsIgnoreCase(sBrand)) {
                    VehicleList[i].printInfo();
                    dem++;
                }
            }
            if (dem == 0) {
                System.out.println("Khong tim thay xe thuoc hang " + sBrand);
            }
        }
    }

    public void displayAllGpsCar() {
        if (count == 0) {
            System.out.println("He thong chua co du lieu");
        } else {
            int dem = 0;
            for (int i = 0; i < count; i++) {
                if (VehicleList[i].getGps()) {//VehicleList[i].getGps()==true
                    VehicleList[i].printInfo();
                    dem++;
                }
            }
            if (dem == 0) {
                System.out.println("Khong tim thay xe co GPS");
            }
        }
    }

    public void displayHighRank() {
        if (count == 0) {
            System.out.println("He thong chua co du lieu");
        } else {
            int dem = 0;
            for (int i = 0; i < count; i++) {
                if (VehicleList[i].price > 50000) {
                    VehicleList[i].printInfo();
                    dem++;
                }
            }
            if (dem == 0) {
                System.out.println("Khong tim thay xe co gia >5000");
            }
        }
    }
}
