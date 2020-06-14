
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeList {

    ArrayList<Employee> employeeList;

    public EmployeeList() {
        employeeList = new ArrayList<>();
    }

    public void addNew() {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        while (true) {
            System.out.print("Enter ID: ");
            e.ID = sc.nextLine().trim();
            if (Pattern.matches("E\\d{2}-\\d{2}", e.ID)) {
                break;
            }
            System.out.println("Format'Exx-xx' with x is a digit !!!");
        }
        while (true) {
            System.out.print("Enter name: ");
            e.name = sc.nextLine().trim();
            if (e.name.length() > 0) {
                break;
            }
            System.out.println("Not null!!!");
        }
        while (true) {
            System.out.print("Enter address: ");
            e.address = sc.nextLine().trim();
            if (e.address.length() > 0) {
                break;
            }
            System.out.println("Not null !!!");
        }
        while (true) {
            System.out.print("Enter email: ");
            e.email = sc.nextLine().trim();
            if (Pattern.matches("[a-zA-Z0-9]{1,}@[a-zA-Z0-9]{1,}.[a-zA-Z]{1,}", e.email)) {
                break;
            }
            System.out.println("Format [have@,dot symbol]");
        }

        employeeList.add(e);
    }

    public void display(String ID) {
        if (employeeList.isEmpty()) {
            System.out.println(">>HT chua co data");
            return;
        }
        int n = 0;
        for (Employee employee : employeeList) {
            if (employee.ID.contains(ID)) {
                System.out.println(employee);
                n++;
            }
        }
        if (n == 0) {
            System.out.println("Ko tim thay nhan vien theo ID");
        }
    }
    String fname = "employees.txt";

    public void save() {
        if (employeeList.isEmpty()) {
            System.out.println("Loi: HT chua co du lieu !");
            return;
        }
        try {
            //1. open output stream de luu ds san pham vo tap tin sanpham.txt
            PrintStream ps = new PrintStream(fname);

            //2. ghi toan bo du lieu trong ds vo output stream nay
            //ds.forEach(ps::println);
            employeeList.forEach(item -> ps.println(item));

            //3. dong stream
            ps.close();

        } catch (Exception ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
    }

    public void Exit() throws IOException {
        //4. open tap tin sanpham.txt trong notepad de xem
        Runtime r = Runtime.getRuntime();
        r.exec("notepad " + fname);

    }
}
