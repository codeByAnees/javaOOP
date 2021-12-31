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
    // public static void main(String[] args) {
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
        JLabel id = new JLabel("ID");
        id.setBounds(10, 90, 80, 25);
        id.setFont(new Font("Serif", Font.BOLD, 15));
        id.setForeground(Color.white);
        panel.add(id);

        // Label Password
        JLabel pass = new JLabel("Password");
        pass.setBounds(10, 130, 80, 25);
        pass.setFont(new Font("Serif", Font.BOLD, 15));
        pass.setForeground(Color.white);
        panel.add(pass);

        // Label 1: (Name)
        JLabel name = new JLabel("Name");
        name.setBounds(10, 170, 80, 25);
        name.setFont(new Font("Serif", Font.BOLD, 15));
        name.setForeground(Color.white);
        panel.add(name);

        // Label 2: (ADDRESS)
        JLabel adr = new JLabel("Address");
        adr.setBounds(10, 210, 80, 25);
        adr.setFont(new Font("Serif", Font.BOLD, 15));
        adr.setForeground(Color.white);
        panel.add(adr);

        // Label 3: (CNIC)
        JLabel enr = new JLabel("CNIC");
        enr.setBounds(10, 250, 80, 25);
        enr.setFont(new Font("Serif", Font.BOLD, 15));
        enr.setForeground(Color.white);

        panel.add(enr);

        // Label 4: (AGE)
        JLabel age = new JLabel("Age");
        panel.add(age);
        age.setBounds(10, 290, 80, 25);
        age.setFont(new Font("Serif", Font.BOLD, 15));
        age.setForeground(Color.white);

        // Label 5: (Conn Type)
        JLabel conT = new JLabel("Connec. Type");
        panel.add(conT);
        conT.setBounds(10, 330, 100, 25);
        conT.setForeground(Color.white);
        conT.setFont(new Font("Serif", Font.BOLD, 15));

        // Label 6: (Load)
        JLabel load = new JLabel("Load");
        panel.add(load);
        load.setBounds(10, 370, 100, 25);
        load.setForeground(Color.white);
        load.setFont(new Font("Serif", Font.BOLD, 15));

        // Creating TEXT FIELDS

        // For Id:
        JTextField custidText = new JTextField();
        panel.add(custidText);
        custidText.setBounds(105, 90, 60, 25);

        // For Password
        JTextField passText = new JTextField();
        panel.add(passText);
        passText.setBounds(105, 130, 80, 25);
        passText.setEditable(false);

        // For Label 1:
        JTextField custnameText = new JTextField();
        panel.add(custnameText);
        custnameText.setBounds(105, 170, 150, 25);
        custnameText.setEditable(false);

        // For Label 2:

        JTextField custadrText = new JTextField();
        panel.add(custadrText);
        custadrText.setBounds(105, 210, 150, 25);
        custadrText.setEditable(false);

        // For Label 3:
        JTextField custcnText = new JTextField();
        panel.add(custcnText);
        custcnText.setBounds(105, 250, 110, 25);
        custcnText.setEditable(false);

        // For Label 4:
        JTextField custageText = new JTextField();
        panel.add(custageText);
        custageText.setBounds(105, 290, 30, 25);
        custageText.setEditable(false);

        // For Label 5:

        String[] conn = { "Select", "Residential", "Commercial" };

        JComboBox connectionType = new JComboBox(conn);
        panel.add(connectionType);
        connectionType.setEnabled(false);
        connectionType.setForeground(Color.black);
        connectionType.setBounds(105, 330, 100, 25);

        // For Label 6:
        ButtonGroup bg = new ButtonGroup();
        JRadioButton load1 = new JRadioButton(" < 5 ");
        panel.add(load1);
        bg.add(load1);
        load1.setBounds(105, 372, 60, 25);
        load1.setForeground(Color.white);
        load1.setBackground(Color.black);
        load1.setEnabled(false);
        JRadioButton load2 = new JRadioButton(" > 5 ");
        panel.add(load2);
        bg.add(load2);
        load2.setBounds(160, 372, 60, 25);
        load2.setForeground(Color.white);
        load2.setBackground(Color.black);
        load2.setEnabled(false);

        // Creating Buttons
        JButton bsearch = new JButton("Search");
        panel.add(bsearch);
        bsearch.setBounds(270, 90, 90, 25);
        bsearch.setFont(new Font("Serif", Font.BOLD, 18));
        bsearch.setBackground(Color.orange);
        bsearch.setForeground(Color.black);
        bsearch.setBorderPainted(false);
        bsearch.addActionListener(e -> {
            String tempid = custidText.getText();
            Customer cust = admin.searchCustomer(tempid);
			if (cust != null) {
				passText.setEditable(true);
                custnameText.setEditable(true);
                custadrText.setEditable(true);
                custageText.setEditable(true);
                custcnText.setEditable(true);
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

        JButton b2 = new JButton("Add");
        panel.add(b2);
        b2.setBounds(120, 430, 90, 25);
        b2.setFont(new Font("Serif", Font.BOLD, 18));
        b2.setBackground(Color.green);
        b2.setForeground(Color.black);
        b2.setBorderPainted(false);
        b2.addActionListener(e -> {
            c.setID(custidText.getText());
			c.setPassword(passText.getText());
			c.setName(custnameText.getText());
			c.setAddress(custadrText.getText());
			c.setCNIC(custcnText.getText());
			c.setAge(custageText.getText());
            String tempID = custidText.getText();
			admin.editCustomerRec(c, tempID);
		});

        JButton b3 = new JButton("Cancel");
        panel.add(b3);
        b3.setBounds(270, 430, 90, 25);
        b3.setFont(new Font("Serif", Font.BOLD, 18));
        b3.setBackground(Color.RED);
        b3.setForeground(Color.black);
        b3.setBorderPainted(false);
        b3.addActionListener(e -> {
            frame.dispose();
        });

    }
}
