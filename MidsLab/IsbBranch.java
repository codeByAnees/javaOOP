package JavaOOP.MidsLab;

import java.util.Scanner;

public class IsbBranch extends Enchanted {
    private boolean dineIn;
    public IsbBranch() {
        super();
        dineIn = false;
    }

    public void order() {
        super.PlaceOrder();
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter 1 for Dine-in \nEnter 2 to Take away: ");
        int choice = input.nextInt();
        if (choice == 1) {
            dineIn = true;
        }
    }
}
