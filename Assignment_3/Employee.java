package JavaOOP.Assignment_3;

public abstract class Employee implements Payable {
    private String firstName;
    private String lastName;
    private String SSN;

    public Employee() {
        firstName = null;
        lastName = null;
        SSN = null;
    }

    public Employee(String first, String last, String ssn) {
        this.firstName = first;
        this.lastName = last;
        this.SSN = ssn;
    }
}
