package data;

import java.util.Scanner;

public class TestMonHoc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op = "";

        while (true) {
            System.out.println("\n ===Menu=== ");
            System.out.println("1.Them ");
            System.out.println("2.Xem danh sach ");
            System.out.println("3.Tim mon hoc theo ten ");
            System.out.println("4.Xoa mon hoc theo ma so");
            System.out.println("5.Thoat");
            System.out.println(" >> Vui long thuc hien chuc nang [1-4]:");

            op = sc.nextLine().trim();

            switch (op) {
                case "1":
                    MonHoc m = new MonHoc();
                    m.input();
                    MonHocDAO.insert(m);
                    break;
                case "2":
                    System.out.println(">>Danh sach mon hoc<<");
                    MonHocDAO.getList().forEach(System.out::println);
                    break;
                case "3":
                    System.out.println("Nhap ten mon hoc:");
                    String ten = sc.nextLine().trim();
                    long cnt = MonHocDAO.getList().stream().filter(item -> item.tenNgan.contains(ten)).count();//phan biet chu hoa chu thuong
                    if (cnt == 0) {
                        System.out.println(">>Ko tim thay<<");
                    } else {
                        MonHocDAO.getList().stream().filter(item -> item.tenNgan.contains(ten)).forEach(System.out::println);
                    }
                    break;
                case "4":
                    System.out.println("Nhap ma mon hoc muon xoa:");
                    int ms = Integer.parseInt(sc.nextLine().trim());
                    if (MonHocDAO.delete(ms)>0) {
                        System.out.println(">> Da xoa thanh cong");
                    }else{System.out.println(">> Xoa that bai");}
                    break;
                case "5":
                    return;

            }

        }
    }

}
