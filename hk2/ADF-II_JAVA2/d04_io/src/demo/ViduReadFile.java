/*
 * Doc 1 tap tin van ban,xuat noi dung do ra man hinh
 */
package demo;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViduReadFile {

    public static void main(String[] args) {
        ViduReadFile p1=new ViduReadFile();
        p1.readFileBin();
        System.out.println("");
        p1.readFileChar();
        System.out.println("");
    }
    String fname = "D:\\DanGa.txt";// or D:/DanGa.txt
 
    void readFileBin() {
        try {
            //1.tao input stream ket noi voi file DanGa.txt ~openfile
            java.io.FileInputStream fis = new FileInputStream(fname);
            //2.vong lap doc tung (byte) du lieu cua tap tin va xuat len man hinh
            int ch;
            while (( ch = fis.read()) > -1) {//-1 la doc toi cuoi cung file r 
                System.out.printf("%c",ch);
            }
            //3.dong stream
            fis.close();
        } catch (Exception ex) {
            System.out.println("loi: " + ex.getMessage());
        }

    }
    
    void readFileChar(){
        try {
            //1.Tao 1 char stream de noi voi file danga.txt
            java.io.FileReader fr=new FileReader(fname);
            //2. vong lap doc tung (ky tu) trong tap tin->nam tinh
            int ch;
            while ((ch= fr.read()) != -1) {
                
                System.out.printf("%c",ch);
            }
            //3.dong stream
            fr.close();
        } catch (Exception ex) {
            System.out.println("loi: "+ex.getMessage());
        }
            
    } 

}
