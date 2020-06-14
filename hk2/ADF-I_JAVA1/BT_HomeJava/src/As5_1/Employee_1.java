/*
 *ADF – I Assignment 5: ArrayList
Viết chương trình Java quản lý danh sách nhân viên, bao gồm các chức năng thêm mới, tìm kiếm và
in toàn bộ danh sách nhân viên trong công ty.
Hướng dẫn :
a. Tạo project As5
b. Tạo Java Class Employee để mô tả cấu trúc 1 nhân viên như sau:

i. Dữ liệu (fields – variable): id, name, position, baseSalary (100- 2000USD)
ii. Hàm dựng (constructors):
1. Không tham số Employee()
2. Có tham số Employee(String, String, String, int)
iii. Phương thức:
1. void input() : nhập dữ liệu cho các thuộc tính của nhân viên
2. void print() : xuất thông tin chi tiết của đối tượng nhân viên

c. Tạo Java Main Class EmployeeTest (EmployeeTest.java) thực hiện chức năng quản lý danh sách nhân viên :
i. Dữ liệu (fields – variable):
empList ( là 1 ArrayList chứa các đối tượng nhân viên),
ii. Hàm dựng không tham số:
khởi tạo empList
iii. Phương thức (Methods):
1. void add(): thêm 1 nhân viên mới vô danh sách ds.
Lưu ý: kiểm tra nếu mã số bị trùng sẽ báo lỗi và từ chối thêm mới.
2. void display(): In toàn bộ bảng danh sách nhân viên, và in thông báo lỗi nếu hệ thống chưa có
dữ liệu
3. void display(int amt): In bảng danh sách nhân viên có mức lương trên amt USD. Chương trình
sẽ in thông báo lỗi nếu hệ thống chưa có dữ liệu hoặc không tìm thấy nhân viên nào có mức
lương trên amt USD
4. void display(String empName): Tìm và in ra bảng danh sách các nhân viên có tên chứa chuỗi
empName. Chương trình sẽ in thông báo lỗi nếu hệ thống chưa có dữ liệu hoặc không tìm
thấy nhân viên nào theo yêu cầu trên.
5. void menu(): xây dựng hệ thống thực đơn cho phép thêm, tìm kiếm và in danh sách các nhân
viên theo yêu cầu nói trên.
6. static void main (): tạo 1 đối tượng kiểu EmployeeTest, gọi phương thức menu() trên đối
tượng này để thi hành chương trình.

d. Biên dịch và thi hành chương trình
 */
package As5_1;

import java.util.Scanner;


public class Employee_1 {
    String id,name,position;
    int baseSalary;

    public Employee_1() {
        
    }

    public Employee_1(String id, String name, String position, int baseSalary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.baseSalary = baseSalary;
    }
     
    void input(){
     Scanner in= new Scanner(System.in);
        System.out.print("Enter id: ");
        id=in.nextLine().trim();
        System.out.print("Enter name: ");
        name=in.nextLine().trim();
        System.out.print("Enter position: ");
        position=in.nextLine().trim();
        while (true) {            
            System.out.print("Enter baseSalary: ");
             baseSalary=Integer.parseInt(in.nextLine().trim());
 //           baseSalary=in.nextInt();
            if (baseSalary>=100 && baseSalary<=2000) {
                break;
            }
            System.out.println("ERROR:baseSalary in[100~2000].");
        }
    }
    
    void print(){
        System.out.printf("***Employee %s***\n",id);
        System.out.println("ID: "+id);
        System.out.println("NAME: "+name);
        System.out.println("POSITION: "+position);
        System.out.println("baseSalary: "+baseSalary);
    }
}
