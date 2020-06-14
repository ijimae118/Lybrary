/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoctorList p = new DoctorList();
        String op;
        while (true) {
            System.out.println("===Danh Sách Bac Si===");
            System.out.println("1.Thêm 1 bac si: ");
            System.out.println("2.Remove 1 bac si theo ID: ");
            System.out.println("3.In toàn bộ ds bac si thuoc chuyen khoa 2: ");
            System.out.println("4.Tim va In bảng danh sách bac si theo ten: ");
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
    

