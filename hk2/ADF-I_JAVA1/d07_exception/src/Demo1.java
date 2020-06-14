
import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        float n = 2.5f;  // n=2.5 =>loi syntax (loi cu phap)
        int a = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("nhap n: ");
                n = Float.parseFloat(sc.nextLine().trim());
                break;//nhap dung =>thoat vong lap
            } catch (NumberFormatException e) {
                System.out.println("loi: " + e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("nhap a: ");
                a = Integer.parseInt(sc.nextLine().trim());
                break;//nhap dung =>thoat vong lap
            } catch (NumberFormatException e) {// bắt lỗi chi tiết
                System.out.println("loi: " + e.getMessage());
            }catch(Exception e){// bắt lỗi chung
                    System.out.println("loi: " + e.getMessage());
            }
        }
        
        float c= n/a ;

        System.out.println("Ket qua phep chia: ");
        System.out.printf("%f / %d =%f \n", n, a, c);

        System.out.println("ket thuc chuong trinh");
    }

}
