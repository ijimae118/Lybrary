/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package As3_1;

import java.util.Scanner;

public class Doctor2 {
    //field du lieu 

    public String docNo, name, specification;
    public int exp_years, salary;

    //ham dung ko tham so
    public Doctor2() {
        docNo = "00";
        name = "Default";
        specification = "No";
        exp_years = 1;
        salary = 1;
    }

    public Doctor2(String docNo, String name, String specification, int exp_years, int salary) {
        this.docNo = docNo;
        this.name = name;
        this.specification = specification;
        this.exp_years = exp_years;
        this.salary = salary;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        //nhap ma so - kt ko dc de trong
        while (true) {
            System.out.print(" >> nhap ma so BS: ");
            docNo = sc.nextLine().trim();
            if (docNo.length() > 0) {
                break; //ket thuc vong lap : nhap dung
            }
            System.out.println("Ma BS ko dc de trong !");
        }
        while (true) {
            System.out.println(">>Nhap ten BS: ");
            name = sc.nextLine().trim();
            if (name.length() > 0) {
                break;//Ket thuc vong lap :nhap dung
            }
            System.out.println("Ten BS ko dc de trong!");
        }
        //nhap chuyen khoa-kt ko dc de trong
        while (true) {
            System.out.println(">>Nhap chuyen khoa: ");
            specification = sc.nextLine().trim();
            if (specification.length() > 0) {
                break;//ket thuc vong lap nhap dung
            }
            System.out.println("Chuyen khoa ko dc de trong");
        }
        while (true) {
            System.out.print(" >> nhap so nam kinh nghiem: ");
            exp_years = Integer.parseInt(sc.nextLine().trim());
            if (exp_years >= 0) {
                break; //ket thuc vong lap : nhap dung
            }
            System.out.println("So nam KN phai >= 0 !");
        }

        //nhap muc luong CB - kt ko dc < 0
        while (true) {
            System.out.print(" >> nhap luong CB: ");
            salary = Integer.parseInt(sc.nextLine().trim());
            if (salary >= 0) {
                break; //ket thuc vong lap : nhap dung
            }
            System.out.println("Luong CB phai >= 0 !");
        }

    }

    //ham in ra hệ số cấp bậc của bác sĩ dua vao so nam kn
    public void print(String id) {
        //kiem tra tham so id voi ma so bac si
        if (id.equals(docNo)) {
            if (exp_years >= 15) {
                System.out.println("Bac D");
            } else if (exp_years >= 10) {
                System.out.println("Bac C");
            } else if (exp_years >= 5) {
                System.out.println("Bac B");
            } else {
                System.out.println("Bac A");
            }
        } else {
            System.out.println(">> Ma so ko dung !");
        }
    }
    //ham  tính và trả về thu nhập trong tháng

    public int print(int days) {
        int income = 0;
        int allowance = 100;
        if (exp_years >= 15) {
            allowance = 1000;
        } else if (exp_years >= 10) {
            allowance = 600;
        } else if (exp_years >= 5) {
            allowance = 300;
        }
        income = (salary * days) / 24 + allowance;
        return income;
    }

}
