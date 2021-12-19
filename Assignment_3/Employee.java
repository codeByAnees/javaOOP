package JavaOOP.Assignment_3;

public abstract class Employee implements Payable {
    private int id;
    private String name;
    private String jobTitle;

    public Employee() {
        id = 0;
        name = null;
        jobTitle = null;
    }
}
