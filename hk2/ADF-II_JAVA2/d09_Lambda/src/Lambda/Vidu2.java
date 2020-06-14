/*
 * Demo cach su dung bieu thuc lambda ket hop voi 1 build-in function internal interface tu thiet ke
 */
package Lambda;

import java.util.function.*;

public class Vidu2 {

    public static void main(String[] args) {//if muon sai function Interface  co 2 tham so dau vao thi them BI 
        //1. tao bt lambda op1 de thuc hien phep cong 2 so nguyen
        BiFunction<Integer,Integer,Integer> op1 = (Integer x, Integer y) -> {
            return x + y;
        };
        //2.tao bt lambda op2 de thuc hien phep tru 2 so nguyen
        BiFunction<Integer,Integer,Float> op2 = (x, y) ->{
            float kq = x/y;
            return kq;
        };
        //3.tao bt lambda op3 de thuc hien phep tong binh phuong 2 so nguyen
        BiFunction<Integer,Integer,Integer> op3 = (x, y) ->{
        int a=x*x;
        int b=y*y;
        return a+b;
        };
        // thuc hien chuc nang cua 3 bt op1,op2,op3
        int a =20,b=6;
        System.out.printf("OP1: %d+%d=%d \n",a,b,op1.apply(a, b));
        System.out.printf("OP2: %d/%d=%f \n",a,b,op2.apply(a, b));
        System.out.printf("OP3: %d^2+%d^2=%d \n",a,b,op3.apply(a, b));
    }

}
