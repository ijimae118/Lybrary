/*
 *  * MInh Hoa phuong phap truyen so cho chuong phuong thuc
 */
package demoMethod;

public class Vidu1 {
    public static void main(String[] args) {
        int n = 5;
        Vidu1 o = new Vidu1();
        o.binhphuong(n); //n: tham so thuc te
        // sau khi goi ham binhpuong, n = ?
        System.out.println("\n >> Sau khi goi ham binhphuong(n), n = " + n);
        System.out.println("n = " + n);
        
        
        o.binhphuong(7); //7: tham so thuc te
        o.binhphuong(n + 4); //n+4: tha so thuc te
    }
    //tinh va in ra binh phuong cua 1 so nguyen n
    //day la phuong phap truyen tham so theo kieu truyen gia tri
    void binhphuong(int n) {
        // n la tham so hinh thuc : bien cuc bo cua ham
        n = n * n;
        System.out.println("Binh Phuong : " + n);
    }
}
    
    

