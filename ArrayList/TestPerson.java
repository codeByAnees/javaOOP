package JavaOOP.ArrayList;
import java.util.ArrayList;

public class TestPerson {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<Person>();
        Person p = new Person(1, "A", 15.0f);
        personList.add(p);
        Person p1 = new Person(2, "B", 13.0f);
        personList.add(p1);
        Person p2 = new Person(3, "C", 19.0f);
        personList.add(p2);
        Person p3 = new Person(4, "D", 12.0f);
        personList.add(p3);
        Person p4 = new Person(5, "E", 18.0f);
        personList.add(p4);
        Person p5 = new Person(6, "F", 24.0f);
        personList.add(p5);
        Person p6 = new Person(7, "G", 27.0f);
        personList.add(p6);

        Person.sorting(personList);
        
        for (int i = 0; i < personList.size(); i++) {
            System.out.println("\n\t\tPerson SORT");
            System.out.println(personList.get(i));
        }
    }
}
