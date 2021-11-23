package JavaOOP.AbstractClasses;

public class Circle extends GeometricObject {
    private float radius;
    public Circle() {
        super();
        radius = 0.0f;
    }
    public Circle(String lineColor, boolean filled, float radius) {
        super(lineColor, filled);
        this.radius = radius;
    }
    public String toString() {
        return (super.toString() + "Radius: " + radius);
    }

    public float getArea() {
        return (3.1417f * radius * radius);
    }
}
