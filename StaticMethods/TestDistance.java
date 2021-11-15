package JavaOOP.StaticMethods;

public class TestDistance {
    public static void main(String[] args) {
    Distance d1 = new Distance();
    Distance d2 = new Distance(11, 23);
    Distance d3 = new Distance(d2);
    Distance d4 = new Distance(15);
    Distance d5 = d2.Sum(d4);
    Distance.showCount();
    Distance d6 = Distance.sum1(d1, d4);
    }
}
