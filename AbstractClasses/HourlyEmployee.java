package JavaOOP.AbstractClasses;

public class HourlyEmployee extends Employee {
    private int hours;
    private double wagePerHour;

    public HourlyEmployee() {
        super();
        hours = 0;
        wagePerHour = 0.0;
    }

    public HourlyEmployee(String fN, String lN, String ssn, int h, double wagePerHour) {
        super(fN, lN, ssn);
        this.hours = h;
        this.wagePerHour = wagePerHour;
    }

    public double earnings() {
        return (hours * wagePerHour);
    }
}
