package JavaOOP.AbstractClasses;

public abstract class GeometricObject {
    private String lineColor;
    private boolean filled;
    protected float area;

    protected GeometricObject() {
        lineColor = null;
        filled = false;
    }

    protected GeometricObject(String lineColor, boolean filled) {
        this.lineColor = lineColor;
        this.filled = filled;
        area = 0.0f;
    }

    public String toString() {
        return ("Line Color: " + lineColor + "\tFilled: " + filled);
    }

    public abstract float getArea();
}
