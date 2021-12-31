package JavaOOP.SemesterProject;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AddCustomerGUI {
	private JTextField idField;
	private JTextField passField;
	private JTextField nameField;
	private JTextField adrField;
	private JTextField cnicField;
	private JTextField ageField;
	private JComboBox connTypes;
	private JRadioButton rBtn1;
	private JRadioButton rBtn2;
	private JButton addBtn;
	private JButton cancelBtn;

	public AddCustomerGUI() {	
		Admin admin = new Admin();
// Frame
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setLocation(450, 150);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);

// Panel
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.black);
		frame.add(panel);
	
// Labels		
		// Label Front:(ADD Customer)
		JLabel front = new JLabel("ADD RECORD");
		front.setBounds(180, 20, 200, 25);
		front.setFont(new Font("Serif", Font.BOLD,20));
		front.setForeground(Color.WHITE);
		panel.add(front);
		
		// Label Id:
		JLabel id = new JLabel("ID");
		id.setBounds(10, 90, 80, 25);
		id.setFont(new Font("Serif", Font.BOLD,15));
		id.setForeground(Color.white);
		panel.add(id);
		
		// Label Password
		JLabel pass = new JLabel("Password");
		pass.setBounds(250, 90, 80, 25);
		pass.setFont(new Font("Serif", Font.BOLD,15));
		pass.setForeground(Color.white);
		panel.add(pass);
		
		// Label 1: (Name)
		JLabel name = new JLabel("Name");
		name.setBounds(10, 130, 80, 25);
		name.setFont(new Font("Serif", Font.BOLD,15));
		name.setForeground(Color.white);
		panel.add(name);
		
		// Label 2: (ADDRESS)
		JLabel adr = new JLabel("Address");
		adr.setBounds(10, 170, 80, 25);
		adr.setFont(new Font("Serif", Font.BOLD,15));
		adr.setForeground(Color.white);
		panel.add(adr);
		
		// Label 3: (CNIC)
		JLabel enr = new JLabel("CNIC");
		enr.setBounds(10, 210, 80, 25);
		enr.setFont(new Font("Serif", Font.BOLD,15));
		enr.setForeground(Color.white);
		panel.add(enr);
		
		// Label 4: (AGE)
		JLabel age = new JLabel("Age");
		panel.add(age);
		age.setBounds(10, 250, 80, 25);
		age.setFont(new Font("Serif", Font.BOLD,15));
		age.setForeground(Color.white);
		
		// Label 5: (Conn Type)
		JLabel conT = new JLabel("Connec. Type");
		panel.add(conT);
		conT.setBounds(10, 290, 100, 25);
		conT.setForeground(Color.white);
		conT.setFont(new Font("Serif", Font.BOLD,15));
		
		// Label 6: (Load)
		JLabel load = new JLabel("Load");
		panel.add(load);
		load.setBounds(10, 330, 100, 25);
		load.setForeground(Color.white);
		load.setFont(new Font("Serif",Font.BOLD,15));
		
// Creating TEXT FIELDS
		Customer c = new Customer();
		//For Id:
		idField = new JTextField();
		panel.add(idField);
		idField.setBounds(105, 90, 60, 25);
		
		//For Password:
		passField = new JTextField();
		panel.add(passField);
		passField.setBounds(330, 90, 100, 25);
		
		// For Label 1: 
		nameField = new JTextField();
		panel.add(nameField);
		nameField.setBounds(105, 130, 150, 25);
		
		// For Label 2:
		adrField = new JTextField();
		panel.add(adrField);
		adrField.setBounds(105, 170, 150, 25);
		
		// For Label 3:
		cnicField = new JTextField();
		panel.add(cnicField);
		cnicField.setBounds(105, 210, 110, 25);
		
	    // For Label 4:
		ageField = new JTextField();
		panel.add(ageField);
		ageField.setBounds(105, 250, 30, 25);
			
		// For Label 5:
		String[] conn = {"Select" ,"Residential", "Commercial"};
		connTypes = new JComboBox(conn);
		connTypes.setForeground(Color.black);
		
		panel.add(connTypes);
		connTypes.setBounds(105, 290, 100, 25);
		connTypes.addItemListener(e -> {
			c.setConnectionType((String)connTypes.getSelectedItem());
		});

		// For Label 6:
		ButtonGroup bg = new ButtonGroup();
		rBtn1 = new JRadioButton(" < 5 ");
		panel.add(rBtn1);
		bg.add(rBtn1);
		rBtn1.setBounds(105, 332, 60, 25);
		rBtn1.setForeground(Color.white);
		rBtn1.setBackground(Color.black);
		rBtn2 = new JRadioButton(" > 5 ");
		panel.add(rBtn2);
		bg.add(rBtn2);
		rBtn2.setBounds(160, 332, 60, 25);
		rBtn2.setForeground(Color.white);
		rBtn2.setBackground(Color.black);

		rBtn1.addActionListener(e -> {
			if (rBtn1.isSelected())
				c.setLaod(4);
			else c.setLaod(6);
		});

		rBtn2.addActionListener(e -> {
			if (rBtn2.isSelected())
				c.setLaod(6);
			else c.setLaod(4);
		});
		
		
// Creating Buttons
		addBtn = new JButton("Add");
		panel.add(addBtn);
		addBtn.setBounds(120, 400, 90, 25);
		addBtn.setFont(new Font("Serif", Font.BOLD,18));
		addBtn.setBackground(Color.green);
		addBtn.setForeground(Color.white);
		addBtn.setBorderPainted(false);
		addBtn.addActionListener(e -> {
			c.setID(idField.getText());
			c.setPassword(passField.getText());
			c.setName(nameField.getText());
			c.setAddress(adrField.getText());
			c.setCNIC(cnicField.getText());
			c.setAge(ageField.getText());
			c.setMeterNo();
			admin.addNewUser(c);
		});
		
		// Cancel button
		cancelBtn = new JButton("Back");
		panel.add(cancelBtn);
		cancelBtn.setBounds(270, 400, 90, 25);
		cancelBtn.setFont(new Font("Serif", Font.BOLD,18));
		cancelBtn.setBackground(Color.RED);
		cancelBtn.setForeground(Color.white);
		cancelBtn.setBorderPainted(false);
		cancelBtn.addActionListener(e -> {
			frame.dispose();
			AdminGUI adm = new AdminGUI();
		});	
	}
}
