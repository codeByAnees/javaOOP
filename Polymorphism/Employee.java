package JavaOOP.Polymorphism;

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
        System.out.print("Enter your salary: ");
        salary = input.nextDouble();
    }
    
    // public String toString() {
    //     return (super.toString() + "\nJob title: " + jobTitle + "\nSalary: " + salary);
    // }
    // public boolean equals(Employee temp) {
    //     if (super.equals(temp) && this.jobTitle.equals(temp.jobTitle) && this.salary == temp.salary) {
    //         return true;
    //     }
    //     return false;
    // }
   
}
