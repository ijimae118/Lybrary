
package app;

import data.*;
import java.sql.Connection;
import java.sql.Driver;

public class Test {

    public static void main(String[] args) {
        // kiem tra viec load driver sqljdbc co thanh cong?
        
        MyLib.loadDriver();        
        System.out.println("Load driver thanh cong !");
        
        
        MyLib.getConnect();
        System.out.println("Ket noi DB thanh cong !");
    }
    
    
}
