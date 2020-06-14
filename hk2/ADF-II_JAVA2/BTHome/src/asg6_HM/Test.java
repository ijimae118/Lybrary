package asg6_HM;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        ProductCatalog d = new ProductCatalog();
        
        String op;
        while (true) {
            System.out.println("===Danh Sách===");
            System.out.println("1.Thêm 1 san pham: ");
            System.out.println("2.Nhap/Xuat hang ton kho: ");
            System.out.println("3.In toàn bộ ds SP:");
            System.out.println("4.Thoat");

            System.out.print("Mời chọn menu[1-4]: ");
            op = ap.nextLine().trim();
            switch (op) {
                case "1":
                    d.add();
                    break;
                case "2":
                   // System.out.println("Moi nhap theo format: ID,sQty,[true=nhap||false=xuat]");
                   // d.set(ap.nextLine().trim(),Float.parseFloat(ap.nextLine().trim()),Boolean.parseBoolean(ap.nextLine().trim()));
                    System.out.print("Enter Id: ");
                    String id=ap.nextLine().trim();
                    System.out.print("Enter sQty: ");
                    float sQty=Float.parseFloat(ap.nextLine().trim());
                    System.out.print("Enter [true{nhap}||false{xuat}]: ");
                    boolean ac=Boolean.parseBoolean(ap.nextLine().trim());
                    d.set(id, sQty, ac);
                    break;
                case "3":
                    d.display();
                    break;
                case "4":
                    d.saveFile();
                    return;
            }
        }
    }

}
