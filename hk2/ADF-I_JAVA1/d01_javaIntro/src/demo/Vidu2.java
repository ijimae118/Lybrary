/*
    *Scanner viet hoa chu dau tien 
    *vi du nhap 2 so nguyen 
    *thuc hien cac phép toan so hoc tren 2 so nay va in ra ket qua 
 */
package demo;

import java.util.Scanner;

public class Vidu2 {

    public static void main(String[] args) {
    // Tao ra 1 doi tuong [Sc] cua lop Scanner 
    //de thuc hien viec nhap nhu lieu 
        Scanner sc = new Scanner(System.in);
        
        // IN ra 1 thong bao len man hinh, nhac nho nguoi chay nhap 1 so nguyen
        System.out.print("Nhập số nguyên thứ nhất:");
        int n1=sc.nextInt();
        System.out.print("Nhap so nguyen thu hai:");
        int n2=sc.nextInt();
        
        // In ra ket qua cua phep cong 2 so
        // vi du ,neu n1=5 va n2=8 ,thi muon in ra man hinh:
        //5+8=13; print(ln)in ra xuông dong 
        //thi printf():printf("%d+%d=%d",n1,n2,n1+n2);
        System.out.println("Phép toán số học:");
        System.out.printf("%d  +  %d=%d \n",n1,n2,n1+n2);
        System.out.printf("%d  -  %d=%d \n",n1,n2,n1-n2);
        System.out.printf("%d  *  %d=%d \n",n1,n2,n1*n2);
        System.out.printf("%d  /  %d=%d \n",n1,n2,n1/n2);
        System.out.printf("%d  %% %d=%d \n",n1,n2,n1%n2);
        
        
        System.out.println("Phép toán luận lý nhị phân:");
        System.out.printf("%d  &  %d=%d \n",n1,n2,n1&n2);
        System.out.printf("%d  |  %d=%d \n",n1,n2,n1|n2);
        System.out.printf("%d  ^  %d=%d \n",n1,n2,n1^n2);
    }
    /*
    Hệ nhị phân(Máy chỉ hiểu hệ nhị phân):
    And:
    n1=22= 0001 0110
    n2=17= 0001 0001
    n1&n2= 0001 0000=2^4=16
    Or:
    n1=22= 0001 0110
    n2=17= 0001 0001
    n1|n2= 0001 0111=2^4+2^2+2^1+2^0
                    =16 + 4 + 2 + 1 =23
    ??:
    n1=22= 0001 0110
    n2=17= 0001 0001
    n1^n2= 0000 0111=2^2+2^1+2^0
                    = 4 + 2 + 1 =7
    He thong so thap phan[0-9]
    1567= 1000  +500    +60      +7
        = 1*10^3+5*10^2+6*10^1 +7*10^0
    
    chuyển 22 thanh nhị phân
    22:2=11 du 0
    11:2=5  du 1
    5:2=2   du 1
    2:2=1   du 0
    1:2=0   du 1
    => 0001 0110
    */
}
