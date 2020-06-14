
package app;

import data.Computer;
import data.laptop;

public class TestLaptop {


    public static void main(String[] args) {
/*       laptop c1=new laptop(); // run all because laptop extends Computer and add more two variable.
        // kieu khai bao bien =kieu doi tuong (type of object)c1:laptop
        //kieu cap phat bo nho =kieu tham chieu(type of reference) c1:Laptop
        c1.input();
        c1.display();
*/        
/*          Computer c2 =new Computer();// run 3 variable don't have a add apart
        // kieu khai bao bien =kieu doi tuong (type of object)c2:Computer
        //kieu cap phat bo nho =kieu tham chieu(type of reference) c2:Computer    }
       c2.input();
       c2.display();
*/
        Computer c3 =new laptop();// run all because it extends (laptop ~5 variable)
        // kieu khai bao bien =kieu doi tuong (type of object)c3:Computer
        //kieu cap phat bo nho =kieu tham chieu(type of reference) c3:Laptop    }
       c3.input();
       c3.display();


}
}