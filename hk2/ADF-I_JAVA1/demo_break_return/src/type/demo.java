/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package type;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class demo {

    public boolean gender01;
    public String gender02;
    Scanner sc = new Scanner(System.in);

    public demo() {
    }

    public void input01() {
        
        
        while (true) {
            try {
                System.out.println("Moi nhap gender01[nam/nu]: ");// boolean
                gender01 = sc.nextLine().trim().equalsIgnoreCase("nam");//input("nam")==true
                break;

               
            } catch (Exception e) {
                System.out.println("loi:"+e.getMessage());
            }

        }
        
     
    }

    public void input02() {
        
        
        while (true) {
            System.out.println("Moi nhap gender02[nam/nu]: ");
            gender02 = sc.nextLine().trim().toLowerCase();
            if (gender02.equalsIgnoreCase("nam") || gender02.equalsIgnoreCase("nu")) {// String 
                break;
            }
            System.out.println("Du lieu 02 ko hop le");
        }
        
        
    }

    public void print() {
        
        System.out.printf("gender: %s \n", gender01 ? "nam" : "nu");
        
        
        System.out.println("gender: " + gender02);
    }
}
