/*
Create class Employee derives from Person, in package data, consists of:
- Fields : salary, workedDays, position
- Constructors to initialize the all fields
- Override methods:
- accept() : allow user to input additional details for an employee:
invoke method accept() of super class.
using try-catch exception for validation: salary belongs to [200-10000], salary belongs to
[0-27].
- printInfo() : display details of an employee including id, name, age, position, salary,
worked days, income (salary* worked days/26)
- toString() : return a string presenting all the details of a employee.
 */
package data;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author lam
 */
public class Employee extends Person {

    public String position;
    public int salary, workedDays;
    Scanner sc = new Scanner(System.in);

    public Employee() {
    }

    @Override
    public void accept() {
        super.accept();
        try {
            while (true) {
                System.out.print("Moi nhap salary: ");
                salary = Integer.parseInt(sc.nextLine().trim());
                if (salary>=200&&salary<=10000) {
                    break;
                }
                System.out.println("loi.moi nhap lai salary");
            }
        } catch (Exception e) {
            System.out.println("loi:"+e.getMessage());
        }
        try {
            while (true) {
                System.out.print("Moi nhap workedDays: ");
                workedDays = Integer.parseInt(sc.nextLine().trim());
                if (workedDays>=0&&workedDays<=27) {
                    break;
                }
                System.out.println("loi.moi nhap lai workedDays");
            }
        } catch (Exception e) {
            System.out.println("loi:"+e.getMessage());
        }
            
                System.out.print("Moi nhap position: ");
                position =sc.nextLine().trim();
        
    }

    @Override
    public void printinfo() {
            System.out.println("===Employee===");
            System.out.println("id: "+id);
            System.out.println("name: "+name);
            System.out.println("yob: "+(Year.now().getValue()-yob));
            System.out.println("position: "+position);
            System.out.println("workedDays: "+workedDays);
            System.out.println("salary: "+salary);
            System.out.println("income: "+(salary*workedDays/26));
    }

    @Override
    public String toString() {
    return String.format("%s,%s,%d,%s,%d,%d,%d",id,name,(Year.now().getValue()-yob),position,salary,workedDays,(salary*workedDays/26));
    }
    
    

}
