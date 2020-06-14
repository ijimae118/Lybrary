/*
 *Vi du ve new io
 */
package demo;

import java.io.IOException;

public class ViduNIO {

    public static void main(String[] args) {
        ViduNIO vd = new ViduNIO();
        vd.readFile();
    }
    String fname1 = "D:/DanGa.txt";

    void readFile() {
        // doc noi dung cua tap tin [danga.txt] xuat len man hinh
        java.nio.file.Path p = java.nio.file.Paths.get(fname1);
        try {

            java.nio.file.Files.readAllLines(p).forEach(System.out::println);
        } catch (IOException ex) {
            System.out.println("loi:" + ex.getMessage());
        }
    }
}
