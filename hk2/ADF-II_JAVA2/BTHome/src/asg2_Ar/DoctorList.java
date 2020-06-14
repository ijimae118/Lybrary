package asg2_Ar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoctorList {

    List<Doctor> List = new ArrayList();

//    Map<String, Doctor> drList = new HashMap();
    public void add() {
        Doctor d = new Doctor();
        d.input();
        List.add(d);
    }

    public void remove(String drID) {
        int n = 0;
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i).id.equalsIgnoreCase(drID)) {
                List.remove(i);
                
                n++;
                System.out.println("Xoa thanh cong" + drID);
                break;
            }
        }

        if (n == 0) {
            System.out.printf("Ko xoa dc %s. \n" , drID);
        }
    }

    public void display() {
        int n = 0;
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i).level.equalsIgnoreCase("2")) {
                System.out.println(List.get(i));
                n++;
            }
        }
        if (n == 0) {
            System.out.println("Ko co data chuyen khoa 2.");
        }

    }

    public void display(String drName) {
        int n = 0;
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i).name.contains(drName)) {
                System.out.println(List.get(i).toString());
                n++;
            }
        }
        if (n == 0) {
            System.out.println("Ko tim thay bac si theo ten.");
        }
    }

}
