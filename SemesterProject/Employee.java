package JavaOOP.SemesterProject;

import java.io.Serializable;
import java.util.Scanner;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Employee extends User implements Serializable {
    private String jobTitle;
    private double salary;

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
        System.out.print("Enter ID: ");
        id = input.nextLine();
        System.out.print("Enter password: ");
        password = input.nextLine();
        ArrayList<Employee> list = readEmpFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id.equals(this.id) && list.get(i).password.equals(this.password)) {
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

    public static ArrayList<Employee> readEmpFile() {
        ArrayList<Employee> list = new ArrayList<>();
        String path = "D:\\Visual Studio\\Java\\JavaOOP\\SemesterProject\\Employee.dat";
        try {
            File file = new File(path);
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            while (true) {
                list.add((Employee)in.readObject());
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