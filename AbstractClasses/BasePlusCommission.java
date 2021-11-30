package JavaOOP.AbstractClasses;

public class BasePlusCommission extends CommisionEmployee {
    private double basicSalary;

    public BasePlusCommission() {
        super();
        basicSalary = 0.0;
    }

    public BasePlusCommission(String fN, String lN, String ssn, int sales, double commissionRate, double basicSalary) {
        super(fN, lN, ssn, sales, commissionRate);
        this.basicSalary = basicSalary;
    }

    public double earnings() {
        return (super.earnings() + basicSalary);
    }
}
