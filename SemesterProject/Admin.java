package JavaOOP.SemesterProject;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
public class Admin extends LogIn {
    public Admin() {
        id = null;
        password = null;
    }

    public Admin(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public void readData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = input.nextLine();
        System.out.print("Enter password: ");
        password = input.nextLine();
    }

    public boolean validation() {
        String adminID = "0";
        String adminPass = "1234";
        readData();
        if (adminID.equals(id) && adminPass.equals(password)) {
            return true;
        }
        else return false;
    }

    public int searchCustomer(String userID, ArrayList<Customer> o) {
        int index = -1;
        for (int i = 0; i < o.size(); i++) {
            if (o.get(i).id.equals(userID)) {
                index = i;
            }
        }
        return index;
    }

    public void delCustomer(String ID, ArrayList<Customer> o) {
        int index = searchCustomer(ID, o);
        if (index != -1) {
            o.remove(index);
            writeFileCustomer(o);
            System.out.println("Done");
        }
        else System.out.println("User not found!");
    }
    
    public void writeFileCustomer(ArrayList<Customer> list) {
        String path = "D:\\Visual Studio\\Java\\JavaOOP\\SemesterProject\\Customer.dat";
        try {
            File file = new File(path);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            for (int i = 0; i < list.size(); i++) {
                out.writeObject(list.get(i));
            }
            out.close();
        }
        catch (Exception e) {
            System.out.println("Exception caught");
            e.toString();
        }
    }

    public int searchEmp(String ID, ArrayList<Employee> o) {
        int index = -1;
        for (int i = 0; i < o.size(); i++) {
            if (o.get(i).id.equals(ID)) {
                index = i;
            }
        }
        return index;
    }

    public void delEmployee(String ID, ArrayList<Employee> o) {
        int index = searchEmp(ID, o);
        if (index != -1) {
            o.remove(index);
            writeFileEmployee(o);
            System.out.println("Done");
        }
        else System.out.println("User not found!");
    }

    public void writeFileEmployee(ArrayList<Employee> list) {
        String path = "D:\\Visual Studio\\Java\\JavaOOP\\SemesterProject\\Employee.dat";
        try {
            File file = new File(path);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            for (int i = 0; i < list.size(); i++) {
                out.writeObject(list.get(i));
            }
            out.close();
        }
        catch (Exception e) {
            System.out.println("Exception caught");
            e.toString();
        }
    }

    public void writeToFile(Object o) {
        String path = "";
        if (o instanceof Customer) {
            path = "D:\\Visual Studio\\Java\\JavaOOP\\SemesterProject\\Employee.dat";
        }
        if (o instanceof Employee) {
            path = "D:\\Visual Studio\\Java\\JavaOOP\\SemesterProject\\Customer.dat";
        }
        File file = new File(path);
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file, true));
            out.writeObject(o);
            out.close();
        }
        catch (Exception e) {
            System.out.println("Exception caught");
            e.toString();
        }
    }
}