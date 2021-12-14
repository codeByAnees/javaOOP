package JavaOOP.Filing.BinaryIO;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.io.File;
import java.io.FileInputStream;
public class ObjectIO {
    public static void main(String[] args) {
        File file = new File("D:\\Visual Studio\\Java\\JavaOOP\\Filing\\BinaryIO\\ObjectFile.dat");
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeUTF("ABC");
            out.writeDouble(12.5);
            out.writeObject(new Date());
            out.writeObject(new Person(1, "Anees", 19));
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            System.out.println(in.readUTF());
            System.out.println(in.readDouble());
            System.out.println(((Date)(in.readObject())).toString());
            System.out.println(((Person)(in.readObject())).toString());
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
