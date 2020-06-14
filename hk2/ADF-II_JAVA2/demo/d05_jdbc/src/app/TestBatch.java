/*
Quan ly danh sach cac lop hoc - du lieu dc luu tru trong bang tbBatch
 */
package app;

import data.*;
import java.util.*;

public class TestBatch {

    public static void main(String[] args) {
        TestBatch o = new TestBatch();
        o.menu();
    }
    
    void menu(){
        String op ="";
        BatchDAO ba = new BatchDAO();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(" === MENU ===");
            System.out.println("1. Xem danh sach cac lop hoc");
            System.out.println("2. Them lop hoc moi");
            System.out.println("3. Xoa lop hoc theo ma so");
            System.out.println("4. Sua hoc phi cua 1 lop hoc theo ma so");
            System.out.println("5. Ket thuc chuong trinh");
            System.out.print(" Vui long chon chuc nang tu 1 - 5:  ");
            op = sc.nextLine();
            
            switch(op){
                case "1": 
                    ArrayList<Batch> ds = BatchDAO.getList();
                    if(ds.isEmpty()){
                        System.out.println("HT chua co du lieu");
                        break;
                    }
                    System.out.println("\n Danh sach cac lop hoc");
                    for (Batch d : ds) {
                        System.out.println(d);
                    }
                    break;
                case "2": 
                    Batch newBatch = new Batch();
                    System.out.println("Nhap thong tin cua lop hoc moi");
                    System.out.print("nhap id: ");
                    newBatch.batchno = sc.nextLine().trim();
                    System.out.print("nhap chuong trinh: ");
                    newBatch.description = sc.nextLine().trim();
                    System.out.print("nhap hoc phi: ");
                    newBatch.fee = Integer.parseInt(sc.nextLine().trim());
                    
                    if (BatchDAO.insert(newBatch) > 0){
                        System.out.println("  -- Them moi thanh cong !");
                    }
                    else{
                        System.out.println(" --- Them moi that bai");
                    }
                    
                    break;
                case "3": break;
                case "4": break;
                case "5": return;
            }
        }
        
    }
    
}
