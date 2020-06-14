/*
Viết chương trình Java quản lý đối tượng bác sĩ theo hướng dẫn sau
1. Tạo project As3
2. Tạo Java Class, Doctor (Doctor.java) với cấu trúc như sau :
a. Fields dữ liệu : docNo, name, specification (string), exp_years, salary (int)
b. Hàm dựng: khởi trị ban đầu cho các field dữ liệu, bao gồm hàm dựng
i. Không tham số Doctor()
ii. Có tham số Doctor(String, String, String, int, int)
c. Phương thức:
i. void input () : nhập dữ liệu chi tiết của 1 bác sĩ . Yêu cầu kiểm tra tính hợp lệ
của dữ liệu: docNo, name, specification -ko được để trống, exp_years, salary
phải lớn hơn 0
ii. void print() : in các thông tin chi tiết của 1 bác sĩ ra màn hình
iii. void print(String id) : in ra hệ số cấp bậc của bác sĩ có mã số là id,
dựa vào số năm kinh nghiệm (exp_years) như sau :
1. ‘D’ nếu số năm kn >=15 năm
2. ‘C’ nếu số năm kn >=10 năm và nhỏ hơn <15 năm
3. ‘B’ nếu số năm kn >=5 năm và nhỏ hơn <10 năm
4. ‘A’ nếu số năm kn <5 năm
Lưu ý, chương trình sẽ thông báo lỗi nếu mã số id ko đúng.
iv. int print(int days): tính và trả về thu nhập trong tháng của bác sĩ dựa vào số
ngày làm việc (days) và số năm kinh nghiệm theo công thức sau :
income = (salary * days)/24 + allowance (phụ cấp cấp bậc) ,
với allowance = 1000 nếu số năm kn >=15 năm

600 nếu số năm kn >=10 năm và nhỏ hơn <15 năm
300 nếu số năm kn >=5 năm và nhỏ hơn <10 năm
100 nếu số năm kn <5 năm

3. Tạo lớp kiểm thử Java Main Class, DoctorTest.java , bao gồm 2 phương thức :
a. menu() : tạo thực đơn để thực hiện các chức năng :
1. nhập thông tin bác sĩ, 2. xuât thông tin bác sĩ, 3. in cấp bậc, 4. Nhập số ngày làm
việc và tính thu nhập, 5. Thoát
b. main() : gọi phương thức menu() để thi hành chương trình.

4. Biên dịch và thi hành chương trình.
 */
package As3_1;

import java.util.Scanner;

public class Doctor {
    //field du lieu 
    public String docNo, name, specification;
    public int exp_years, salary;
    Scanner in = new Scanner(System.in);
    //ham dung ko tham so
    public Doctor() {
        docNo = "00";
        name = "Default";
        specification = "No";
        exp_years = 1;
        salary = 1;
    }
    //ham dung co tham so
    public Doctor(String no, String name, String spe, int years, int money) {
        docNo = no;
        this.name = name;// (this.) de bien name ->xanh 
        specification = spe;
        exp_years = years;
        salary = money;
    }
   

    void input() {
        do{
        System.out.print("\nMoi nhap docNo: ");
        docNo = in.nextLine();
        System.out.print("\nMoi nhap name: ");
        name = in.nextLine();
        System.out.print("\nMoi nhap specification: ");
        specification = in.nextLine();
        System.out.print("\nMoi nhap exp_years: ");
        exp_years = in.nextInt();
        System.out.print("\nMoi nhap salary: ");
        salary=in.nextInt();// nextInt tự tao 1 dòng enter xuống hàng nên đẩy hàng nextLine() xuống
         in.nextLine();// để cân bằng lại do ko nhập đc khi làm vòng lặp ta phải tạo thêm nextLine cho cân bằng lại.
//       in.nextLine();
//       in.nextLine();
        }while(docNo.length() == 0 || name.length()==0 || specification.length()==0 || exp_years<=0 || salary<=0);
        
        
    }

    void print() {
          System.out.println("***InFo Doctor***");
          System.out.println("docNo: "+docNo);
          System.out.println("name: "+name);
          System.out.println("specification: "+specification);
          System.out.println("exp_years: "+exp_years);
          System.out.println("salary: "+salary);
    }
    
    void print(String id){
        id=docNo;
    if(exp_years>=15){
            System.out.println("level: D");
        }else if(10<=exp_years&& exp_years<15){
            System.out.println("level: C");
        }else if(5<=exp_years && exp_years<10){
            System.out.println("level: B");
        }else{
            System.out.println("level: A");
        }
    }
    
    void print(int days){
     System.out.print("\n Enter Days Work on month: ");
      days=in.nextInt();
    if(exp_years>=15){
            System.out.printf("income: %d \n",(salary * days)/24+1000);
        }else if(10<=exp_years&& exp_years<15){
            System.out.printf("income: %d \n",(salary * days)/24+600);
        }else if(5<=exp_years && exp_years<10){
            System.out.printf("income: %d \n",(salary * days)/24+300);
        }else{
            System.out.printf("income: %d \n",(salary * days)/24+100);
        }      
    }

        void menu() {       
        int option;
 //       int option =0;

        do {
            System.out.println("Hệ thống quản lý bác sĩ: ");
            System.out.println("1.Nhập thông tin BS: ");
            System.out.println("2.Xuất thông tin BS: ");
            System.out.println("3.In cấp bậc: ");
            System.out.println("4.Nhập số ngày làm việc và tính thu nhập: ");
            System.out.println("5.Thoát: ");
            System.out.print("\tChon chuc nang(1-4): ");


           option =in.nextInt();
            in.nextLine();
            switch (option) {
                case 1:
                    input();
                    break;
                case 2:
                    print();
                    break;
                case 3:
                    print("");
                    break;
                case 4:
                    print(0);
                    break;
                case 5:
                    return;
            }
        } while (option != 5);
        System.out.println("Cam on da su dung he thong! Bye Bye ...");
    }
   
}
