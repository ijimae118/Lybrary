
import java.io.IOException;
import java.util.Scanner;


public class EmployeeTest {
/**
 * @author Qucah lam
 * @see p 
 */
    public static void main(String[] args) throws IOException {
        EmployeeList p = new EmployeeList();
        

        Scanner sc = new Scanner(System.in);
        String op = null;

        while (true) {
            System.out.println("\n  MENU");
            System.out.println("1. New employee: ");
            System.out.println("2. Display employee by ID: ");
            System.out.println("3. Save list of employee: ");
            System.out.println("4. Exit.");
            System.out.print(" Please enter [1-4]: ");

            op = sc.nextLine().trim();
            switch (op) {
                case "1":
                    p.addNew();
                    break;
                case "2":
                    System.out.println("Enter ID: ");
                    p.display(sc.nextLine().trim());
                    break;
                case "3":
                    p.save();
                    break;
                case "4":
                    p.Exit();
                    return;
            }
        }
    }

}
