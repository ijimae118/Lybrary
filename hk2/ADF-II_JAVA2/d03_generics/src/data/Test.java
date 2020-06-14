package data;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op;
        
        ProductList p = new ProductList();
        p.readFile();
        while (true) {
            System.out.println("===Danh Sách ===");
            System.out.println("1.Thêm sp: ");
            System.out.println("2.Remove sp theo ID: ");
            System.out.println("3.In toàn bộ ds sp: ");
            System.out.println("4.Tim va In bảng danh sách sp theo ten: ");
            System.out.println("5.Thoat");

            System.out.print("Mời chọn menu[1-5]: ");
            op = sc.nextLine().trim();
            switch (op) {
                case "1":
                    p.add();
                    break;
                case "2":
                    System.out.print("Enter id to remove:");
                    
                    break;
                case "3":
                    p.display();
                    break;
                case "4":
                    System.out.print("Mời nhập name: ");
                    p.display(sc.nextLine().trim());
                    break;
                case "5":
                    //save danh sach du lieu truoc khi ket thuc ct 
                    p.saveFile();
                    return;
            }
        }
    }

}
