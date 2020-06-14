/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

import javax.swing.JFrame;
/**
 *
 * @author PC
 */
public class HelloSwing {

    public HelloSwing() {
     JFrame frame = new JFrame("Hello :)) ");
     frame.setSize(400,400);
     frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        //HelloSwing h= new HelloSwing();
        new HelloSwing();
    }
}
