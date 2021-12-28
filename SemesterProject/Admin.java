package JavaOOP.SemesterProject;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Admin extends LogIn implements Serializable {
    protected String id;
    protected String password;
    Filing filing = new Filing();
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

    public int searchCustomer(String userID, ArrayList<Customer> o) {
        int index = -1;
        for (int i = 0; i < o.size(); i++) {
            String temp = o.get(i).id;
            if (temp.equals(userID)) {
                index = i;
            }
        }
        return index;
    }

    public void delCustomer(String ID, ArrayList<Customer> o) {
        int index = searchCustomer(ID, o);
        if (index != -1) {
            o.remove(index);
            filing.writeFileCustomer(o);
            System.out.println("Done");
        }
        else System.out.println("\nUser not found!\n");
    }
    

    public int searchEmp(String ID, ArrayList<Employee> o) {
        int index = -1;
        for (int i = 0; i < o.size(); i++) {
            String temp = o.get(i).id;
            if (temp.equals(ID)) {
                index = i;
            }
        }
        return index;
    }

    public void delEmployee(String ID, ArrayList<Employee> o) {
        int index = searchEmp(ID, o);
        if (index != -1) {
            o.remove(index);
            filing.writeFileEmployee(o);
            System.out.println("\nDone\n");
        }
        else System.out.println("\nUser not found!\n");
    }


    public void calBill(ArrayList<Customer> o) {
        File file = new File("D:\\Visual Studio\\Java\\JavaOOP\\SemesterProject\\BillRecord.dat");
        for (int i = 0; i < o.size(); i++) {
            double bill = 0;
            String tempCon = o.get(i).connectionType;
            if (tempCon.equalsIgnoreCase("Residential")) {
                int tempUnit = o.get(i).noOfUnits;
                int tempLoad = o.get(i).load;
                bill = Residential(tempUnit, tempLoad);
            }
            else {
                int tempUnit = o.get(i).noOfUnits;
                int tempLoad = o.get(i).load;
                bill = Commercial(tempUnit, tempLoad);
            }
            String tempID = o.get(i).id;
            try {
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file, true));
                out.writeUTF(tempID);
                out.writeObject(new Date());
                out.writeDouble(bill);
                out.close();
            }
            catch (Exception e) {
                System.out.println("\nException caught-->");
                System.out.print(e.toString());
            }
        }
    }

    // 1) Residential
    public static double Residential(int units, int load) {
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
    public static double Commercial(int units, int load) {
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