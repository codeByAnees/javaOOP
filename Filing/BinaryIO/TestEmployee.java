package JavaOOP.Filing.BinaryIO;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
public class TestEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee e1 = new Employee();
        e1.readData();
        Employee e2 = new Employee();
        e2.readData();
        Employee e3 = new Employee();
        e3.readData();
        Employee e4 = new Employee();
        e4.readData();
        File file = new File("D:\\Visual Studio\\Java\\JavaOOP\\Filing\\BinaryIO\\Employee.dat");
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(e1);
            out.writeObject(e2);
            out.writeObject(e3);
            out.writeObject(e4);
            out.close();
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
                while (true) {
                    list.add((Employee)in.readObject());
                }
            }
            catch (EOFException e){
                System.out.println("End of file");
            }
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Employee.sorting(list);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            for (int i = 0; i < list.size(); i++) {
                out.writeObject(list.get(i));
            }
            out.close();
            try {
                ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
                System.out.print("\n\t\tSorted List");
                while (true) {
                    System.out.println(input.readObject().toString());
                }
            }
            catch (EOFException e){
                System.out.println("End of file");
            }
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
