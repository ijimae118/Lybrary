/*
 Mo ta cau truc du lieu cua 1 doi tuong nhan vien , bao gom:
fiel du lieu :ma so,luong cb,so ngay lam viec
phuong thuc xu ly:nhap ,xuat()
 */
package basic;

import java.util.Scanner;

public class Employee implements IPayable {

    public String id, name;
    public int salary, wdays;

    //ham dung
    public Employee() {
    }

    public Employee(String id, String name, int salary, int wdays) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.wdays = wdays;
    }

    // ham nhap
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma so: ");
        id = sc.nextLine().trim();
        System.out.print("nhap ho ten: ");
        name = sc.nextLine().trim();
        System.out.print("nhap luong co ban: ");
        salary = Integer.parseInt(sc.nextLine().trim());
        System.out.print("nhap so ngay lam viec: ");
        wdays = Integer.parseInt(sc.nextLine().trim());
    }

    @Override
    public float getSalary() {
        float temp = 0;//luong tam tinh
        temp = salary * wdays / 24.0f;
        if (wdays > 24) {
            temp += (salary / 24.0f * (wdays - 24) * OT);
        }
        return temp;
    }

    @Override
    public float getTax() {
        float temp = 0;
        if (getSalary() > 1000) {
            temp = getSalary() * 0.2f;
        } else if (getSalary() > 500) {
            temp = getSalary() * 0.1f;
        }
        return temp;
    }

    public void output() {
        System.out.println(">> bang luong nhan vien");
        System.out.println("id: " + id);
        System.out.println("ten: " + name);
        System.out.println("luong cb: " + salary);
        System.out.println("so ngay lam viec: " + wdays);
        System.out.println("luong thang:" + getSalary());
        System.out.println("thue thu nhap: " + getTax());
        System.out.println("thuc lanh: " + (getSalary() - getTax()));
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %.2f", id, name, getSalary() - getTax());
    }

}
