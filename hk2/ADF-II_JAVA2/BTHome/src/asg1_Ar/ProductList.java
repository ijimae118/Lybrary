package asg1_Ar;

import java.util.ArrayList;

public class ProductList {

    
    ArrayList<Product> prlist = new ArrayList();

    public void addProduct() {
        Product p = new Product();
        p.input();
        prlist.add(p);
    }

    public void displayAll() {
        if (prlist.isEmpty()) {
            System.out.println("He thong chua co du lieu");
            return;
        }
        for (Product product : prlist) {
            System.out.println(product);
        }
    }

    public void searchByName(String name) {
        int n = 0;
        for (int i = 0; i < prlist.size(); i++) {
            if (prlist.get(i).name.contains(name)) {
                System.out.println(prlist.get(i));
                n++;
            }
        }
        if (n == 0) {
            System.out.println("Ko tim thay san pham theo ten !");
        }
    }

}
