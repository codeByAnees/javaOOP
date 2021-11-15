package JavaOOP.StaticMethods;
import java.util.Scanner;
public class Distance {
    private static int count = 0;
    private int inch;
    private int feet;

    public Distance() {
        count++;
        inch = 0;
        feet = 0;
    }

    public Distance(int i, int f) {
        count++;
        this.inch = i;
        this.feet = f;
    }

    public Distance(Distance d) {
        count++;
        this.inch = d.inch;
        this.feet = d.feet;
    }

    public Distance(int inch) {
        count++;
        this.feet = inch / 12;
        this.inch = inch % 12;
    }

    public void readData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feets: ");
        feet = input.nextInt();
        System.out.print("Enter distance in inches: ");
        inch = input.nextInt();
    }

    public void showData() {
        System.out.println("\nDistance in feets: " + feet);
        System.out.print("Distance in inches: " + inch);
    }

    static public void showCount() {
        System.out.print("Total no. of objects: " + count);
    }

    public Distance Sum(Distance d) {
        Distance temp = new Distance();
        temp.feet = this.feet + d.feet;
        temp.inch = this.inch + d.inch;
        if (temp.inch > 11) {
            temp.feet += temp.inch / 12;
            temp.inch = temp.inch % 12;
        }
        return temp;
    }

    public static Distance sum1 (Distance d1, Distance d2) {
        Distance temp = new Distance();
        temp.feet = d1.feet + d2.feet;
        temp.inch = d1.inch + d2.inch;
        if (temp.inch > 11) {
            temp.feet += temp.inch / 12;
            temp.inch = temp.inch % 12;
        }
        return temp;
    }
}
