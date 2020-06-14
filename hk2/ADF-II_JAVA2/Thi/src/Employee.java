
public class Employee {
public String ID,name,address,email;

    public Employee() {
    }

    public Employee(String ID, String name, String address, String email) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s",ID,name,address,email); //To change body of generated methods, choose Tools | Templates.
    }
    
}
