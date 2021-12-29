package JavaOOP.SemesterProject;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
public class Admin extends LogIn implements Serializable {
    protected String id;
    protected String password;
    Filing filing = new Filing();

    public void readData() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter ID: ");
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

    public Customer searchCustomer() {
        Scanner input = new Scanner(System.in);
        ArrayList<Customer> list = filing.readCustomerFile();
        System.out.print("Enter customer-ID to search: ");
        String uID = input.next();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i).id;
            if (temp.equals(uID)) {
                index = i;
            }
        }
        if (index == -1) return null;
        else return list.get(index);
    }

    public void delCustomer() {
        Scanner input = new Scanner(System.in);
        ArrayList<Customer> list = filing.readCustomerFile();
        System.out.print("Enter customer-ID to delete: ");
        String uID = input.next();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i).id;
            if (temp.equals(uID)) {
                index = i;
            }
        }
        if (index != -1) {
            list.remove(index);
            filing.writeFileCustomer(list);
        }
        else System.out.println("Person record not found");
    }

    public void editCustomerRec() {
        Scanner input = new Scanner(System.in);
        ArrayList<Customer> list = filing.readCustomerFile();
        System.out.print("Enter customer-ID to edit: ");
        String uID = input.next();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i).id;
            if (temp.equals(uID)) {
                index = i;
            }
        }
        if (index != -1) {
            Customer c = new Customer();
            c.readData();
            list.set(index, c);
            filing.writeFileCustomer(list);
        }
        else System.out.println("Person record not found");
    }
    

    public Employee searchEmp() {
        Scanner input = new Scanner(System.in);
        ArrayList<Employee> list = filing.readEmpFile();
        System.out.print("Enter employee ID to search: ");
        String uID = input.next();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i).id;
            if (temp.equals(uID)) {
                index = i;
            }
        }
        if (index == -1) return null;
        else return list.get(index);
    }

    public void delEmployee() {
        Employee emp = searchEmp();
        ArrayList<Employee> list = filing.readEmpFile();
        if (emp != null) {
            list.remove(emp);
            filing.writeFileEmployee(list);
            System.out.println("\nDone\n");
        }
        else System.out.println("\nUser not found!\n");
    }

    public void editEmpRec() {
        Scanner input = new Scanner(System.in);
        ArrayList<Employee> list = filing.readEmpFile();
        System.out.print("Enter employee-ID to edit: ");
        String uID = input.next();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i).id;
            if (temp.equals(uID)) {
                index = i;
            }
        }
        if (index != -1) {
            Employee e = new Employee();
            e.readData();
            list.set(index, e);
            filing.writeFileEmployee(list);
        }
        else System.out.println("Employee record not found");
    }

    public void addNewUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter 1 for customer \nEnter 2 for employee: ");
        int optio = input.nextInt();
        if (optio == 1) {
            Customer c1 = new Customer();
            c1.readData();
            filing.writeToFile(c1);
        }
        else {
            Employee e1 = new Employee();
            e1.readData();
            filing.writeToFile(e1);
        }
    }


    public void calBill() {
        Scanner input = new Scanner(System.in);
        ArrayList<Customer> list = filing.readCustomerFile();
        for (int i = 0; i < list.size(); i++) {
            double Bill = 0;
            int tempUnit = 0;
            int tempLoad = 0;
            String tempCon = list.get(i).connectionType;
            if (tempCon.equalsIgnoreCase("Residential")) {
                tempUnit = list.get(i).noOfUnits;
                tempLoad = list.get(i).load;
                Bill = Residential(tempUnit, tempLoad);
            }
            else {
                tempUnit = list.get(i).noOfUnits;
                tempLoad = list.get(i).load;
                Bill = Commercial(tempUnit, tempLoad);
            }
            System.out.print("Enter bill month: ");
            String month = input.nextLine();
            Record r = new Record(list.get(i).id, month, tempUnit, Bill);
            ArrayList<Record> rlist = new ArrayList<>();
            rlist.add(r);
            filing.writeBillRecord(rlist, true);
        }
    }

    // 1) Residential
    public double Residential(int units, int load) {
        double bill = 0; 
        if ((load < 5) && (units != 0)) {
            if (units < 50)
                bill = units * 5.95;
            else if (units > 50 && units <= 100)
                bill = units * 10.74;
            else if (units > 100 && units <= 200) {
                int Units = units - 100;
                bill = (Units * 12.06) + (100 * 10.74);
            }
            else if (units > 200 && units <= 300) {
                int Units = units - 200;
                bill = (Units * 15.15) + (100 * 12.06) + (100 * 10.74);
            }
            else if (units > 300 && units <= 700) {
                int Units = units - 300;
                bill = (Units * 21.55) + (100 * 10.74) + (100 * 12.06) + (100 * 15.15);
            }
            else if (units > 700){
                int Units = units - 700;
                bill = (Units * 25.65) + (100 * 10.74) + (100 * 12.06) + (100 * 15.15) + (400 * 21.55);
            }
        }
        else {
            bill = units * 18.87;
        }
        return bill;
    }
    // 2) Commercial
    public double Commercial(int units, int load) {
        double bill = 0;
        if ((load < 5) && (units != 0)){
            bill = units * 22.95;
        }
        else if ((load >= 5) && (units != 0)){
            bill = units * 24.63;
        }
        return bill;
    }
}