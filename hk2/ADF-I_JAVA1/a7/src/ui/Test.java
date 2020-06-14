/*
Create main class Test in package ui that allows user to manage cars accepted into system
through the menu system as follows:
1. Add a new car
2. Display all cars
3. Search car by brand name
4. Display all cars having GPS module
5. Display high-rank vehicle
6. Exit
 */
package ui;

import data.VehicleCatalog;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        VehicleCatalog v= new VehicleCatalog();
        Scanner sc = new Scanner(System.in);
        String op;

        while (true) {
            System.out.println("=====MENU=====");
            System.out.println("1. ADD car: ");
            System.out.println("2. Display all Car: ");
            System.out.println("3. Search car by brand name: ");
            System.out.println("4. Display all cars having GPS module: ");
            System.out.println("5. Display high rank vehicle: ");
            System.out.println("6. Exit.");
            System.out.print("Vui long chon chuc nang [1-6]: ");
            op = sc.nextLine().trim();

            switch (op) {
                case "1":
                    v.addCar();
                    break;
                case "2":
                    v.display();
                    break;
                case "3":
                    System.out.print("Enter brand: ");
                    String sBrand = sc.nextLine().trim();// tạo lệnh nhập
                    v.searchByBrand(sBrand);
                    break;
                case "4":
                    v.displayAllGPSCar();
                    break;
                case"5":
                    v.displayHighRank();
                    break;
                case"6":
                    return;
            }
        }

    }

}
