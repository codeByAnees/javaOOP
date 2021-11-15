package JavaOOP.Constructors;
import java.util.Scanner;
public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(5, 20, 53);
        System.out.print("Hours of object t2: " + t2.getHour());
        t1.setHour(12);
        t1.setMins(45);
        t1.setSecs(59);
        t1.showData();
        Time t3 = new Time(5, 20, 56);
        t3.showData();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter new mins for t3: ");
        int m = input.nextInt();
        t3.setMins(m);
        t3.showData();
        Time t4 = t1.compare(t2);
        Time t5 = new Time(t3);
        Time t6 = t2.sum(t3);
    }
    
}
