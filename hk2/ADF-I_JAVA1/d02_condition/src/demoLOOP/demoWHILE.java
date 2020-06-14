/*
*Demo vong lap DO-WHITE
*tra loi cau hoi "Thu do cua VN la thp?"
*neu dung ->cam on , if sai yeu cau tra loi lai.
*/
package demoLOOP;

import java.util.Scanner;//*chon tat ca thu vien

public class demoWHILE {

    public static void main(String[] args) {
     Scanner enter = new Scanner(System.in);
     String traloi="";
     
        while (true) {            
            System.out.print("Thu do cua VN o dau ?");
            traloi = enter.nextLine().trim();
            if(traloi.equalsIgnoreCase("hanoi")){
                break;//dung roi -> thoat vong lap
            }
            System.out.println("ko dung, vui long tra loi lai!!!");
        }
        System.out.println("Chuc mung ,ban tra loi dung roi!");
    }
    
}
