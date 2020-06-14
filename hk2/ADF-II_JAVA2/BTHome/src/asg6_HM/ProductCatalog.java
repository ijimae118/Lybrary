package asg6_HM;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.HashMap;

public class ProductCatalog {

    HashMap<String, Product> pList = new HashMap<>();
    String fname = "TONKHO.DAT";

    public ProductCatalog() {
        readFile();
    }

    public void add() {
        Product p = new Product();
        p.input();
        long cnt = pList.keySet().stream().filter(item -> item.contains(p.id)).count();
        if (cnt == 0) {
            pList.put(p.id, p);
            System.out.println("Nhap thanh cong.");

        } else {
            System.out.println("Id bi trung.Moi ban nhap lai");
        }

    }

    public void set(String sID, float sQty, boolean isReceive) {
        if (pList.isEmpty()) {
            System.out.println(">>HT chua co data");
            return;
        }
        int n = 0;
        for (Product value : pList.values()) {
            if (isReceive == true && sID.equalsIgnoreCase(value.id)) {
                value.in_qty += sQty;
                System.out.println("Nhap kho thanh cong" + sQty);
                n++;
            } else if (isReceive == false && sID.equalsIgnoreCase(value.id)) {
                value.out_qty += sQty;
                System.out.println("Xuat kho thanh cong" + sQty);
                n++;
            }
        }
        if (n == 0) {
            System.out.println("Nhap/Xuat kho ko hop le !!!");
        }
    }

    public void display() {
        if (pList.isEmpty()) {
            System.out.println(">>HT chua co data");
            return;
        }
        for (Product value : pList.values()) {
            value.output();
            //System.out.println(value);
        }
        //pList.values().forEach(System.out::println);
    }

    public void saveFile() {
        if (pList.isEmpty()) {
            System.out.println("Loi: HT chua co du lieu !");
            return;
        }
        try {
            //1. open output stream de luu ds san pham vo tap tin sanpham.txt
            PrintStream ps = new PrintStream(fname);

            //2. ghi toan bo du lieu trong ds vo output stream nay
            //ds.forEach(ps::println);
            pList.values().forEach(item -> ps.println(item));

            //3. dong stream
            ps.close();

            //4. open tap tin sanpham.txt trong notepad de xem
            Runtime r = Runtime.getRuntime();
            r.exec("notepad " + fname);

        } catch (Exception ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
    }

    public void readFile() {
        File f = new File(fname);
        if (f.exists() == false) {
            return;  //tap tin sanpham.txt chua duoc tao -> ket thuc ham xu ly
        }

        pList = new HashMap<>();

        try {
            //1. open input stream ket voi tap tin sanpham.txt
            BufferedReader br = new BufferedReader(new FileReader(fname));

            //2. vong lap doc cac dong du lieu trong file sanpham.txt
            String line = null;
            while (br.ready()) {
                line = br.readLine(); // doc 1 dong van ban ->1 line

                String[] items = line.split(",");//trong 1 line  cac phan tu dc tach ra = dau ",";
                if (items.length == 7) {//if 1 line (item) dc tach ra boi dau , thanh 3 phan : 0,1,2
                    Product p = new Product();
                    p.id = items[0].trim();
                    p.name = items[1].trim();
                    p.price = Integer.parseInt(items[2].trim());
                    p.in_qty=Float.parseFloat(items[3].trim());
                    p.out_qty=Float.parseFloat(items[4].trim());
                    p.qoh=Float.parseFloat(items[5].trim());
                    p.amt=Float.parseFloat(items[6].trim());

                    pList.put(p.id, p);
                    
                }
            }// ket thuc while

            //3. dong stream
            br.close();

        } catch (Exception ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
    }

}
