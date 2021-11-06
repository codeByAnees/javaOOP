package JavaOOP.MethodOverriding;
import java.util.Scanner;
public class Student extends Person {
    private double cgpa;
    private String program;
    public Student() {
        super();
        cgpa = 0.0;
        program = null;
    }
    public void readData() {
        super.readData();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Program: ");
        program = input.nextLine();
        System.out.print("Enter your CGPA: ");
        cgpa = input.nextDouble();
    }
    public void showData() {
        super.showData();
        System.out.print("\nProgram: " + program + "\nCGPA: " + cgpa);
    }
}
