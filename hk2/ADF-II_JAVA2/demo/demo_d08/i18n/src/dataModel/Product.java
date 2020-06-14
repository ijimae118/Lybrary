/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataModel;

import java.util.Vector;

/**
 *
 * @author ThuyLM
 */
public class Product {
    private String id,name, cat;
    private int price;

    public Product() {
    }

    public Product(String id, String name, String cat, int price) {
        this.id = id;
        this.name = name;
        this.cat = cat;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%d,%s", id,name,price,cat); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Vector toVector(){
        Vector v = new Vector();
        v.add(id);
        v.add(name);
        v.add(price);
        v.add(cat);
        return v;
    }
    
}
