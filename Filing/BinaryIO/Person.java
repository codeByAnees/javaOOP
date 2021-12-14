package JavaOOP.Filing.BinaryIO;
import java.io.Serializable;
import java.util.Scanner;
public class Person implements Serializable {
    private int id;
    private String name;
    protected float age;
    public Person() {
        id = 0;
        name = null;
        age = 0.0f;
    }
    public Person(int id, String name, float age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void readPerson() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter ID: ");
        id = input.nextInt();
        System.out.print("Enter age: ");
        age = input.nextFloat();
    }
    public String toString() {
        return ("ID: " + id + "\nname: " + name + "\nAge: " + age);
    }
    // public void displayPerson() {
    //     System.out.println("ID: " + id + "\nname: " + name + "\nAge: " + age);
    // }
}
