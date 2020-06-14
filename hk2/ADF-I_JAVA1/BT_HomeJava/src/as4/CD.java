package as4;

import java.util.Scanner;

public class CD {

    Scanner scanner = new Scanner(System.in);
    public String id, type, title;
    public int price, year;

    public void input() {
        System.out.println("Nhap thong tin cua 1 dia CD: ");
        System.out.print("Nhap id: ");
        id = scanner.nextLine().trim();
        System.out.print("Nhap tua: ");
        title = scanner.nextLine().trim();
        while (true) {
            System.out.print("Nhap loai cd[Audio|Video]: ");
            type = scanner.nextLine().trim();
            if (type.equalsIgnoreCase("Audio") || type.equalsIgnoreCase("Video")) {
                break;
            }
            System.out.println("Loai cd ko hop le !!!");

        }
        System.out.print("Nhap don gia: ");
        price = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("nhap nam xuat ban: ");
        year = Integer.parseInt(scanner.nextLine().trim());

    }

    public void print() {
        System.out.println("Thong tin CD");
        System.out.println("Id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("year: " + year);
    }

    @Override
    public String toString() {
       // return "CD{" + "scanner=" + scanner + ", id=" + id + ", type=" + type + ", title=" + title + ", price=" + price + ", year=" + year + '}'; ko ra??
       return String.format("%s ,%s,%s,%d,%d",id,title,type,price,year); //To change body of generated methods, choose Tools | Templates.
    }
    
}
