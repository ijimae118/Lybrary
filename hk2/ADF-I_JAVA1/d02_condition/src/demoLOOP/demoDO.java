/*
*Demo vong lap DO-WHITE
*tra loi cau hoi "Thu do cua VN la thp?"
*neu dung ->cam on , if sai yeu cau tra loi lai.
*/
package demoLOOP;

import java.util.*;//*chon tat ca thu vien
public class demoDO {

   public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String ans="";//khai báo biến
         
         do {           
             System.out.println("Thu đô cua Vietnam la thanh pho nao ?");
             ans = input.nextLine();//Tạo nơi nhập dữ liệu
       } while (ans.equalsIgnoreCase("hanoi")==false);//equalsIgnoreCase giúp kiểm tra String(chữ) không quan tâm chữ (thường or hoa)
         System.out.println("Chuc mung ,ban da tra loi dung !");
    }
    
}
