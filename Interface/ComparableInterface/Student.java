package JavaOOP.Interface.ComparableInterface;

public class Student implements Comparable<Student> {
    private String name;
    private String dob;
    private boolean enrolled;
    private double marks;

    public Student() {
        name = null;
        dob = null;
        enrolled = false;
        marks = 0.0;
    }

    public Student(String name, String dob, boolean enrolled, double marks) {
        this.name = name;
        this.dob = dob;
        this.enrolled = enrolled;
        this.marks = marks;
    }

    public int compareTo(Student s) {
        if (this.marks == s.marks) {
            return 0;
        }
        else if (this.marks > s.marks) {
            return 1;
        }
        else return -1;
    }
}
