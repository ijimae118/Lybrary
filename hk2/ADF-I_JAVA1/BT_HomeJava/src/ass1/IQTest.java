package ass1;

/*
Viết chương trình Java kiểm tra trình độ IQ của sinh viên bao gồm 4 nội dung: tiếng Anh (English), Kỹ năng
(Aptitude), Toán (Mathematics) và Kiến thức tổng quát (General Knowledge).
Mỗi nội dung chỉ có 1 câu hỏi, và người thi chỉ được trả lời 1 lần duy nhất. Mỗi câu trả lời đúng được cộng10
điểm.
Chương trình chỉ dừng lại khi người thi trả lời đủ 4 loại câu hỏi.
Trước khi kết thúc, chương trình sẽ in ra điểm KQ (= điểm tổng của 4 câu hỏi + điểm thưởng) và trình độ IQ
của người chơi.
- Cách tính điểm thưởng:

Nếu điểm tổng = 40, điểm thưởng = 10.
Nếu điểm tổng = 30, điểm thưởng = 5.
Nếu điểm tổng = 20, điểm thưởng = 2.

- Cách đánh giá trình độ IQ:

Nếu điểm KQ = 50, in ra thông báo “You are a genius”
Nếu điểm KQ = 35, in ra thông báo “You are intelligent”
Nếu điểm KQ = 22, in ra thông báo “Your IQ level is average”
Ngược lại, in ra thông báo “Your IQ level is below average”

Hướng dẫn thực hiện:
1. Tạo project ass1
2. Tạo main class IQTest (chứa trong tập tin IQTest.java)
3. Trong class IQTest :
a) Tạo các field dữ liệu (biến – variable):

b) Tạo các method (hàm - function) QuestionEnglish() , QuestionApt() , QuestionMath() và
QuestionGK() thực hiện chức năng kiểm tra trình độ tiếng anh, kỹ năng, toán và kiến thức tổng quát.
Ví dụ sau minh họa nội dung method QuestionEnglish() , thực hiện chức năng kiểm tra tiếng Anh.
Lưu ý, với mỗi loại câu hỏi người thi chỉ được trả lời 1 lần (dựa vào biến ansE, ansM, ansA, ansG).
Tiếp tục lập trình cho các method còn lại để kiểm tra trình độ Kỹ năng, Toán và Kiến thức
tổng quát.
c) Tạo method menu():
Thiết kế menu để người thi có thể chọn lựa câu hỏi muốn trả lời (do – while, swich case)
Chương trình chỉ dừng lại khi người chơi trả lời đủ 4 loại câu hỏi.
Trước khi kết thúc chương trình, phải in ra điểm kết quả (= điểm tổng+ điểm thưởng) và đánh giá trình
độ IQ của người chơi.

d) Trong method main() : tạo đối tượng thể hiện của lớp IQTest (o) và gọi menu()

4. Biên dịch và chạy thử chương trình
 */
import java.util.Scanner;

public class IQTest {

    Scanner in;
    int marks = 0;
    boolean ansE, ansM, ansA, ansG;

    public static void main(String[] args) {
        IQTest o = new IQTest();
        o.menu();
    }

    void QuestionEnglish() {
        if (ansE == false) {
            System.out.println("The meaning of 'Boy' is:");
            System.out.println("1. con trai");
            System.out.println("2. con gai");
            System.out.println("3. Ong cu");
            System.out.println("4. Ba Lao");
            System.out.print("The anwer is(1-4): ");
            //    in = new Scanner(System.in);// Khởi tạo Scanner để gọi nextInt()
            int ans = in.nextInt();
            if (ans == 1) {
                marks += 10;// trả lời đúng :+10 điểm
            }
            ansE = true;//đánh dấu trạng thái đã trả lời câu hỏi tiếng anh
        } else {
            System.out.println("The question was answered already.");
        }
    }

    void QuestionAptitude() {
        if (ansA == false) {
            System.out.println("1 byte =? bit:");
            System.out.println("1. hai");
            System.out.println("2. tám");
            System.out.println("3. hai mươi lăm");
            System.out.println("4. Năm mươi tư");
            System.out.print("The anwer is(1-4): ");
            //    in = new Scanner(System.in);// Khởi tạo Scanner để gọi nextInt()
            int ans = in.nextInt();
            if (ans == 2) {
                marks += 10;// trả lời đúng :+10 điểm
            }
            ansA = true;//đánh dấu trạng thái đã trả lời câu hỏi         }
        } else {
            System.out.println("The question was answered already.");
        }
    }

    void QuestionMathematics() {
        if (ansM == false) {
            System.out.println("6/(4-2)=?");
            System.out.println("1. Một");
            System.out.println("2. Hai");
            System.out.println("3. Ba");
            System.out.println("4. Năm");
            System.out.print("The anwer is(1-4): ");
            //   in = new Scanner(System.in);// Khởi tạo Scanner để gọi nextInt()
            int ans = in.nextInt();
            if (ans == 3) {
                marks += 10;// trả lời đúng :+10 điểm
            }
            ansM = true;//đánh dấu trạng thái đã trả lời câu hỏi         }
        } else {
            System.out.println("The question was answered already.");
        }
    }

    void Questions_GEneral_Knơledge() {
        if (ansG == false) {
            System.out.println("Một cây làm chẳng nên non,...cây chụm lại nên hòn núi cao");
            System.out.println("1. Một");
            System.out.println("2. Hai");
            System.out.println("3. Năm");
            System.out.println("4. Ba");
            System.out.print("The anwer is(1-4): ");
            //    in = new Scanner(System.in);// Khởi tạo Scanner để gọi nextInt()
            int ans = in.nextInt();
            if (ans == 4) {
                marks += 10;// trả lời đúng :+10 điểm
            }
            ansG = true;//đánh dấu trạng thái đã trả lời câu hỏi,để khi if câu hỏi đã đc trả lời thì ansG = true trả về else          }
        } else {
            System.out.println("The question was answered already.");
        }
    }

    void getmarks() {
        //  return marks; chỉ trả về điểm ,đổi void -> int
        switch (marks) {
            case 40:
                System.out.printf("KQ: %d \n", marks + 10);
                System.out.println("You are a genius");
                break;
            case 30:
                System.out.printf("KQ: %d \n", marks + 5);
                System.out.println("You are intelligent");
                break;
            case 20:
                System.out.printf("KQ: %d \n", marks + 2);
                System.out.println("Your IQ level is average");
                break;
            default:
                System.out.println("Your IQ level is below average");
        }
    }

     void menu() {
        in = new Scanner(System.in);// in  khởi tạo Scanner để gọi nextInt() cho toàn bộ void hàm trong switch...case
        int option = 0; //default
        do {
            System.out.println("TestIQ: ");
            System.out.println("1. English");
            System.out.println("2. Aptitude");
            System.out.println("3. Mathematics");
            System.out.println("4. General Knowledge");
            System.out.println("5.Exit");
            System.out.print("\tPlease choose from 1-5: ");

            option = in.nextInt();
            switch (option) {
                case 1:
                    QuestionEnglish();
                    break;
                case 2:
                    QuestionAptitude();
                    break;
                case 3:
                    QuestionMathematics();
                    break;
                case 4:
                    Questions_GEneral_Knơledge();
                    break;
                case 5:
                    //    System.out.printf("marks: %d \n",getmarks()); Chỉ trả về điểm.
                    if (ansE && ansA && ansM && ansG) { //đảm bảo ng chơi trả lời hết tất cả câu hỏi thêm == true // do getmarks() ko trả lời kq nên mới chạy else
                        getmarks();// Tính điểm
                    } else {
                        System.out.println("Cannot exit program");//Khi ng chơi ko hoan thanh yêu cầu trên thì trả về kq sau
                        // phần lặp lại để trương trinh  ko tắt ,tới khi hoan thanh hết 
                        menu();
                    }
                    return;//tắt trương chình
                   default:
                    System.out.println("\n if you don't finish [1-4] ,you won't exit the program. \n");
                    break;
            }
        } while (option != 5);
    }

}































// Try not run:
/*
                    if (ansE && ansA && ansM && ansG){
                        /*
                        if (marks = 40) {
                            bonus = 10;
                        } else if (marks = 30) {
                            bonus = 5;
                        } else if (marks = 20) {
                            bonus = 2;
                        } else {
                            bonus = 0;
                        }
                        System.out.printf("Điểm KQ: %d", marks + bonus);
                        if (marks + bonus = 50) {
                            You are genius;
                        } else if (marks + bonus = 35) {
                            You are intelligent;
                        } else if (marks + bonus = 22) {
                            You IQ level is average;
                        } else {
                            You IQ level is below average;
                        }
 */
 /*
                        switch (marks) {
                            case 40:
                                System.out.printf("KQ: %d", marks + 10);
                            case 30:
                                System.out.printf("KQ: %d", marks + 5);
                            case 20:
                                System.out.printf("KQ: %d", marks + 2);
                        }
                        while (marks != 40) {
                            break;
                        }
 */
 /*                    } else {
                       System.out.println("Cannot exit program");
                    }
 */
