package JavaOOP.Practice;

public class Account {
    private double balence;
    public void setBalence(double b) {
        balence = b;
    }
    public void showBalence() {
        System.out.print("Balence: " + balence);
    }
    public void deposit(double temp) {
        balence += temp;
        //System.out.print("New Balence: " + balence);
    }
    public void withdraw(double temp) {
        balence -= temp;
        //System.out.print("Withdrawl amount is: " + temp);
    }
}
