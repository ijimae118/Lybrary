/*
Create class VehicleCatalog in package data for managing a collection of Car:
- Fields: [max, next] int, vehicleList – an array consists of cars
- Methods:
- addCar() - add a new car into system
- displayAll() - display all cars
- searchByBrand (String sBrand) – search & display car by the brand.
- displayAllGPSCar() - display all cars having GPS module installed.
- displayHighRankl() - display all cars having price greater than 50000
 */
package data;

public class VehicleCatalog {

    final int max = 5;
    int next = 0;
    Car[] vehicleList = new Car[max];

    public void addCar() {
        if (next == max) {
            System.out.println("Full memory");
        } else {
            Car c = new Car();
            c.accept();
            vehicleList[next] = c;
            next++;
        }
    }

    public void display() {
        if (next == max) {
            System.out.println("Full memory");
        } else {
            for (int i = 0; i < next; i++) {
                //vehicleList[i].printinfo(); C_1
                System.out.println(vehicleList[i]);//C_2 System.out.println(vehicleList[i].toString()); [.toString() có hay ko cũng đc vì hàm trả về sout tự auto hiểu lấy toString()]
            }

        }
    }

    public void searchByBrand(String sBrand) {
        if (next == max) {
            System.out.println("Full memory");
        } else {
            int count = 0;
            for (int i = 0; i < next; i++) {
                if (vehicleList[i].brand.contains(sBrand)) {
                    vehicleList[i].printinfo();
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Ko tim thay nhan hieu xe nay. ");
            }
        }
    }

    public void displayAllGPSCar() {
        if (next == max) {
            System.out.println("Full memory");
        } else {
            int count = 0;
            for (int i = 0; i < next; i++) {
                if (vehicleList[i].isGps()) {
                    vehicleList[i].printinfo();
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Ko tim thay xe nao co GPS");
            }
        }
    }

    public void displayHighRank() {
        if (next == max) {
            System.out.println("Full memory");
        } else {
            int count = 0;
            for (int i = 0; i < next; i++) {
                if (vehicleList[i].price > 50000) {
                    vehicleList[i].printinfo();
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("ko tim thay xe nao co gia tri lon hon 50000");
            }
        }
    }

}
