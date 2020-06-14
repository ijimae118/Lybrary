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
public class Laptop extends Computer {
    public boolean webcam;
    public int QoH;
    
    public Laptop(){}

    @Override
    public void accept() {
        super.accept(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        while (true){
            try{
                System.out.print("Nhap webcame(y/n): ");
                webcam = sc.nextLine().trim().equalsIgnoreCase("y");
                break;
            }
            catch(Exception e){
                System.out.println("Loi: "+e.getMessage());
            }
        }
        while (true){
            try{
                System.out.print("Nhap QoH: ");
                QoH = sc.nextInt();
                if (QoH > 0){
                    break;
                }
                throw new Exception("QoH khong duoc be hon khong");
            }
            catch(Exception e){
                System.out.println("Loi: "+e.getMessage());
                sc = new Scanner(System.in);
            }
        }
    }
    
    
    @Override
    public void printInfo() {
        System.out.println("---Thong tin laptop---");
        System.out.printf("Ma so: %s\n",id);
        System.out.printf("Ten sp: %s\n",name);
        System.out.printf("Gia sp: %d\n",price);
        System.out.printf("So luong ton khon: %d\n",QoH);
        System.out.printf("Webcam: %s\n", webcam?"co":"khong");
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Webcam: %s, Price: %d, QoH: %d, Amount: %d\n",id,name,webcam?"co":"khong",price,QoH,price*QoH);
    }
    
    
}
