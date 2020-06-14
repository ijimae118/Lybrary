/*
demo cac chuc nang cua class Math
 */
package demo;

import java.util.Scanner;

public class ViduMath {

    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.print("nhap 1 so: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        double x = Math.sqrt(n);
        System.out.printf("- can bac 2 cua %d = %.2f \n", n, x);
        System.out.printf("%2f\n",Math.abs(x));
        System.out.printf("- so san: floor(%f) = %f \n", x, Math.floor(x));
        System.out.printf("- so tran: ceil(%f) = %f \n", x, Math.ceil(x));
        System.out.printf("- so lam tron: round(%f) = %d \n", x, Math.round(x));///lam tron se cho ra so nguyen

        int a = 5, b = 3;
        System.out.printf("- luy thua %d^%d: pow(%d,%d) = %f \n", a, b, a, b, Math.pow(a, b));

//        float r;
//        System.out.printf("- so ngau nhien tu [0-1]: %f \n",Math.random());
        System.out.println("- 5 so ngau nhien (so thuc tu 0-1) bat ky: ");
        for (int i = 0; i < 5; i++) {
            System.out.printf("\t %f \n", Math.random());
        }

        System.out.println("- 5 so ngau nhien (so nguyen [0-100]) bat ky: ");
        for (int i = 0; i < 5; i++) {
            System.out.printf("\t %d \n", Math.round(Math.random() * 100));
        }

        System.out.println("- 5 so ngau nhien (so nguyen [10-50]) bat ky: ");
        for (int i = 0; i < 5; i++) {
            System.out.printf("\t %d \n", Math.round(Math.random() * 40)+10);// day so chay tu (0-40) ,moi element+10=>[10-50] 
        }
        
        

    }

}
