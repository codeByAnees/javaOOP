package JavaOOP.SemesterProject;

import java.util.Scanner;

public class User implements LogIn {
    private String id;
    private String password;
    private String name;
    private String address;
    private String cnic;
    private double age;

    public User() {
        id = null;
        password = null;
        name = null;
        address = null;
        cnic = null;
        age = 0.0;
    }

    public User(String id, String pass, String name, String add, String cnic, double age) {
        this.id = id;
        this.password = pass;
        this.name = name;
        this.address = add;
        this.cnic = cnic;
        this.age = age;
    }

    public void readData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter address: ");
        address = input.nextLine();
        System.out.print("Enter cnic: ");
        cnic = input.nextLine();
        System.out.print("Enter age: ");
        age = input.nextDouble();
    }

    public boolean validation() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = input.nextLine();
        System.out.print("Enter password: ");
        password = input.nextLine();
        String userID = "0";
        String userPass = "1234";
        readData();
        if (userID.equals(id) && userPass.equals(password)) {
            return true;
        }
        else return false;
    }
}
