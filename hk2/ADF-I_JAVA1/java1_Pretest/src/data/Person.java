/*
Creates an abstract class named Person in package data.
- Fields ID, name, yob
- Default constructor to initialize the above fields.
- Method
- public void accept() : allow user input data into data fields.
Using try-catch exception for validation: ID, name not null- yob must be in range [1940-
2000] .
- public abtract void printInfo() : print details of an person.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author lam
 */
public abstract class Person {

    public String id, name;
    public int yob;
    Scanner sc = new Scanner(System.in);

    public Person() {
    }

    public Person(String id, String name, int yob) {
        this.id = id;
        this.name = name;
        this.yob = yob;
    }

    public void accept() {
        while (true) {
            try {
                System.out.println("Moi nhap id: ");
                id = sc.nextLine().trim();
                if (id.length() > 0) {
                    break;
                }
                System.out.println("loi .nhap lai id");

            } catch (Exception e) {
                System.out.println("loi: " + e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Moi nhap name: ");
                name = sc.nextLine().trim();
                if (name.length() > 0) {
                    break;
                }
                System.out.println("loi nhap lai name");

            } catch (Exception e) {
                System.out.println("loi: " + e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Moi nhap yob: ");
                yob = Integer.parseInt(sc.nextLine().trim());
                if (yob >= 1940 && yob <= 2000) {
                    break;
                }
                System.out.println("loi.nhap lai yob");

            } catch (NumberFormatException e) {
                System.out.println("loi: " + e.getMessage());
            }

        }
    }
    
    public abstract void printinfo(); 
}
