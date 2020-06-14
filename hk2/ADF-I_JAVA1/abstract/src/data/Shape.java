/*
 * Day la 1 lop truu tuong mo ta cau truc 1 doi tuong hinh hoc tong quat
co 2 ham trinh dien tich va tinh chu vi
--Method--lop cha--
 */
package data;

public abstract class Shape {// cau truc cha 

//    public abstract String name();

    //ham tinh dien tich
    public abstract double getArea();
    //ham tinh chu vi

    public abstract double getPeripheral();

    // ham truu tuong nhap du lieu cho 1 doi tuong hinh hoc
    public abstract void input();

    // ham in tra dien tich va chu vi cua 1 doi tuong hinh hoc
    public void output() {
//      System.out.printf("Hinh %s:\n", name());
        System.out.printf("Dien tich: %.2f \n", getArea());
        System.out.printf("Chu vi: %.2f \n", getPeripheral());
    }
}
