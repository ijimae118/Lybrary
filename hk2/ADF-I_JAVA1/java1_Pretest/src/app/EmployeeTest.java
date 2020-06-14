/*
Create java main class EmployeeTest in package app for managing a collection of Employees:
- Fields: max, next – eList (array of employees)
- Methods:
- void add() - add a new employee
- void display() - display all employees.
- void display ( String eName ) - search and display employees by the required name.
- void remove( String eID ) – remove an employee by ID.
- void menu() - allows to manage the list of employees through the menu system as follows.
1. Add a new employee
2. Display list of employee
3. Search employee by name
4. Remove employee by ID
5. Exit
 */
package app;

import data.Employee;
import java.util.Scanner;

/**
 *
 * @author lam
 */
public class EmployeeTest {
    final int max=5;
    int next=0;
   Employee[] eList= new Employee[max];
            
    public static void main(String[] args) {
        EmployeeTest e= new EmployeeTest();
        e.menu();
    }
    
    void add(){
        if (next==max) {
            System.out.println("full memory");
            return;
        }
     Employee e= new Employee();
     e.accept();
     
     eList[next]=e;
     next++;
    }
    void display(){
        if (next==0) {
            System.out.println("Chua co du lieu"); 
             return;       
        }
        for (int i = 0; i < next; i++) {
            System.out.println(eList[i].toString());
        }
    }
    void display(String eName){
        int n=0;
        for (int i = 0; i < next; i++) {
            if (eList[i].name.contains(eName)) {
                eList[i].printinfo();
                n++;
            }
            
        }
        if (n==0) {
            System.out.println("ko tim thay cn theo ten.");
        }
    }
    void remove(String eID){
        int n=0;
        for (int i = 0; i < next; i++) {
            if (eList[i].id.equalsIgnoreCase(eID)) {
                for (int j = i; j < next-1; j++) {
                    eList[j]=eList[j+1];
                }
                next--;
                n++;
                System.out.println("Xoa thanh cong");
                break;
            }
            
        }
        if (n==0) {
           System.out.println("khong tim thay nhan vien co ma so " + eID);
        }
    }
    
    void menu(){
        Scanner read = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.println("=== Chuong trinh quan ly nhan vien ===");
            System.out.println("Chon 1 trong nhung lua chon duoi.");
            System.out.println("1. Them nhan vien");
            System.out.println("2. In danh sach");
            System.out.println("3. Tim kiem nhan vien");
            System.out.println("4. Xoa nhan vien");
            System.out.println("5. Thoat chuong trinh");
            System.out.print("Mời chon[1-5]: ");
            input = read.nextLine();
            switch (input) {
                case "1":
                    add();
                    break;
                case "2":
                    display();
                    break;
                case "3":
                    System.out.println("Nhap ten nguoi can tim: ");
                    String search = read.nextLine();
                    display(search);
                    break;
                case "4":
                    System.out.println("Nhap ma so nhan vien muon xoa: ");
                    String searchID = read.nextLine();
                    remove(searchID);
                    break;
                case "5": return;
            }
        }
    }
}
