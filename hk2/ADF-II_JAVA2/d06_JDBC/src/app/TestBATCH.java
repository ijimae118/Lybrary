/*
Kiem thu cac chuc nang CRUD cua lop BacthDAO
 */
package app;

import data.*;
import java.util.*;

public class TestBATCH {

    public static void main(String[] args) {
        TestBATCH tb= new TestBATCH();
        tb.menu();
    }

    void menu() {
        Scanner sc = new Scanner(System.in);
        String op = null;
        while (true) {
            System.out.println("\n MENU ");
            System.out.println("************");
            System.out.println("1.Xem danh sach");
            System.out.println("2.Them moi");
            System.out.println("3.Xoa");
            System.out.println("4.Thoat");
            System.out.print("Chon chuc nang [1-4]: ");
            op = sc.nextLine().trim();
            switch (op) {
                case "1":
                    //in ds lop hoc
                    ArrayList<Batch> ds = BatchDAO.getList();
                    System.out.println("Danh sach cac lop hoc: ");
                    ds.forEach(System.out::println);
                    break;
                case "2":
                    //them 1 lop hoc moi
                    Batch lopMoi = new Batch();
                    lopMoi.input();
                    if (BatchDAO.insert(lopMoi) > 0) {
                        System.out.println("\n Da them lop hoc vo DB thanh cong");
                    } else {
                        System.out.println("\n Them moi that bai !!!");
                    }
                    break;
                case "3":
                    //xoa 1 lop hoc theo maso
                    System.out.println("\n >> Nhap ma lop muon xoa: ");
                    //String ms= sc.nextLine().trim();
                    if (BatchDAO.delete(sc.nextLine().trim())>0) {
                        System.out.println("\n Xoa thanh cong !");
                    }else{
                        System.out.println("\n Xoa that bai !");
                    }
                    break;
                case "4":
                    return;
            }
        }

    }

}
