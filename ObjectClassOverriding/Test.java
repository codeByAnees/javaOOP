package JavaOOP.ObjectClassOverriding;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        //t.readData();
        Teacher t1 = new Teacher();
        //t1.readData();
        System.out.print(t.equals(t1));
        System.out.print(t1.toString());
        //System.out.print(t.toString());
    }
}
