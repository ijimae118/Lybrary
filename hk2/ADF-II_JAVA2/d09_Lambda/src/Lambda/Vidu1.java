/*
 *Demo cach su dung bieu thuc lambda ket hop voi 1 function internal interface tu thiet ke
 */
package Lambda;

@FunctionalInterface//chi co 1 ham truu tuong duy nhat-(bo qua ko nhap cung dc) 
interface ICasio{
    public float op(float a,float b);
    
}
public class Vidu1 {

    public static void main(String[] args) {
        //1.tao bt lambda op1 de thuc hien phep cong hai so thuc
        ICasio op1=(float x,float y) -> { return x+y; };
        //2.tao bt lambda op2 de thuc hien phep nhan 2 so thuc 
        ICasio op2 =(x,y)-> x*y;
        //3.tao bt lambda op2 tra ve tong binh phuong cua 2 so thuc
        ICasio op3=(x,y)->{
        float a= x*x;
        float b=y*y;
        return a+b;
        };
        //thuc hien chuc nang cua 3 bt op1 .op2,op3
        float a=10, b=15;
        System.out.printf("OP1: %.2f + %.2f=%.2f\n",a,b,op1.op(a, b));
        System.out.printf("OP2: %.2f * %.2f=%.2f\n",a,b,op2.op(a, b));
        System.out.printf("OP3: %.2f^2 + %.2f^2=%.2f\n",a,b,op3.op(a, b));
    }
    
}
