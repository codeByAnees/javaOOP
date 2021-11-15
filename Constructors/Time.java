package JavaOOP.Constructors;
import java.util.Scanner;
public class Time {
    private int hour;
    private int mins;
    private int secs;

    public Time() {
        hour = 0;
        mins = 0;
        secs = 0;
    }

    public Time(int h, int m, int s) {
        this.hour = h;
        this.mins = m;
        this.secs = s;
    }

    public Time(Time temp) {
        this.hour = temp.hour;
        this.mins = temp.mins;
        this.secs = temp.secs;
    }

    public Time compare(Time temp) {
        if (this.hour > temp.hour) {
            return this;
        }
        else return temp;
    }

    public Time sum(Time t) {
        Time temp = new Time();
        temp.hour = this.hour + t.hour; 
        temp.mins = this.mins + t.mins;
        temp.secs = this.secs + t.secs;
        if (temp.secs > 59) {
            temp.mins += temp.secs / 60;
            temp.secs = temp.secs % 60;
        }
        if (temp.mins > 59) {
            temp.hour += temp.mins / 60;
            temp.mins = temp.mins % 60;
        }
        return temp;
    }

    public void setHour(int h) {
        hour = h;
    }

    public void setMins(int m) {
        mins = m;
    }

    public void setSecs(int s) {
        secs = s;
    }

    public int getHour() {
        return hour;
    }

    public int getMins() {
        return mins;
    }

    public int getSecs() {
        return secs;
    }

    public void readData() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter Hours: ");
        hour = input.nextInt();
        System.out.print("Enter minutes: ");
        mins = input.nextInt();
        System.out.print("Enter seconds: ");
        secs = input.nextInt();
    }

    public void showData() {
        System.out.println("\nHour : min : sec");
        System.out.println(hour + ":" + mins + ":" + secs);
    }
}
