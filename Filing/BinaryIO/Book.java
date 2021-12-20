package JavaOOP.Filing.BinaryIO;
import java.io.Serializable;
import java.util.Scanner;
public class Book implements Serializable {
    protected String bookName;
    protected String publisher;
    protected Person person;

    public Book() {
        person = new Person();
        bookName = null;
        publisher = null;
    }

    public void readData() {
        Scanner input = new Scanner(System.in);
        person.readPerson();
        System.out.print("Enter book name: ");
        bookName = input.nextLine();
        System.out.print("Enter book publisher: ");
        publisher = input.nextLine();
    }

    public String toString() {
        return (person.toString() + "\nBook name: " + bookName + "\nPublisher: " + publisher);
    }
}
