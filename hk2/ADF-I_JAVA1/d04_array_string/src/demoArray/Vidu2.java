/*
 *demo cach tao mang chua ca chuoi ky tu String
 */
package demoArray;
import java.util.Scanner;
public class Vidu2 {

    public static void main(String[] args) {
        Vidu2 vd = new Vidu2();
        
        vd.genAString();
        System.out.println("");
        vd.genAString2();
        System.out.println("");

    }

    // Tao 1 mang chua cac chuoi ky tu co noi dung luc khoi tao
    private void genAString() {
        String[] a = {"Dong", "Tay", "Nam", "Bac", "Trung Tam"};
        System.out.println("\n Cac vi tri: ");
        for(int i = 0; i < a.length; i++){
            System.out.printf("%s \n", a[i]);
        }
    }

    // tao 1 mang chua cac chuoi ky tu co noi dung duoc khai tao boi user
private void genAString2() {
        //tao mang chua ten cua 6 ban sinh vien
        String[] tenSV = new String[6];
        Scanner sc = new Scanner(System.in);
        //vong lap nhap ten cua tung sinh vien
        System.out.println("\n Nhap ten sinh vien: ");
        for (int i = 0; i < tenSV.length; i++) {
            System.out.printf("Nhap ten SV thu %d: ", i + 1);
            tenSV[i] = sc.nextLine();
        }
        //vong lap in ra danh sach ten sinh vien
        for (int i = 0; i < tenSV.length; i++) {
            System.out.printf("%d. %s\n", i + 1, tenSV[i]);
        }
    }
}
