package JavaOOP.Interface.CloneableInterface;

import java.util.Date;
import java.util.Scanner;

public class House {
    private int houseNo;
    private double area;
    private Date whenBuilt;

    public House() {
        houseNo = 0;
        area = 0.0;
        whenBuilt = null;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    public void readData() {
        Scanner input = new Scanner(System.in);
        System.out.print("\n\t\tHouse\n");
        System.out.print("Enter House no: ");
        houseNo = input.nextInt();
        System.out.print("Enter Area: ");
        area = input.nextDouble();
        whenBuilt = new Date();
    }

    // public String toString() {
    //     return ("House no: " + houseNo + "\nArea: " + area + "\nDate built: " + whenBuilt);
    // }

    public Object Clone() {
        try {
            House h = (House)super.clone();
            Date d = (Date)h.whenBuilt.clone();
            h.whenBuilt = d;
            return h;
        }
        catch (CloneNotSupportedException e){
            return null;
        }
    }
}
