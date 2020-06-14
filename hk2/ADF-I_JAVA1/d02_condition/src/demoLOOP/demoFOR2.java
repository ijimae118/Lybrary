/*
 *demo vong lap FOR long nhau
* ve ca hinh sao theo cau truc hinh tam giac vuong
 */
package demoLOOP;

public class demoFOR2 {

    public static void main(String[] args) {
        int n=5;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
                
    }
    
}
