
package data;

import java.util.Scanner;


public class Apartment {
    public String id, owner, address;
    public float width, length;

    public Apartment() {
        input();
    }

    public Apartment(String id, String owner, String address, float width, float length) {
        this.id = id;
        this.owner = owner;
        this.address = address;
        this.width = width;
        this.length = length;
    }

    private void input() {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter id: ");
        id = a.nextLine().trim();
        System.out.print("Enter owner: ");
        owner = a.nextLine().trim();
        System.out.print("Enter address: ");
        address = a.nextLine().trim();
        while (true) {
            System.out.print("Enter width: ");
            width = Float.parseFloat(a.nextLine().trim());
            if (width>0) {
                break;
            }
            System.out.println("width>0.");   

        }
        while (true) {
            System.out.print("Enter length: ");
            length = Float.parseFloat(a.nextLine().trim());
            if (length>0) {
                break;
            }
            System.out.println("length>0.");
        }

    }
    
    public void print(){
        System.out.println("Id: "+id);
        System.out.println("Owner: "+owner);
        System.out.println("Address: "+address);
        System.out.println("Width: "+width);
        System.out.println("Lenght: "+length);
        System.out.printf("Area: %f \n",width*length);
        System.out.printf("Peripheral: %f \n",(width+length)*2);
    
    }
    public boolean isSquare(){
        if (width==length) {
            return true;
        } else {
            return false;
        }
    }
    public float getArea(){
         return width*length;
    }
    public float getPeripheral(){
        return (width+length)*2;
    }
    
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%.2f,%.2f,%.2f,%.2f",id,owner,address,width,length,width*length,(width+length)*2);
    }   
}
