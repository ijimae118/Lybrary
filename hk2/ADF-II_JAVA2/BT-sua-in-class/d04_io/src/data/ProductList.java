/*
Quan ly danh sach cac san pham, bao gom chuc nang
- them
- xem danh sach
- luu file / doc file ho so san pham
 */
package data;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductList {

    HashSet<Product> ds = new HashSet<>();

    public void add() {
        Product p = new Product();

        Scanner sc = new Scanner(System.in);

        //nhap du lieu cho tiet cho 1 san pham
        System.out.print("Nhap ma so SP: ");
        p.id = sc.nextLine().trim();

        if (ds.stream().filter(item -> item.id.equals(p.id)).count() > 0) {
            System.out.println("LOI: ID da ton tai. Tu choi thao tac !");
            return;
        }
        System.out.print("Nhap ten SP: ");
        p.name = sc.nextLine().trim();

        System.out.print("Nhap don gia SP: ");
        p.price = Integer.parseInt(sc.nextLine().trim());

        //dua san pham vo ds
        ds.add(p);
    }

    public void display() {
        if (ds.isEmpty()) {
            System.out.println("Loi: HT chua co du lieu !");
            return;
        }
        System.out.println("Danh sach san pham");
        //ds.forEach(System.out::println);
        ds.forEach(item -> System.out.println(item));
    }

    String fname = "SanPham.txt";

    public void SaveFileText() {
        if (ds.isEmpty()) {
            System.out.println("Loi: HT chua co du lieu !");
            return;
        }
        try {
            //1. open output stream de luu ds san pham vo tap tin sanpham.txt
            PrintStream ps = new PrintStream(fname);

            //2. ghi toan bo du lieu trong ds vo output stream nay
            //ds.forEach(ps::println);
            ds.forEach(item -> ps.println(item));

            //3. dong stream
            ps.close();

            //4. open tap tin sanpham.txt trong notepad de xem
            Runtime r = Runtime.getRuntime();
            r.exec("notepad " + fname);

        } catch (Exception ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
    }

    public void LoadFileText() {
        File f = new File(fname);
        if (f.exists() == false) {
            return;  //tap tin sanpham.txt chua duoc tao -> ket thuc ham xu ly
        }

        ds = new HashSet<>();

        try {
            //1. open input stream ket voi tap tin sanpham.txt
            BufferedReader br = new BufferedReader(new FileReader(fname));

            //2. vong lap doc cac dong du lieu trong file sanpham.txt
            String line = null;
            while (br.ready()) {
                line = br.readLine(); // doc 1 dong van ban ->1 line

                String[] items = line.split(",");//trong 1 line  cac phan tu dc tach ra = dau ",";
                if (items.length == 3) {//if 1 line (item) dc tach ra boi dau , thanh 3 phan : 0,1,2
                    Product p = new Product();
                    p.id = items[0].trim();
                    p.name = items[1].trim();
                    p.price = Integer.parseInt(items[2].trim());

                    ds.add(p);
                }
            }// ket thuc while

            //3. dong stream
            br.close();

        } catch (Exception ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
    }
}
