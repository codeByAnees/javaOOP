package JavaOOP.CompositionAggregation;
import java.util.Scanner;
public class Address {
    private int houseNo;
    private String street;
    private String city;
    private String country;

    public Address() {
        houseNo = 0;
        street = null;
        city = null;
        country = null;
    }

    public Address(int h, String st, String city, String country) {
        this.houseNo = h;
        this.street = st;
        this.city = city;
        this.country = country;
    }

    public void setAddress(int h, String st, String ct, String cy) {
        houseNo = h;
        street = st;
        city = ct;
        country = cy;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void readData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter house no: ");
        houseNo = input.nextInt();
        System.out.print("Enter street: ");
        street = input.nextLine();
        System.out.print("Enter city: ");
        city = input.nextLine();
        System.out.print("Enter country: ");
        country = input.nextLine();
    }

    public void showData() {
        System.out.print("House No: " + houseNo);
        System.out.print("Street: " + street);
        System.out.print("City: " + city);
        System.out.print("Country: " + country);
    }
}
