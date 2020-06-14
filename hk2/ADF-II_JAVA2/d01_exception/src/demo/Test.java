/*
Chuong trinh java kiem thu loi NewException
 */
package demo;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int diem;
        
        java.util.Scanner sc= new Scanner(System.in);
        System.out.println("nhap diem thi cua 1 sv [0-100]: ");
        diem=Integer.parseInt(sc.nextLine().trim());
        
        //System.out.println("Phan loai: ");
        
        String xeploai="";
        
        if(diem >=90){
            xeploai="A";
        }
        else if(diem>=70){
            xeploai="B";
        }
        else if(diem>=50){
            xeploai="C";
        }
        else {
            xeploai="D";
        }
        
        System.out.printf(">>Diem KQ=%d,=> Xep loai: %s \n",diem,xeploai);
    }
    
}
