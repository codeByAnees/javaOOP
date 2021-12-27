package JavaOOP.Practice;

import java.util.Scanner;

public class Procedural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id1, id2;
        String name1, name2;
        float marks1, marks2;
        id1 = 37;
        name1 = "Abc";
        marks1 = 3.2f;
        System.out.print("Enter id of student-2: ");
        id2 = input.nextInt();
        System.out.print("Enter name of student-2: ");
        name2 = input.nextLine();
        System.out.print("Enter marks of student-2: ");
        marks2 = input.nextFloat();

        System.out.println("Student-1 ID: " + id1);
        System.out.println("Student-1 name: " + name1);
        System.out.println("Student-1 perscentage: " + marks1);
        System.out.println("Student-2 ID: " + id2);
        System.out.println("Student-2 name: " + name2);
        System.out.println("Student-2 percentage: " + marks2);
    }

    public static double calPerson(float marks) {
        return (marks / 500) * 100;
    }
}
