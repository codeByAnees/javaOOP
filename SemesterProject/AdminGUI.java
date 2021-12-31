package JavaOOP.SemesterProject;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminGUI {
	//public static void main(String[] args) {
        private JButton addBtn;
        private JButton delBtn;
        private JButton editBtn;
        private JButton searchBtn;
        private JButton viewBtn;
        private JButton calBillBtn;
        private JButton addUnitsBtn;
        
		public AdminGUI() {
        Admin admin = new Admin();
        Filing filing = new Filing();

// FRAME	
        JFrame frame = new JFrame();
        frame.setSize(300, 500);
        frame.setLocation(530, 150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
// PANEL
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        frame.add(panel);
        
// LABEL
        JLabel adminLabel = new JLabel("ADMIN");
        adminLabel.setBounds(97,20,100,25);
        adminLabel.setForeground(Color.orange);
        adminLabel.setFont(new Font("Serif",Font.BOLD,25));
        panel.add(adminLabel);
        
// BUTTONS      
        //1-Add Customer
        addBtn = new JButton("Add Customer");
        addBtn.setBounds(65, 80, 152, 30);
        addBtn.setFont(new Font("Arial Black", Font.BOLD, 12));
        addBtn.setForeground(Color.WHITE);
        addBtn.setBackground(Color.black);
        addBtn.setBorderPainted(false);
        panel.add(addBtn);
        
        //2-Delete Customer
        delBtn = new JButton("Delete Customer");
        delBtn.setBounds(65, 120, 152, 30);
        delBtn.setFont(new Font("Arial Black", Font.BOLD, 12));
        delBtn.setForeground(Color.WHITE);
        delBtn.setBackground(Color.black);
        delBtn.setBorderPainted(false);
        panel.add(delBtn);
        
        //3-Edit Customer
        editBtn = new JButton("Edit Customer");
        editBtn.setBounds(65, 160, 152, 30);
        editBtn.setFont(new Font("Arial Black", Font.BOLD, 12));
        editBtn.setForeground(Color.WHITE);
        editBtn.setBackground(Color.black);
        editBtn.setBorderPainted(false);
        panel.add(editBtn);
        
        //4-Search Customer
        searchBtn = new JButton("Search Customer");
        searchBtn.setBounds(65, 200, 153, 30);
        searchBtn.setFont(new Font("Arial Black", Font.BOLD, 12));
        searchBtn.setForeground(Color.WHITE);
        searchBtn.setBackground(Color.black);
        searchBtn.setBorderPainted(false);
        panel.add(searchBtn);
        
        //5-View Customer
        viewBtn = new JButton("View Customers");
        viewBtn.setBounds(65, 240, 152, 30);
        viewBtn.setFont(new Font("Arial Black", Font.BOLD, 12));
        viewBtn.setForeground(Color.WHITE);
        viewBtn.setBackground(Color.black);
        viewBtn.setBorderPainted(false);
        panel.add(viewBtn);

        //6- Calculate Bill
        calBillBtn = new JButton("CALCULATE BILL");
        calBillBtn.setBounds(27, 340, 230, 80);
        calBillBtn.setFont(new Font("Arial Black", Font.BOLD, 17));
        calBillBtn.setForeground(Color.white);
        calBillBtn.setBackground(Color.ORANGE);
        calBillBtn.setBorderPainted(false);
        panel.add(calBillBtn);

	    //7-Enter Customer Units	
        addUnitsBtn = new JButton("Enter Units");
        addUnitsBtn.setBounds(65, 280, 152, 30);
        addUnitsBtn.setFont(new Font("Arial Black", Font.BOLD, 12));
        addUnitsBtn.setForeground(Color.WHITE);
        addUnitsBtn.setBackground(Color.black);
        addUnitsBtn.setBorderPainted(false);
        panel.add(addUnitsBtn);
        
// Event handling
        addBtn.addActionListener(e -> {
            AddCustomerGUI add = new AddCustomerGUI();
            frame.dispose();
        });

        delBtn.addActionListener(e -> {
            DeleteGUI del = new DeleteGUI();
            frame.dispose();
        });

        editBtn.addActionListener(e -> {
            EditGUI edit = new EditGUI();
            frame.dispose();
        });

        searchBtn.addActionListener(e -> {
            SearchGUI s = new SearchGUI();
            frame.dispose();
        });

        viewBtn.addActionListener(e -> {
            ViewRecordGUI view = new ViewRecordGUI();
            ArrayList<Customer> list = filing.readCustomerFile();
            for (int i = 0; i < list.size(); i++) {
                Customer custt = list.get(i);
                view.textArea.append("\n***************************\n");
                view.textArea.append(custt.toString());
            }
            
        });

        addUnitsBtn.addActionListener(e -> {
            SetUnitsGUI units = new SetUnitsGUI();
            frame.dispose();
        });

        calBillBtn.addActionListener(e -> {
            CalBillGUI calBill = new CalBillGUI(); 
            frame.dispose();
        });
	}
}