/*
 Quan ly danh sach cac san pham ,bao gom chuc nang
-them
-xem danh sah
-lưu file/doc file
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
        System.out.print("Nhap ma so SP: ");
        p.id = sc.nextLine().trim();

        if (ds.stream().filter(item -> item.id.equals(p.id)).count() > 0) {
            System.out.println("loi: ID da ton tai .tu choi thao tac !");
            return;
        }
        System.out.print("Nhap ten SP:");
        p.name = sc.nextLine().trim();
        System.out.print("Nhap don gia SP:");
        p.price = Integer.parseInt(sc.nextLine().trim());

        //dua san pham vo ds
        ds.add(p);
    }

    public void display() {
        if (ds.isEmpty()) {
            System.out.println("loi: HT chua co data");
            return;
        }
        System.out.println("In ds SP");
        // ds.forEach(System.out::println);
        ds.forEach(item -> System.out.println(item));
    }

    String fname = "Sanpham.txt";

    public void SaveFileText() {
        if (ds.isEmpty()) {
            System.out.println("loi: HT chua co data");
            return;
        }
        try {
            //1.open output stream de luu ds san pham vo tap tin sanpham.txt
            PrintStream ps = new PrintStream(fname);
            //2.ghi toan bo du lieu trong ds vo output stream nay
            //ds.forEach(ps::println);
            ds.forEach(item -> ps.println(item));
            //3.dong stream
            ps.close();
            //4. open file chua
            Runtime r = Runtime.getRuntime();
            r.exec("notepad " + fname);
        } catch (Exception ex) {
            System.out.println("loi:" + ex.getMessage());
        }
    }
    
    public void LoadFileTest(){
     File f= new File(fname);
        if (f.exists()==false) {
            return;//tap tin sanpham.txt chua duoc tao ->ket thuc ham xu ly
        }
        ds=new HashSet<>();
        try {
            //1.open input stream ket voi tap tin sanpham.txt
            BufferedReader br= new BufferedReader(new FileReader(fname));//or f cũng đc
            //2.vong lap doc cac dong du lieu trong file sanpham.txt
            String line=null;
            while (br.ready()) {//còn dữ liệu                
                line= br.readLine();//doc 1 dong vb->line
                
                String[] items =line.split(",");
                
                if (items.length==3) {
                    Product p=new Product();
                    p.id=items[0].trim();
                    p.name=items[1].trim();
                    p.price=Integer.parseInt(items[2].trim());
                    
                    ds.add(p);
                }
            }//ket thuc while
        } catch (Exception ex) {
            System.out.println("loi: "+ex.getMessage());
        }
        
    }
}
