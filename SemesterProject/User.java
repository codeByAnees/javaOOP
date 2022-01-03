package JavaOOP.SemesterProject;

import java.io.Serializable;
import java.util.ArrayList;
public class User extends LogIn implements Serializable {
    String id;
    String password;
    private String name;
    private String address;
    private String cnic;
    private String age;

    Filing filing = new Filing();
    public User() {
        name = null;
        address = null;
        cnic = null;
        age = null;
    }

    public User(String name, String add, String cnic, String age) {
        this.name = name;
        this.address = add;
        this.cnic = cnic;
        this.age = age;
    }

    public boolean validation(String ID, String Password, String type) {
        boolean valid = false;
        if (type.equals("c")) {
            ArrayList<Customer> list = filing.readCustomerFile();
            for (int i = 0; i < list.size(); i++) {
                String tempID = list.get(i).id;
                String tempPass = list.get(i).password;
                if (ID.equals(tempID) && Password.equals(tempPass)) {
                    valid = true;
                }
            }
        }
        else if (type.equals("e")) {
            ArrayList<Employee> list = filing.readEmployeeFile();
            for (int i = 0; i < list.size(); i++) {
                String tempID = list.get(i).id;
                String tempPass = list.get(i).password;
                if (ID.equals(tempID) && Password.equals(tempPass)) {
                    valid = true;
                }
            }
        }
        return valid;
    }

    public void setID(String id) {
        this.id = id;
    }
    public void setPassword(String p) {
        this.password = p;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setCNIC(String cnic) {
        this.cnic = cnic;
    }
    public void setAge(String age) {
        this.age = age;
    }

    public String getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getCNIC() {
        return cnic;
    }
    public String getAge() {
        return age;
    }

    public String toString() {
        return ("\nUser name: " + name + "\nUser address: " + address + "\nCNIC: " + cnic + "\nAge: " + age);
    }
}
