package asg3_HS;

import java.util.HashSet;
import java.util.stream.Stream;

public class BookCatalog {

    HashSet<Book> bkList = new HashSet<>();

    /*
    void add() {
        Book b = new Book();
        b.input();

        for (Book item : bkList) {
            if (b.id.equals(item.id)) {
                System.out.println("ID bi trung");
                return;
            }

        }
        bkList.add(b);
        System.out.println("Them moi thanh cong");
    }

    public void remove(String bkID) {
        if (bkList.isEmpty()) {
            System.out.println(">>HT chua co du lieu:");
            return;
        }

        int n = 0;
        for (Book o : bkList) {

            if (o.id.equalsIgnoreCase(bkID)) {
                bkList.remove(o);
                n++;
                System.out.println("Xoa thanh cong");
                return;

            }
        }
        if (n == 0) {
            System.out.println("Xoa that bai.");
        }
    }

    void display() {
        if (bkList.isEmpty()) {
            System.out.println(">>HT chua co data");
            return;
        }

        for (Book book : bkList) {
            System.out.println(book);
        }

        //    bkList.forEach(System.out::println);
    }

    void display(String auName) {
        int n = 0;
        for (Book b : bkList) {
            if (b.author.contains(auName)) {
                System.out.println(b);
                n++;
            }
        }
        if (n == 0) {
            System.out.println("Ko tim thay sach cua tac gia " + auName);
        }
    }
     */
    void add() {
        Book b = new Book();
        b.input();
        long cnt = bkList.stream().filter(item -> item.id.equals(b.id)).count();
        if (cnt == 0) {
            bkList.add(b);
            System.out.println("Nhap thanh cong");
        } else {
            System.out.println("Trung ID.");
        }
    }

    public void remove(String bkID) {
        if (bkList.isEmpty()) {
            System.out.println(">>HT chua co du lieu:");
            return;
        }

        int n = 0;
        for (Book o : bkList) {

            if (o.id.equalsIgnoreCase(bkID)) {
                bkList.remove(o);
                n++;
                System.out.println("Xoa thanh cong");
                return;

            }
        }

        if (n == 0) {
            System.out.println("Xoa that bai.");
        }
    }

    void display() {
        if (bkList.isEmpty()) {
            System.out.println(">>HT chua co data");
            return;
        }

        bkList.forEach(System.out::println);
    }

    void display(String auName) {//ra
        int n = 0;
        for (Book b : bkList) {
            if (b.author.contains(auName)) {
                System.out.println(b);
                n++;
            }
        }
        if (n == 0) {
            System.out.println("Ko tim thay sach cua tac gia " + auName);
        }
    }

/*    void display(String auName) {//ko ra
        if (bkList.isEmpty()) {
            System.out.println(" HT chua co du lieu !");
            return;
        }

        Stream<Book> prStream = bkList.stream().filter(item -> item.author.contains(auName));

        if (prStream.count() == 0) {
            System.out.println("Ko tim thay");
        } else {
            prStream.forEach(System.out::println);
        }
    }
*/
}
