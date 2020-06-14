/*
JP2 Assignment 2 - Collection API
Viết chương trình quản lý danh sách các bác sĩ bao gồm các chức năng:
1. Thêm bác sĩ mới
2. Xóa bác sĩ ra khỏi danh sách, theo mã số
3. Liệt kê tất cả bác sĩ có trình độ chuyên khoa 2
4. Tìm kiếm bác sĩ theo tên
5. Thoát

Yêu cầu thực hiện:
1. Tạo class Doctor bao gồm :
a. Các fields dữ liệu:
i. String id, name, level
ii. int exp_years
b. Các contructors để khởi tạo giá trị ban đầu cho các field dữ liệu.
c. Method :
* void input() : nhập chi tiết bác sĩ và kiểm tra dữ liệu hợp lệ như sau :
- id : Dxx[xx], với x là ký số - từ 2 đến 4 ký số.
- name : ít nhất 2 ký tự chữ hoặc khoảng trắng.
- level : trình độ chuyên khoa: level 1, level 2, level 3 hoặc để trống.
- exp_years: số năm kinh nghiệm , từ 0 - 60
 String toString() : override method này để biểu diễn nội dung của 1 đối tượng bác sĩ dưới dạng
chuỗi.

2. Tạo class DoctorList bao gồm :
a. Các fields dữ liệu:
HashMap<String, Doctor> drList để lưu danh sách các bác sĩ.
b. Method :
1. void add() : thêm 1 bác sĩ vô danh sách drList. Yêu cầu kiểm tra trùng mã .
2. void remove(String drID) : Xóa bác sĩ có mã drID ra khỏi danh sách drList.
3. void display() : In danh sách các bác sĩ thuộc chuyên khoa 2 ra màn hình.
4. void display(StringdrName) : Tìm và in ra ds các bác sĩ có tên chứa trong đối số drName

3. Tạo java main class TestDoctor có menu để test chương trình
 */
package asg2_Ar;

import java.util.Scanner;

public class TestDoctor {

    public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        DoctorList d = new DoctorList();
        String op;
        while (true) {
            System.out.println("===Danh Sách Bac Si===");
            System.out.println("1.Thêm 1 bac si: ");
            System.out.println("2.Remove 1 bac si theo ID: ");
            System.out.println("3.In toàn bộ ds bac si thuoc chuyen khoa 2: ");
            System.out.println("4.Tim va In bảng danh sách bac si theo ten: ");
            System.out.println("5.Thoat");

            System.out.print("Mời chọn menu[1-5]: ");
            op = ap.nextLine().trim();
            switch (op) {
                case "1":
                    d.add();
                    break;
                case "2":
                    System.out.print("Enter id to remove:");
                    d.remove(ap.nextLine().trim());
                    break;
                case "3":
                    d.display();
                    break;
                case "4":
                    System.out.print("Mời nhập name: ");
                    d.display(ap.nextLine().trim());
                    break;
                case "5":
                    return;
            }
        }
    }

}
