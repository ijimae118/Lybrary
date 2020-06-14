/*
 *  nhập xuất thông tin student
 */
package nhap;

import java.util.Scanner;

public class Student {
//khai bao cac truong(field)

    private int id;
    private String name;
    private boolean gender;

    //constructor khong co doi so
    public Student() {
        this.id = -1;
        this.name = "noname";
        this.gender = true;
    }

    //constructor co doi so
    public Student(int id, String name, boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

 /*   //get accessor
    public int getId() {
        return this.id;
    }

    public void setId(int value) {
        this.id = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public boolean isMale() {
        return this.gender;
    }

    public void setMale(boolean value) {
        this.gender = value;
    }
*/
    //To be continued...

    //phuong thuc nhap
    public void scanInfo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID:");
        this.id = input.nextInt();
        input.nextLine();
        System.out.print("Enter Name:");
        this.name = input.nextLine();
        System.out.print("Enter Gender:");
        this.gender = input.nextBoolean();
    }

    public void printInfo() {
        System.out.println("-----------------------------------");
        System.out.println("| ID | Name | Male |");
        System.out.printf("| %d | %s | %b |\n", this.id, this.name, this.gender);
    }

    public static void main(String[] args) {
        //tao doi tuong cua lop student
        Student std = new Student();
        //goi phuong thuc cua doi tuong student
        std.scanInfo();
        std.printInfo();
    }

}
