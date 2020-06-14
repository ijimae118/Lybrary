package model;

import java.util.Scanner;

public class Project {
    int id,value;
    String projectName,startDate;
    boolean completed;

    public Project() {
    }

    public Project(int id, int value, String projectName, String startDate, boolean completed) {
        this.id = id;
        this.value = value;
        this.projectName = projectName;
        this.startDate = startDate;
        this.completed = completed;
    }
    public void input(){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter projectName: ");
        projectName=sc.nextLine().trim();
        System.out.println("Enter startDate: ");
        startDate=sc.nextLine().trim();
        System.out.println("Enter value: ");
        value=Integer.parseInt(sc.nextLine().trim());
        System.out.println("Enter completed: ");
        completed=Boolean.parseBoolean(sc.nextLine().trim());
    }

    @Override
    public String toString() {
        return String.format("%d,%s,%s,%d,%s",id,projectName,startDate,value,completed);
    }
    
}
