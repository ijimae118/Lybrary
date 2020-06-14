package ui;

import model.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String op = "";
        while (true) {
            System.out.println("==MEnu==");
            System.out.println("1.Them nhan vien");
            System.out.println("2.Cap nhat luong nhan vien");
            System.out.println("3.Liet ke nhan vien");
            System.out.println("4.Tim nhan vien theo ten");
            System.out.println("5.Thoat");
            System.out.print("Vui long chon chuc nang [1-5]: ");

            op = sc.nextLine();
            switch (op) {
                case "1":
                    Employee e = new Employee();
                    e.input();
                    if (EmpoyeeDAO.insert(e) > 0) {
                        System.out.println("Da them nhan vien moi !!!");
                    } else {
                        System.out.println("co loi khi them nv !!!");
                    }
                    break;
                case "2":
                    System.out.println("Nhap ma nhan vien: ");
                    String manv = sc.nextLine();
                    System.out.println("Nhap luong muon thay doi: ");
                    try {
                        int luongmoi = Integer.parseInt(sc.nextLine());
                        if (EmpoyeeDAO.update(manv, luongmoi)) {
                            System.out.println("Da cap nhat luong thanh cong.");
                        } else {
                            System.out.println("Cap nhat that bai.");
                        }
                    } catch (Exception ex) {
                        System.out.println("Loi: " + ex.getMessage());
                    }

                    break;
                case "3":

                    List<Employee> ds = EmpoyeeDAO.getList();
                    for (Employee item : ds) {
                        System.out.println(item);
                    }
                    break;
                case "4":
                    System.out.print("Nhap vao ten nhan vien muon tim: ");
                    String ten = sc.nextLine();
                    List<Employee> ds2 = EmpoyeeDAO.getList(ten);
                    for (Employee item : ds2) {
                        System.out.println(item);
                    }
                    break;
                case "5":
                    return;
            }
        }

    }

}
