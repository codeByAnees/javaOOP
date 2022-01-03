package JavaOOP.SemesterProject;

import java.io.Serializable;
public class Record implements Serializable {
    protected String id;
    protected String month;
    protected int units;
    protected double bill;

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

    public String toString() {
        return ("\n\tBill Record" + "\nBill month: " + month + "\nUnits consumed: " + units + "\nBill amount: " + bill);
    }
}