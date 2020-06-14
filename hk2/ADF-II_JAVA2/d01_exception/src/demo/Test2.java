/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int diem;

        java.util.Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("nhap diem thi cua 1 sv [0-100]: ");
                diem = Integer.parseInt(sc.nextLine().trim());
                if (diem > 0 && diem <= 100) {
                    break;
                }
                throw new NewException("Diem thi phai >=0 va <=100!");
            } catch (Exception e) {
                System.out.println("loi:" + e.getMessage());
            }
        }

        //System.out.println("Phan loai: ");
        String xeploai = "";
        if (diem >= 90) {
            xeploai = "A";
        } else if (diem >= 70) {
            xeploai = "B";
        } else if (diem >= 50) {
            xeploai = "C";
        } else {
            xeploai = "D";
        }

        System.out.printf(">>Diem KQ=%d,=> Xep loai: %s \n", diem, xeploai);
    }

}
