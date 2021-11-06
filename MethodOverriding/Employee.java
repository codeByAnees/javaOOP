package JavaOOP.MethodOverriding;

import java.util.Scanner;
public class Employee extends Person {
    private String jobTitle;
    private double salary;
    public Employee() {
        super();
        jobTitle = null;
        salary = 0.0;
    }
    public Employee(int id, String name, float age, String jobTitle, double salary) {
        super(id, name, age);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void readData() {
        super.readData();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter job title: ");
        jobTitle = input.nextLine();
        System.out.print("Enter salary: ");
        salary = input.nextDouble();
    }
    public void showData() {
        super.showData();
        System.out.print("\nJob title: " + jobTitle + "\nSalary :" + salary);
    }
}
