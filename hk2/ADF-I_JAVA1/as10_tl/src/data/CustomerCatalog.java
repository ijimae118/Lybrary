/*
Create class CustomerCatalog in package data for managing a collection of Customers:
- Fields:
cList – array of customers,
count – the number of customers stored in array.
- No-agr constructor to initialize the all the fields.
- Methods:
- add() - add a new customer into array
- searchByName(String name) - search customers having name passed by user.
- displayAll() - display all customers.
 */
package data;


public class CustomerCatalog {
   
    final int max = 5;
    int count = 0;

    Customer[] cList = new Customer[max];

    public void add() {
        if (count==max) {
            System.out.println("Full memory");
            return;
        }
        Customer c = new Customer();
        c.accept();

        cList[count] = c;
        count++;
    }

    public void searchByName(String name) {
        if (count==0) {
            System.out.println("Don't have any data");
            return;
        }
        int num=0;
        for (int i = 0; i < count; i++) {
            if (cList[i].name.contains(name)) {
                System.out.println(cList[i].toString());
                num++;
            }
        }
        if (num==0) {
            System.out.println("Can't find out person name");
        }
    }

    public void displayAll() {
        if (count==0) {
            System.out.println("Don't have any data");
        }
        for (int i = 0; i < count; i++) {
               System.out.println(cList[i].toString());
            
        }
    }
}
