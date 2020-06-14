package As6_1;

import java.util.Scanner;

public class StudentTest {

    private final int max = 10;
    private int count;
    private final Student[] ds;

    public StudentTest() {
        ds = new Student[max];
        count = 0;
    }

    public static void main(String[] args) {
        StudentTest list=new StudentTest();
        list.menu();
    }

    void add() {
        if (count == max) {
            System.out.println("full memory");
            return; //ket thuc ham
        }
        Student o = new Student();
        o.input();

        ds[count] = o;

        count++;

    }

    void display() {
        if (count == 0) {
            System.out.println("DS chưa có dữ liệu.");
            return;
        }
        System.out.println("DS sv có trong list:");
        for (int i = 0; i < count; i++) {
            ds[i].print();
            //System.out.println(ds[i].toString());
        }
    }

    void display(int m) {
        if (count == 0) {
            System.out.println("DS sv chưa có dữ liệu.");
            return;
        }
        int sv = 0;
        for (int i = 0; i < count; i++) {
            if (((ds[i].theory + ds[i].practive) / 2) > m) {
                ds[i].print();
                sv++;
            }
        }
        if (sv == 0) {
            System.out.printf(">>ko tim thay ds sinh vien co diem trung binh tren: %d\n", m);
        }

    }

    void display(String stName) {
        if (count == 0) {
            System.out.println("DS sv chưa có dữ liệu.");
            return;
        }
        int sv = 0;
        for (int i = 0; i < count; i++) {
            if (stName.equalsIgnoreCase(ds[i].name)) {
                ds[i].print();
                sv++;
            }
        }
        if (sv == 0) {
            System.out.printf(">>ko tim thay ten sv trong ds sinh vien : %s\n", stName);
        }

    }

     void menu() {
        Scanner sc = new Scanner(System.in);
        String op;

        while (true) {
            System.out.println("=====MENU=====");
            System.out.println("1. Them Sinh Vien moi: ");
            System.out.println("2. Xem danh sach S.vien: ");
            System.out.println("3. In ra ds S.vien co diem trung binh tren số cho: ");
            System.out.println("4. Tim kiem S.Vien theo ten: ");
            System.out.println("5. Thoat");
            System.out.print("Vui long chon chuc nang [1-5]: ");
            op = sc.nextLine().trim();

            switch (op) {
                case "1":
                    add();
                    break;
                case "2":
                    display();
                    break;
                case "3":
                    System.out.print("Nhap so diem trung binh muon tim để in ra list điểm trb trên điểm muốn tìm: ");
                    int dSV = sc.nextInt();
                    sc.nextLine();
                    display(dSV);
                    break;
                case "4":
                    System.out.print("Nhap ten S.Vien muon tim: ");
                    String nCD = sc.nextLine().trim();
                    display(nCD);
                    break;
                case "5":
                    return;//ket thuc ham menu -> dung chuong trinh

            }
        }

    }

}
