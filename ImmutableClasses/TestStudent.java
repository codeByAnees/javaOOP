package JavaOOP.ImmutableClasses;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(127, "Uzair");
        s1.showData();
        s2.showData();
        s2.setID(370);
        s2.setName("Anees");
        s2.showData();
    }
}
