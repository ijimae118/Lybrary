package ui;

import data.Apartment;
import java.util.ArrayList;
import java.util.Scanner;

public class ApartmentTest {

    ArrayList<Apartment> ds = new ArrayList<>();// khởi tạo hàm dựng

    public static void main(String[] args) {
        ApartmentTest o = new ApartmentTest();
        o.menu();
    }

    void add() {
        Apartment a = new Apartment();

        int temp = 0;
        for (int i = 0; i < ds.size(); i++) {
            if (a.id.equalsIgnoreCase(ds.get(i).id)) {
                temp++;
            }
        }
        if (temp != 0) {
            System.out.println("***************");
            System.out.println("In bị trùng !!!");
            System.out.println("***************");
        } else {
            ds.add(a);
        }

    }

    void display() {
        if (ds.isEmpty()) {
            System.out.println("He thong chua co du lieu");
            return;
        }
        for (Apartment d : ds) {
            d.print();
        }
    }

    void display(int area) {
        if (ds.isEmpty()) {
            System.out.println("He thong chua co du lieu");
            return;
        }
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getArea() > area) {
                System.out.println("\n Danh sach ten nhan vien co muc luong tren amt USD: ");
                ds.get(i).print();

            } else {
                System.out.println("Căn hộ ko đạt yêu cầu: " + ds.get(i).id);
            }

        }
    }

    void display(boolean isSquare) {
        if (ds.isEmpty()) {
            System.out.println("He thong chua co du lieu");
            return;
        }
        
        if (isSquare == true) {
            int dem=0;
            for (int i = 0; i < ds.size(); i++) {

                if (ds.get(i).width == ds.get(i).length) {
                    System.out.println("căn hộ hình vuông");
                    ds.get(i).print();
                    dem++;
                } else {
                    System.out.println("Căn hộ ko đạt yêu cầu hv: " + ds.get(i).owner);
                }
            }
            if (dem==0) {
                System.out.println("Ko có căn hộ nào hình vuông");
            }

        } else {
            int sum=0;
            for (int i = 0; i < ds.size(); i++) {
                
                if (ds.get(i).width != ds.get(i).length) {
                    System.out.println("Căn hộ hình chữ nhật");
                    ds.get(i).print();
                    sum++;
                } else {
                    System.out.println("Căn hộ ko đạt yêu cầu hcn: " + ds.get(i).owner);
                }
            }
            if (sum==0) {
                System.out.println("Ko co can ho nao hinh chu nhat.");
            }
        }
    }

    void menu() {
        Scanner ap = new Scanner(System.in);
        String op;
        while (true) {
            System.out.println("===Danh Sách Nhân Viên===");
            System.out.println("1.Thêm căn hộ: ");
            System.out.println("2.In toàn bộ ds căn hộ: ");
            System.out.println("3.In bảng danh sách căn hộ có diện tích trên area m^2: ");
            System.out.println("4.Tìm ds căn hộ hình vuông[Please enter true]: ");
            System.out.println("5.Thoat");

            System.out.print("Mời chọn menu[1-5]: ");
            op = ap.nextLine().trim();
            switch (op) {
                case "1":
                    add();
                    break;
                case "2":
                    display();
                    break;
                case "3":
                    System.out.print("Mời nhập area m^2: ");
                    int area = Integer.parseInt(ap.nextLine().trim());
                    //int area=ap.nextInt();
                    display(area);
                    break;
                case "4":
                    System.out.print("Mời nhập true để in ra hình vuông|| false để in ra hình chữ nhật: ");
                    boolean isSquare = Boolean.parseBoolean(ap.nextLine().trim());
                    display(isSquare);
                    break;
                case "5":
                    return;
            }
        }

    }
}
