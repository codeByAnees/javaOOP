package JavaOOP.SemesterProject;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
public class Filing implements Serializable {
    
    public void writeToFile(Object o) {
        String path = "";
        if (o instanceof Customer) {
            path = "D:\\Visual Studio\\Java\\JavaOOP\\SemesterProject\\Customer.dat";
        }
        else if (o instanceof Employee) {
            path = "D:\\Visual Studio\\Java\\JavaOOP\\SemesterProject\\Employee.dat";
        }
        File file = new File(path);
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file, true));
            out.writeObject(o);
            out.close();
        }
        catch (Exception e) {
            System.out.println("\nException caught");
            System.out.print(e.toString());
        }
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
            System.out.println("\nException caught");
            System.out.print(e.toString());
        }
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
            System.out.println("\nException caught");
            System.out.print(e.toString());
        }
    }

    //storing objects in arraylist from file
    public ArrayList<Customer> readCustomerFile() {
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
        }
        catch (Exception e) {
            System.out.println("\nException caught\n");
            System.out.print(e.toString());
        }
        return list;
    }

    public ArrayList<Employee> readEmpFile() {
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
            System.out.println("\nFile read!\n");
        }
        catch (Exception e) {
            System.out.println("\nException caught\n");
            System.out.print(e.toString());
        }
        return list;
    }
}
