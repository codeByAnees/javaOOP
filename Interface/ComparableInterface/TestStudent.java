package JavaOOP.Interface.ComparableInterface;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Aqib", "12-90-2098", true, 90);
        Student s2 = new Student("Anees", "12-90-2098", true, 85);
        int x = s1.compareTo(s2);
        if (x == 0) {
            System.out.println("Both have same marks");
        }
        else if (x == 1) {
            System.out.println("S1 have more marks");
        }
        else System.out.println("S2 have more marks");
    }
}
