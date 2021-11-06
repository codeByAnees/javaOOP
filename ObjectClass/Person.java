package JavaOOP.ObjectClass;

import java.util.Scanner;
public class Person {
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
    public void readData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter your ID: ");
        id = input.nextInt();
        System.out.print("Enter your age: ");
        age = input.nextFloat();
    }
    // public void showData() {
    //     System.out.println("ID: " + id + "\nName: " + name + "\nAge: " + age);
    // }
    public String toString() {
        return ("ID: " + id + "\nName: "+ name + "\nAge: " + age);
    }
    public boolean equals(Person temp) {
        if (this.id == temp.id && this.name.equals(temp.name) && this.age == temp.age) {
            return true;
        }
        else return false;
    }
}

