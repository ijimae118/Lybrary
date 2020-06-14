/*
Su dung bieu thuc qui tac ten cua 1 sinh vien co hop le hay ko
Ten hop le la:
- co do dai tu 4->30 ky tu
- moi ky tu duoc phep co gia tri a-z,A-Z, or khoang trang.[a-zA-Z ]
 */
package demo;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author lam
 */
public class Vidu1 {

    public static void main(String[] args) {
        java.util.Scanner sc= new Scanner(System.in);
        System.out.print("Nhap vao ho ten: ");
        String fullname = sc.nextLine().trim();
        
        //1.Tao doi tuong Pattern chua qui luat mo ta ten hop le
        //Ten hop le la:
        //Chua cac ky tu a-z ,A-Z hoac khoang trang
        //co do dai tu 4->30 ky tu =>luong tu{}
        java.util.regex.Pattern p = Pattern.compile("[a-z A-Z]{4,30}");
        //2.Tao doi tuong Matcher ,de thuc hien viec so sanh(so khop) mau qui tac p voi chuoi ten duoc nhap fullname
        java.util.regex.Matcher m= p.matcher(fullname);
        if (m.matches()) {
            System.out.println("Ten nhap dung roi");
        }else{
            System.out.println("Ten ko hop le.Vui long nhap lai");
        }
        
    }
    
}
