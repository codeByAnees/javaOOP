package JavaOOP.SemesterProject;

import java.io.Serializable;
import java.util.Scanner;

public abstract class User extends LogIn implements Serializable {
    protected String id;
    protected String password;
    protected String name;
    private String address;
    private String cnic;
    private double age;

    public User() {
        name = null;
        address = null;
        cnic = null;
        age = 0.0;
    }

    public User(String name, String add, String cnic, double age) {
        this.name = name;
        this.address = add;
        this.cnic = cnic;
        this.age = age;
    }

    public void readData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Set ID: ");
        id = input.nextLine();
        System.out.print("Set password: ");
        password = input.nextLine();
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter address: ");
        address = input.nextLine();
        System.out.print("Enter cnic: ");
        cnic = input.nextLine();
        System.out.print("Enter age: ");
        age = input.nextDouble();
    }

    public abstract boolean validation();

    public String toString() {
        return ("\nName: " + name + "\nAddress: " + address + "\nCNIC: " + cnic + "\nAge: " + age);
    }

    // public boolean cnicValid(String s) {
    //     boolean validation = cnicLength(s) && cnicDigits(s);
    //     if ((s.charAt(5) == '-') && (s.charAt(13) == '-') && (validation))
    //         return true;
    //     else if (validation)
    //         return true;
    //     else 
    //         return false;
    // }
    // public boolean cnicLength(String S) {
    //     if ((S.length() == 15) || (S.length() == 13))
    //         return true;
    //     return false;			
    // }
    // public boolean cnicDigits(String S) {
    //     int totalDigits = 0;
    //     for (int i = 0; i < S.length(); i++){
    //         if (Character.isDigit(S.charAt(i)))
    //             totalDigits++;
    //     }
    //     if (totalDigits == 13)
    //         return true;
    //     return false;
    // }
}
