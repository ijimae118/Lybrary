/*
 *Xay dung hệ thống thực đơn-de chon lua cac  chuc nang trong 1 chuong trinh
*1.Goi tien
*2.Rut tien
*3.Chuyen khoan
*4.Xem so du
*5.Ket thuc
 */
package demoLOOP;

import java.util.Scanner;
public class demoMENU {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String op="";
        
        while (true) {            
            System.out.println("===NENU===");
            System.out.println("1.Goi tien");
            System.out.println("2.Rut tien");
            System.out.println("3.Chuyen khoan");
            System.out.println("4.Xem so du");
            System.out.println("5.Ket thuc");
            
            System.out.println("Vui long chon chuc nang [1-5]");
            op = sc.nextLine();// cho user nhap so hieu chuc nang muon lam viec
            
            switch(op){
                case "1": System.out.println("Ban dang thuc hien viec goi tien...");
                break;//chay tiếp case 2
                case "2": System.out.println("Ban dang thuc hien viec rut tien...");
                break;
                case "3": System.out.println("Ban dang chuyen khoan...");
                break;
                case "4": System.out.println("So du hien tai la...");
                break;
                case "5": System.out.println("Cam on ban da su dung dich vu...");
                return;//để tắt trương trinh
                default: System.out.println("Vui long chon dung chuc nang[1-5]...");// mặc định
                break;
            }
        }
    }
    
}
