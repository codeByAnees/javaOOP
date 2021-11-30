package JavaOOP.AbstractClasses;

public class TestEmployee {
    public static void main(String[] args) {
    Object o1 = new HourlyEmployee("A", "B", "123", 12, 500);
    if (o1 instanceof HourlyEmployee) {
        System.out.println("Hourly Class: " + ((HourlyEmployee)o1).earnings());
    }
    Object o2 = new CommisionEmployee("C", "D", "456", 10, 500);
    if (o2 instanceof CommisionEmployee) {
        System.out.println("Commission Class: " + ((CommisionEmployee)o2).earnings());
    }
    Object o3 = new BasePlusCommission("E", "F", "789", 10, 500, 15000.0);
    if (o3 instanceof BasePlusCommission) {
        System.out.println("BasePlusCommission Class: " + ((BasePlusCommission)o3).earnings());
    }
    }
}
