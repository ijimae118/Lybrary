/*
 i/o-marshal
 *Ghi 1 chuoi van ban ,chua trong 1 tap tin
 */
package demo;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViduWriteFile {

    public static void main(String[] args) {
        ViduWriteFile vd =new ViduWriteFile();
        vd.WriteFileBin();
        vd.WriteFileBin2();
    }
    String fname = "D:/DanVit.txt";
    String lyrics = "Lời bài hát: Đàn Vịt Con.\nNhạc sĩ: Mộng LânLời đăng bởi: lethihoa_994Bài hát : Đàn Vịt Con - V.A\r\n"
            + "\r\n"
            + "Đàn vịt con ra bờ ao\r\n"
            + "Nối đuôi theo chân mẹ.\r\n"
            + "Đàn vịt con nhớ nhé\r\n"
            + "Chớ có rẽ ngang nhớ đi thẳng hàng\r\n"
            + "Chớ có rẽ ngang nhớ đi thẳng hàng.";

    void WriteFileBin() {      
        try {
            //1.Tao 1 char stream de noi voi file Danvit.txt
            FileOutputStream fos= new FileOutputStream(fname);
            //2.doc het cac byte du lieu trong chuoi lyrics -> output stream
            byte[] buffer = lyrics.getBytes();
            fos.write(buffer);
            //3.dong output stream
            fos.close();
            
            //mở đối tượng = runtime
            Runtime r= Runtime.getRuntime();
            r.exec("notepad "+fname);
            
        } catch (Exception ex) {
            System.out.println("loi:"+ex.getMessage());
        }
    }// dạng nhị phân
    
        String fname2 = "D:/DanVit2.txt";
        void WriteFileBin2() {      
        try {
            //1.Tao 1 char stream de noi voi file Danvit.txt
            PrintStream ps= new PrintStream(fname2);
            //2.doc het cac byte du lieu trong chuoi lyrics -> output stream
            ps.println(lyrics);
            
            //3.dong output stream
            ps.close();
            
            //mở đối tượng = runtime
            Runtime r= Runtime.getRuntime();
            r.exec("notepad "+fname);
            
        } catch (Exception ex) {
            System.out.println("loi:"+ex.getMessage());
        }
    }

}
