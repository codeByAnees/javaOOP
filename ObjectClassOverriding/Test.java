package JavaOOP.ObjectClassOverriding;

public class Test {
    public static void main(String[] args) {
        // Object t = new Teacher();
        // Object t1 = new Teacher();
        // if (t instanceof Teacher && t1 instanceof Teacher) {
        //     ((Teacher)t).readData();
        //     ((Teacher)t1).readData();
        // }
        // System.out.print(t.equals(t1));
        // System.out.print(t1.toString());
        // System.out.print(t.toString());
        Teacher t = new Teacher();
        Person t1 = new Teacher();
        t.readData();
        t1.readData();
        // if (t instanceof Teacher && t1 instanceof Teacher) {
        //     ((Teacher)t).readData();
        //     ((Teacher)t1).readData();
        // }
        System.out.print(t.equals(t1));
        System.out.print(t1.toString());
        //System.out.print(t.toString());
    }
}
