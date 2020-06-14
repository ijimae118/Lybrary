package as3;

import java.util.Scanner;

public class DoctorTest {

    public static void main(String[] args) {
//        Doctor d1 = new Doctor("1", "Minh", "tre em", 20, 2000);
//        Doctor d2 = new Doctor("2", "Nga", "tai mui hong", 10, 5000);
        DoctorTest m = new DoctorTest();
        m.menu();
        

        

    }
    
    void menu(){
        Scanner sc = new Scanner(System.in);
        String op = "";
        Doctor d = new Doctor();
        while(true){
            //man hinh menu
            System.out.println("Menu");
            System.out.println("1. Nhap thong tin bac si");
            System.out.println("2. Xuat thong tin");
            System.out.println("3. In cap bac");
            System.out.println("4. Tinh thu nhap");
            System.out.println("5. Ket thuc");
            System.out.print("Chon chuc nang [1-5]: ");
            op = sc.nextLine().trim();
            //dua vao so hieu chuc nang nhap vao de goi ham tuong ung
            switch(op){
                case "1":
                    d.input();
                    break;
                case "2":
                    d.print();
                    break;
                case "3":
                    System.out.print("nhap ms bac si: ");
                    String id = sc.nextLine().trim();
                    d.print(id);
                    break;
                case "4":
                    System.out.println("Nhap so ngay lam viec");
                    int days = Integer.parseInt(sc.nextLine().trim());
                    int income = d.print(days);
                    System.out.println(income);
                case "5":
                    System.out.println("ket thuc chuong trinh");
                    return;
                default:
                    System.out.println("chuc nang khong hop le");
                    break;
            }
        }
    }
}
