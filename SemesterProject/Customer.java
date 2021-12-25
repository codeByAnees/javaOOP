package JavaOOP.SemesterProject;

import java.io.Serializable;
import java.util.Scanner;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
public class Customer extends User implements Serializable {
    private String meterNo;
    private String connectionType;
    private int noOfUnits;
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
        System.out.print("Enter meter no: ");
        meterNo = input.nextLine();
        System.out.print("Enter connection type: ");
        connectionType = input.nextLine();
    }

    public boolean validation() {
        boolean valid = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = input.nextLine();
        System.out.print("Enter password: ");
        password = input.nextLine();
        ArrayList<Customer> list = readCustomerFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id.equals(this.id) && list.get(i).password.equals(this.password)) {
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
                    if (in.readUTF().equals(id)) {
                        System.out.println("Bill Month: " + in.readUTF());
                        System.out.println("Bill amount: " + in.readDouble());
                    }
                }
            }
            catch (EOFException e) {
                System.out.println("File read!");
                e.toString();
            }
            catch (Exception e) {
                System.out.println("Exception caught");
                e.toString();
            }
        }
        else System.out.println("Invalid ID or password!");
    }

    public static ArrayList<Customer> readCustomerFile() {
        ArrayList<Customer> list = new ArrayList<>();
        String path = "D:\\Visual Studio\\Java\\JavaOOP\\SemesterProject\\Customer.dat";
        try {
            File file = new File(path);
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            while (true) {
                list.add((Customer)in.readObject());
            }
        }
        catch (EOFException e) {
            System.out.println("File read!");
            e.toString();
        }
        catch (Exception e) {
            System.out.println("Exception caught");
            e.toString();
        }
        return list;
    }
}