package demoMethod;
import java.util.Scanner;
public class Vidu3 {
    
    public static void main(String[] args) {
        Vidu3 vd =new Vidu3();
        
        vd.add(12,13);
        vd.add("HEllo","Lê Minh!!!");
        vd.add();
    }
    
    
    public void add(int x, int y){
        System.out.println(">>Kq cong 2 so: ");
        System.out.printf("%d + %d = %d" , x,y,x+y);
        
    }
    
    
    void add(String s1, String s2){
        System.out.println(">> Kq cong 2 chuoi ky tu: ");
        System.out.printf("%s + %s = %s",s1,s2,s1+s2);
    }
    
    
    void add(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu 1: ");
        int n1 = sc.nextInt();
        System.out.print("Nhap so thu 2: ");
        int n2 = sc.nextInt();
        System.out.print("Nhap so thu 3: ");
        int n3 = sc.nextInt();
        
        System.out.println("kq 3 so: ");
        System.out.printf("%d +%d + %d=%d",n1,n2,n3,n1+n2+n3);
    }
    
    
    
}
