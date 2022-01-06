package JavaOOP.Practice;

public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(6, 10, 15);
        t1.showData();
        Time t2 = new Time(6, 10, 15);
        t2.showData();
        t2 = null;
        t1 = null;
        System.gc();
    }
}
