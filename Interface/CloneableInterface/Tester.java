package JavaOOP.Interface.CloneableInterface;

public class Tester {
    public static void main(String[] args) {
        House h1 = new House();
        h1.readData();
        House h2 = ((House)h1.Clone());
        System.out.print(h1.toString());
        System.out.print(h2.toString());
    }
}
