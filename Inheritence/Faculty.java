package JavaOOP.Inheritence;
import java.util.Scanner;
public class Faculty extends Employee {
    private String rank;
    private String officeHours;
    public Faculty() {
        super();
        rank = null;
        officeHours = null;
    }
    public void readData() {
        super.readData();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your rank: ");
        rank = input.nextLine();
        System.out.print("Enter office hours: ");
        officeHours = input.nextLine();
    }
    public void showData() {
        super.showData();
        System.out.print("\nRank: " + rank + "\nOffice hours: " + officeHours);
    }
}
