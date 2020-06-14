/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asg1_Ar;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author PC
 */
public class Product {

    public String id, name, mfg;
    public int unitPrice, qoh;

    public Product() {
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            Pattern p = Pattern.compile("[FB]\\d{4}");
            Matcher m;
            try {
                System.out.print("Enter Id: ");
                id = sc.nextLine().trim();
                m = p.matcher(id);
                if (m.matches()) {
                    break;
                }
                throw new InvalidException("id : Fxxxx (food) hoặc Bxxxx (beverage), với x là ký số.");
            } catch (Exception e) {
                System.out.println("loi: " + e.getMessage());
            }

        }

        while (true) {
            Pattern p1 = Pattern.compile("[a-zA-Z ]{2,}", Pattern.CASE_INSENSITIVE);
            Matcher m1;
            try {
                System.out.print("Enter Name: ");
                name = sc.nextLine().trim();
                m1 = p1.matcher(name);
                if (m1.matches()) {
                    break;
                }
                throw new InvalidException("it nhat 2 ky tu");
            } catch (Exception e) {
                System.out.println("loi: " + e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Enter unitPrice: ");
                unitPrice = Integer.parseInt(sc.nextLine().trim());
                if (unitPrice > 0) {
                    break;
                }
                throw new InvalidException("unitPrice > 0!!!");
            } catch (InvalidException | NumberFormatException e) {
                System.out.println("loi: " + e.getMessage());
            }

        }

        while (true) {
            try {
                System.out.print("Enter qoh: ");
                qoh = Integer.parseInt(sc.nextLine().trim());
                if (qoh > 0) {
                    break;
                }
                throw new InvalidException("qoh > 0!!!");
            } catch (Exception e) {
                System.out.println("loi: " + e.getMessage());
            }

        }

        while (true) {
            Pattern p2 = Pattern.compile("(US|VN|TL)", Pattern.CASE_INSENSITIVE);
            Matcher m2;
            try {
                System.out.print("Enter mfg: ");
                mfg = sc.nextLine().trim();
                m2 = p2.matcher(mfg);
                if (m2.matches()) {
                    break;
                }
                throw new InvalidException("mfg: US hoặc VN hoặc TL");
            } catch (InvalidException e) {
                System.out.println("loi: " + e.getMessage());
            }
        }

    }

    public void print() {
        System.out.println("id: " + id);
    }

    public String standardlizeMFG() {
        if ("US".equalsIgnoreCase(mfg)) {
            return mfg.replaceAll("(US|us|Us|uS)", "United State");
        } else if ("VN".equalsIgnoreCase(mfg)) {
            return mfg.replaceAll("(VN|vn|Vn|vN)", "Vietnam");
        } else {
            return mfg.replace("(TL|tl|Tl|tL)", "Thailand");
        }

    }

    @Override
    public String toString() {
        return String.format("id: %s,name: %s,mfg: %s,unitPrice: %d,qoh: %d", id, name, standardlizeMFG(), unitPrice, qoh);
    }

}
