package JavaOOP.SemesterProject;
import java.io.File;
import java.util.Scanner;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
public class Admin implements LogIn {
    private String id;
    private String password;

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

    
    // public void searchRecord(String userID) {
    //     String path = "D:\\Visual Studio\\Java\\JavaOOP\\SemesterProject\\Record.dat";
    //     File file = new File(path);
    //     Student stud = new Student();
    //     try {
    //         ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
    //         float cgpA = 0.0f;
    //         while (true) {
    //             Student temp = (Student)in.readObject();
    //             if (temp.cgpa > cgpA) {
    //                 cgpA = temp.cgpa;
    //                 stud = temp;
    //             }
    //         } 
    //     }
    //     catch (EOFException e) {
    //         System.out.println("File read!");
    //     }
    //     System.out.println(stud.toString());
    // }
}
