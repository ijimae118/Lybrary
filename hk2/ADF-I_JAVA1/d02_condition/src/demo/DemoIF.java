/*
*Vi du ve dieu kien IF-ELSE
*Cho nhap 1 so nguyen,xuat ra thong bao day la so chan hoac so le
 */
package demo;

import java.util.Scanner;

public class DemoIF {
    
    public static void main(String[] args) {
        //de thuc hien chuc nang nhap du lieu ,tao 1 doi tuong [sc] thuoc lop Scanner
        Scanner sc = new Scanner(System.in);
        
           //xuat 1 thong bao len man hinh
        System.out.print("nhap 1 so nguyen:");
        int n = sc.nextInt();
        
        if(n%2==0){
            System.out.printf("%d la so chan \n",n);
        }
        else{System.err.printf("%d la so le \n",n);
        }
    }
    
}
