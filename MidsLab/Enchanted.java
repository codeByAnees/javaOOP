package JavaOOP.MidsLab;
import java.util.Scanner;
import java.util.Date;

public class Enchanted {
    protected static int count = 0;
    protected String[] flavors = new String[3];
    private int cups;
    Date d;

    public Enchanted() {
        for (int i = 0; i < flavors.length; i++) {
            flavors[i] = null;
        }
        cups = 0;
        d = new Date();
    }

    public void PlaceOrder() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of cups(Max 3): ");
        cups = input.nextInt();
        if (cups > 3) {
            System.out.println("Maximum limit is 3");
            PlaceOrder();
        }
        else {
            count += cups;
            for (int i = 0; i < cups; i++) {
                System.out.println("<-----FLAVORS----->");
                System.out.print("\n1) Vanilla \n2) Strawberry \n3) Mango");
                System.out.println("\nEnter your choice(1, 2 or 3): ");
                int choice = input.nextInt();
                if (choice == 1){
                    flavors[i] = "Vanilla";
                }
                else if (choice == 2){
                    flavors[i] = "Strawberry";
                }
                else if (choice == 3){
                    flavors[i] = "Mango";
                }
                else {
                    System.out.println("Invalid choice \n Please enter valid choice");
                    i--;
                }
            }
        }
    }
    public void showData() {
        System.out.print("\n\tDetails\n");
        System.out.println(d);
        for (int i = 0; i < cups; i++) {
            System.out.println("Flavor: " + flavors[i]);
        }
        System.out.println("Cups: " + cups);
    }

    public int totalCups() {
        return count;
    }
}
