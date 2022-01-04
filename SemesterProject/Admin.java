package JavaOOP.SemesterProject;
import java.io.Serializable;
import java.util.ArrayList;

public class Admin extends LogIn implements Serializable {
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
            String temp = list.get(i).id;
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
            String temp = list.get(i).id;
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
            String temp = list.get(i).id;
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