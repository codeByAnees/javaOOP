package JavaOOP.Lab6;

public class CommissionEmployee {
    private String firstName;
    private String lastName;
    private String SSN;
    private int grossSales;
    private double commissionRate;

    public CommissionEmployee() {
        firstName = null;
        lastName = null;
        SSN = null;
        grossSales = 0;
        commissionRate = 0.0;
    }

    public CommissionEmployee(String fn, String ln, String ssn, int gs, double cr) {
        this.firstName = fn;
        this.lastName = ln;
        this.SSN = ssn;
        this.grossSales = gs;
        this.commissionRate = cr;
    }

    
}
