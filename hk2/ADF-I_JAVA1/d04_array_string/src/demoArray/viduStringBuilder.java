/*
 * Demo StringBuilder
 */
package demoArray;

public class viduStringBuilder {

    public static void main(String[] args) {
        System.out.println("Demo StringBuilder");
        
        StringBuilder sb= new StringBuilder("Quach lam");
        System.out.printf("sb=[%s] \n",sb.toString());
        //length():dem so ky tu
        System.out.printf("Tong so ky tu: %d \n",sb.length());
        //insert():them chuoi "Gia" vo vi tri 6 
        sb.insert(6, "Gia ");
        System.out.printf("Sau khi insert(): [%s] \n",sb.toString());
        // append():them cuoi chuoi ,"SV"
        sb.append(",SV.");
        System.out.printf("Sau khi append(): [%s]\n",sb.toString());
        //delete():xoa 1 so ky tu trong chuoi
        sb.delete(6,10);
        System.out.printf("Sau khi delete(): [%s]\n",sb.toString());
        //reverse():dao cac ky tu ben trong chuoi
        sb.reverse();
        System.out.printf("Sau khi reverse: [%s]\n",sb.toString());
    }
    
}
