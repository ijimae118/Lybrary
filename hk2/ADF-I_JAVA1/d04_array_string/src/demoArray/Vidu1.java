/*
 * Demo cach tao mang.
 */
package demoArray;

import java.util.Scanner;

public class Vidu1 {

    public static void main(String[] args) {
        Vidu1 vd = new Vidu1();
        vd.gen10Int(); System.out.println();
        vd.gen10Int2(); System.out.println();
        vd.gen5Int(); System.out.println();
    }

 //ham tao mang co 10 so nguyen 
    private void gen10Int(){
        //mang co 10 so nguyen, ie. moi pt cua mang phai la so nguyen 
        int[] aInt ;            //khai bao bien mang aInt;
        aInt = new int[10];     //cap phat bo nho cho mang aInt chua 10 so nguyen
//      int[] aInt=new int[10];        
        System.out.println(">> Noi dung cua mang aInt:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%3d",aInt[i]);
        }
        
    }

 //ham tao mang co 10 so nguyen - duoc khoi gan gia tri ban dau co dinh. 
    private void gen10Int2(){
        //mang co 10 so nguyen, ie. moi pt cua mang phai la so nguyen 
        int[] aInt = {10,20,30,40,50,30,60,70,80,100};
        
        System.out.println("\n>> Noi dung cua mang aInt - duoc khoi gan gia tri co dinh:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%3d ",aInt[i]);
        }
    }

 //ham tao mang co 5 so nguyen - duoc khoi gan gia tri khi chuong trinh chay. 
    private void gen5Int(){
        //khai bao mang co 5 so nguyen va cap phat bo nho (bang toan tu new)
        int[] aInt = new int[5];
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap gia tri cho mang: ");
        for (int i = 0; i < 5; i++) {
            System.out.printf("nhap phan tu thu %d: ", i);
            aInt[i] = sc.nextInt();
        }
        
        System.out.println("\n\n>> Noi dung cua mang aInt - duoc khoi tri trong vong lap:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%3d ",aInt[i]);
        }
    }

}
