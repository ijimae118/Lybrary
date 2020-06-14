/*
Mo ta bang nhan vien trong CSDL
 */
package model;

import java.util.Scanner;
import java.util.regex.*;

public class Employee {

    public String id;           //Exxxx
    public String fullname;     //tu 2-30 ky tu chu, hoac khoang trang
    public boolean gender;
    public int salary;          //tu 100-20000

    public void input() {
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("E\\d{1,4}");
        Matcher m = null;
        while (true) {
            System.out.print("Nhap id nhan vien: ");
            id = sc.nextLine().trim();
            m = p.matcher(id);
            if (m.matches()) {
                break;
            }
            System.out.println("ID ko hop le (Exxxx)");
        }

        p = Pattern.compile("[a-z ]{2,30}", Pattern.CASE_INSENSITIVE);
        while (true) {
            System.out.print("Nhap ten nhan vien: ");
            fullname = sc.nextLine().trim();
            m = p.matcher(fullname);
            if (m.matches()) {
                break;
            }
            System.out.println("ten ko hop le (2 den 30 ky tu)");
        }

        p = Pattern.compile("(Nam|Nu)", Pattern.CASE_INSENSITIVE);
        String tam = "";
        while (true) {
            System.out.print("Nhap gioi tinh: ");
            tam = sc.nextLine().trim();
            m = p.matcher(tam);
            if (m.matches()) {
                gender = tam.toLowerCase().equals("nam");
                break;
            }
            System.out.println("gioi tinh ko hop le (Nam|Nu)");
        }

        while (true) {
            try {
                System.out.print("Nhap luong nhan vien: ");
                salary = Integer.parseInt(sc.nextLine().trim());
                if (salary >= 100 && salary <= 20000) {
                    break;
                }
                throw new Exception("Luong ko hop le[100-20000]");
            } catch (Exception e) {
                System.out.println("Loi: " + e.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %d", id, fullname, (gender ? "nam" : "nu"), salary);
    }

}
