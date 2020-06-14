/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import basic.*;
public class Test {

    public static void main(String[] args) {
       Employee e1 = new Employee();
       e1.input();
       
       Worker w1 =new Worker();
       w1.input();
       
       e1.output();
       w1.output();
    }
    
}
