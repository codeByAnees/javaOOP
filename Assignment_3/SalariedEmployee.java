package JavaOOP.Assignment_3;

public class SalariedEmployee extends Employee {
    private double weeklySalary;
    
    public SalariedEmployee() {
        super();
        weeklySalary = 0.0;
    }

    public double getPaymentAmount() {
        return (weeklySalary * 4);
    }
}

