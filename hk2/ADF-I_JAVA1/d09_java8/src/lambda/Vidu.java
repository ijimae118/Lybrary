/*
demo cách lập trình bieu thuc lambda(ham an danh)
1.phải có (tạo) 1 function interface (loại interface chỉ có 1 hàm trù tượng duy nhất)
2.tạo biểu thức lambda dựa trên functional interface o buoc 1
3.cho thi hanh bt lambda
 */
package lambda;

import java.util.Scanner;

public class Vidu {

    public static void main(String[] args) {
        //2.tao bieu thuc lambda dua tren functional interface ICasio
        ICasio ex1 = (int x, int y) -> {
            return x + y;
        };
        ICasio ex2 = (x, y) -> {
            return x * y;
        };
        ICasio ex3 = (x, y) -> x / y;
        // neu ko su dung lambda ,thi trien khia lop an danh de cai dat phep toan tru
        ICasio ex4 = new ICasio() {
            @Override
            public int op(int a, int b) {
                return a - b;
            }
        };
        // nhập 2 số nguyên,lưu vo biến a,b
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("nhập số thứ 1: ");
        int a = Integer.parseInt(sc.nextLine().trim());
        System.out.println("nhập số thứ 2: ");
        int b = Integer.parseInt(sc.nextLine().trim());
        //3.thuc hien lambda
        int kq1 = ex1.op(a, b);
        System.out.printf("%d + %d =%d \n", a, b, kq1);
        int kq2 = ex2.op(a, b);
        System.out.printf("%d * %d =%d \n", a, b, kq2);

        System.out.printf("%d / %d =%d \n", a, b, ex3.op(a, b));

        System.out.printf("%d - %d =%d \n", a, b, ex4.op(a, b));
    }

}
// định nghĩa functional interface

@FunctionalInterface//có hay ko dòng này cũng đc
interface ICasio {

    public int op(int a, int b);
}
