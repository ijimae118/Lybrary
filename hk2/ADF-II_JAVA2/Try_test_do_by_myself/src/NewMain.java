
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class NewMain {

    /**
     * @param args the command line arguments 
     **
     * int sum = 0; int number = 0; do{ number++; sum += number; if (sum>4) { break; } }while (number < 5);
       System.out.println(sum);
       System.out.println(number);
     **
     * 
     */
    public static void main(String[] args) {
            File a=new File("hello");
            a.mkdir();
    }

}
