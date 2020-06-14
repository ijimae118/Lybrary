/*
 * Quan ly danh sach san pham trong Hashset
 */
package data;

import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class ProductList {

    HashSet<Product> ds = new HashSet<>();

    public void add() {
        Product p = new Product();
        p.input();

        long cnt = ds.stream().filter(item -> item.id.equals(p.id)).count();//stream la 1 luong chua du lieu p ,if trinh sua Stream thi no ko anh huong den data p. stream ko dc tai su dung ,no chi dc sai 1 lan
        if (cnt == 0) {
            ds.add(p);
        } else {
            System.out.println("Ma so da ton tai .Tu choi them moi!");
        }
    }

    public void display() {
        if (ds.isEmpty()) {
            System.out.println("HT chua co du lieu!");
            return;
        }
        System.out.println("Danh sach san pham:");
        //cach 1
        for (Product d : ds) {
            System.out.println(d);
        }
        //cach2 : bt lambda
        ds.forEach((d) -> {
            System.out.println(d);
        });
        //cach3 :rut gon bt lambda: method reference
        ds.forEach(System.out::println);
    }

    //tim san pham theo ten
    public void display(String s) {
        if (ds.isEmpty()) {
            System.out.println("HT chua co du lieu");
            return;
        }
        Stream<Product> prStream = ds.stream().filter(item -> item.name.toLowerCase().contains(s));
        //ds.stream().filter(item->item.name.toLowerCase().contains(s)).forEach(System.out::println);
        if (prStream.count() == 0) {
            System.out.println("Ko tim thay");
        } else {
            prStream.forEach(System.out::println);
        }
    }

    String fname = "sanpham.data";

    public void saveFile() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname));
            oos.writeObject(ds);
            oos.close();
        } catch (Exception ex) {
            System.out.println("loi:"+ex.getMessage());
        }
    }
    
    public void readFile(){
        try {
        ObjectInputStream iis= new ObjectInputStream(new FileInputStream(fname));
        ds=(HashSet<Product>) iis.readObject();
        iis.close();
        } catch (Exception ex) {
            System.out.println("loi:" +ex.getMessage());
        }
    
    }

}
