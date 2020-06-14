/*
II. Package - ArrayList (+)
Viết chương trình Java quản lý danh sách các căn hộ, bao gồm các chức năng thêm mới, tìm
kiếm và in toàn bộ danh sách theo hướng dẫn sau
1. Tạo project As6b
2. Tạo package data:
a. Trong package data, tạo class Apartment để mô tả 1 căn hộ như sau:
i. Fields: id , owner, address, width (float, >0), length (float, >0)
ii. Constructors: no-arg, parameterize
iii. Phương thức:
1. private void input() : nhập dữ liệu cho 1 căn hộ - được gọi trong
hàm dựng không tham số.
2. public void print() : xuất thông tin chi tiết của căn hộ bao gồm :
id, owner, address, width, length, area (diện tích), peripheral (chu
vi)
3. public boolean isSquare(), trả về true nếu chiều dài và rộng của
căn hộ là bằng nhau.
4. public float getArea() : trả về diện tích căn hộ
5. public float getPeripheral() : trả về chu vi căn hộ
6. String toString(): biểu diễn đối tượng Apartment dưới dạng chuỗi

3. Tạo package ui.
a. Trong package ui, tạo java main class ApartmentTest để thực hiện chức năng
quản lý danh sách căn hộ với nội dung như sau:
i. Fields: ArrayList ds (chứa các đối tượng căn hộ),
ii. No-agr constructor (Hàm dựng không tham số): khởi tạo bộ nhớ cho
arraylist ds
iii. Methods:
1. void add(): thêm 1 căn hộ mới mới vô danh sách ds.
Lưu ý: kiểm tra nếu mã số căn hộ bị trùng sẽ báo lỗi và từ chối thêm
mới.
2. void display(): In toàn bộ bảng danh sách các căn hộ, và in thông báo
lỗi nếu hệ thống chưa có dữ liệu

Page 3 of 3 ADF-I – Assignment 6
3. void display(int area): In ra danh sách các căn hộ có diện tích trên
area m2
. Chương trình sẽ in thông báo lỗi nếu hệ thống chưa có dữ
liệu hoặc không tìm thấy căn hộ nào thỏa điều kiện nêu trên.
4. void display(boolean isSquare):
- Nếu isSquare là true: Tìm và in ra danh sách các căn hộ hình vuông,
ngược lại xuất các căn hộ hình chữ nhật.
- Lưu ý: chương trình sẽ in thông báo lỗi nếu hệ thống chưa có dữ
liệu hoặc không tìm thấy căn hộ nào theo yêu cầu.
5. void menu(): xây dựng hệ thống thực đơn cho phép thêm, tìm kiếm
và in danh sách các căn hộ theo yêu cầu.
6. static void main (): tạo 1 đối tượng kiểu ApartmentTest, gọi phương
thức menu() trên đối tượng này để thi hành chương trình.
 */
package As6_2_data;

import java.util.Scanner;

public class Apartment {

    String id, owner, address;
    float width, length;

    public Apartment() {
    }

    public Apartment(String id, String owner, String address, float width, float length) {
        this.id = id;
        this.owner = owner;
        this.address = address;
        this.width = width;
        this.length = length;
    }

     void input() {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter id: ");
        id = a.nextLine().trim();
        System.out.println("Enter owner: ");
        owner = a.nextLine().trim();
        System.out.println("Enter address: ");
        address = a.nextLine().trim();
        while (true) {
            System.out.println("Enter width: ");
            width = Float.parseFloat(a.nextLine().trim());
            if (width>0) {
                break;
            }
            System.out.println("width>0.");   

        }
        while (true) {
            System.out.println("Enter length: ");
            length = Float.parseFloat(a.nextLine().trim());
            if (length>0) {
                break;
            }
            System.out.println("length>0.");
        }

    }
    
    public void print(){
        System.out.println("Id: "+id);
        System.out.println("Owner: "+owner);
        System.out.println("Address: "+address);
        System.out.println("Width: "+width);
        System.out.println("Lenght: "+length);
        System.out.printf("Area: %f",width*length);
        System.out.printf("Peripheral: %f",(width+length)*2);
    
    }
    public boolean isSquare(){
        if (width==length) {
            return true;
        } else {
            return false;
        }
    }
    public float getArea(){
         return width*length;
    }
    public float getPeripheral(){
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return String.format("%5s %5s %5s %5.2f %5.2f %5.2f %5.2f",id,owner,address,width,length,width*length,(width+length)*2);
    }
    
}
