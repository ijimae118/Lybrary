package PRETEST1_IO_HS;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Book {

    static boolean add(Book b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String BookID, Title, Publisher;
    public int Price;

    public void input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter BookID: ");
            BookID = sc.nextLine().trim();
            if (Pattern.matches("B\\d{4}", BookID)) {
                break;
            }
            System.out.println("Format BookID: Bxxxx ");
        }
        while (true) {
            System.out.println("Enter Title: ");
            Title = sc.nextLine().trim();
            if (Title.length() > 2) {
                break;
            }
            System.out.println("Format Title >2 ");
        }
        while (true) {
            try {
                System.out.println("Enter Price: ");
                Price = Integer.parseInt(sc.nextLine().trim());
                if (Price >=1 && Price <=1000) {
                    break;
                }
                System.out.println("Format Title ko de trong ");
            } catch (NumberFormatException e) {
                System.out.println("loi: "+e.getMessage());
            }

        }
        while (true) {
            System.out.println("Enter Publisher: ");
            Publisher = sc.nextLine().trim();
            if (Pattern.matches("(OUP|CUP)", Publisher)) {
                break;
            }
            System.out.println("OUP or CUP ");
        }

    }
    
    public String standardizedPublisher(){
        if ("OUP".equalsIgnoreCase(Publisher)) {
            return Publisher.replaceAll("OUP", "Oxford University Press");
        } else {
            return Publisher.replaceAll("CUP", "Cambridge Unicersity Press");
        }
    
    }
    public String stabn(){
    String s= "Cambridge Unicersity Press";
        if (Publisher.equals("OUP")) {
            s="Oxford University Press";
        }
    return s;
    }

    @Override
    public String toString() {
        return String.format("[BookID],%s,{Title},%s,(price),%d,<Publisher>,%s",BookID,Title,Price,standardizedPublisher());
    }
// phan trung lap lam them 2 cai duoi
    @Override
    public boolean equals(Object o) {
        Book b= (Book) o;
        return b.BookID.equals(this.BookID);
    }

    @Override
    public int hashCode() {
        return 100; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
