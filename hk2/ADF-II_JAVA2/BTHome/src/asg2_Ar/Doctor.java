package asg2_Ar;

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
        while (true) {
            Pattern p = Pattern.compile("D\\d{2,4}");
            Matcher m = null;
            try {
                System.out.print("Enter id: ");
                id = sc.nextLine().trim();
                m = p.matcher(id);
                if (m.matches()) {
                    break;
                }
                System.out.println("id : Dxx[xx], với x là ký số - từ 2 đến 4 ký số");
            } catch (Exception e) {
                System.out.println("loi: " + e.getMessage());
            }
        }

        while (true) {
            Pattern p = Pattern.compile("[a-z A-Z]{2,}");
            Matcher m = null;
            try {
                System.out.print("Enter name: ");
                name = sc.nextLine().trim();
                m = p.matcher(name);
                if (m.matches()) {
                    break;
                }
                System.out.println("name : ít nhất 2 ký tự chữ hoặc khoảng trắng.");
            } catch (Exception e) {
                System.out.println("loi: " + e.getMessage());
            }
        }

        while (true) {
            Pattern p = Pattern.compile("(1|2|3){0,1}");
            Matcher m = null;
            try {
                System.out.print("Enter level: ");
                level = sc.nextLine().trim();
                m = p.matcher(level);
                if (m.matches()) {
                    break;
                }
                System.out.println("level : trình độ chuyên khoa: level 1, level 2, level 3 hoặc để trống.");
            } catch (Exception e) {
                System.out.println("loi: " + e.getMessage());
            }
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
