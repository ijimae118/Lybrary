/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Goods;
import java.util.Scanner;

/**
 *
 * @author THUYLM
 */
public abstract class Computer {
    public String id,name;
    public int price;
    
    public Computer(){}
    
    public void accept(){
        Scanner sc = new Scanner(System.in);
        while (true){
            try{
                System.out.print("Nhap ID: ");
                id = sc.nextLine().trim();
                if (id.length() > 0){
                    break;
                }
                throw new Exception("ID khong duoc de trong");
            }
            catch(Exception e){
                System.out.println("Loi: "+e.getMessage());
            }
        }
        while (true){
            try{
                System.out.print("Nhap name: ");
                name = sc.nextLine().trim();
                if (name.length() > 0){
                    break;
                }
                throw new Exception("Name khong duoc de trong");
            }
            catch(Exception e){
                System.out.println("Loi: "+e.getMessage());
            }
        }
        while (true){
            try{
                System.out.print("Nhap price: ");
                price = sc.nextInt();
                if (price >= 0){
                    break;
                }
                throw new Exception("Price khong duoc be hon khong");
            }
            catch(Exception e){
                System.out.println("Loi: "+e.getMessage());
                sc = new Scanner(System.in);
            }
        }
    }
    public abstract void printInfo();
}
