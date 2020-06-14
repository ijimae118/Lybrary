/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
 */
package nhap;

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class Person {

    //khai bao cac truong
    private int Id;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Phone;

    //contrucson co doi so
    public Person(int id, String FirstName, String LastName, String Email, String Phone) {
        this.Id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Phone = Phone;
    }
//cỏtrucson khong co doi so

    public Person() {

        this.Id = -1;
        this.FirstName = ("noname");
        this.LastName = ("nonam");
        this.Email = ("noname");
        this.Phone = ("noname");
    }

    public int getId() {
        return this.Id;
    }

    public void setId(int value) {
        this.Id = value;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public String getEmail() {
        return this.Email;
    }

    public String getPhone() {
        return this.Phone;
    }

    public void setFirstName(String value) {
        this.FirstName = value;

    }

    public void setLastName(String value) {
        this.LastName = value;
    }

    public void setEmail(String value) {
        this.Email = value;
    }

    public void setPhonr(String value) {
        this.Phone = value;
    }

//phuong thuc nhap
    public void ScanInfo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Id:");
        this.Id = input.nextInt();
        input.nextLine();
        System.out.println("Enter FirstName:");
        this.FirstName = input.nextLine();
        System.out.println("Enter LastName:");
        this.LastName = input.nextLine();
        System.out.println("Enter Email:");
        this.Email = input.nextLine();
        System.out.println("Enter Phone:");
        this.Phone = input.nextLine();

    }

    public void printInfo() {
        System.out.println("-----------------------------------");
        System.out.println("| Id | FirstName | LastName | Email | Phone |");
        System.out.printf("| %d | %s | %s | %s | %s |\n",this.Id,this.FirstName,this.LastName,this.Email,this.Phone);
    }

    public static void main(String[] args) {
        // tao doi tuong person
        Person ps = new Person();
//goi phuong thuc cua doi tuong person
        ps.ScanInfo();
        ps.printInfo();
    }

}
