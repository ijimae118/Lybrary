/*
*vi du minh hoa cau truc IF-ELSE long nhau:Kiem tra nam nhuan
 */
package demo;

import java.util.Scanner;
public class DemoIF_NamNhuan {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.print("Nhap nam muon kiem tra:");
        int year = sc.nextInt(); //luu so nhap tu ban phim ->bien (year)
        //kiem tra
        if(year % 4 != 0){
            //Year ko chia het cho 4 =>nam binh thuong
            System.out.printf(">>%d la nam thuong,co 365 ngay \n",year);
        }
        else{
            if(year % 100 != 0){
                 //year chia het cho 4 va ko chia het 100(vd 2020,2024)    
                System.out.printf(">>%d la nam nhuan,co 366 ngay \n",year);
                }
            else if(year % 400 == 0){
                //year chia het cho 400 (vd 2000,2400)
                System.out.printf(">>%d la nam nhuan thế kỷ,co 366 ngay \n",year);
                }
            else{
                //year chi chia het 100 (vd 1900,2100,2200,2300, 2500)
                System.out.printf(">>%d la nam the ky ,co 365 ngay \n",year);
            }
            
        }
    }
}
