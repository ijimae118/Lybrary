/*
*Vi du minh hoa cau truc Switch_Case
*Tinh tien thuong cua nhan vien ,dua vao bac thang
*IF bac A=>1000 , bac B=>500,bac C=>200,cac bac khac=>50.
 */
package demo;

import java.util.Scanner;//chấm * chon hết tất cả thư viện

public class Demo_Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên nhan vien:");
        String name = sc.nextLine();

        System.out.print("Mời nhập bậc lương [A,B,C,D,...]:");
        String leve1 = sc.nextLine();
        //Tạo biến bonus=0
        int bonus = 0;
        // Các trường hợp
        switch (leve1) {
            case "A":
            case "a":
                bonus = 1000;
                break;
            case "B":
            case "b":
                bonus = 500;
                break;
            case "C":
            case "c":
                bonus = 200;
                break;
            default:
                bonus = 50;
                break;
        }
        System.out.println("*** Thong tin cua nhan vien ***");
        System.out.println("Ten:"+ name);
        System.out.println("Bac Luong:"+ leve1);
        System.out.println("Thuong:"+ bonus);
    }

}
