
package asg2_Ar;

import java.util.Scanner;


public class Test_2 {

 
    public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        DoctorList_2 d = new DoctorList_2();
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
