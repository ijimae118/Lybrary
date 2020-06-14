/*
Ghi 1 chuoi van ban ra 1 tap tin
 */
package demo;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViduWriteFile {

    public static void main(String[] args) {
        ViduWriteFile vd = new ViduWriteFile();
        vd.WriteFileBin();
        vd.WriteFileBin2();
    }

    String fname = "D:/DanVit.txt";
    String lyrics = "\r\nĐàn vịt con ra bờ ao\r\n"
        + "Nối đuôi theo chân mẹ.\r\n"
        + "Đàn vịt con nhớ nhé\r\n"
        + "Chớ có rẽ ngang nhớ đi thẳng hàng\r\n"
        + "Chớ có rẽ ngang nhớ đi thẳng hàng.\r\n";

    void WriteFileBin() {
        try {
            //1. tao output stream ket voi file Danvit.txt
            FileOutputStream fos = new FileOutputStream(fname);

            //2. doc het cac byte du lieu trong chuoi lyrics -> output stream
            byte[] buffer = lyrics.getBytes();
            fos.write(buffer);

            //3.dong output stream
            fos.close();
            //4.mo file out ra
            Runtime r = Runtime.getRuntime();
            r.exec("notepad " + fname);

        } catch (Exception ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
    }

    String fname2 = "D:/DanVit2.txt";

    void WriteFileBin2() {
        try {
            //1. tao output stream ket voi file Danvit.txt
            PrintStream ps = new PrintStream(fname2);

            //2. xuat chuoi lyrics -> output stream
            ps.println(lyrics);

            //3.dong output stream
            ps.close();
            //4. mo file out ra
            Runtime r = Runtime.getRuntime();
            r.exec("notepad  " + fname2);

        } catch (Exception ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
    }

}
