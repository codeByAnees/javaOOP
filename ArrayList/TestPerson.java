package JavaOOP.ArrayList;

import java.util.ArrayList;

public class TestPerson {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<Person>();
        System.out.println(personList.size());
        System.out.println(personList.isEmpty());
        Person p = new Person();
        p.readPerson();
        personList.add(p);
        Person p1 = new Person();
        p1.readPerson();
        personList.add(p1);
        System.out.println(personList.contains(p));
        System.out.println(personList.contains(p1));
        System.out.println(personList.get(1));
        Person p2 = new Person();
        p2.readPerson();
        System.out.println(personList.set(1, p2));
        System.out.println(personList.remove(p));
    }
}
