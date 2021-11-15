package JavaOOP.Lab6;

public class Computer {
    private int wordSize;
    private double memeorySize;
    private double storageSize;
    private double speed;

    public Computer() {
        wordSize = 0;
        memeorySize = 0.0;
        storageSize = 0.0;
        speed = 0.0;
    }

    public Computer(int w, double m, double s, double sp) {
        this.wordSize = w;
        this.memeorySize = m;
        this.storageSize = s;
        this.speed = sp;
    }

    public void display() {
        System.out.print("\nWord size: " + wordSize + "\tMemory size: " + memeorySize +
                        "\nSpeed: " + speed + "\tStorage Size: " + storageSize);
    }
}
