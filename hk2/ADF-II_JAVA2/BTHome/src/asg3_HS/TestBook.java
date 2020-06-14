package asg3_HS;

import java.util.Scanner;

public class TestBook {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookCatalog p = new BookCatalog();
        String op;
        while (true) {
            System.out.println("===Menu===");
            System.out.println("1.Thêm 1 sách mới vô bkList: ");
            System.out.println("2.Remove 1 qs by id: ");
            System.out.println("3.In toàn bộ ds book : ");
            System.out.println("4.Tim va In book theo ten: ");
            System.out.println("5.Thoat");

            System.out.print("Mời chọn menu[1-5]: ");
            op = sc.nextLine().trim();
            switch (op) {
                case "1":
                    p.add();
                    break;
                case "2":
                    System.out.print("Enter id to remove:");
                    p.remove(sc.nextLine().trim());
                    break;
                case "3":
                    p.display();
                    break;
                case "4":
                    System.out.print("Mời nhập name: ");
                    p.display(sc.nextLine().trim());
                    break;
                case "5":
                    return;
            }
        }
    }

}
