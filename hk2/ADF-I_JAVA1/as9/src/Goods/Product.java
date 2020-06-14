/*
1 Creates an abstract class named Product in package Goods.
- Protected Fields id, name
- Public constructor to initialise the above fields.
- Method:
- Protected void accept() : allow user input data into data fields.
- Public abstract void printInfo() : abtract method used to print details of an product.
 */
package Goods;

import java.util.Scanner;

public abstract class Product {
    protected String id,name;
    Scanner sc =new Scanner(System.in);
    
    public Product() {

    }
    
    protected void accept(){
        System.out.println("Mời nhập id: ");
        id=sc.nextLine().trim();
        System.out.println("Mời nhập name: ");
        name=sc.nextLine().trim();
        
    }
    public abstract void printinfo();
}
