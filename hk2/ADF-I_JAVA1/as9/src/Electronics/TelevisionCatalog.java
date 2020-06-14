/*
Create class TelevisionCatalog in package Electronics for managing a collection of
Televisions:
- Fields:
[max, count] int, tvList – array of Television.
- Default constructor to initialise the all the fields.
- Methods:
- Public void add() - add a new television into array
- Public void searchByBrand() - search televisions belong a brand name accepted by
user.
- Public void displayAll() - display all televisions.
- Public void displayHighValue() – display televisions with the price above 500.
 */
package Electronics;

import Goods.Television;

public class TelevisionCatalog {

    public int max = 5, count = 0;

    Television[] tvlist = new Television[max];

    public TelevisionCatalog() {//Default constructor to initialise the all the fields.
    }
     

    public void add() {
        if (count == max) {
            System.out.println("Full memory");
            return;
        }
        
        Television a = new Television();//auto accep();
        
        tvlist[count] = a;
        count++;
    }

    public void searchByBrand(String brand) {
        if (count == 0) {
            System.out.println("Chưa có dữ liệu");
        } else {
            int d=0;
            for (int i = 0; i < count; i++) {
                if (tvlist[i].brand.contains(brand)) {
                    tvlist[i].printinfo();
                    d++;
                }
            }
            if (d==0) {
                System.out.println("Ko tim thấy nhãn hiệu tv");
            }
        }
    }

    public void displayAll() {
        if (count == 0) {
            System.out.println("Chưa có dữ liệu");
        } else {
            for (int i = 0; i < count; i++) {
                
                System.out.println(tvlist[i].toString());
               // tvlist[i].printinfo();
                

            }
        }
    }

    public void displayHighValue() {
        if (count == 0) {
            System.out.println("Chưa có dữ liệu");
        } else {
            int d=0;
            for (int i = 0; i < count; i++) {
                if (tvlist[i].price > 500) {
                    tvlist[i].printinfo();
                d++;
                }
            }
            if (d==0) {
                System.out.println("Ko có tv nào có giá lớn hơn 500");    
            }
        }
    }
    

}
