package JavaOOP.Filing.BinaryIO;
import java.io.Serializable;
import java.util.Scanner;
import java.util.ArrayList;
public class Employee implements Serializable, Comparable<Employee> {
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

    public int compareTo(Employee P) {
        if (this.salary == P.salary) {
            return 0;
        }
        else if (this.salary > P.salary) {
            return 1;
        }
        else return -1;
    }

    public static ArrayList<Employee> sorting(ArrayList<Employee> Emp) {
        ArrayList<Employee> p = Emp;
        for (int i = 0; i < p.size(); i++) {
            for (int j = i + 1; j < p.size(); j++) {
                if (p.get(i).compareTo(p.get(j)) == 1) {
                    Employee temp = p.get(i);
                    Employee temp1 = p.get(j);
                    p.set(i, temp1);
                    p.set(j, temp);
                }
            }
        }
        return p;
    }
}
