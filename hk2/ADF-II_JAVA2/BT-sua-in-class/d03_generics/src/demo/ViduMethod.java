
package demo;

public class ViduMethod {

    String[] tensv = {"Phong", "Minh", "Thach","Lam","Thang"};
    int[] diem ={30,40,50,60, 70};
    
    //ham in ra ds ten sinh vien
    void display(String[] dsTen){
        for (String item : dsTen) {
            System.out.println(item);
        }
    }
    
    //ham in ra ds diem thi sinh vien
    void display(int[] dsDIEM){
        for (int item : dsDIEM) {
            System.out.println(item);
        }
    }
    
    
    public static void main(String[] args) {
        ViduMethod vd = new ViduMethod();
        
        System.out.println("\n Danh sach ten SV:");
        vd.display(vd.tensv);
        
        System.out.println("\n Bang diem: ");
        vd.display(vd.diem);
    }
    
}
