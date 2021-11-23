package JavaOOP.AbstractClasses;

public class Rectangle extends GeometricObject {
    private float width;
    private float length;

    public Rectangle() {
        super();
        width = 0.0f;
        length = 0.0f;
    }

    public Rectangle(String lineColor, boolean filled, float width, float length) {
        super(lineColor, filled);
        this.width = width;
        this.length = length;
    }

    public float getArea() {
        return width * length;
    }
}
