package JavaOOP.SemesterProject;

import java.io.Serializable;
import java.util.ArrayList;
public class Record implements Serializable {
    private String id;
    private String month;
    private int units;
    private double bill;

    Filing filing = new Filing();
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

    public Record getRecord(String id, String month) {
		Record r = new Record();
		ArrayList<Record> list = filing.readBillRecord();
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			String rID = list.get(i).getID();
			String rMonth = list.get(i).getMonth();
			if (rID.equals(id) && rMonth.equals(month)) {
				r = list.get(i);
				index = 0;
				break;
			}
		}
		if (index == -1) return null;
		else return r;
	}

    public String toString() {
        return ("\n\tBill Record" + "\nBill month: " + month + "\nUnits consumed: " + units + "\nBill amount: " + bill);
    }
}