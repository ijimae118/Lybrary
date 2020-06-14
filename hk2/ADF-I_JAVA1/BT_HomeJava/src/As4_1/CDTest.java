/*
 ung dung java quan ly he thong kho du lieu CD trong mang
 */
package As4_1;

import java.util.Arrays;
import java.util.Scanner;

public class CDTest {

    CD[] cdLIST;// day la khai bao 1 bien mang ten la cdLIST chua cac doi tuong CD1
    int counter;//bien dem so luonng CD dang chua trong cdLIST
    final int max = 10;//hang so nguyen -dinh nghia so luong cd toi da trong mang cdLIST

    public CDTest() {
        cdLIST = new CD[max];// khoi tao va cap phat bo nho cho cdLIST
        counter = 0;
    }

    // ham thêm 1 CD moi vo cdLIST , nếu mảng ko còn chổ trống in ra thông báo lỗi
    void add() {
        if (counter == max) {
            //mang full
            System.out.println("Full Memory!!!");
            return;
        }
        // tao 1 doi tuong CD moi
        CD o = new CD();
        //cho user nhap du lieu cho CD moi
        o.input();
        // cat CD moi vo mang cdLIST
        cdLIST[counter] = o;

        //cap nhat lai bien dem counter
        counter++;
    }

    // void displayAll():In ra bang danh sach cac CD lưu trữ trong kho.lưu ý sẽ in thông báo lỗi nếu kho chưa có dữ liệu
    void displayAll() {
        if (counter == 0) {
            System.out.println(">>He thong chua co du lieu!!!");
            return;//ket thuc ham
        }
        System.out.println("Danh sach CD trong kho");
        for (int i = 0; i < counter; i++) {
           // cdLIST[i].print();// in hang dọc
              System.out.println(cdLIST[i].toString());//in hang ngan
            
        }
    }

    // ham tim kiem CD trong danh sach theo mã số (cod).
    //in chi tiet cua CD đó ra if tìm thấy,ngc lại thông bao lỗi
    void search(String cid) {
        if (counter == 0) {
            System.out.println(">>He thong chua co du lieu!!!");
            return;//ket thuc ham
        }
        int demID = 0;
        for (int i = 0; i < counter; i++) {
            // kiem tra tung dia CD tren tung dong i
            if (cdLIST[i].id.equals(cid)) {
                // tim thay -> in ra toan bo chi tiet
                cdLIST[i].print();
//                System.out.println(Arrays.toString(cdLIST));
                demID++;
            }

        }//ket thuc For

        if (demID == 0) {
            System.out.printf(">> Ko tim thay CD co ma so :%s!!! \n", cid);
        }

    }

    // he thong thuc don
    void menu() {
        Scanner sc = new Scanner(System.in);
       String op;

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
                    System.out.print("Nhap ma so cd muon tim");
                    String maCD = sc.nextLine().trim();// tạo lệnh nhập
                    search(maCD);//hàm
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
