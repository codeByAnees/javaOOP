package JavaOOP.Practice;

import java.util.Scanner;

public class ProceduralOOP {
    private int id;
    private String name;
    private float marks;

    public ProceduralOOP() {
        id = 0;
        name = null;
        marks = 0.0f;
    }

    public ProceduralOOP(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void readData() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter name: ");
        name = input.nextLine();
        System.out.print("Enter ID: ");
        id = input.nextInt();
        System.out.print("Enter marks: ");
        marks = input.nextFloat();
    }

    public double calPercent() {
        return (marks / 500) * 100;
    }

    public String toString() {
        return ("\nID: " + id + "\nName: " + name + "\nMarks: " + marks + "\nPercentage: " + this.calPercent());
    }
}
