/*
 * Vi du nen 1 tap tin van ban
 */
package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.DeflaterOutputStream;

public class ViduZip {

    public static void main(String[] args) {
        ViduZip vd= new ViduZip();
        vd.zipFile();
    }
    String fname1="D:/DanGa.txt";
    String fname2="D:/DanGa.FLT";
    void zipFile(){
        try {
            java.io.FileInputStream fis= new FileInputStream(fname1);
            java.io.FileOutputStream fos= new FileOutputStream(fname2);
            
            java.util.zip.DeflaterOutputStream dos=new DeflaterOutputStream(fos);//nen ra tap tin
            
            int b;
            while ((b = fis.read()) != -1) {                
                dos.write(b);
            }
            dos.close();
            fos.close();
            fis.close();
            
            System.out.println("Finished!!!");
        } catch (Exception ex) {
            System.out.println("loi:"+ex.getMessage());
        }
    }
}
