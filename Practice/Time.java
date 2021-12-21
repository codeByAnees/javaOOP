package JavaOOP.Practice;

public class Time {
    private int hour, mint, sec;
    public Time() {
        hour = 0;
        mint = 0;
        sec = 0;
    }

    public Time(int h, int m, int s) {
        this.hour = h;
        this.mint = m;
        this.sec = s;
    }

    public void showData() {
        System.out.println("Hour: " + hour + " Min: " + mint + " Sec: " + sec);
    }

    public void finalize() {
        System.out.println("Object destroyed.");
    }
}
