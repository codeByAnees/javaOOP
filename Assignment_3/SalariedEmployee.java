package JavaOOP.Assignment_3;

public class SalariedEmployee extends Employee{
    private int no_of_working_hours;
    private double wagePerHour;
    
    public SalariedEmployee() {
        super();
        no_of_working_hours = 0;
        wagePerHour = 0.0;
    }

    public double calculatePay() {
        return (no_of_working_hours * wagePerHour);
    }
}

