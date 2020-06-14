/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoArray;


public class print {


    public static void main(String[] args) {
        String tenSV = "Nguyen Xuan Huy";
        int namSinh = 2000;
        float diemThi = 97.69F;
        boolean gioiTinh = true;
        //in thong tin sinh vien
        //ten: Nguyen Xuan Huy, nam sinh: 2000, diem kq: 97.69, gioi tinh: nam
        //su dung ham printf() :f - format (%s, %d, %f)
        System.out.println("\nHam printf()");
        System.out.printf("ten: %s, nam sinh: %d, diem kq: %f, gioi tinh: %s\n", tenSV, namSinh, diemThi, gioiTinh);
        System.out.printf(">> Finished !\n");
        //su dung ham println() 
        System.out.println("\nHam println()");
        System.out.println("ten: "+tenSV+", nam sinh: "+namSinh+", diem kq: "+diemThi+", gioi tinh: "+gioiTinh);
        System.out.println(">> Finished !");
        
        //su dung ham print() 
        System.out.println("\nHam print()");
        System.out.print("ten: "+tenSV+", nam sinh: "+namSinh+", diem kq: "+diemThi+", gioi tinh: "+gioiTinh+"\n");
        System.out.print(">> Finished !\n");
    }
    
}
