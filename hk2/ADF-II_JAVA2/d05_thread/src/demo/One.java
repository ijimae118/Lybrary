/*
Day la 1 Thread in ra 1 gthong bao 20 lan
 */
package demo;

public class One extends Thread{

    @Override
    public void run(){
    //day la phong thuc cai dat nhiem vu cua 1 thread phai lam
        for (int i = 0; i < 20; i++) {
            try {
                System.out.println("\t I am Number One!");
                
                Thread.sleep(500); //500 mili giay=nua giay
            } catch (Exception ex) {
                System.out.println("loi:"+ex.getMessage());
            }
        }
    }
    
    
}
