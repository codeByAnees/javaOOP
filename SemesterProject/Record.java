package JavaOOP.SemesterProject;

import java.io.Serializable;
public class Record implements Serializable {
    protected String id;
    protected String month;
    protected int units;
    protected double bill;
    protected boolean paid;

    public Record() {
        id = null;
        month = null;
        units = 0;
        bill = 0.0;
        paid = false;
    }

    public Record(String id, String month, int units, double bill) {
        this.id = id;
        this.month = month;
        this.units = units;
        this.bill = bill;
        this.paid = false;
    }

    public String toString() {
        return ("\nBill month: " + month + "\nUnits consumed: " + units + "\nBill amount: " + bill);
    }
}