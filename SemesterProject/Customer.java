package JavaOOP.SemesterProject;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Random;
public class Customer extends User {
    protected int load;
    private String meterNo;
    protected String connectionType;
    protected int noOfUnits;

    Filing filing = new Filing();
    public Customer() {
        super();
        load = 0;
        meterNo = null;
        connectionType = null;
        noOfUnits = 0;
    }

    public Customer(String name, String add, String cnic, 
    String age, int load, String meterNo, String connection, int noOfUnits) {
        super(name, add, cnic, age);
        this.load = load;
        this.meterNo = meterNo;
        this.connectionType = connection;
        this.noOfUnits = noOfUnits;
    }

    public void setMeterNo() {
        this.meterNo = meterNo();
    }
    public void setConnectionType(String connection) {
        this.connectionType = connection;
    }
    public void setLaod(int load) {
        this.load = load;
    }
    public void setUnits(int units) {
        this.noOfUnits = units;
    }

    public String getMeterNO() {
        return meterNo;
    }
    public String getConnection() {
        return connectionType;
    }
    public int getUnits() {
        return noOfUnits;
    }

    public Customer customerProfile(String ID) {
        String path = "D:\\Visual Studio\\Java\\JavaOOP\\SemesterProject\\Customer.dat";
        Customer c = new Customer();
        boolean check = false;
        try {
            File file = new File(path);
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            while (true) {
                c = (Customer)in.readObject();
                if (c.id.equals(ID)) {
                    check = true;
                    break;
                }
            }
        }
        catch (EOFException e) {
            System.out.println("\nFile read!\n");
        }
        catch (Exception e) {
            System.out.println("\nException caught");
            System.out.print(e.toString());
        }
        if (check) return c;
        else return null;
    }

    public ArrayList<Record> showBillRecord() {
        return filing.readBillRecord();
    }

    public ArrayList<Record> payBill() {
        return filing.readBillRecord();
    }

    public String toString() {
        return (super.toString() + "\nElectricity load: " + load + "\nMeter Num: " + meterNo +
        "\nConnection type: " + connectionType + "\nConsumed units: " + noOfUnits);
    }

    public String meterNo() {
        String MeterNumber = "";
        Random random = new Random();
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int count = 4;
        for (int i = 1; i < count - 1; i++) {
            int index = random.nextInt(alphabets.length());
            char ch = alphabets.charAt(index);
            MeterNumber += ch;
        }
        MeterNumber = MeterNumber + "-";
        for (int j = 0; j <= count; j++) {
            int num = (int)(Math.random() * 10);
            MeterNumber += num;
        }
        return MeterNumber;
    }
}