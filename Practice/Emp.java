package JavaOOP.Practice;
import java.util.Scanner;
public class Emp {
    private int employeeCode;
    private String employeeName;
    private String dateOfJoining;

    public void setparameters(int code, String name, String date) {
        employeeCode = code;
        employeeName = name;
        dateOfJoining = date;
    }

    public void display() {
        System.out.print("\nEmployee Code: " + employeeCode + "\nEmployee Name: " + employeeName + 
                        "\nDate of joining: " + dateOfJoining);
    }
    public void checkTenure() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter current date: ");
        String tempD = input.nextLine();
        String[] curr = tempD.split("-", 3);
        String[] joined = dateOfJoining.split("-", 3);
        int joiningY = Integer.parseInt(joined[2]);
        int currentY = Integer.parseInt(curr[2]);
        int joiningM = Integer.parseInt(joined[1]);
        int currentM = Integer.parseInt(curr[1]);
        int joiningD = Integer.parseInt(joined[0]);
        int currentD = Integer.parseInt(curr[0]);
        if (currentY - joiningY == 3 && joiningM >= currentM  && joiningD >= currentD) {
            System.out.print("Yes. Employee tenure is more than 3 years");
        }
        else
            System.out.print("Employee tenure is less than 3 years");
    }
}
