/*
 *Hien thuc vai tro cua 1 thread:in ra 1 thong bao 30 lan
 */
package demo;

/**
 *
 * @author PC
 */
public class Two implements Runnable {

    @Override
    public void run() {
        //day la phong thuc cai dat nhiem vu cua 1 thread phai lam
        for (int i = 0; i < 20; i++) {
            try {
                System.out.println("\t I am Number Two!!!");

                Thread.sleep(200); 
            } catch (Exception ex) {
                System.out.println("loi:" + ex.getMessage());
            }
        }
    }

}
