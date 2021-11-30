package JavaOOP.AbstractClasses;

public class CommisionEmployee extends Employee {
    private int sales;
    private double commissionRate;

    public CommisionEmployee() {
        super();
        sales = 0;
        commissionRate = 0.0;
    }

    public CommisionEmployee(String fN, String lN, String ssn, int sales, double commissionRate) {
        super(fN, lN, ssn);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    public double earnings() {
        return (sales * commissionRate);
    }
}
