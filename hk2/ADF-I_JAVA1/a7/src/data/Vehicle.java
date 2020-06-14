/*
 Creates a class named Vehicle in package data.
- Protected fields: ID, name, brand, speed, weight, price
- Public Constructors: to initialize the above fields.
- Methods:
- Protected void accept() : allow user input data into data fields.
validation: [ID, name, brand] is not null. [speed, price] must be greater than zero.
- Public void printInfo() : used to print details of an vehicle.
 */
package data;

import java.util.Scanner;

public class Vehicle {

    protected String id, name, brand;
    protected int speed, weight, price;

    public Vehicle() {
    }

    public Vehicle(String id, String name, String brand, int speed, int weight, int price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.speed = speed;
        this.weight = weight;
        this.price = price;
    }

    protected void accept() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter id: ");
            id = sc.nextLine().trim();
            if (id.length()>0) {
                break;
            }
            System.out.println("Id ko dc de trong");
        }
        while (true) {
            System.out.println("Enter name: ");
            name = sc.nextLine().trim();
            if (name.length()>0) {
                break;
            }
            System.out.println("Name ko dc de trong");
        }
        while (true) {
            System.out.println("Enter brand: ");
            brand = sc.nextLine().trim();
            if (brand.length()>0) {
                break;
            }
            System.out.println("Brand ko dc de trong");
        }
        
        while (true) {            
            try {
                System.out.println("Enter speed: ");
                speed=Integer.parseInt(sc.nextLine().trim());
                if (speed>0) {
                    break;
                }
    
                throw new NumberFormatException("ten k0 duoc de trong");
            } catch (NumberFormatException e) {
                System.out.println("loi: "+e.getMessage());
            }
            
        }
        
        while (true) {            
            try {
                System.out.println("Enter weight: ");
                weight=Integer.parseInt(sc.nextLine().trim());
                if (weight>0) {
                    break;
                }
                System.out.println("weight must be greater than zero");
         
            } catch (NumberFormatException e) {
                System.out.println("loi: "+e.getMessage());
            }
            
        }
        while (true) {            
            try {
                System.out.println("Enter price: ");
                price=Integer.parseInt(sc.nextLine().trim());
                if (price>0) {
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("loi: "+e.getMessage());
            }
            
        }
    

    }
    
        public void printinfo(){
            System.out.println("===Vehicle===");
            System.out.println("id:"+id);
            System.out.println("name:"+name);
            System.out.println("brand:"+brand);
            System.out.println("speed:"+speed);
            System.out.println("weight:"+weight);
            System.out.println("price:"+price);
        }
}
