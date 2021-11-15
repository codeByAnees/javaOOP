package JavaOOP.ArrayOfObjects;
import java.util.Scanner;
public class Student {
    private String name;
    private float[] marks = new float[5];
    //private float average;
    public Student() {
        name = null;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = 0.0f;
        }
        //average = 0.0f;
    }
    public Student(String name, float marks[]) {
        this.name = name;
        this.marks = marks;
        //average = calAverage();
    }
    public void readData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = input.nextLine();
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks: ");
            marks[i] = input.nextFloat();
        }
    }
    public void showData() {
        System.out.print("\n\t\tStudent Details");
        System.out.print("Name: " + name);
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Marks: " + marks[i]);
        }
        //System.out.print("Average: " + average); 
    }
    public float calAverage() {
        float sum = 0.0f;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum / marks.length;
    }
    public Student compareAverage(Student S) {
        if (this.calAverage() > S.calAverage()) {
            return this;
        }
        else if (this.calAverage() == S.calAverage()) {
            return null;
        }
        else return S;
    }
}
