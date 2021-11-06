package JavaOOP.MethodOverriding;
import java.util.Scanner;
public class GradStudent extends Student {
    private boolean enrolledInResearch;
    public GradStudent() {
        super();
        enrolledInResearch = false;
    }
    public void readData() {
        super.readData();
        Scanner input = new Scanner(System.in);
        System.out.print("Enrolled in research? (y/n): ");
        String choice = input.nextLine();
        if (choice.equals("y") || choice.equals("Y")) {
            enrolledInResearch = true;
        }
        else enrolledInResearch = false;
    }
    public void showData() {
        super.showData();
        System.out.print("\nEnrolled in research? " + enrolledInResearch);
    }
}
