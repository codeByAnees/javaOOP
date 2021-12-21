package JavaOOP.Lab_Assignment_3;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.readData();
        Student s2 = new Student();
        s2.readData();
        Student s3 = new Student();
        s3.readData();
        Student s4 = new Student();
        s4.readData();
        Student s5 = new Student();
        s5.readData();

        try {
            File file = new File("stu.dat");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(s1);
            out.writeObject(s2);
            out.writeObject(s3);
            out.writeObject(s4);
            out.writeObject(s5);
            out.close();
            Student s = new Student();
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
                float cgpA = 0.0f;
                while (true) {
                    Student temp = (Student)in.readObject();
                    if (temp.cgpa > cgpA) {
                        cgpA = temp.cgpa;
                        s = temp;
                    }
                } 
            }
            catch (EOFException e) {
                System.out.println("File read!");
            }
            System.out.println(s.toString()); 
        }
        catch (Exception e) {
            System.out.println("Exception");
            System.out.println(e.toString());
        }
    }
}
