/*
ADF-II Assignment 1 - Regular Expression - Exception
Viết chương trình quản lý danh sách sản phẩm bao gồm các chức năng:
1. Thêm sản phẩm mới
2. Liệt kê tất cả sản phẩm
3. Tìm kiếm sản phẩm theo tên
4. Thoát

Yêu cầu thực hiện:
1. Tạo class exception InvalidException bao gồm các hàm dựng thông báo lỗi sai.
2. Tạo class Product bao gồm :
a. Các fields dữ liệu:
i. String id, name, mfg
ii. int unitPrice, qoh
b. Các contructors để khởi tạo giá trị ban đầu cho các field dữ liệu.
c. Method void input() : nhập và kiểm tra thông tin chi tiết cho sản phẩm :
- id : Fxxxx (food) hoặc Bxxxx (beverage), với x là ký số.
- name : ít nhất 2 ký tự.
- unitPrice, qoh > 0
- mfg: US hoặc VN hoặc TL
d. Method String standardlizeMFG() : trả về chuỗi mô tả đầy đủ tên quốc gia sản xuất của field
mfg: US => United State, VN => Vietnam, TL => Thailand
f. Override method toString() để biểu diễn nội dung của 1 đối tượng sp dưới dạng chuỗi, với nội
dung của field mfg được thay thế bằng hàm standardlizeMFG().

3. Tạo class ProductList bao gồm :
a. Các fields dữ liệu:
ArrayList<Product> prList để lưu danh sách sản phẩm.
c. Method :
1. void addProduct() : thêm 1 sản phẩm vô danh sách prList.
2. void displayAll() : In toàn bộ danh sách sản phẩm ra màn hình.
3. void searchByName(String name) : Tìm và in ra ds các sp có tên chứa trong đối số name

4. Tạo java main class TestProduct có menu để test chương trình
*/
package asg1_Ar;

import java.util.Scanner;

public class TestProduct {

    public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        ProductList pr = new ProductList();
        String op;
        while (true) {
            System.out.println("===Danh Sách San Pham===");
            System.out.println("1.Thêm Sp: ");
            System.out.println("2.In toàn bộ ds SP: ");
            System.out.println("3.Tim va In bảng danh sách SP theo ten: ");
            System.out.println("4.Thoat");

            System.out.print("Mời chọn menu[1-4]: ");
            op = ap.nextLine().trim();
            switch (op) {
                case "1":
                    pr.addProduct();
                    break;
                case "2":
                    pr.displayAll();
                    break;
                case "3":
                    System.out.print("Mời nhập name: ");
                    pr.searchByName(ap.nextLine().trim());
                    break;
                case "4":
                    return;
            }
        }

    }

}
