/*
* Lop mo ta cau truc Sinh Vien, bao gom :
* thuoc tinh du lieu (Java_class:fields/C#:variable) :ma so ,ten ,nam sinh,gioi tinh
*ham xu ly (methods / C#:function): input():nhap liey; output():xuat du lieu
*/
package demo;
import java.util.Scanner;//thu vien nhap
public class Student {
    // khai bao cac thuoc tinh(variable/fields)
    public String id,name,gender;
    public int yob;
    public String passwork;
    
//2 cach nhap lieu default vs tham so:
    //ham khoi tao(contructor)-trung ten voi class - ko gia tri tra ve
    public Student(){//VD1:default--mac dinh cho bien
        id="sv00";name="vo danh";gender="nam";yob=1997; //Khong ghi default trc thi no tu auto cho thong tin 
    }
    
    // ham khoi tao co tham so [ms,ten,gender,yob]->[id,name,gender,yob]
    public Student(String ms,String ten,String gender,int yob){
            id= ms;//if để this. vao thi van nhu zay khong co gi thay doi
            name= ten;
            this.gender= gender;//if tham so vs bien trung nhau thi them (this.)
            this.yob= yob;//this la dai dien cho doi tuong[Student];
                           //this.yob ie. thuoc tinh [yob] cua [Student]
    }                     //trong khi do [yob] dong 26 ,chi la tham so (hinh thuc) cua ham khoi tao

    
/*
    Student(String sv100, String mai, String nu, int i, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/    
    
    
    // nhap thong tin cho tung sinh vien cu the
    public void input(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap ma so SV: ");
        id =sc.nextLine();
        System.out.print("Nhap ten SV: ");
        name =sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gender=sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        yob=sc.nextInt();// Int = Integer
    }
    // ham xuat thong tin sinh vien len man hinh:
    public void output(){
            System.out.println("***Thong tin sinh vien***: "+id);//
            System.out.println("ma so: "+id);
            System.out.println("ten: "+name);
            System.out.println("gioi tinh: "+gender);
            System.out.println("nam sinh: "+yob);
            System.out.println("pass: "+passwork);
    }
}
