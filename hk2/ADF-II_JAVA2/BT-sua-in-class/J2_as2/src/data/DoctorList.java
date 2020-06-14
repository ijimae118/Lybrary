/*
a. Các fields dữ liệu:
    HashMap<String, Doctor> drList để lưu danh sách các bác sĩ.
b. Method :
    1. void add() : thêm 1 bác sĩ vô danh sách drList. Yêu cầu kiểm tra trùng mã .
    2. void remove(String drID) : Xóa bác sĩ có mã drID ra khỏi danh sách drList.
    3. void display() : In danh sách các bác sĩ thuộc chuyên khoa 2 ra màn hình.
    4. void display(StringdrName) : Tìm và in ra ds các bác sĩ có tên chứa trong đối số drName
 */
package data;

import java.util.*;
public class DoctorList {
    HashMap drList = new HashMap();
    
    public void add(){
        Doctor d = new Doctor();
        d.input();
        
        //kiem tra ma trung
        if(drList.containsKey(d.id)){
            System.out.println("Ma so da ton tai. Tu choi them moi !");
            return;
        }
        
        drList.put(d.id, d);
        System.out.println(" Them moi thanh cong.");
    }
    
    public void remove(String drID){
        if(drList.isEmpty()){
            System.out.println(" >> HT chua co du lieu !");
            return;
        }
        
        if(drList.remove(drID)==null){
            System.out.println(" >> Ko tim thay bs co ma so "+ drID);
        }
        else{
            System.out.println(" >> Da xoa thanh cong !");
        }
    }
    
    //in danh sach bac si chuyen khoa 2
    public void display(){
        if(drList.isEmpty()){
            System.out.println(" >> HT chua co du lieu !");
            return;
        }
        
        int cntCK2 =0;
        for (Object item : drList.values()) {
            Doctor dr = (Doctor) item;
            if(dr.level.equalsIgnoreCase("level 2")){
                System.out.println(dr);
                cntCK2++;
            }
        }//ket thuc FOR
        
        if(cntCK2==0){
            System.out.println(">> Ko tim thay bs chuyen khoa 2 !");
        }
    }
    
    //in danh sach cac bac si co ten dc yeu cau
    void display(String drName){
        if(drList.isEmpty()){
            System.out.println(" >> HT chua co du lieu !");
            return;
        }
        
        int cntTen =0;
        drName = drName.trim().toLowerCase();
        for (Object item : drList.values()) {
            Doctor dr = (Doctor) item;
            if(dr.name.toLowerCase().contains(drName)){
                System.out.println(dr);
                cntTen++;
            }
        }//ket thuc FOR
        
        if(cntTen==0){
            System.out.println(">> Ko tim thay bs co ten: "+ drName);
        }        
    }
}
