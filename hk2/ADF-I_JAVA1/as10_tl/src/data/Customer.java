/*
Creates a class named Customer in package data.
- Fields ID, name,address,bonus
- No-arg / parametter constructor to initialise the above fields.
- Method
- void accept() : allow user input data into data fields.
Using try-catch exception for validation: ID, name is not null. bonus must be greater
than zero and less than 1000.
toString() : return a string presenting all the details of a customer

2 Create class CustomerCatalog in package data for managing a collection of Customers:
 */
package data;

import java.util.Scanner;

public class Customer {

    public String id, name, address;
    public int bonus;
    Scanner sc = new Scanner(System.in);

    public Customer() {
    }

    public Customer(String id, String name, String address, int bonus) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.bonus = bonus;
    }

    public void accept() {
        while (true) {
            try {
                System.out.print("Enter id: ");
                id = sc.nextLine().trim();
                if (id.length() > 0) {
                    break;
                }
                System.out.println("can't null");

            } catch (Exception e) {
                System.out.println("loi: " + e.getMessage());
            }

        }

        while (true) {
            try {
                System.out.print("Enter name: ");
                name = sc.nextLine().trim();
                if (name.length() > 0) {
                    break;
                }
                System.out.println("can't null");

            } catch (Exception e) {
                System.out.println("loi: " + e.getMessage());
            }

        }

        while (true) {
            try {
                System.out.print("Enter address: ");
                address = sc.nextLine().trim();
                if (address.length() > 0) {
                    break;
                }
                System.out.println("can't null");

            } catch (Exception e) {
                System.out.println("loi: " + e.getMessage());
            }

        }

        while (true) {
            try {
                System.out.print("Enter bonus: ");
                bonus = Integer.parseInt(sc.nextLine().trim());
                if (bonus > 0 && bonus < 1000) {
                    break;
                }
                System.out.println("===0< bonus <1000===");

            } catch (NumberFormatException e) {
                System.out.println("loi: " + e.getMessage());
            }
        }

    }

    @Override
    public String toString() {
        return String.format("id: %s ,name: %s,address: %s,bonus: %d", id, name, address, bonus);
    }

}
