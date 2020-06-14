/*
Quan ly  danh sach san pham trong HashSet
 */
package data;

import java.util.*;
import java.io.*;

public class ProductList {

    HashSet<Product> ds = new HashSet<>();

    public void add() {
        Product p = new Product();
        p.input();

        long cnt = ds.stream().filter(item -> item.id.equals(p.id)).count();
        if (cnt == 0) {
            ds.add(p);
        } else {
            System.out.println("Ma so da ton tai. Tu choi them moi! ");
        }
    }
    public void delete(String ID){
        if (ds.isEmpty()) {
            System.out.println(" HT chua co du lieu !");
            return;
        }
        Product x=ds.stream().filter(item->item.id.contains(ID)).findAny().orElse(null);
        if (x==null) {
            System.out.println("Xoa that bai");
        } else {
            ds.remove(x);
            System.out.println("Xoa thanh cong");
        }
    }
    public void display() {
        if (ds.isEmpty()) {
            System.out.println(" HT chua co du lieu !");
            return;
        }

        System.out.println("Danh sach san pham");
        /*
        //cach 1:
        for (Product d : ds) {
            System.out.println(d);
        }
        
        //cach 2: bt lambda
        ds.forEach((d) -> {
            System.out.println(d);
        });
         */

        //cach 3: rut gon bt lambda: method reference
        ds.forEach(System.out::println);
    }

    //tim san pham theo ten
    public void display(String s) {
        if (ds.isEmpty()) {
            System.out.println(" HT chua co du lieu !");
            return;
        }

        // Stream<Product> prStream = (Stream<Product>) ds.stream().filter(item -> item.name.contains(s));
        
        
        /*  while (prStream.findAny().orElse(null)!=null) {
            prStream.forEach(System.out::println);
            n++;
            System.out.println(n);
            if (n == 1) {
                System.out.println("Ko tim thay");
            }
            break;
        }*/
        long cnt= ds.stream().filter(item->item.name.contains(s.toLowerCase())).count();
        if (cnt==0) {
            System.out.println("Ko tim thay !!!");
        } else {
            ds.stream().filter(item->item.name.contains(s.toLowerCase())).forEach(System.out::println);
        }
    /*    Product prStream = ds.stream().filter(item -> item.name.contains(s.toLowerCase())).findAny().orElse(null);
        if (prStream == null) {
            System.out.println("Ko Tim Thay");
        } else {
            System.out.println(prStream);
        }
        */
    }

    String fname = "sanpham.data";

    public void saveFile() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname));
            oos.writeObject(ds);
            oos.close();

        } catch (IOException ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
    }

    public void readFile() {
        try {
            ObjectInputStream iis = new ObjectInputStream(new FileInputStream(fname));
            ds = (HashSet<Product>) iis.readObject();
            iis.close();

        } catch (Exception ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
    }
}
