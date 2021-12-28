package JavaOOP.Lab_Assignment_4;

public class Student {
    private String name;
    private String gender;
    private boolean enrolled;
    private double marks;
    private Double percentage;

    public Student() {
        name = null;
        gender = null;
        enrolled = false;
        marks = 0.0;
        percentage = 0.0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    // get methods

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public boolean getEnrolled() {
        return enrolled;
    }

    public double getMarks() {
        return marks;
    }

    public Double getPercentage() {
        return percentage;
    }

    public Double calPercent() {
        return (marks / 500.0) * 100.0;
    }
}
