/*
Create class Television derives from Product and implements ITax, in package Electronics.
- Fields: pprice, QoH (quantity on hand) and brand.
- Constructors to initialise the all fields.
- Override methods:
protected void accept() : allow user to input additional details of a television

invoke method accept() of super class.

public String toString() : return a string presenting all the details of a product as
follows: id, name, price, QoH, cost, amount (=cost*QoH, cost: price after TAX)
 */
package Goods;




public class Television extends Product implements ITax{
    public int price ,QoH;
    public String brand;
    public float cost=price-(price*VAT_TAX_PERCENT);

    

    
    public Television() {
        accept();    //mặc định để auto accept
    }
    
    @Override
    protected void accept(){
    super.accept();
        System.out.println("Enter price: ");
        price=Integer.parseInt(sc.nextLine().trim());
        System.out.println("Enter quantity on hand: ");
        QoH=Integer.parseInt(sc.nextLine().trim());
        System.out.println("Enter brand: ");
        brand=sc.nextLine().trim();
        
    }
    
    
    @Override
    public float getCost() {
       
        return cost;
    }
    
    
    @Override
    public void printinfo() {
        System.out.println("====Data TV===");
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("QoH: "+QoH);
        System.out.println("Cost: "+cost);
        System.out.printf("Amount: %.2f ",cost*QoH);
        System.out.println("");
        
    }


        @Override
    public String toString() {
        return String.format("id: %s,name: %s,price: %d,QoH: %d,cost: %.2f,amount: %.2f",id,name,price,QoH,cost,cost*QoH);
    }

    
}
