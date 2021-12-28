package JavaOOP.SemesterProject;

import java.io.Serializable;
import java.util.Scanner;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Random;
public class Customer extends User {
    protected int load;
    protected String meterNo;
    protected String connectionType;
    protected int noOfUnits;

    Filing filing = new Filing();

    public Customer() {
        super();
        meterNo = null;
        connectionType = null;
        noOfUnits = 0;
    }

    public Customer(String name, String add, String cnic, 
    double age, String meterNo, String connection, int noOfUnits) {
        super(name, add, cnic, age);
        this.meterNo = meterNo;
        this.connectionType = connection;
        this.noOfUnits = noOfUnits;
    }

    public void readData() {
        super.readData();
        Scanner input = new Scanner(System.in);
        meterNo = meterNo();
        System.out.print("Choose a connection \nEnter 1 for residential \nEnter 2 for commercial: ");
        int type = input.nextInt();
        switch(type) {
            case 1:
                connectionType = "Residential";
                break;
            case 2:
                connectionType = "Commercial";
                break;
        }
        System.out.print("Enter load: ");
        load = input.nextInt();
    }

    public boolean validation() {
        boolean valid = false;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter ID: ");
        String ID = input.nextLine();
        System.out.print("Enter password: ");
        String Password = input.nextLine();
        ArrayList<Customer> list = filing.readCustomerFile();
        for (int i = 0; i < list.size(); i++) {
            String tempID = list.get(i).id;
            String tempPass = list.get(i).password;
            if (ID.equals(tempID) && Password.equals(tempPass)) {
                valid = true;
            }
        }
        return valid;
    }

    public void customerProfile() {
        if (validation()) {
            String path = "D:\\Visual Studio\\Java\\JavaOOP\\SemesterProject\\BillRecord.dat";
            try {
                File file = new File(path);
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
                while (true) {
                    if (in.readUTF().equals("0")) {
                        System.out.println("Bill Month: " + in.readObject());
                        System.out.println("Bill amount: " + in.readDouble());
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
        }
        else System.out.println("\nInvalid ID or password!\n");
    }

    public String toString() {
        return (super.toString() + "\nLoad: " + load + "\nMeter No: " + meterNo +
        "\nConnection type: " + connectionType + "\nUnits consumed: " + noOfUnits);
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

