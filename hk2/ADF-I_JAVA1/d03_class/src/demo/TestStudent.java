/*
 * Kiem thu chuc nang hoat dong cua class Student
 */
package demo;

public class TestStudent {

    public static void main(String[] args) {
        //tao 1 bien doi tuong [sv] kieu Student 
        Student sv = new Student();
        sv.input();


        //tao tiep bien doi tuong 2 [sv2] kieu Student 
        Student sv2 = new Student();
        sv2.input();
        // tao bien doi tuong thu 3 [sv3] ,kieu [Student] thong va default--mac dinh 
        Student sv3 = new Student();
        // tao  bien doi tuong thu 4 [sv4] ,kieu [Student] thong va tham so
        Student sv4 =  new Student("sv100","Mai","nu",1992);
        
        //xuat thong tin cua sinh vien
        
        sv.output();
        sv2.output();
        sv3.output();
        sv4.passwork="123";
        sv4.output();
    }

}
