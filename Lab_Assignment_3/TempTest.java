package JavaOOP.Lab_Assignment_3;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
public class TempTest {
    public static void main(String[] args) {
        try {
            File file = new File("Stu.dat");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            Student stu[] = new Student[5];
            for (int i = 0; i < stu.length; i++) {
                stu[i] = new Student();
                stu[i].readData();
                out.writeObject(stu[i]);
            }
            out.close();
            Student stud = new Student();
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
                float cgpA = 0.0f;
                while (true) {
                    Student temp = (Student)in.readObject();
                    if (temp.cgpa > cgpA) {
                        cgpA = temp.cgpa;
                        stud = temp;
                    }
                } 
            }
            catch (EOFException e) {
                System.out.println("File read!");
            }
            System.out.println(stud.toString());
        }
        catch (Exception e) {
            System.out.println("Exception");
            System.out.println(e.toString());
        }
    }
}
