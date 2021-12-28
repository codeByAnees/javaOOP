package JavaOOP.SemesterProject;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee extends User {
    private String jobTitle;
    private double salary;

    Filing filing = new Filing();

    public Employee() {
        super();
        jobTitle = null;
        salary = 0.0;
    }

    public Employee(String name, String add, String cnic, 
    double age, String jobTitle, double salary) {
        super(name, add, cnic, age);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void readData() {
        super.readData();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter job title: ");
        jobTitle = input.nextLine();
        System.out.print("Enter salary: ");
        salary = input.nextDouble();
    }

    public boolean validation() {
        boolean valid = false;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter ID: ");
        String ID = input.nextLine();
        System.out.print("Enter password: ");
        String Password = input.nextLine();
        ArrayList<Employee> list = filing.readEmpFile();
        for (int i = 0; i < list.size(); i++) {
            String tempID = list.get(i).id;
            String tempPass = list.get(i).password;
            if (ID.equals(tempID) && Password.equals(tempPass)) {
                valid = true;
            }
        }
        return valid;
    }

    public void EmpProfile() {
        if (validation()) {
            String path = "D:\\Visual Studio\\Java\\JavaOOP\\SemesterProject\\EmpRecord.dat";
            try {
                File file = new File(path);
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
                while (true) {
                    if (in.readUTF().equals(id)) {
                        System.out.println("Pay Month: " + in.readUTF());
                        System.out.println("Pay amount: " + in.readDouble());
                    }
                }
            }
            catch (EOFException e) {
                System.out.println("\nFile read!\n");
                System.out.print(e.toString());
            }
            catch (Exception e) {
                System.out.println("\nException caught");
                System.out.print(e.toString());
            }
        }
        else System.out.println("\nInvalid ID or password!\n");
    }

    public void setNoOfUnits(ArrayList<Customer> list) {
        if (validation()) {
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < list.size(); i++) {
                System.out.print("Enter no of units: ");
                int unit = input.nextInt();
                list.get(i).noOfUnits = unit;
            }
            filing.writeFileCustomer(list);
        }
        else System.out.println("\nInvalid ID or password!\n");
    }

    public String toString() {
        return (super.toString() + "\nJob title: " + jobTitle + "\nSalary: " + salary);
    }
}