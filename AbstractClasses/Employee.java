package JavaOOP.AbstractClasses;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String SSN;

    protected Employee() {
        firstName = null;
        lastName = null;
        SSN = null;
    }
    
    protected Employee(String fN, String lN, String ssn) {
        this.firstName = fN;
        this.lastName = lN;
        this.SSN = ssn;
    }
    
    public abstract double earnings(); 
}
