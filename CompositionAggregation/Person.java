package JavaOOP.CompositionAggregation;
import java.util.Scanner;
public class Person {
    private String name;
    private float age;
    private Address ad;
    public Person() {
        name = null;
        age = 0.0f;
        ad = new Address();
    }
    public Person(String n, float ag, int h, String s, String ct, String cy) {
        name = n;
        age = ag;
        ad = new Address(h, s, ct, cy);
    }
    public void readData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter age: ");
        age = input.nextFloat();
        ad.readData();
    }
    public void showData() {
        System.out.print("Name: " + name);
        System.out.print("Age: " + age);
        ad.showData();
    }
}
