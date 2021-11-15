package JavaOOP.Lab6;

public class Laptop extends Computer {
    private double length;
    private double width;
    private double height;
    private double weight;

    public Laptop() {
        super();
        length = 0.0;
        width = 0.0;
        height = 0.0;
        weight= 0.0;
    }

    public Laptop(int w, double m, double s, double sp, double len, double wi, double h, double we) {
        super(w, m, s, sp);
        this.length = len;
        this.width = wi;
        this.height = h;
        this.weight = we;
    }

    public void display() {
        super.display();
        System.out.println("\nLength: " + length + "\tWidth: " + width +
                            "\nHeight: " + height + "\tWeight: " + weight);
    }
}
