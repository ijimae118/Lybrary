/*
List vs Set chỉ chứa giá trị, trong khi Map chứa cặp key và value. 
*Tao cau truc map chua bang danh sach ma so va ten sinh vien
HashSet chỉ chứa giá trị, trong khi HashMap chứa cặp key và value.
HashMap duy trì không có thứ tự, trong khi TreeMap duy trì thứ tự tăng dần.
HashMap là KHÔNG synchronized.HashMap có thể chứa một khóa null và nhiều giá trị null.
Hashtable là synchronized.Hashtable không thể chứa bất kỳ khóa null hoặc giá trị null.
 */
import java.util.*;

class Sinhvien {

    public String id, name;
    public int mark;

    public Sinhvien() {
    }

    public Sinhvien(String id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%d", id, name, mark);
    }

}

public class Vidu1 {

    public static void main(String[] args) {

        Sinhvien[] ds = {
            new Sinhvien("s1", "Le Minh", 100),
            new Sinhvien("s7", "Anh Tuan", 70),
            new Sinhvien("s13", "Hoanh Hai", 80),
            new Sinhvien("s4", "Van Long", 50),
            new Sinhvien("s2", "Van Chinh", 30),
            new Sinhvien("s2", "Van Chinh", 30),
            new Sinhvien("s2", "Tu Hai", 35)
        };
        
        // tao map chua ds sinh vien
        Map ds1 = new HashMap();
        for (Sinhvien item : ds) {
            ds1.put(item.id, item);// key,values
        }

        //in ds sinh vien
        System.out.println("Dang sach sinh vien [array DS]");
        for (Sinhvien sv : ds) {
            System.out.println(sv);
        }
        System.out.println("Dang sach sinh vien [hashmap DS1]");
        for (Object sv : ds1.values()) {
            System.out.println(sv);
        }
    }

}
