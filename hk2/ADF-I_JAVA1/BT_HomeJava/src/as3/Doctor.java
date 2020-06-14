package as3;

import java.util.Scanner;

public class Doctor {

    String docNo, name, specification;
    int exp_years, salary;
//    ham dung khong tham so

    public Doctor() {
    }
//ham dung co tham so

    public Doctor(String docNo, String name, String specification, int exp_years, int salary) {
        this.docNo = docNo;
        this.name = name;
        this.specification = specification;
        this.exp_years = exp_years;
        this.salary = salary;
    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        //nhap ma so khong duoc de trong
        while (true) {
            System.out.print("enter doctor number: ");
            docNo = scanner.nextLine().trim();
            if (docNo.length() > 0) {
                break;//ket thuc vong lap
            }
            System.out.println("Ma BS ko duoc de trong vui long nhap lai!");
        }

        //nhap ten cua bac si
        while (true) {
            System.out.print("enter doctor name: ");
            name = scanner.nextLine().trim();
            if (name.length() > 0) {
                break;//ket thuc vong lap
            }
            System.out.println("Ten BS ko duoc de trong vui long nhap lai!");
        }

        //nahp chuyen khoa
        while (true) {
            System.out.print("enter doctor specification: ");
            specification = scanner.nextLine().trim();
            if (specification.length() > 0) {
                break;//ket thuc vong lap
            }
            System.out.println("Chuyen khoa ko duoc de trong vui long nhap lai!");
        }

        //so nam knh nghiem
        while (true) {
            System.out.print("enter doctor year experiment: ");
            exp_years = Integer.parseInt(scanner.nextLine().trim());
            if (exp_years >= 0) {
                break;//ket thuc vong lap
            }
            System.out.println("so nam kinh nghiem phai >= 0 !");
        }

        //nhap muc luong cb
        while (true) {
            System.out.print("enter doctor salary: ");
            salary = Integer.parseInt(scanner.nextLine().trim());
            if (salary >= 0) {
                break;//ket thuc vong lap
            }
            System.out.println("Muc luong phai >= 0 !");
        }
    }
    //ham print() in thong tin bac si
    public void print(){
        System.out.println("docNo: "+docNo);
        System.out.println("name: "+ name);
        System.out.println("specification: "+ specification);
        System.out.println("exp_years: "+exp_years);
        System.out.println("salary: "+salary);
    }

//    ham in ra ham so cap bac cua 1 bac si dua vao so nam kinh nghiem
    public void print(String id) {
        //kiem tra tham so ID voi docNo
        if (id.equals(docNo)) {
            if (exp_years >= 15) {
                System.out.println("Bac D");
            } else if (exp_years >= 10) {
                System.out.println("bac C");
            } else if (exp_years >= 5) {
                System.out.println("Bac B");
            } else {
                System.out.println("bac A");
            }
        } else {
            System.out.println(">> Ma so khong dung");
        }
    }

    //ham tinh va tra ve thu nhap trong thang
    public int print(int days) {
        //int income = 0;
        int allowance = 100;

        if (exp_years >= 15) {
            allowance = 1000;
        } else if (exp_years >= 10) {
            allowance = 600;
        } else if (exp_years >= 5) {
            allowance = 300;
        }
        int income = (salary * days) / 24 + allowance;
        return income;
    }
}
