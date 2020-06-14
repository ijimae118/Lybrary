/*
* Mo ta cau truc du lieu cua 1 doi tuong cong nhan ,bao gom 
* Field du lieu ma so, ho ten ,luong can ban ,so ngay lam viec,thoi vu(part time) 
* phuong thuc xu ly : nhap(),xuất();
*/
package basic;

import java.util.Scanner;

public class Worker implements IPayable{
    public String id,name;
    public int salary ,wdays;
    public boolean partime;

    public Worker() {
    }
    
    public Worker(String id, String name, int salary, int wdays, boolean partime) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.wdays = wdays;
        this.partime = partime;
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
        System.out.println("Hop dong thoi vu(y/n)?: ");
        partime=sc.nextLine().trim().equalsIgnoreCase("y");
    }

    @Override
    public float getSalary() {
        return salary*wdays/24.0f;
    }

    @Override
    public float getTax() {
        float temp =0;
        if(partime==false && getSalary()>500){
        temp =getSalary()*0.1f;
        }
        return temp;
    }
    
    public void output(){
        System.out.println(">> bang luong cong nhan");
        System.out.println("id: "+id);
        System.out.println("ten: "+name);
        System.out.println("luong cb: "+salary);
        System.out.println("so ngay lam viec: "+wdays);
        System.out.println("thoi vu: "+partime);
        System.out.println("luong thang:"+getSalary());
        System.out.println("thue thu nhap: "+getTax());
        System.out.println("thuc lanh: "+(getSalary()-getTax()));
    }

   @Override
    public String toString() {
        return String.format("%s, %s, %.2f", id, name, getSalary()-getTax());
    }  
}

