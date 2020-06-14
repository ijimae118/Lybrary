package ui;

import java.sql.SQLException;
import java.util.Scanner;
import model.Project;
import model.ProjectDAO;

public class Test {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        String op = "";

        while (true) {
            System.out.println("\n ===Menu=== ");
            System.out.println("1.Them ");
            System.out.println("2.Xoa mon hoc theo ma so");
            System.out.println("3.Xem danh sach tbProject ");
            System.out.println("4.Tra ve ds du an hoan tat ");

            System.out.println("5.Thoat");
            System.out.println(" >> Vui long thuc hien chuc nang [1-5]:");

            op = sc.nextLine().trim();

            switch (op) {
                case "1":
                    Project m = new Project();
                    m.input();
                    ProjectDAO.insert(m);
                    break;
                case "2":
                    System.out.println("Nhap ma du an muon xoa:");
                    String ms = sc.nextLine().trim();
                    if (ProjectDAO.delete(ms) > 0) {
                        System.out.println(">> Da xoa thanh cong");
                    } else {
                        System.out.println(">> Xoa that bai");
                    }
                    break;
                case "3":
                    System.out.println(">>Danh sach tbProject<<");
                    ProjectDAO.getList().forEach(System.out::println);
                    break;
                case "4":
                    System.out.println("Danh sach du an hoan thanh: ");
                    ProjectDAO.getCompletedProject();
                    break;

                case "5":
                    return;

            }

        }
    }

}
