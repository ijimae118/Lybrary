/*
 * Vi du giai nen tap tin FLT ->TXT 
 */
package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.InflaterOutputStream;

public class ViduUnzip {

    public static void main(String[] args) {
        ViduUnzip vd= new ViduUnzip();
        vd.unzipFile();
    }
    String fname1="D:/DanGa.FLT";//read
    String fname2="D:/DanGa2.txt";//write    
    void unzipFile(){
        try {
            java.io.FileInputStream fis= new FileInputStream(fname1);
            java.io.FileOutputStream fos= new FileOutputStream(fname2);
            java.util.zip.InflaterOutputStream ios =new InflaterOutputStream(fos);
            
            int b;
            while ((b=fis.read())!=-1) {                
                ios.write(b);
            }
            ios.close();
            fos.close();
            fis.close();
            System.out.println("Finished!!!");
            
            Runtime r= Runtime.getRuntime();
            r.exec("notepad "+fname2);
        } catch (Exception ex) {
            System.out.println("loi:"+ex.getMessage());
        }
    }
}
