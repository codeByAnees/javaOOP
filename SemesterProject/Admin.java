package JavaOOP.SemesterProject;

import java.util.Scanner;
import java.io.File;
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

    // public void myFile() {
    //     String path = "D:\\Visual Studio\\Java\\JavaOOP\\SemesterProject\\Record.dat";
    //     File file = new File(path);
    // }
    
    public void searchRecord(String userID) {
        String path = "D:\\Visual Studio\\Java\\JavaOOP\\SemesterProject\\Record.dat";
        File file = new File(path);
        
    }
}
