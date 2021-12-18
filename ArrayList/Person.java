package JavaOOP.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class Person implements Comparable<Person> {
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

    public Person(Person p) {
        this.id = p.id;
        this.name = p.name;
        this.age = p.age;
    }

    public void readPerson() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\t\tPerson Details");
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter ID: ");
        id = input.nextInt();
        System.out.print("Enter age: ");
        age = input.nextFloat();
    }

    public float getAge() {
        return age;
    }

    public String toString() {
        return ("ID: " + id + "\nname: " + name + "\nAge: " + age);
    }

    public int compareTo(Person P) {
        if (this.age == P.age) {
            return 0;
        }
        else if (this.age > P.age) {
            return 1;
        }
        else return -1;
    }

    public static void sorting(ArrayList<Person> person) {
        ArrayList<Person> p = person;
        for (int i = 0; i < p.size(); i++) {
            for (int j = i + 1; j < p.size(); j++) {
                if (p.get(i).compareTo(p.get(j)) == 1) {
                    Person temp = p.get(i);
                    Person temp1 = p.get(j);
                    p.set(i, temp1);
                    p.set(j, temp);
                }
            }
        }
    }
}
