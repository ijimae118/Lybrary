package asg5_TreeMap;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.TreeMap;

public class DoctorManager {

    TreeMap<String, Doctor> doctorList = new TreeMap<>();
    String fname = "D:/ASG5.txt";

    public static void main(String[] args) {
        DoctorManager d = new DoctorManager();
        d.menu();
    }

    void add() {
        Scanner sc = new Scanner(System.in);
        Doctor d = new Doctor();
        //input
        System.out.print("Enter id: ");
        d.id = sc.nextLine().trim();
        System.out.print("Enter name: ");
        d.name = sc.nextLine().trim();
        System.out.print("Enter specialization: ");
        d.specialization = sc.nextLine().trim();
        System.out.print("Enter availHours: ");
        d.availHours = Integer.parseInt(sc.nextLine().trim());

        doctorList.put(d.id, d);//put(key,array);
    }

    void display() {
        if (doctorList.isEmpty()) {
            System.out.println(">>HT chua co data.");
            return;
        }
        doctorList.values().forEach(System.out::println);
        /*
        for (Doctor value : doctorList.values()) {
            System.out.println(value);
        }
         */
    }

    void display(String id) {
        Doctor a = doctorList.values().stream().filter(item -> item.id.contains(id)).findAny().orElse(null);
        if (a == null) {
            System.out.println(">>Ko tim thay id");
        } else {
            System.out.println(a);
        }

    }

    void readFile() {
        try {
            ObjectInputStream iis = new ObjectInputStream(new FileInputStream(fname));
            doctorList = (TreeMap<String, Doctor>) iis.readObject();
            iis.close();

        } catch (Exception ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
    }

    void saveFile() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname));
            oos.writeObject(doctorList);
            oos.close();

        } catch (IOException ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
    }

    void menu() {
        Scanner ap = new Scanner(System.in);
        DoctorManager d = new DoctorManager();
        d.readFile();
        String op;
        while (true) {
            System.out.println("===Danh Sách Bac Si===");
            System.out.println("1.Thêm 1 bac si: ");
            System.out.println("2.In toàn bộ ds bac si:");
            System.out.println("3.Tim va In bảng danh sách bac si theo id: ");
            System.out.println("4.Thoat");

            System.out.print("Mời chọn menu[1-4]: ");
            op = ap.nextLine().trim();
            switch (op) {
                case "1":
                    d.add();
                    break;
                case "2":
                    d.display();
                    break;
                case "3":
                    System.out.print("Enter id to find:");
                    d.display(ap.nextLine().trim());
                    break;
                case "4":
                    d.saveFile();
                    return;
            }
        }
    }
}
