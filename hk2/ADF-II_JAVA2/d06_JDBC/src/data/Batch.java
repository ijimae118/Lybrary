/*
class mo ta cau truc cua 1 lop hop(cau truc tuong tu bang tbBatch trong database [sem2_demo])
 */
package data;

import java.util.Scanner;

public class Batch {

    public String maLop, chuongTrinh;
    public int hocPhi;

    public void input() {
        java.util.Scanner sc = new Scanner(System.in);
        // nhap ma lop ,4 ky so bat ky
        while (true) {
            System.out.print("nhap ma lop(4 ky so): ");
            maLop = sc.nextLine().trim();
            if (java.util.regex.Pattern.matches("\\d{4}", maLop) == true) {
                break;
            }
            System.out.println(">> Ma lop ko hop le.Vui long nhap lai !");
        }

        // nhap ten lop hoc ,toi da 20 ky tu
        while (true) {
            System.out.print("nbap ten chuong trinh (tu 3-20 ky tu): ");
            chuongTrinh = sc.nextLine().trim();
            if (chuongTrinh.length() >= 3 && chuongTrinh.length() <= 20) {
                break;
            }
            System.out.println(">> chuong trinh ko hop le.Vui long nhap lai !");
        }

        //nhap hoc phi >=100 va <=10000
        while (true) {
            try {
                System.out.print("nhap hoc phi [100-10000]: ");
                hocPhi = Integer.parseInt(sc.nextLine().trim());
                if (hocPhi >= 100 && hocPhi <= 10000) {
                    break;
                }
                System.out.println(">> hoc phi ko hop le.Vui long nhap lai !");
            } catch (Exception e) {
                System.out.println("loi: " + e.getMessage());
            }
        }
        
        
    }

    @Override
    public String toString() {
        return String.format("%-5s,%-20s,%5d", maLop, chuongTrinh, hocPhi);
    }

}
