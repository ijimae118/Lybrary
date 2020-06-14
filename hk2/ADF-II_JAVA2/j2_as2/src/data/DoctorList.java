package data;

import java.util.HashMap;

public class DoctorList {

    HashMap drList = new HashMap();

    public void add() {
        Doctor d = new Doctor();
        d.input();
        //kiem tra ma trung
        if (drList.containsKey(d.id)) {
            System.out.println("Ma so da ton tai .Tu choi them moi!");
            return;
        }

        drList.put(d.id, d);
        System.out.println("Them moi thanh cong.");
    }

    public void remove(String drID) {
        if (drList.isEmpty()) {
            System.out.println(">>HT chua co du lieu:");
            return;
        }

        if (drList.remove(drID) == null) {
            System.out.println(">>ko tim thay bs co ma so" + drID);
        } else {
            System.out.println(">>Da xoa thanh cong");
        }
    }

    //in ds bs chuyen khoa 2
    public void display() {
        if (drList.isEmpty()) {
            System.out.println(">>HT chua co du lieu!");
            return;
        }

        int cntTen = 0;
        for (Object item : drList.values()) {
            Doctor dr = (Doctor) item;
            if (dr.level.equalsIgnoreCase("level 2")) {
                System.out.println(dr);
                cntTen++;
            }
        }//ket thuc for

        if (cntTen == 0) {
            System.out.println(">>ko tim thay bs ck2:");
        }
    }

    public void display(String drName) {
        if (drList.isEmpty()) {
            System.out.println(">>HT chua co du lieu!");
            return;
        }

        int cntTen = 0;
        drName=drName.trim().toLowerCase();
        for (Object item : drList.values()) {
            Doctor dr = (Doctor) item;
            if (dr.name.toLowerCase().contains(drName)) {
                System.out.println(dr);
                cntTen++;
            }
        }//ket thuc for

        if (cntTen == 0) {
            System.out.println(">>ko tim thay bs co ten:" + drName);
        }
    }
}
