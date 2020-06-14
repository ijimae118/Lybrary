/*
Create java main class Test in package app for managing a collection of Cylinders:
- Fields: max, next – cList (array of cylinders)
- Methods:
- void add() - add a new cylinder
- void display() - display all cylinders.
- void display( float v ) - display cylinder having volume greater than v.
- void menu() - allows to manage the list of cylinders through the menu system as follows.
1. Add a new cylinder
2. Display all cylinders
3. Display all cylinders having required volume
4. Exit
 */
package app;

import data.Cylinder;
import java.util.Scanner;

/**
 *
 * @author lam
 */
public class Test {

    final int max = 5;
    int next = 0;
    Cylinder[] cList = new Cylinder[max];

    public static void main(String[] args) {
        Test t= new Test();
        t.menu();
    }

    void add() {
        if (next == max) {
            System.out.println("full memory");
        }
        Cylinder c = new Cylinder();
        c.accept();

        cList[next] = c;
        next++;
    }

    void display() {
        if (next == 0) {
            System.out.println("Chua co data");
        } else {
            for (int i = 0; i < next; i++) {
                cList[i].printinfo();
            }
        }
    }

    void display(float v) {
        if (next == 0) {
            System.out.println("Chua co data");
        } else {
            int n=0;
            for (int i = 0; i < next; i++) {
                if (cList[i].volume() > v) {
                    cList[i].printinfo();
                n++;
                }
            }
            if (n==0) {
                System.out.println("Ko tim thay volume nao lon hon volume cho");
            }
            
        }
    }
    
    void menu(){
        Test a=new Test();
        Scanner sc = new Scanner(System.in);
        String op;

        while (true) {
            System.out.println("=====MENU=====");
            System.out.println("1. ADD cylinder: ");
            System.out.println("2. Display all cylinder: ");
            System.out.println("3. Display cylinder having volume greater than v  : ");
            System.out.println("4. End");
            System.out.print("Vui long chon chuc nang [1-4]: ");
            op = sc.nextLine().trim();

            switch (op) {
                case "1":
                    a.add();
                    break;
                case "2":
                    a.display();
                    break;
                case "3":
                   System.out.print("Enter volume want to greater: ");
                    a.display(Float.parseFloat(sc.nextLine().trim()));
                    break;
                case "4":
                    return;
            }
        }
    }
}
