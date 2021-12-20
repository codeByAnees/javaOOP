package JavaOOP.Assignment_3;

public class Tester {
    public static void main(String[] args) {
        Payable p = new Invoice("abc", "def", 12, 30);
        Payable p2 = new SalariedEmployee("A", "B", "WER-123", 1000);
        System.out.println(p.getPaymentAmount());
        System.out.println(p2.getPaymentAmount());
    }
}
