package JavaOOP.AbstractClasses;

public class TesterClass {
    public static void main(String[] args) {
        GeometricObject o1 = new Rectangle("Red", true, 12.3f, 14.5f);
        GeometricObject o2 = new Circle("Blue", false, 10.3f);
        float a = o1.getArea();
        float b = o2.getArea();
    }
}
