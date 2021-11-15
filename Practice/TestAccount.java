package JavaOOP.Practice;
import java.util.Scanner;
public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setBalence(2500);
        a1.showBalence();
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter amount to deposit: ");
        double temp = input.nextDouble();
        a1.deposit(temp);
        System.out.print("New "); a1.showBalence();
        System.out.print("\nEnter amount to withdraw: ");
        double temp1 = input.nextDouble();
        a1.withdraw(temp1);
        System.out.print("After withdrawl "); a1.showBalence();
    }
}
