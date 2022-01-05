package JavaOOP.SemesterProject;

import java.io.Serializable;
public class Record implements Serializable {
    private String id;
    private String month;
    private int units;
    private double bill;

    public Record() {
        id = null;
        month = null;
        units = 0;
        bill = 0.0;
    }

    public Record(String id, String month, int units, double bill) {
        this.id = id;
        this.month = month;
        this.units = units;
        this.bill = bill;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public String getID() {
        return id;
    }

    public String getMonth() {
        return month;
    }

    public int getUnits() {
        return units;
    }

    public double getBill() {
        return bill;
    }


    public String toString() {
        return ("\n\tBill Record" + "\nBill month: " + month + "\nUnits consumed: " + units + "\nBill amount: " + bill);
    }
}