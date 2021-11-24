package JavaOOP.Interface.ComparableInterface;

public class TestHouse {
    public static void main(String[] args) {
        House h = new House();
        h.readData();
        House h1 = new House();
        h1.readData();
        int e = h.compareTo(h1);
        if (e == 0) {
            System.out.print("Both of the houses are equal in area");
        }
        else if (e == 1) {
            System.out.print("House: " + h.getHouseNo() + " is bigger than " + h1.getHouseNo());
        }
        else {
            System.out.print("House: " + h1.getHouseNo() + " is bigger than " + h.getHouseNo());
        }
    }
}
