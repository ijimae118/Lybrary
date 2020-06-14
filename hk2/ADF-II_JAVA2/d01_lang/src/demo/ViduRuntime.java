/*
 Su dung runtime de mo chuong trinh Notepad
 */
package demo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViduRuntime {

    public static void main(String[] args) {
        //Lay doi tuong tham chieu cua lop runtime
        Runtime r= Runtime.getRuntime();
//      String fname ="D:\\Desktops\\aptech\\hk2\\ADF-II_JAVA2\\thuJAVA.txt"; // ko run dc
        try {
            // mo chuong trinh notepad bang doi tuong r
        //  r.exec("notepad" + fname);
            r.exec("notepad.exe D:\\Desktops\\aptech\\hk2\\ADF-II_JAVA2\\thuJAVA.txt");
        } catch (IOException ex) {
            System.out.println("loi: "+ex.getMessage());
        }
        
    }
    
}
