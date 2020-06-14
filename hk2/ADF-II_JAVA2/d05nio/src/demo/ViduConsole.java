/*
 * Chay = cmd .
 */
package demo;

/**
 *
 * @author PC
 */
public class ViduConsole {


    public static void main(String[] args) {
       java.io.Console cs= System.console();
       cs.printf("Nhap tai khoan dang nhap: ");
       String s=cs.readLine();
       
       cs.printf("Nhap password: ");
       String pw=new String (cs.readPassword());
       
       cs.printf("\n Tai Khoan: %s",s);
       cs.printf("\n Tai Khoan: %s \n",pw);
    }
    
}
