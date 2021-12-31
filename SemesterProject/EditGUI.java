package JavaOOP.SemesterProject;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class EditGUI {
    Admin admin = new Admin();
    private JButton searchBtn;
    private JButton cancelBtn;
    private JButton addBtn;
    private JTextField idField;
    private JTextField passField;
    private JTextField nameField;
    private JTextField cnicField;
    private JTextField ageField;
    private JTextField adrField;
    private JComboBox connectionType;
    private JRadioButton load1;
    private JRadioButton load2;

    public EditGUI() {
// Frame
        JFrame frame = new JFrame();
        frame.setSize(500, 600);
        frame.setLocation(450, 150);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

// Panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        frame.add(panel);

// Label Front:(ADD Customer)
        JLabel front = new JLabel("EDIT RECORD");
        front.setBounds(180, 20, 200, 25);
        front.setFont(new Font("Serif", Font.BOLD, 20));
        front.setForeground(Color.WHITE);
        panel.add(front);

        // Label Id:
        JLabel idLabel = new JLabel("ID");
        idLabel.setBounds(10, 90, 80, 25);
        idLabel.setFont(new Font("Serif", Font.BOLD, 15));
        idLabel.setForeground(Color.white);
        panel.add(idLabel);

        // Label Password
        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(10, 130, 80, 25);
        passLabel.setFont(new Font("Serif", Font.BOLD, 15));
        passLabel.setForeground(Color.white);
        panel.add(passLabel);

        // Label 1: (Name)
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(10, 170, 80, 25);
        nameLabel.setFont(new Font("Serif", Font.BOLD, 15));
        nameLabel.setForeground(Color.white);
        panel.add(nameLabel);

        // Label 2: (ADDRESS)
        JLabel adrLabel = new JLabel("Address");
        adrLabel.setBounds(10, 210, 80, 25);
        adrLabel.setFont(new Font("Serif", Font.BOLD, 15));
        adrLabel.setForeground(Color.white);
        panel.add(adrLabel);

        // Label 3: (CNIC)
        JLabel cnicLabel = new JLabel("CNIC");
        cnicLabel.setBounds(10, 250, 80, 25);
        cnicLabel.setFont(new Font("Serif", Font.BOLD, 15));
        cnicLabel.setForeground(Color.white);
        panel.add(cnicLabel);

        // Label 4: (AGE)
        JLabel ageLabel = new JLabel("Age");
        panel.add(ageLabel);
        ageLabel.setBounds(10, 290, 80, 25);
        ageLabel.setFont(new Font("Serif", Font.BOLD, 15));
        ageLabel.setForeground(Color.white);

        // Label 5: (Conn Type)
        JLabel conTLabel = new JLabel("Connec. Type");
        panel.add(conTLabel);
        conTLabel.setBounds(10, 330, 100, 25);
        conTLabel.setForeground(Color.white);
        conTLabel.setFont(new Font("Serif", Font.BOLD, 15));

        // Label 6: (Load)
        JLabel loadLabel = new JLabel("Load");
        panel.add(loadLabel);
        loadLabel.setBounds(10, 370, 100, 25);
        loadLabel.setForeground(Color.white);
        loadLabel.setFont(new Font("Serif", Font.BOLD, 15));

// Creating TEXT FIELDS
        // For Id:
        idField = new JTextField();
        panel.add(idField);
        idField.setBounds(105, 90, 60, 25);

        // For Password
        passField = new JTextField();
        panel.add(passField);
        passField.setBounds(105, 130, 80, 25);
        passField.setEditable(false);

        // For Label 1:
        nameField = new JTextField();
        panel.add(nameField);
        nameField.setBounds(105, 170, 150, 25);
        nameField.setEditable(false);

        // For Label 2:
        adrField = new JTextField();
        panel.add(adrField);
        adrField.setBounds(105, 210, 150, 25);
        adrField.setEditable(false);

        // For Label 3:
        cnicField = new JTextField();
        panel.add(cnicField);
        cnicField.setBounds(105, 250, 110, 25);
        cnicField.setEditable(false);

        // For Label 4:
        ageField = new JTextField();
        panel.add(ageField);
        ageField.setBounds(105, 290, 30, 25);
        ageField.setEditable(false);

        // For Label 5:
        String[] conn = { "Select", "Residential", "Commercial" };
        connectionType = new JComboBox(conn);
        panel.add(connectionType);
        connectionType.setEnabled(false);
        connectionType.setForeground(Color.black);
        connectionType.setBounds(105, 330, 100, 25);

        // For Label 6:
        ButtonGroup bg = new ButtonGroup();
        load1 = new JRadioButton(" < 5 ");
        panel.add(load1);
        bg.add(load1);
        load1.setBounds(105, 372, 60, 25);
        load1.setForeground(Color.white);
        load1.setBackground(Color.black);
        load1.setEnabled(false);

        load2 = new JRadioButton(" > 5 ");
        panel.add(load2);
        bg.add(load2);
        load2.setBounds(160, 372, 60, 25);
        load2.setForeground(Color.white);
        load2.setBackground(Color.black);
        load2.setEnabled(false);

// Creating Buttons
        searchBtn = new JButton("Search");
        panel.add(searchBtn);
        searchBtn.setBounds(270, 90, 90, 25);
        searchBtn.setFont(new Font("Serif", Font.BOLD, 18));
        searchBtn.setBackground(Color.orange);
        searchBtn.setForeground(Color.black);
        searchBtn.setBorderPainted(false);

        searchBtn.addActionListener(e -> {
            String tempid = idField.getText();
            Customer cust = admin.searchCustomer(tempid);
			if (cust != null) {
				passField.setEditable(true);
                nameField.setEditable(true);
                adrField.setEditable(true);
                ageField.setEditable(true);
                cnicField.setEditable(true);
                connectionType.setEnabled(true);
                load1.setEnabled(true);
                load2.setEnabled(true);
			}
			else JOptionPane.showMessageDialog(null, "User not found");
        });

        Customer c = new Customer();
        connectionType.addItemListener(e -> {
			c.setConnectionType((String)connectionType.getSelectedItem());
		});

        load1.addActionListener(e -> {
			if (load1.isSelected())
				c.setLaod(4);
			else c.setLaod(6);
		});

		load2.addActionListener(e -> {
			if (load2.isSelected())
				c.setLaod(6);
			else c.setLaod(4);
		});

        addBtn = new JButton("Add");
        panel.add(addBtn);
        addBtn.setBounds(120, 430, 90, 25);
        addBtn.setFont(new Font("Serif", Font.BOLD, 18));
        addBtn.setBackground(Color.green);
        addBtn.setForeground(Color.black);
        addBtn.setBorderPainted(false);
        addBtn.addActionListener(e -> {
            c.setID(idField.getText());
			c.setPassword(passField.getText());
			c.setName(nameField.getText());
			c.setAddress(adrField.getText());
			c.setCNIC(cnicField.getText());
			c.setAge(ageField.getText());
            String tempID = idField.getText();
			admin.editCustomerRec(c, tempID);
		});

        cancelBtn = new JButton("Cancel");
        panel.add(cancelBtn);
        cancelBtn.setBounds(270, 430, 90, 25);
        cancelBtn.setFont(new Font("Serif", Font.BOLD, 18));
        cancelBtn.setBackground(Color.RED);
        cancelBtn.setForeground(Color.black);
        cancelBtn.setBorderPainted(false);
        cancelBtn.addActionListener(e -> {
            frame.dispose();
            AdminGUI ad = new AdminGUI();
        });
    }
}