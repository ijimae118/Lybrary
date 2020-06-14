
/*
 List(arraylist,vector,linkedlist): list chua dc cac phan tu trung lap.
 * Tao 1 cau truc du lieu Arraylist chua danh sach ten cua cac sinh vien
 */


public class Vidu1 {

    public static void main(String[] args) {
        java.util.List ds1= new java.util.ArrayList<>();
        
        ds1.add("Le Minh");
        ds1.add("Anh Tuan");
        ds1.add("Gia Lam");
        ds1.add(null);
        ds1.add("Anh Tuan");
        ds1.add(12345);
        
        System.out.println("Danh sach ten sinh vien: ");
        for (Object ten : ds1) {
            System.out.println(ten);//dc dinh dang theo toString
        }
         System.out.println("Danh sach ten sinh vien-truy xuat theo chi so index: ");
         for (int i = 0; i < ds1.size(); i++) {
             System.out.println(ds1.get(i));
        }
        
        java.util.List ds2= new java.util.LinkedList();
        ds2.add("Le Minh");
        ds2.add("Anh Tuan");
        ds2.add("Gia Lam");
        ds2.add(null);
        ds2.add("Anh Tuan");
        ds2.add(12345);
        
        System.out.println("Danh sach ten sinh vien(2):");
        for (Object object : ds2) {
            System.out.println(object);
        }
    }
    
}
