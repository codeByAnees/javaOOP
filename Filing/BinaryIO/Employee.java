package JavaOOP.Filing.BinaryIO;
import java.io.Serializable;
import java.util.Scanner;
import java.util.ArrayList;
public class Employee implements Serializable {
    private int id;
    private String name;
    private double age;
    private float salary;
    public Employee() {
        id = 0;
        name = null;
        age = 0.0;
        salary = 0.0f;
    }

    public void readData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        name = input.nextLine();
        System.out.print("Enter employee ID: ");
        id = input.nextInt();
        System.out.print("Enter employee age: ");
        age = input.nextDouble();
        System.out.print("Enter employee salary: ");
        salary = input.nextFloat();
    }

    public String toString() {
        return ("\nEmployee ID: " + id + "\nEmployee name: " + name + "\nEmployee age: " + age +
        "\nEmployee salary: " + salary);
    }
}
