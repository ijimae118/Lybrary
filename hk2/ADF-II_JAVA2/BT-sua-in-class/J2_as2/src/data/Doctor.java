/*
Các fields dữ liệu:
i. String id, name, level
ii. int exp_years
b. Các contructors để khởi tạo giá trị ban đầu cho các field dữ liệu.
c. Method :
* void input() : nhập chi tiết bác sĩ và kiểm tra dữ liệu hợp lệ như sau :
- id : Dxx[xx], với x là ký số - từ 2 đến 4 ký số.
- name : ít nhất 2 ký tự chữ hoặc khoảng trắng.
- level : trình độ chuyên khoa: level 1, level 2, level 3 hoặc để trống.
- exp_years: số năm kinh nghiệm , từ 0 - 60
 String toString() : override method này để biểu diễn nội dung của 1 đối tượng bác sĩ dưới dạng
chuỗi.
 */
package data;

import java.util.Scanner;
import java.util.regex.*;

public class Doctor {

    public String id, name, level;
    public int exp_years;

    public Doctor() {
    }

    public Doctor(String id, String name, String level, int exp_years) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.exp_years = exp_years;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        
        // nhap ma so
        /*
        Pattern p = Pattern.compile("D\\d{2,4}");
        Matcher m= null;
        while(true){
            System.out.print(" nhap ma so : ");
            id = sc.nextLine().trim();
            
            m= p.matcher(id);
            if(m.matches()){
                break;
            }
            System.out.println(" ma so ko hop le: Dxx[xx] !");
        }
        */
        Pattern p = null;
        while(true){
            System.out.print(" nhap ma so : ");
            id = sc.nextLine().trim();           
            
            if(Pattern.matches("D\\d{2,4}", id)){
                break;
            }
            System.out.println(" ma so ko hop le: Dxx[xx] !");
        }
        
        //nhap ten
        while(true){
            System.out.print(" nhap ten : ");
            name = sc.nextLine().trim();           
            
            if(Pattern.matches("[a-z A-Z]{2,}", name)){
                break;
            }
            System.out.println(" ten ko hop le!");
        }
        
        //nhap trinh do chuyen khoa
        while(true){
            System.out.print(" nhap trinh do chuyen khoa : ");
            level = sc.nextLine().trim().toUpperCase();           
            
            if(level.isEmpty() || Pattern.matches("LEVEL [123]", level) ){
                break;
            }
            System.out.println(" CK ko hop le: level 1,2,3");
        }
        
        //nhap so nam kinh nghiem
        while(true){
            try {
                System.out.print("nhap so nam kinh nghiem [0-60]: ");
                exp_years = Integer.parseInt(sc.nextLine().trim());
                if(exp_years>=0 && exp_years<=60){
                    break;
                }
                
            } catch (Exception e) {
                System.out.println("Loi: " + e.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %d", id, name, level, exp_years);
    }
}
