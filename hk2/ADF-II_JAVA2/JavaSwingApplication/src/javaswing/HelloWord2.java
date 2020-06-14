/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class HelloWord2 extends JFrame{

    public HelloWord2() throws HeadlessException {
        setTitle("Hello ;))");
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        HelloWord2 helloWord2 = new HelloWord2();
    }
}
