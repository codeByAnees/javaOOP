package JavaOOP.GUI;

public class Employee {
    private String id;
    private String name;
    private String gender;
    private String jobTitle;
    private double salary;
    private String status;
    private double tax;

    public Employee() {
        id = null;
        name = null;
        gender = null;
        jobTitle = null;
        salary = 0.0;
        status = null;
        tax = 0.0;
    }

    public Employee(String id, String name, String gender, String jobTitle, double salary, String status, double tax) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.status = status;
        this.tax = tax;
    }

    // set methods
    public void setID(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    // get methods

    public String getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public double getSalary() {
        return salary;
    }
    public String getStatus() {
        return status;
    }
    public double getTax() {
        return tax;
    }

    public String toString() {
        return ("\nID: " + id + "\nName: " + name + "\nGender: " + gender + "\nJob title: " + jobTitle + "\nSalary: " + salary + "\nStatus: " + status + "\nTax: " + tax);
    }
}
