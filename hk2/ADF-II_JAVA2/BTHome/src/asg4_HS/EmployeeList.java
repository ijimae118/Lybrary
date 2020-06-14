package asg4_HS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeList implements java.io.Serializable {

    HashSet<Employee> empList = new HashSet<>();

    public EmployeeList() {
        TreeSet tree = new TreeSet();
        for (Employee em : empList) {
            tree.add(em);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op;

        EmployeeList p = new EmployeeList();
        p.ReadFileTest();

        while (true) {
            System.out.println("\n *** MENU ***");
            System.out.println("1. Them 1 nhan vien");
            System.out.println("2. Tim nv theo ten");
            System.out.println("3. Xem danh sach nhan vien");
            System.out.println("4. In ds nv co tham nien tren nam");
            System.out.println("5. Remove");
            System.out.println("6. Thoat");
            System.out.print(" Vui long nhap chuc nang [1-6]: ");

            op = sc.nextLine().trim();
            switch (op) {
                case "1":
                    p.addEmp();
                    break;
                case "2":
                    System.out.print(" nhap ten nhan vien can tin: ");
                    p.searchByName(sc.nextLine().trim());
                    break;
                case "3":
                    p.display();
                    break;
                case "4":
                    try {
                        System.out.print("nhap so nam: ");
                        p.display(Integer.parseInt(sc.nextLine().trim()));
                    } catch (NumberFormatException e) {
                        System.out.println("loi:" + e.getMessage());
                    }

                    break;
                case "5":
                    System.out.print("nhap ten: ");
                    p.remove(sc.nextLine().trim());
                    break;
                case "6":
                    //save danh sach du lieu truoc khi ket thuc ct
                    p.writeFileText();
                    return;
            }
        }
    }

    public void addEmp() {
        Employee e = new Employee();
        e.input();

        long cnt = empList.stream().filter(item -> item.id.equalsIgnoreCase(e.id)).count();
        if (cnt == 0) {
            empList.add(e);
            System.out.println("Nhap thanh cong.");

        } else {
            System.out.println("Id bi trung.Moi ban nhap lai");
        }

    }

    public void searchByName(String name) {//chua xong
        if (empList.isEmpty()) {
            System.out.println(">>HT chua co data");
            return;
        }
        
        Employee e = empList.stream().filter(item -> item.name.contains(name.toUpperCase())).findAny().orElse(null);
        if (e == null) {
            System.out.println("KO tim thay ten");
        } else {
            System.out.println(e);
            //empList.remove(e);
        }
        /*        
        int n = 0;
        for (Employee b : empList) {
            if (b.name.contains(name)) {
                System.out.println(b);
                n++;
            }
        }
        if (n == 0) {
            System.out.println("Ko tim thay nhan vien theo ten " + name);
        }
         */
    }

    public void remove(String name) {//chua xong
        if (empList.isEmpty()) {
            System.out.println(">>HT chua co data");
            return;
        }
        
        Employee e = empList.stream().filter(item -> item.name.contains(name.toUpperCase())).findAny().orElse(null);
        if (e == null) {
            System.out.println("KO tim thay ten de remove.");
        } else {
            empList.remove(e);
            System.out.println("Remove thanh cong.");
        }

    }

    public void display() {
        if (empList.isEmpty()) {
            System.out.println(">>HT chua co data");
            return;
        }
        /*
        for (Employee e : empList) {
            System.out.println(e);
        }*/
        empList.forEach(System.out::println);
    }

    public void display(int years) {
        if (empList.isEmpty()) {
            System.out.println(">>HT chua co data");
            return;
        }
        /*
        Employee e = empList.stream().filter(item -> item.joinedYear < years).findAny().get();
        if (e == null) {
            System.out.println("KO tim thay ds nv co kinh nghiem lon hon nam cho.");
        } else {
            System.out.println(e);
            
        }
        */
        int n = 0;
        for (Employee employee : empList) {
            if (employee.joinedYear < years) {
                System.out.println(employee);
                n++;
            }
        }
        if (n == 0) {
            System.out.println(">>Ko tim dc ds nv co kinh nghiem lon hon nam cho.");
        }

    }

    String fname = "NV.txt";

    public void writeFileText() {
        if (empList.isEmpty()) {
            System.out.println(">>HT chua co data");
            return;
        }

        try {
            //dua data ra file NV.txt
            PrintStream ps = new PrintStream(fname);
            empList.forEach(item -> ps.println(item));
            ps.close();
            // mo file NV.txt
            Runtime r = Runtime.getRuntime();
            r.exec("notepad " + fname);
        } catch (IOException ex) {
            System.out.println("loi:" + ex.getMessage());
        }
    }

    public void ReadFileTest() {
        File f = new File(fname);
        if (f.exists() == false) {
            return;//tap tin NV.txt chua duoc tao -> ket thuc ham xu ly.
        }
        empList = new HashSet<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fname));

            String line;
            while (br.ready()) {
                line = br.readLine(); // doc 1 dong van ban ->1 line

                String[] items = line.split(",");//trong 1 line  cac phan tu dc tach ra = dau ",";
                if (items.length == 5) {//if 1 line (item) dc tach ra boi dau , thanh 5 phan : 0,1,2,3,4
                    Employee p = new Employee();
                    p.id = items[0].trim();
                    p.name = items[1].trim();
                    p.address = items[2].trim();
                    p.salary = Integer.parseInt(items[3].trim());
                    p.joinedYear = Integer.parseInt(items[4].trim());

                    empList.add(p);
                }
            }// ket thuc while

            //3. dong stream
            br.close();
        } catch (Exception ex) {
            System.out.println("loi:" + ex.getMessage());
        }

    }

}
