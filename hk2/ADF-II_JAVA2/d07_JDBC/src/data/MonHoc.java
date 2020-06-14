package data;

import java.util.Scanner;

public class MonHoc {

    public int ma, soTiet;
    public String tenNgan, tenDai;

    public MonHoc() {
    }

    @Override
    public String toString() {
        return String.format("%4d,%-5s,%-30s,%3d", ma, tenNgan, tenDai, soTiet); //To change body of generated methods, choose Tools | Templates.
    }

    public void input() {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin cho 1 lop hoc: ");
        while (true) {
            System.out.println("Nhap ten viet tat: ");
            tenNgan = sc.nextLine().trim();
            if (tenNgan.length() >= 2 && tenNgan.length() <= 5) {
                break;
            }
            System.out.println("Ten ko hop le ,tu [2-5] ky tu !");
        }
        while (true) {
            System.out.println("Nhap ten day du: ");
            tenDai = sc.nextLine().trim();
            if (tenDai.length() >= 2 && tenDai.length() <= 50) {
                break;
            }
            System.out.println("Ten ko hop le ,tu [2-50] ky tu !");
        }
        while (true) {
            try {
                System.out.println("Nhap so tiet hoc tu [4-60]: ");
                soTiet = Integer.parseInt(sc.nextLine().trim());
                if (soTiet >= 4 && soTiet <= 60) {
                    break;
                }
                System.out.println("So tiet hoc ko hop le ,tu [4-60] !");
            } catch (Exception e) {
                System.out.println("loi: "+e.getMessage());
            }

        }
    }

}
