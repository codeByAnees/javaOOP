package JavaOOP.SemesterProject;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminGUI {
    private JButton addBtn;
    private JButton editBtn;
    private JButton viewBtn;
    private JButton addEmp;
    private JButton viewEmp;
    private JButton deletebutton;
    private JButton searchbutton;
    private JButton exitbutton;

    public AdminGUI() {
        Filing filing = new Filing();
    // FRAME	
        JFrame frame = new JFrame();
        frame.setSize(450, 450);
        frame.setLocation(430, 150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    // PANEL
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        frame.add(panel);
        
    // LABEL
        JLabel adminLabel = new JLabel("ADMIN");
        adminLabel.setBounds(160,20,100,25);
        adminLabel.setForeground(Color.orange);
        adminLabel.setFont(new Font("Serif",Font.BOLD,26));
        panel.add(adminLabel);
        
    // BUTTONS      
        //Add Customer
        addBtn = new JButton("Add Customer");
        addBtn.setBounds(140, 75, 152, 50);
        addBtn.setFont(new Font("Arial Black", Font.BOLD, 14));
        addBtn.setForeground(Color.WHITE);
        addBtn.setBackground(Color.black);
        addBtn.setBorderPainted(false);
        panel.add(addBtn);
        
        //Edit Customer
        editBtn = new JButton("Edit Customer");
        editBtn.setBounds(140, 195, 152, 50);
        editBtn.setFont(new Font("Arial Black", Font.BOLD, 14));
        editBtn.setForeground(Color.WHITE);
        editBtn.setBackground(Color.black);
        editBtn.setBorderPainted(false);
        panel.add(editBtn);
        
        //View Customer
        viewBtn = new JButton("View Customers");
        viewBtn.setBounds(60, 260, 150, 35);
        viewBtn.setFont(new Font("Arial Black", Font.BOLD, 12));
        viewBtn.setForeground(Color.WHITE);
        viewBtn.setBackground(Color.black);
        viewBtn.setBorderPainted(false);
        panel.add(viewBtn);

        //SEARCH EMPLOYEE OR CUSTOMER
        searchbutton = new JButton("SEARCH");
        searchbutton.setBounds(60, 310, 150, 50);
        searchbutton.setFont(new Font("Arial Black", Font.BOLD, 17));
        searchbutton.setForeground(Color.white);
        searchbutton.setBackground(Color.ORANGE);
        searchbutton.setBorderPainted(false);
        panel.add(searchbutton);
        
        //DELETE EMPLOYEE OR CUSTOMER
        deletebutton = new JButton("DELETE");
        deletebutton.setBounds(230, 310, 150, 50);
        deletebutton.setFont(new Font("Arial Black", Font.BOLD, 17));
        deletebutton.setForeground(Color.white);
        deletebutton.setBackground(Color.red);
        deletebutton.setBorderPainted(false);
        panel.add(deletebutton);
        
        //Add employee
        addEmp = new JButton("Add Employee");
        addEmp.setBounds(140, 135, 152, 50);
        addEmp.setFont(new Font("Arial Black", Font.BOLD, 14));
        addEmp.setForeground(Color.white);
        addEmp.setBackground(Color.black);
        addEmp.setBorderPainted(false);
        panel.add(addEmp);

        // view emp
        viewEmp = new JButton("View Employees");
        viewEmp.setBounds(230, 260, 150, 35);
        viewEmp.setFont(new Font("Arial Black", Font.BOLD, 12));
        viewEmp.setForeground(Color.white);
        viewEmp.setBackground(Color.black);
        viewEmp.setBorderPainted(false);
        panel.add(viewEmp);
        
        // EXIT
        exitbutton = new JButton("EXIT");
        exitbutton.setBounds(0,20,100,30);
        exitbutton.setFont(new Font("Arial Black", Font.BOLD, 15));
        exitbutton.setForeground(Color.white);
        exitbutton.setBackground(Color.green);
        exitbutton.setBorderPainted(false);
        panel.add(exitbutton);

        exitbutton.addActionListener(e->{
            frame.dispose();
        });

        addBtn.addActionListener(e -> {
            AddCustomerGUI add = new AddCustomerGUI();
            frame.dispose();
        });

        editBtn.addActionListener(e -> {
            EditGUI edit = new EditGUI();
            frame.dispose();
        });

        viewBtn.addActionListener(e -> {
            ViewRecordGUI view = new ViewRecordGUI();
            ArrayList<Customer> list = filing.readCustomerFile();
            for (int i = 0; i < list.size(); i++) {
                Customer custt = list.get(i);
                view.getArea().append("\n***************************\n");
                view.getArea().append(custt.toString());
            }
        });

        addEmp.addActionListener(e -> {
            AddEmployeeGUI ae = new AddEmployeeGUI();
            frame.dispose();
        });

        viewEmp.addActionListener(e -> {
            ViewRecordGUI view = new ViewRecordGUI();
            ArrayList<Employee> list = filing.readEmployeeFile();
            for (int i = 0; i < list.size(); i++) {
                Employee empp = list.get(i);
                view.getArea().append("\n***************************\n");
                view.getArea().append(empp.toString());
            }
        }); 

        deletebutton.addActionListener(e -> {
            DeleteGUI d = new DeleteGUI();
            frame.dispose();
        });

        searchbutton.addActionListener(e -> {
            SearchGUI s = new SearchGUI();
            frame.dispose();
        });
    }
}