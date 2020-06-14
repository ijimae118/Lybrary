package asg3_HS;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Book{

    String id, title, author, publisher;
    int pages, price;

    public Book() {
    }

    public Book(String id, String title, String author, String publisher, int pages, int price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
        this.price = price;
    }

    void input() {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter id: ");
            id = sc.nextLine().trim();

            if (Pattern.matches("B\\d{4}", id)) {
                break;
            }
            System.out.println("id : Bxxxx, với x là ký số.");
        }

        while (true) {

            System.out.print("Enter title: ");
            title = sc.nextLine().trim();

            if (Pattern.matches("[a-z A-Z]{2,}", title)) {
                break;
            }
            System.out.println("title: it nhat 2 ky tu chu ,so or khong trang. ");
        }

        while (true) {

            System.out.print("Enter author: ");
            author = sc.nextLine().trim();

            if (!author.isEmpty()) {
                break;
            }
            System.out.println("Author ko dc de trong.");
        }

        while (true) {

            System.out.print("Enter pubisher: ");
            publisher = sc.nextLine().trim();

            if (publisher.length() > 0) {
                break;
            }
            System.out.println("publisher ko dc de trong.");
        }

        while (true) {
            try {
                System.out.print("Enter pages: ");
                pages = Integer.parseInt(sc.nextLine().trim());

                if (pages >= 5 && pages <= 2000) {
                    break;
                }
                System.out.println("Pages: 5-2000.");
            } catch (NumberFormatException e) {
                System.out.println("loi: " + e.getMessage());
            }

        }
        while (true) {
            try {
                System.out.print("Enter price: ");
                price = Integer.parseInt(sc.nextLine().trim());

                if (price >0) {
                    break;
                }
                System.out.println("Price >0 .");
            } catch (NumberFormatException e) {
                System.out.println("loi: " + e.getMessage());
            }

        }

    }

    @Override
    public String toString() {
        return String.format("id:%s title:%s author:%s pages:%d price:%d",id,title,author,pages,price);
    //      return super.toString();
    }
     
}
