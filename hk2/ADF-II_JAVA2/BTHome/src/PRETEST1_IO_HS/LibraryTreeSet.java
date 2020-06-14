/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRETEST1_IO_HS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author PC
 */
public class LibraryTreeSet {
        TreeSet<Book> ds = new TreeSet<>((b1, b2)->b1.BookID.compareTo(b2.BookID));

    public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        Library d = new Library();
        d.read();
        String op;
        while (true) {
            System.out.println("===Danh Sách===");
            System.out.println("1.Thêm 1 book: ");
            System.out.println("2.In toàn bộ book : ");
            System.out.println("3.Save");
            System.out.println("4.Thoat");

            System.out.print("Mời chọn menu[1-4]: ");
            op = ap.nextLine().trim();
            switch (op) {
                case "1":
                    d.add();
                    break;
                case "2":
                    d.Display();
                    break;
                case "3":
                    d.Save();
                    break;
                case "4":
                    return;
            }
        }
    }

    public void add() {
        Book b = new Book();
        b.input();
        
        if (Book.add(b)) {
            System.out.println("Nhap thanh cong");
        } else {
            System.out.println("Nhap book that bai");
        }
    
    }

    public void Display() {
        if (Book.isEmpty()) {
            System.out.println(">>HT chua co data");
            return;
        }
        //    Book.forEach(System.out::println);
        int n = 0;
        for (Book book : ds) {
            n++;
            System.out.println(n + " " + book);
        }
    }
    String fname = "Library.txt";

    public void Save() {
        if (Book.isEmpty()) {
            System.out.println("Loi: HT chua co du lieu !");
            return;
        }
        try {
            //1. open output stream de luu ds san pham vo tap tin sanpham.txt
            PrintStream ps = new PrintStream(fname);

            //2. ghi toan bo du lieu trong ds vo output stream nay
            //ds.forEach(ps::println);
            ds.forEach(item -> ps.println(item));
        //    Book.forEach(ps::println);
            //3. dong stream
            ps.close();

            //4. open tap tin sanpham.txt trong notepad de xem
            Runtime r = Runtime.getRuntime();
            r.exec("notepad " + fname);

        } catch (Exception ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
    }

    public void read() {
        File f = new File(fname);
        if (f.exists() == false) {
            return;  //tap tin sanpham.txt chua duoc tao -> ket thuc ham xu ly
        }

        ds = new TreeSet<>();

        try {
            //1. open input stream ket voi tap tin sanpham.txt
            BufferedReader br = new BufferedReader(new FileReader(fname));

            //2. vong lap doc cac dong du lieu trong file sanpham.txt
            String line = null;
            while (br.ready()) {
                line = br.readLine(); // doc 1 dong van ban ->1 line

                String[] items = line.split(",");//trong 1 line  cac phan tu dc tach ra = dau ",";
                if (items.length == 8) {//if 1 line (item) dc tach ra boi dau , thanh 3 phan : 0,1,2
                    Book p = new Book();
                    p.BookID = items[1].trim();
                    p.Title = items[3].trim();
                    p.Price = Integer.parseInt(items[5].trim());
                    p.Publisher = items[7].trim();

                    Book.add(p);

                }
            }// ket thuc while

            //3. dong stream
            br.close();

        } catch (Exception ex) {
            System.out.println("Loi: " + ex.getMessage());
        }

    }
}
