package JavaOOP.SemesterProject;
import java.util.ArrayList;

public class Admin implements LogIn {
    Filing filing = new Filing();
    public boolean validation(String id, String password) {
        String adminID = "admin";
        String adminPass = "12345";
        if (adminID.equals(id) && adminPass.equals(password)) {
            return true;
        }
        else return false;
    }

    public Customer searchCustomer(String uID) {
        ArrayList<Customer> list = filing.readCustomerFile();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i).getID();
            if (temp.equals(uID)) {
                index = i;
            }
        }
        if (index == -1) return null;
        else return list.get(index);
    }

    public void editCustomerRec(Customer c, String uID) {
        ArrayList<Customer> list = filing.readCustomerFile();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i).getID();
            if (temp.equals(uID)) {
                index = i;
            }
        }
        list.set(index, c);
        filing.writeFileCustomer(list);
    }
    
    public void addNewUser(Customer c1) {
        filing.writeToFile(c1);
    }

    public void displayCustomers() {
        ArrayList<Customer> list = filing.readCustomerFile();
        for (int i = 0; i < list.size(); i++) {
            Customer c = list.get(i);
            System.out.println(c.toString());
        }
    }

    public Employee searchEmployee(String uID) {
        ArrayList<Employee> list = filing.readEmployeeFile();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i).getID();
            if (temp.equals(uID)) {
                index = i;
            }
        }
        if (index == -1) return null;
        else return list.get(index);
    }

    public void addNewUser(Employee c1) {
        filing.writeToFile(c1);
    }
}