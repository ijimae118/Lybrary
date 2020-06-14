package demo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ViDuThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("So luong thread: " + Thread.activeCount());
        System.out.println("ten thread hien tai: " + Thread.currentThread().getName());

        //tao ra thread thu 2 trong ct
        Thread t2 = new One();
        //tao thread thu 3 trong ct
        Thread t3 = new Thread(new Two());
        // tao ra thread thu 4 
        Runnable r= ()->{
            for (int i = 0; i < 50; i++) {
                try {
                System.out.printf("I am Daemon Thread\n",i+1);
                Thread.sleep(250);
                } catch (InterruptedException ex) {
                    System.out.println("loi:"+ex.getMessage());
                }             
            }
        };
        Thread t4 = new Thread(r);
        t4.setDaemon(true);
        // cho t2 va t3 chay
        t2.start();
        t3.start();
        t4.start();
        
        //while(t2.isAlive()||t3.isAlive()); //Cach1
        try {// Cach 2
            
            t2.join();
            t3.join();
          
        } catch (InterruptedException ex) {
            System.out.println("loi:"+ex.getMessage());
        }
        // ap dung 2 cách tren de phong toa cac lenh duoi cua main
        //in thong bao ket thuc chuong trinh
        System.out.println("\n ***Ket thuc chuong trinh_Game Over***");
    }

}
