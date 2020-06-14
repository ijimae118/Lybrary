/*
 *Demo ve 1 so chuc nang cua java.time
 */
package timeAPI;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import static timeAPI.Demo.localDate;

public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String op = null;

        while (true) {
            System.out.println("\n  === DEMO java.time ===");
            System.out.println("1. LocalDate");
            System.out.println("2. LocalDateTime");
            System.out.println("3. monthDay");
            System.out.println("4. offsettime");
            System.out.println("5. Period");
            System.out.println("6. Temporal");
            System.out.println("7. SimpleDateFormat");
            System.out.println("10. Thoat");

            System.out.print("Vui long nhap [1-10]: ");
            op = sc.nextLine().trim();
            switch (op) {
                case "1":
                    localDate();
                    break;
                case "2":
                    localDateTime();
                    break;
                case "3":
                    monthDay();
                    break;
                case "4":
                    offsetTime();
                    break;
                case "5":
                    period();
                    break;
                case "6":
                    temporal();
                    break;
                case "7":
                    dateFormat();
                    break;
                case "10":
                    return;
            }
        }

    }

    static void localDate() {
        LocalDate o = LocalDate.now();

        System.out.println("Local Date: " + o);
        System.out.println("Next 34 days : " + o.plusDays(34));
        System.out.println("Previous 14 days: " + o.minusDays(14));

    }

    static void localDateTime() {
        LocalDateTime d = LocalDateTime.of(2000, 7, 21, 8, 30);//cho cố định t/g
        System.out.println("Local date time : " + d);
        System.out.println("next 112 minutes: " + d.plusMinutes(112));
    }

    static void monthDay() {
        MonthDay md1 = MonthDay.now();
        System.out.println("Month ,Day of today: " + md1);

        MonthDay md2 = MonthDay.of(10, 8);//sinh nhat chuan :ngày 8 tháng 10
        if (md1.equals(md2)) {
            System.out.println("Chuc mung,hom nay sinh nhat chuan!");
        } else {
            System.out.println("Buon ,hom nay ko co su kien gi het!!!");
        }
    }

    static void offsetTime() {
        OffsetTime t = OffsetTime.now();
        System.out.println("OffsetTime: " + t);
    }

    static void period() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay sinh cua ban: ");
        System.out.print("ngay: ");
        int d = Integer.parseInt(sc.nextLine().trim());
        System.out.print("thang: ");
        int M = Integer.parseInt(sc.nextLine().trim());
        System.out.print("nam: ");
        int y = Integer.parseInt(sc.nextLine().trim());

        LocalDate bd = LocalDate.of(y, M, d);// ngay sinh cua ban
        LocalDate today = LocalDate.now();// ngay hom nay

        LocalDate bd2 = bd.withYear(today.getYear());//ngay sinh nhat cua ban trong nam nay
        if (bd2.isBefore(today) || bd2.equals(today)) {
            //ngay sinh nhat da qua or la ngay hom nay
            bd2 = bd2.plusYears(1);
        }
        Period p = Period.between(today, bd2);// tinh khoang cach t/g giua ngay homnay va ngay sinh nhat sap toi cua ban
        System.out.println("Ngay sinh nhat trong nam:" + bd2);
        System.out.printf("\n Còn %d tháng ,%d ngày nua la den sinhn nhat cua ban! \n", p.getMonths(), p.getDays());
        System.out.printf("\n Chinh xac la cho %d ngay nua !", ChronoUnit.DAYS.between(today, bd2));
    }

    static void temporal() {
        LocalDate today = LocalDate.now();
        LocalDate examDate = today.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println("Ngay thi ADF-I: " + examDate);
    }

    static void dateFormat() {
        java.util.Date today = new java.util.Date();
//LocalDate today= LocalDate.now();
        System.out.println("today is: " + today);
        java.text.SimpleDateFormat sdf = new SimpleDateFormat("dd,MM,YY");
        System.out.println("today is:" + sdf.format(today));

    }

}
//year().isleap :năm nhuận.
