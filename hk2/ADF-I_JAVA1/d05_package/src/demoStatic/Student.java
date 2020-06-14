/*
 * Tao ra 1 class mo ta sinh vien 
fiel:ma so ,ten ,diem thi,ma lop hoc,ten truong
*/
package demoStatic;

public class Student {
    public String id, name;
    public int mark;
    public static String school="Aptech";
    
    public Student() {
    }
    
    public Student(String id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
    
    //override phuong thuc toString() de bieu dien du lieu cua 1 doi tuong duoi dang 1 chuoi 1 ky tu
    @Override
    public String toString() {
        return String.format("%s, %s, %d, %s", id, name, mark,school);
    }
    
   
}