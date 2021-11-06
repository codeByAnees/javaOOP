package JavaOOP.Polymorphism;

public class Test {
    public static void main(String[] args) {
        // Object o1 = new Person();
        // Object o2 = new Employee();
        // Object o3 = new Teacher();
        // System.out.print(o1.equals(o2));
        // System.out.print(o3.toString());
        Person p1 = new Person();
        Person p2 = new Employee();
        Person p3 = new Teacher();
        System.out.print(p1.toString());
        System.out.print(p2.toString());
        System.out.print(p3.toString());
    }
}
