/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goods;

/**
 *
 * @author THUYLM
 */
public class LaptopCatalog {
    public int max=5,count=0;
    Laptop[] cList = new Laptop[max];
    
    public void addLaptop(){
        if(count==max){
            System.out.println("He thong qua tai.");
            return;
        }
        Laptop lap = new Laptop();
        lap.accept();
        cList[count] = lap;
        count++;
    }
    public void displayAll(){
        if(count==0){
            System.out.println("He thong chua co du lieu.");
            return;
        }
        for(int i =0; i<count; i++){
            System.out.println(cList[i]);
        }
    }
    public void search(String laptopName){
        if(count==0){
            System.out.println("He thong chua co du lieu.");
            return;
        }
        int count_remove = 0;
        for(int i =0; i<count; i++){
            if(cList[i].name.toLowerCase().contains(laptopName)){
                cList[i].printInfo();
                count_remove++;
            }
        }
        if(count_remove == 0){
            System.out.println("Khong tim thay du lieu yeu cau.");
        }
    }
    public void remove(String laptopID){
        if(count==0){
            System.out.println("He thong chua co du lieu.");
            return;
        }
        int count_remove = 0;
        for(int i =0; i<count; i++){
            if(cList[i].id.equals(laptopID)){
                
                for(int j = i; j<count-1; j++){
                    cList[j] = cList[j+1];           
                }
                count--;
                               
                count_remove++;
                System.out.printf("Da xoa laptop id %s",laptopID);
                break;//ket thuc 
            }
        }
        if(count_remove == 0){
            System.out.println("Khong tim thay du lieu yeu cau.");
        }
    }
    
}
