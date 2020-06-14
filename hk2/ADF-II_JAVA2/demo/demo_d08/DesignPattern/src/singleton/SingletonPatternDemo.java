/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author ThuyLM
 */
public class SingletonPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();
        //Get the only object available
        SingleObject o1 = SingleObject.getInstance();

        //show the message
        o1.showMessage();

        System.out.println("o1:" + o1);

        SingleObject o2 = SingleObject.getInstance();

        //show the message
        o2.showMessage();

        System.out.println("o1:" + o2);
    }

}
