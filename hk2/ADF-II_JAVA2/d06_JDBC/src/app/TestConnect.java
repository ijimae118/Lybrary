/*
kiem thu viec ket noi den CSDL [sem2_demo] cua sqlserver co thanh cong ko? sau khi lam MyLIB.java
 */
package app;

import data.MyLIB;
public class TestConnect {

    public static void main(String[] args) {
        if (data.MyLIB.getCN()==null) {
            System.out.println("Thoi roi,buon oi chao mi!!! :( ");
        }
        else{
            System.out.println(">>Thanh cong roi!!! :) ");
        }
        
    }
    
}
