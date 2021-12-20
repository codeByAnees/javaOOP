package JavaOOP.Assignment_3;

public class SalariedEmployee extends Employee {
    private double weeklySalary;
    
    public SalariedEmployee() {
        super();
        weeklySalary = 0.0;
    }
    
    public SalariedEmployee(String first, String last, String ssn, double weeklySalary) {
        super(first, last, ssn);
        this.weeklySalary = weeklySalary;
    }

    public double getPaymentAmount() {
        return (weeklySalary * 4);
    }
}

