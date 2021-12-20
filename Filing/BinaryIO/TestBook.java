package JavaOOP.Filing.BinaryIO;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.readData();
        Book b2 = new Book();
        b2.readData();
        Book b3 = new Book();
        b3.readData();
        Book b4 = new Book();
        b4.readData();
        try {
            File file = new File("D:\\Visual Studio\\Java\\JavaOOP\\Filing\\BinaryIO\\BookStore.dat");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(b1);
            out.writeObject(b2);
            out.writeObject(b3);
            out.writeObject(b4);
            out.close();
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
                while (true) {
                    System.out.println(((Book)(in.readObject())).toString());
                }
            }
            catch (EOFException e) {
                System.out.println("File readed!");
            }
        }
        catch (Exception e) {
            System.out.print(e.toString());
            System.out.println("Exception caught!");
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter book name to search: ");
        String name = input.nextLine();
        searchBook(name);
    }

    public static void searchBook(String name) {
        try {
            String f = "D:\\Visual Studio\\Java\\JavaOOP\\Filing\\BinaryIO\\BookStore.dat";
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(f));
            while (true) {
                Book b = (Book)input.readObject();
                if (b.bookName.equals(name)) {
                    System.out.println("Book found \n" + b.toString());
                    break;
                }
            }
        }
        catch (EOFException e) {
            System.out.println("Record not found, File readed.");;
        }
        catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Exception caught!");
        }
    }
}
