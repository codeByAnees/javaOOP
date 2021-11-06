package JavaOOP.MethodOverriding;
import java.util.Scanner;
public class Teacher extends Employee {
    private int courses;
    public Teacher() {
        super();
        courses = 0;
    }
    public void readData() {
        super.readData();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of courses: ");
        courses = input.nextInt();
    }
    public void showData() {
        super.showData();
        System.out.print("\nNo. of courses: " + courses);
    }
}
