package demo;

public class ViduMethodGeneric {

    String[] tensv = {"Phong", "Minh", "Thach", "Lam", "Thang"};
    Integer[] diem = {30, 40, 50, 60, 70};

    //ham in ra ds du lieu(by tham so T,ds vs bien item)
    <T> void display(T[] ds) {
        for (T item : ds) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        ViduMethodGeneric vd = new ViduMethodGeneric();
        System.out.println("\n Danh sach ten sinh vien: ");
        vd.display(vd.tensv);
        
        System.out.println("\n Bang diem sinh vien: ");
        vd.display(vd.diem);
        
    }

}
