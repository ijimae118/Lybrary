package data;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Doctor {

    public String id, name, level;
    public int exp_year;

    public Doctor() {
    }

    public Doctor(String id, String name, String level, int exp_year) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.exp_year = exp_year;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        /*        Pattern p = Pattern.compile("D\\d{2,4}");
        Matcher m = null;

        while (true) {
                System.out.print("Enter ma so: ");
                id = sc.nextLine().trim();
               
                m = p.matcher(id);
                if (m.matches()) {
                    break;
                }
                System.out.println("id : Dxx[xx], với x là ký số - từ 2 đến 4 ký số");
        }
         */
        
//        Pattern p = null;
        while (true) {
            System.out.print("Enter ma so: ");
            id = sc.nextLine().trim();

            if (Pattern.matches("D\\d{2,4}", id)) {
                break;
            }
            System.out.println("id : Dxx[xx], với x là ký số - từ 2 đến 4 ký số");
        }

        //nhap ten
        while (true) {
            System.out.print("Enter ten: ");
            name = sc.nextLine().trim();

            if (Pattern.matches("[a-z A-z]{2,}", name)) {
                break;
            }
            System.out.println("name : ít nhất 2 ký tự chữ hoặc khoảng trắng.");
        }

        // nhap trinh do chuyen khoa
        while (true) {
            System.out.print("Enter level: ");
            level = sc.nextLine().trim().toUpperCase();

            if (level.isEmpty() || Pattern.matches("LEVEL [123]", level)) {
                break;
            }
            System.out.println("level : trình độ chuyên khoa: level 1, level 2, level 3 hoặc để trống.");
        }

        while (true) {
            try {
                System.out.print("Enter exp_years: ");
                exp_year = Integer.parseInt(sc.nextLine().trim());
                if (exp_year >= 0 && exp_year <= 60) {
                    break;
                }
                System.out.println("exp_years: số năm kinh nghiệm , từ 0 - 60");

            } catch (Exception e) {
                System.out.println("loi: " + e.getMessage());
            }
        }

    }
    
    @Override
    public String toString() {
        return String.format("id= %s name= %s level= %s int= %d", id, name, level, exp_year);
    }
    
}
