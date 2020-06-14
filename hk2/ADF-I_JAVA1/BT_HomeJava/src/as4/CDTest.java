package as4;

import java.util.Scanner;

public class CDTest {

    CD[] cdList;//day dong khao bao 1 bien mang ten la cdList
    int counter;//bien dem so luong doi tuong cd chua trong mang
    final int max = 2;//hang so nguyen - dinh nghia so luong CD toi da trong mang

    public CDTest() {
        cdList = new CD[max];
        counter = 0;
    }

    //ham them 1 cd moi vo cdList
    void add() {
        if (counter == max) {
            //mang full
            System.out.println("full memory");
            return; //ket thuc ham
        }
        //tao 1 doi tuong cd moi
        CD o = new CD();
        //cho user nhap du lieu cho CD moi
        o.input();
        //cat cd vao trong mang cdList
        cdList[counter]= o;
        //cap nhat lai bien dem counter
        counter++;
    }

    //void displayAll(): in ra tat cac bang danh sach CD dang luu tru trong kho. Luu ý se in thong bao loi neu kho chua co du lieu
    void displayAll() {
        if (counter == 0) {
            System.out.println(">>He thong chua co du lieu!!!");
            return;
        }
        System.out.println("\n Danh sach CD o trong kho");
        for (int i = 0; i < counter; i++) {
           // cdList[i].print();
             System.out.println(cdList[i].toString());
            //System.out.println("cdLIST[i]");??ko ra
        }
    }

    void search(String cid) {
        if (counter == 0) {
            System.out.println(">>He thong chua co du lieu!!!");
            return;
        }
        int demID = 0;
        for (int i = 0; i < counter; i++) {
            //kiem tra tung dia CD tren tung dong
            if (cid.equals(cdList[i].id)) {
                cdList[i].print();
                demID++;
            }
        }//ket thuc for
        if (demID == 0) {
            System.out.printf(">>ko tim thay CD co ma so: %s\n", cid);
        }
    }

    void menu() {
        Scanner sc = new Scanner(System.in);
        String op = "";

        while (true) {
            System.out.println("=====MENU=====");
            System.out.println("1. Them CD moi");
            System.out.println("2. Xem danh sach CD");
            System.out.println("3. Tim kiem CD theo ma so");
            System.out.println("4. Thoat");
            System.out.print("Vui long chon chuc nang [1-4]: ");
            op = sc.nextLine().trim();

            switch (op) {
                case "1":
                    add();
                    break;
                case "2":
                    displayAll();
                    break;
                case "3":
                    System.out.println("Nhap ma so cd muon tim");
                    String maCD = sc.nextLine().trim();
                    search(maCD);
                    break;
                case "4":
                    return;//ket thuc ham menu -> dung chuong trinh

            }
        }

    }

    public static void main(String[] args) {
        CDTest p = new CDTest();
        p.menu();
    }

}
