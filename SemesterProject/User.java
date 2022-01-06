package JavaOOP.SemesterProject;

import java.io.Serializable;
public abstract class User implements LogIn, Serializable {
    private String id;
    private String password;
    private String name;
    private String address;
    private String cnic;
    private String age;

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

    public abstract boolean validation(String ID, String Password);

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
    public String getPass() {
        return password;
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
        return ("\nUser ID: " + id + "\nUser name: " + name + "\nUser address: " + address + "\nCNIC: " + cnic + "\nAge: " + age);
    }
}
