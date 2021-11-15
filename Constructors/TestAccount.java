package JavaOOP.Constructors;

public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account("37303-9591734-1", "Anees", 100000);
        a1.showData();
        a2.showData();
        a1.readData();
    }
    
}
