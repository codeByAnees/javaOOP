package JavaOOP.SemesterProject;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Employee extends User {
    private String jobTitle;
    private String salary;

    Filing filing = new Filing();

    public Employee() {
        super();
        jobTitle = null;
        salary = null;
    }

    public Employee(String name, String add, String cnic, 
    String age, String jobTitle, String salary) {
        super(name, add, cnic, age);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public boolean validation(String ID, String Password) {
        boolean valid = false;
        ArrayList<Employee> list = filing.readEmployeeFile();
        for (int i = 0; i < list.size(); i++) {
            String tempID = list.get(i).id;
            String tempPass = list.get(i).password;
            if (ID.equals(tempID) && Password.equals(tempPass)) {
                valid = true;
            }
        }
        return valid;
    }

    public Employee EmpProfile(String ID) {
        String path = "D:\\Visual Studio\\Java\\JavaOOP\\SemesterProject\\Employee.dat";
        Employee c = new Employee();
        boolean check = false;
        try {
            File file = new File(path);
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            while (true) {
                c = (Employee)in.readObject();
                if (c.id.equals(ID)) {
                    check = true;
                    break;
                }
            }
        }
        catch (EOFException e) {
            System.out.println("\nFile read!\n");
        }
        catch (Exception e) {
            System.out.println("\nException caught");
            System.out.print(e.toString());
        }
        if (check) return c;
        else return null;
    }

    public void setNoOfUnits(int units, String cID) {
        ArrayList<Customer> list = filing.readCustomerFile();
        for (int i = 0; i < list.size(); i++) {
            String tempID = list.get(i).id;
            if (cID.equals(tempID)) {
                list.get(i).noOfUnits = units;
            }
        }
        filing.writeFileCustomer(list);
    }

    public void calBill(String cID, String month) {
        ArrayList<Customer> list = filing.readCustomerFile();
        for (int i = 0; i < list.size(); i++) {
            String tempID = list.get(i).id;
            if (cID.equals(tempID)) {
                double Bill = 0;
                int tempUnit = 0;
                int tempLoad = 0;
                String tempCon = list.get(i).connectionType;
                if (tempCon.equals("Residential")) {
                    tempUnit = list.get(i).noOfUnits;
                    tempLoad = list.get(i).load;
                    Bill = Residential(tempUnit, tempLoad);
                }
                else {
                    tempUnit = list.get(i).noOfUnits;
                    tempLoad = list.get(i).load;
                    Bill = Commercial(tempUnit, tempLoad);
                }
                Record r = new Record(cID, month, tempUnit, Bill);
                ArrayList<Record> rlist = new ArrayList<>();
                rlist.add(r);
                filing.writeBillRecord(rlist, true);
            }
        }
    }

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

    public String toString() {
        return (super.toString() + "\nJob title: " + jobTitle + "\nSalary: " + salary);
    }

    public void setJobTitle(String title) {
        this.jobTitle = title;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getSalary() {
        return salary;
    }
}