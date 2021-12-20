package JavaOOP.Assignment_3;

public class Tester {
    public static void main(String[] args) {
        Invoice i1 = new Invoice();
        System.out.println(i1.getPaymentAmount());
        Employee s = new SalariedEmployee();
        System.out.println(s.getPaymentAmount());
    }
}
