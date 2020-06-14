/*
 *Kiem thu cac doi tuong Student
 */
package demoStatic;

public class TestStudent {

    public static void main(String[] args) {
        Student sv1 = new Student();
        sv1.id = "student100";
        sv1.name = "Duong";
        sv1.mark = 90;
        //    Student.school="FPT-Aptech";

        Student sv2 = new Student("Student101", "Huy", 100);
        //Student.school = "Aptech";
        // in thong tin cua sinh vien
        System.out.println("Thong tin sinh vien");
        System.out.println("Sinh vien thu nhat: \n" + sv1.toString());
        System.out.println("Sinh vien thu hai: \n" + sv2.toString());
    }

}
