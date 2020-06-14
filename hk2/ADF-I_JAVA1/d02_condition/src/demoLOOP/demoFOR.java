/*
 *demo vong lap FOR
* viet chuong trinh in bang cuu chuong N
 */
package demoLOOP;
import java.util.Arrays;
import java.util.Collections;

import java.util.Scanner;
public class demoFOR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    System.out.print("Nhap 1 so nguyen: ");
    int n= sc.nextInt();
    // sout -> bấm tab 
        System.out.printf("*** Bang cuu chuong %d ***\n",n);
        for (int i =1 ; i<=10; i++){
            System.out.printf("%3d*%3d=%4d  \n",n,i,n*i);
        }
        
    }
 
}
