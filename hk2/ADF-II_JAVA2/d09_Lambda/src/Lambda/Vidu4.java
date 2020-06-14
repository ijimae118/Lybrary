/*
 * Demo lambda ket hop voi pbuong thuc sort trong collections
 */
package Lambda;
import java.util.*;
class Contact{
public String name,email,phone;

        public Contact() {
        }

        public Contact(String name, String email, String phone) {
            this.name = name;
            this.email = email;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return String.format("%s , %s , %s",name,email,phone); //To change body of generated methods, choose Tools | Templates.
        }

        
}
public class Vidu4 {
    
    public static void main(String[] args) {
        // tao 1 danh sach cac data lien he 
        List<Contact> ds = Arrays.asList(
        new Contact("lam","quachlam@gmai.com","911"),
        new Contact("minh","leminh@gmai.com","12345"),
        new Contact("duong","daoduong@gmai.com","3456"),
        new Contact("thach","nguyenthach@gmai.com","113")
        );
        System.out.println("Danh sach Contact List");
        ds.forEach(System.out::println);
        // sap xep theo cot ten- cach viet lop noi an danh
        Collections.sort(ds,new Comparator<Contact>(){
      
            @Override
            public int compare(Contact o1, Contact o2) {
               return o1.name.compareTo(o2.name);
            }
            
        });
        System.out.println("\n Danh sach Contact List- theo thu tu ten");
        ds.forEach(System.out::println);
        // sap xep ds theo cot dc email- cach viet btLam
        Collections.sort(ds,(c1,c2)->c1.email.compareTo(c2.email));
        System.out.println("\n Danh sach Contact List- theo thu tu Email");
        ds.forEach(System.out::println);
    }
    
}
