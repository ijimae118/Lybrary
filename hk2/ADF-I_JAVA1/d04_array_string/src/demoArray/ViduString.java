/*
 * Demo cac ham xu ly chuoi ky tu
 */
package demoArray;

public class ViduString {

    public static void main(String[] args) {
        String s = "   Quach Gia Lam ";
        System.out.printf("Chuoi s: [%s] \n", s);
        //length() : tong so ky tu trong chuoi
        int n = s.length();
        System.out.printf("tong so ky tu: %d \n", n);
        //trim() : cat het khoang trang du o dau va cuoi chuoi
        String s1 = s.trim();
        System.out.printf("\nChuoi s1: [%s] \n", s1);
        int n1 = s1.length();
        System.out.printf("tong so ky tu s1: %d \n", n1);
        //toUpperCase() : chuyen sang chu in hoa
        String s2 = s.toUpperCase();
        System.out.printf("\nChuoi s2: [%s] \n", s2);
        //toLowerCase() : chuyen sang chu in thuong
        String s3 = s.toLowerCase();
        System.out.printf("\nChuoi s3: [%s] \n", s3);

        //indexOf():tim vi tri xuat hien cua 1 chuoi con(G) 
        int p = s.indexOf("G");
        System.out.printf("\nVi tri cua [G]: %d \n", p);
        //indexOf():tim vi tri xuat hien cua 1 chuoi con(O) 
        int p1 = s.indexOf("O");
        System.out.printf("Vi tri cua [G]: %d \n", p1);

        //substring :trich chuoi con "GIA"
        String s4 = s.substring(9, 12);
        System.out.printf("\n Chuoi con:[%s] \n", s4);

        //equal(): so sanh giong nhau
        String s5 = "   Quach gia LAM ";
        System.out.printf("EQUAL: [%s] vs [%s]:%s \n",s, s5, s.equals(s5));
        //equalsIgnoreCase(): so sanh giong nhau
        System.out.printf("EQUALIgnoreCase: [%s] vs [%s]:%s \n",s, s5, s.equalsIgnoreCase(s5));
        
         //compare()
        String x1 ="Lam";
        String x2 ="Huy";
        System.out.println("COmpare");
        System.out.printf("[%s] vs [%s] = %d \n",x1,x2,x1.compareTo(x2));
        System.out.printf("[%s] vs [%s] = %d \n",x2,x1,x2.compareTo(x1));
        System.out.printf("[%s] vs [%s] = %d \n",x2,x2,x2.compareTo(x2));
        
        
    }
}
