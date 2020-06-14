/*
1.Tạo project As2:
2. Tạo Java Class, Account (Account.java) với cấu trúc sau:
a. Fields dữ liệu : accNo, balance
b. Hàm dựng: khởi trị ban đầu cho các field dữ liệu.
i. Mặc định Account() – no-parameter constructor ( dòng 17-20 )
ii. Có tham số Account(String, int) - parameterized constructor (dòng 22-25)
c. Phương thức:
i. void deposit (int) : thực hiện chức năng gởi tiền vô tài khoản
ii. void withdraw(int) : thực hiện chức năng rút tiền.
iii. int getBalance() : trả về số dư tài khoản.
3. Tạo lớp kiểm thử Java Main Class, AccountTest.java , bao gồm 2 phương thức :
a. menu() : tạo thực đơn thực hiện chức năng gởi và rút tiền.
b. main() : gọi phương thức menu() để thi hành chương trình.
4. Biên dịch và thi hành chương trình.
5. Mở rộng :
a. Trong lớp Account, sửa lại các phương thức :
i. deposit(int amt) : điều kiện giao dịch thành công : số tiền gởi phải > 100.
ii. withdraw(int amt) : điều kiện giao dịch thành công : số tiền muốn rút > 100
và <số dư TK.
b. Trong lớp AccountTest:
i. Khi khởi tạo đối tượng acc trong phương thức menu()– cho phép user nhập vào
mã TK và số dư ban đầu của TK.
ii. Khi in ra số dư TK của khách hàng, xuất thêm mã TK.
 */
package As2;

public class Account {
    String accNo;
    int balance;

    public Account(){// default balance=100
        accNo = "Acc01";
        balance = 100;
    }
    public Account(String acc, int bal){//tham so
            accNo = acc;
            balance =bal;
    }
    
    public void deposit(int amt){
        if(amt>0){
            balance+=amt;//balance+amt
                    System.out.println("Giao dich gui tien thanh cong.");
        }else{
            System.out.println("Ko the goi tien amt !...");
        }
    }
    public void withdraw(int amt){
        if(amt>0 && amt<balance){
            balance-=amt;//balance-amt
                    System.out.println("Giao dich rut tien thanh cong.");
        }else{
            System.out.println("Ko the rut tien amt !...");
        }
    }
    public int getBalance(){
        return balance;
    }


}
