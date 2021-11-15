package JavaOOP.Constructors;
import java.util.Scanner;
public class Account {
    private String cnic;
    private String title;
    private double balence;

    public Account() {
        cnic = null;
        title = null;
        balence = 0.0;
    }

    public Account(String c, String t, double b) {
        cnic = c;
        title = t;
        balence = b;
    }

    public void readData() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter CNIC: ");
        cnic = input.nextLine();
        System.out.print("Enter title: ");
        title = input.nextLine();
        System.out.print("Enter Balence: ");
        balence = input.nextDouble();
    }

    public void showData() {
        System.out.print("CNIC: " + cnic);
        System.out.print("Title: " + title);
        System.out.print("Balence: " + balence);
    }
    
}
