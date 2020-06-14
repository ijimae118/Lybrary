package asg4_HS;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Employee {

    public String id, name, address;
    public int salary, joinedYear;

    public Employee() {
    }

    public Employee(String id, String name, String address, int salary, int joinedYear) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.joinedYear = joinedYear;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%d,%d",id,name,address,salary,joinedYear);
        
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter id: ");
            id = sc.nextLine().trim();
            if (Pattern.matches("EM\\d{4}", id)) {
                break;
            }
            System.out.println("id:EMxxxx,x la ky so.");
        }
        while (true) {
            System.out.print("Enter name: ");
            name = sc.nextLine().trim().toUpperCase();
            if (name.length() > 0) {
                break;
            }
            System.out.println("name:ko dc de trong.");
        }
        while (true) {
            System.out.print("Enter address: ");
            address = sc.nextLine().trim();
            if (address.length() > 0) {
                break;
            }
            System.out.println("address:ko dc de trong.");
        }
        while (true) {
            try {
                System.out.print("Enter salary: ");
                salary =Integer.parseInt( sc.nextLine().trim());
                if (salary >= 100 && salary <= 10000) {
                    break;
                }
                System.out.println("salary:[100-10000]");

            } catch (Exception e) {
                System.out.println("loi: "+e.getMessage());
            }

        }
        while (true) {
            try {
                System.out.print("Enter jointYear: ");
                joinedYear =Integer.parseInt( sc.nextLine().trim());
                if (joinedYear>=1980 && joinedYear<=2016) {
                    break;
                }
                System.out.println("jointYear:[1980-2016]");

            } catch (NumberFormatException e) {
                System.out.println("loi: "+e.getMessage());
            }

        }
        
    }

}
