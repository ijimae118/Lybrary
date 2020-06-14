/*
 * demo Arraylist
 */
package demoArray;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class viduArraylist {

    public static void main(String[] args) {
        viduArraylist vd = new viduArraylist();
        vd.demo();

    }

    void demo() {
        ArrayList tenSV = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String ten;// = null;
        String ans;// = null;

//vong lap nhap vo danh sach ten sinh vien .Ket thuc khi user nhap cau tra loi dong y Ket thuc nhap lieu
        System.out.println(">>Nhap danh sach ten sinh vien<<");

        while (true) { //lap lai lien tuc
            System.out.print("nhap ten sinh vien: ");
            ten = sc.nextLine();

            tenSV.add(ten);//luu ten cua sinh vien vo arraylist (tenSV)

            System.out.print("ban co tiep tuc nhap (y|n)?: ");
            ans = sc.nextLine();

            if (ans.equalsIgnoreCase("n")) {
                break;//ket thuc vong lap while -nhap ren sinh vien
            }

        }

        //in ra ten danh sach sinh vien
        System.out.println("\n Danh sach ten sinh vien: ");
        tenSV.forEach((item) -> {
            //item la bien tu dat dc nhu abc,123,v.v
            System.out.println(item);
        });

        // in ra danh sach sinh vien -dc sap xep theo thu tu a-z
        Collections.sort(tenSV);
        System.out.println("\n Danh sach ten sinh vien:");
        for (Object abc : tenSV) { //item la bien tu dat dc nhu abc,123,v.v
            System.out.println(abc);
        }
        System.out.println("\n Danh sach ten sinh vien:");
        System.out.println(tenSV);
    }

}
