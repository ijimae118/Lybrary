/*
 * class mo ta cau truc CD
 */
package As4_1;

import java.util.Scanner;

public class CD {

    // fiel su lieu
    Scanner sc = new Scanner(System.in);
    public String id, title, type;
    public int price, year;

    //ham dung (cóntruction)
    public CD() {

    }

    public CD(String id, String title, String type, int price, int year) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.price = price;
        this.year = year;
    }

    public void input() {    
        System.out.println("Nhap thong tin cua 1 dia CD");
        System.out.print("nhap ma so: ");
        id = sc.nextLine().trim();
        System.out.print("nhap tua: ");
        title = sc.nextLine().trim();
        
        while (true) {
            System.out.print("nhap loai CD[Audio|Video]:");
            type = sc.nextLine().trim();
            if (type.equalsIgnoreCase("Audio") || type.equalsIgnoreCase("Video")) {
                break;// nhap dung loai CD ->thoat vong lap
            }
            System.out.println("Loại CD ko hop le!!!");// nguoc lai
        }
       
        System.out.print(" nhap don gia: ");
        price = Integer.parseInt(sc.nextLine().trim());
        
        System.out.print(" nhap nam xb: ");
        year = Integer.parseInt(sc.nextLine().trim());
    }
        public void print(){
            System.out.println(" Thong tin CD: ");
            System.out.println("id: "+id);
            System.out.println("tua: "+title);
            System.out.println("loai: "+type);
            System.out.println("don gia: "+price);
            System.out.println("nam xb: "+year);
        }

    @Override
    public String toString() {
        return String.format("%s ,%s,%s,%d,%d",id,title,type,price,year); //To change body of generated methods, choose Tools | Templates.
    }
        
        
}
