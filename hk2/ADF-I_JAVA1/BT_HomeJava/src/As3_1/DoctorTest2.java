/*
 *Kiem thu lop Doctor
 */
package As3_1;

import java.util.Scanner;

public class DoctorTest2 {

    public static void main(String[] args) {
        DoctorTest2 o = new DoctorTest2();
        o.menu();
    }

    void menu() {
        Scanner sc = new Scanner(System.in);
        String op = "";
        Doctor2 d = new Doctor2();
        while (true) {
            //man hinh menu
            System.out.println("Hệ thống quản lý bác sĩ: ");
            System.out.println("1.Nhập thông tin BS: ");
            System.out.println("2.Xuất thông tin BS: ");
            System.out.println("3.In cấp bậc: ");
            System.out.println("4.Tính thu nhập: ");
            System.out.println("5.Kết thúc: ");

            System.out.print("\tChon chuc nang(1-5): ");
            op = sc.nextLine().trim();

            //dua vao so lieu cbhuc nang nhap vao de goi ham tuong ung
            switch (op) {
                case "1":
                    d.input();
                    break;
                case "2":
                    d.input();
                    break;
                case "3":
                    System.out.println("Nhap ms bac si:");
                    String id = sc.nextLine().trim();
                    d.print(id);
                    break;
                case "4":
                    System.out.print("nhap so ngay lam viec: ");
                    int ngay = Integer.parseInt(sc.nextLine().trim());
                      System.out.printf(">>Thu nhap:%d \n",d.print(ngay));
//                    int income = d.print(ngay);
//                    System.out.println(income);

                    break;

                case "5":
                    return;  //ket thuc ham menu()

                default:
                    System.out.println("Chuc nang ko hop le !");
                    break;

            }
        }

    }
}
