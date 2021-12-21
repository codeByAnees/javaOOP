package JavaOOP.Lab_Assignment_3;
import java.io.Serializable;
import java.util.Scanner;
public class Student implements Serializable {
    protected int id;
    protected String name;
    protected float cgpa;

    public Student() {
        id = 0;
        name = null;
        cgpa = 0.0f;
    }

    public Student(int id, String name, float cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void readData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = input.nextLine();
        System.out.print("Enter student id: ");
        id = input.nextInt();
        System.out.print("Enter student CGPA: ");
        cgpa = input.nextFloat();
    }

    public String toString() {
        return ("\nStudent ID: " + id + "\nStudent name: " + name + "\nStudent CGPA: " + cgpa);
    }
}
