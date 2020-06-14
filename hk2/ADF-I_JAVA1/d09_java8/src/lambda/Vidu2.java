/*
Demo ve mothod references.
 */
package lambda;

import java.util.function.*;

public class Vidu2 {

    public static void main(String[] args) {
        Vidu2 p = new Vidu2();
        p.demoStatic();
        p.demoInstance();
    }

    void demoStatic() {
        int a = 60;
        //áp ding bieu thuc lambda de in giá trị của 1 số nguyên dưới dạng nhị phân
        Function<Integer, String> ex1 = n -> Integer.toBinaryString(n);
        System.out.printf("%d(d) =%s(b) \n",a,ex1.apply(a));// autoboxing int ->Integer
        
        //ap dung method reference de rut gon bt lambda
        Function<Integer,String> ex2= Integer::toBinaryString;//Integer la input ,Str la output//infer
        System.out.printf("%d(d) =%s(b) \n",a,ex2.apply(a));
        
        
    }
    void demoInstance(){
            String name ="le minh";
            //bt thuc lambda tra ve chuoi in hoa
            Supplier<String> ex1 = () -> name.toUpperCase();
            System.out.println("Your name:"+ex1.get());
            
            //method reference
            Supplier<String> ex2 = name::toUpperCase;
            System.out.println("Your name:"+ex2.get());
            
        }
}



