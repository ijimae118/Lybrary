/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package As2;
import java.util.Scanner;
public class AccountTest {

    public static void main(String[] args) {
        AccountTest o= new AccountTest();
        o.menu();
    }
    
    public void menu(){
        Scanner in = new Scanner(System.in);
        Account a = new Account();
        int option,amt;// int option=0,amt=0;
        
        do{
            System.out.println("He thong rut/goi tien tu dong: ");
            System.out.println("1.Goi tien: ");
            System.out.println("2.Rut tien: ");
            System.out.println("3.xem so du: ");
            System.out.println("4.Thoat: ");
            System.out.print("\tChon chuc nang(1-4): ");
            
            option = in.nextInt();
            switch(option){
                case 1:
                    System.out.print("Nhap so tien muon goi: ");
                    amt =in.nextInt();
                    a.deposit(amt);
                    break;
                case 2:
                    System.out.print("Nhap so tien muon rut: ");
                    amt =in.nextInt();
                    a.withdraw(amt);
                    break;
                case 3:
                    System.out.printf("so du: %d \n",a.getBalance());
                    break;
            }
        }while(option !=4);
        System.out.println("Cam on da su dung he thong! Bye Bye ...");
    }
}
