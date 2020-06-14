/*
 * Demo lambda ket hop Internal Runnable trong lap trinh thread
 */
package Lambda;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Vidu3 {

    public static void main(String[] args) {
        // cach viet ham an danh 
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                //dat ten thread la vo danh
                Thread.currentThread().setName("Vo Danh");

                for (int i = 0; i < 10; i++) {
                    try {
                        System.out.printf(" Thread %s - ", Thread.currentThread().getName());
                        System.out.println("count:" + i);
                        Thread.sleep(400);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        };//ket thuc t1

        // cach viet theo dang lambda rut gon cua bt lambda
        Runnable t2 = () -> {
            //dat ten thread la vo danh
            Thread.currentThread().setName("Lambda");

            for (int i = 0; i < 10; i++) {
                try {
                    System.out.printf(" Thread %s - ", Thread.currentThread().getName());
                    System.out.println("count:" + i);
                    Thread.sleep(250);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };//ket thuc t2

        //cho thread t1,t2 thi hanh
        Thread td1 = new Thread(t1);
        Thread td2 = new Thread(t2);
        td1.start();
        td2.start();
    }

}
