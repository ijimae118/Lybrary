
package product;

import sale.IDiscount;


public class Item implements IDiscount{
    public String name;
    public int price,quantity;

    public Item() {
    }
    
    
    @Override
    public void displayDetails() {
        System.out.println("===Item===");
        System.out.println("name: "+name);
        System.out.println("price: "+price);
        System.out.println("quantity: "+quantity);
        System.out.println("total: "+quantity*price);
    }
    
}
