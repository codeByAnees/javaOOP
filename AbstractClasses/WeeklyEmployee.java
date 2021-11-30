package JavaOOP.AbstractClasses;

public class WeeklyEmployee extends Employee {
    private double weeklySalary;

    public WeeklyEmployee() {
        super();
        weeklySalary = 0.0;
    }

    public WeeklyEmployee(String fN, String lN, String ssn, double weeklySalary) {
        super(fN, lN, ssn);
        this.weeklySalary = weeklySalary;
    }
    
    public double earnings() {
        return 15000.0;
    }
}
