/*
 * I. Package - Array
Viết ứng dụng java quản lý danh sách sinh viên theo mô tả sau:
1. Tạo project As6a
2. Tạo package data. Trong package data, tạo class Student theo mô tả sau:
i. Fields : id, name, gender(boolean), theory[0-100], practice [0-100]
ii. Constructors: no-arg constructor , parameterize constructor
iii. Methods:
1. private void input() : nhập thông tin sinh viên, được gọi trong hàm
dựng không tham số
2. public void print() : xuất thông tin sinh viên
3. public String toString(): biểu diễn đối tượng sinh viên dưới dạng
chuỗi bao gồm : Id, name, (male/female), theory, practice,
average

3. Tạo package ui, tạo class StudentTest bao gồm:

i. Fields : max, count và mảng ds chứa các đối tượng Student
ii. Constructors: no-arg
iii. Methods:
1. void add() : thêm sinh viên mới
2. void display(): xuất ds Sinh viên – gọi method print() của class
Student
3. void display(int m): hiển thị ds sinh viên có điểm trung bình trên
mức điểm m (ví dụ display(40) : in ds các sv có điểm tb trên 40)
4. void display(String stName): hiển thị ds sinh viên có tên được
truyền bởi tham số stName
5. void menu()
6. static void main(String[] arg)
 */
package As6_1;

import java.util.*;

public class Student {

    String id, name;
    boolean gender;
    int theory, practive;

    public Student() {
    }

    public Student(String id, String name, boolean gender, int theory, int practive) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.theory = theory;
        this.practive = practive;
    }

    void input() {
        Scanner sv = new Scanner(System.in);
        System.out.print("Enter id: ");
        id = sv.nextLine();
        
        System.out.print("Enter name: ");
        name = sv.nextLine();

        System.out.print("Enter gender(true:nam||false:nu): ");
        gender = sv.nextBoolean();        
            
        while (true) {
            System.out.print("Enter theory: ");
            theory = sv.nextInt();
            if (theory >= 0 && theory <= 100) {
                break;//ket thuc vong lap 
            }
            System.out.println("ERROR_Theory in [0-100]: ");
        }
        while (true) {
            System.out.print("Enter practive: ");
            practive = sv.nextInt();
            if (practive >= 0 && practive <= 100) {
                break;//ket thuc vong lap 
            }
            System.out.println("ERROR_Practive in [0-100]: ");
        }

    }

    void print() {
        System.out.println("***Infor Student***");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Gender: %s \n" , gender ? "nam" : "nu");
        System.out.println("Theory: " + theory);
        System.out.println("Practive:" + practive);
    }

    @Override
    public String toString() {
        return String.format("%3s ,%3s,%3s,%3d,%3d", id, name, gender ? "nam" : "nu", theory, practive); //To change body of generated methods, choose Tools | Templates.
    }

}
