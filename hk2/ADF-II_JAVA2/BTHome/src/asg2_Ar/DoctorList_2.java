package asg2_Ar;

import java.util.HashMap;
import java.util.Map;

public class DoctorList_2 {

    Map<String, Doctor> drList = new HashMap<>();

    public void add() {
        Doctor d = new Doctor();
        d.input();
        drList.put(d.id, d);
    }

    public void remove(String drID) {
        if (drList.containsKey(drID)) {
            drList.remove(drID);
            System.out.println("Xoa thanh cong");
        } else {
            System.out.println("Ko xoa dc.");
        }
    }

    public void display() {//error
        if (drList.containsValue(this.drList.get(this).level.equalsIgnoreCase("2"))) {
            for (Doctor object : drList.values()) {
                System.out.println(object);
            }
        } else {
            System.out.println("ko co data bac si level 2.");
        }

    }
    
    public void display(String drName){//error
        if (drList.containsValue(this.drList.get(this).name.contains(drName))) {
            for (Doctor object : drList.values()) {
                System.out.println(object);
            }
        } else {
            System.out.println("ko tim thay data bac si theo ten.");
        }
    }
       
}
