package As5_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeTest_1 {

 //   ArrayList<Employee_1> emplist = new ArrayList<>();//Khoi tao emplist ko tham so
    List<Employee_1> emplist;

    public EmployeeTest_1() {
     emplist= new ArrayList<>();
    }
    
    public static void main(String[] args) {
        EmployeeTest_1 a = new EmployeeTest_1();
        a.menu();
    }


    
    void add() {
        Scanner sc = new Scanner(System.in);

        while (true) { //lap lai lien tuc
            String ans = "";
            int temp = 0;// ko thể đặt ngoài while ,if đặt ngoài nó sẽ tăng ++ lên
            Employee_1 e = new Employee_1();// ko thể sài chung cho void 
            e.input();

            for (int i = 0; i < emplist.size(); i++) {

                if (e.id.equalsIgnoreCase(emplist.get(i).id)) {// if id trùng nhau
                    temp++;
                }

            }

            if (temp != 0) {// thông báo và ko add vào list
                System.out.println("***************");
                System.out.println("In bị trùng !!!");
                System.out.println("***************");
            } else {// =0 thì add vào list
                emplist.add(e);// add input vao dãy
            }

            System.out.print("ban co tiep tuc nhap (y|n)?: ");
            ans = sc.nextLine();

            if (ans.equalsIgnoreCase("n")) {
                break;//ket thuc vong lap while -nhap ren sinh vien
            }

        }

    }

    void display() {
        if (emplist.isEmpty()) {
            System.out.println("He Thong chua co du lieu");
            return;
        }

        System.out.println("\n Danh sach ten sinh vien: ");

        emplist.forEach((item) -> {
            //     item la bien tu dat dc nhu abc,123,v.v
            item.print();

        });
        /*
        for (Employee_1 abc:emplist) {
                  System.out.println(abc);--ko ra??
                     abc.print();--ra
               }
        
                   for (int i = 0; i < emplist.size(); i++)--ko ra??
              {
                 System.out.println(emplist.get(i).toString());
             }
         */
    }

    void display(int amt) {
        if (emplist.isEmpty()) {
            System.out.println("He thong chua co du lieu");
            return;
        }

                for (int i = 0; i < emplist.size(); i++) {
            if (emplist.get(i).baseSalary > amt) {
                   System.out.println("\n Danh sach ten nhan vien co muc luong tren amt USD: ");
                    emplist.get(i).print();

            }else{System.out.println("Nhân viên ko đạt yêu cầu: "+emplist.get(i).name);}

        }
        
    }

    void display(String empName) {
        if (emplist.isEmpty()) {
            System.out.println("He thong chua co du lieu");
            return;
        }
        for (int i = 0; i < emplist.size(); i++) {
            if (emplist.get(i).name.equalsIgnoreCase(empName)) {
                emplist.get(i).print();
            } else {
                System.out.println("Nhân viên ko đạt yêu cầu: "+emplist.get(i).name);
            }

        }

    }

    void menu() {
        Scanner nv = new Scanner(System.in);
        String op;
        while (true) {
            System.out.println("===Danh Sách Nhân Viên===");
            System.out.println("1.Thêm nhân viên: ");
            System.out.println("2.In toàn bộ ds nhân viên: ");
            System.out.println("3.In bảng danh sách nhân viên có mức lương trên amt USD: ");
            System.out.println("4.Tìm ds nv theo tên: ");
            System.out.println("5.Thoat");

            System.out.print("Mời chọn menu[1-5]: ");
            op = nv.nextLine().trim();
            switch (op) {
                case "1":
                    add();
                    break;
                case "2":
                    display();
                    break;
                case "3":
                    System.out.print("Mời nhập amt USD: ");
                    int amt = Integer.parseInt(nv.nextLine().trim());
                    //    int amt=nv.nextInt();
                    display(amt);
                    break;
                case "4":
                    System.out.print("Mời nhập tên nv muốn tìm: ");
                    String empName = nv.nextLine().trim();
                    display(empName);
                    break;
                case "5":
                    return;
            }
        }

    }

}
