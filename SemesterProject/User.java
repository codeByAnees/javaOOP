package JavaOOP.SemesterProject;

import java.io.Serializable;
import java.util.Scanner;

public abstract class User extends LogIn implements Serializable {
    private String name;
    private String address;
    private String cnic;
    private double age;

    public User() {
        name = null;
        address = null;
        cnic = null;
        age = 0.0;
    }

    public User(String name, String add, String cnic, double age) {
        this.name = name;
        this.address = add;
        this.cnic = cnic;
        this.age = age;
    }

    public void readData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter address: ");
        address = input.nextLine();
        System.out.print("Enter cnic: ");
        cnic = input.nextLine();
        System.out.print("Enter age: ");
        age = input.nextDouble();
    }

    public abstract boolean validation();

    public String toString() {
        return ("\nName: " + name + "\nAddress: " + address + "\nCNIC: " + cnic + "\nAge: " + age);
    }
}
