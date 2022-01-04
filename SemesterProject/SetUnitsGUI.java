package JavaOOP.SemesterProject;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class SetUnitsGUI {
	private JTextField idField;
	private JTextField unitsField;
	private JButton searchB;
	private JButton addUnits;
	private JButton backBtn;

	public SetUnitsGUI() {
		
		Admin admin = new Admin();
		Employee emp = new Employee();
	// FRAME
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		frame.setLocation(530, 150);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	// PANEL
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.white);
		frame.add(panel);
		
	// LABEL
		///SEARCH Customer
		JLabel mainLabel = new JLabel("Customer Units");
		mainLabel.setBounds(70, 20, 180, 25);
		mainLabel.setForeground(Color.black);
		mainLabel.setFont(new Font("Serif", Font.BOLD, 21));
		panel.add(mainLabel);

		//Enter ID
		JLabel idLabel = new JLabel("Enter ID");
		idLabel.setBounds(20, 80, 60, 25);
		idLabel.setFont(new Font("Serif", Font.BOLD, 15));
		idLabel.setForeground(Color.BLACK);
		panel.add(idLabel);

		//Enter Units		
		JLabel addUnitsLabel = new JLabel("Enter Units");				
		addUnitsLabel.setBounds(20, 130, 78, 25);			
		addUnitsLabel.setFont(new Font("Serif", Font.BOLD, 15));
		addUnitsLabel.setForeground(Color.BLACK);
		panel.add(addUnitsLabel);
		
	// TEXT FIELD
		// ID
		idField = new JTextField();
		panel.add(idField);
		idField.setBounds(103, 80, 60, 25);
		idField.setVisible(true);
		
		// UNITS
		unitsField = new JTextField();
		panel.add(unitsField);
		unitsField.setBounds(103, 130, 60, 25);
		unitsField.setVisible(true);
		unitsField.setEditable(false);
			
	// Search Button
		searchB = new JButton("SEARCH");
		panel.add(searchB);
		searchB.setBounds(175, 80, 80, 23);
		searchB.setForeground(Color.black);
		searchB.setBackground(Color.orange);
		searchB.setFont(new Font("Tahoma",Font.BOLD,11));
		searchB.setBorderPainted(false);
	
	// ADD Button
		addUnits = new JButton("ADD");
		panel.add(addUnits);
		addUnits.setBounds(175, 130, 80, 23);	
		addUnits.setForeground(Color.black);
		addUnits.setBackground(Color.orange);
		addUnits.setFont(new Font("Tahoma", Font.BOLD, 11));
		addUnits.setBorderPainted(false);
		addUnits.setEnabled(false);
// BACK Button
		backBtn = new JButton("Back");
		panel.add(backBtn);
		backBtn.setBounds(103, 190, 74, 30);	
		backBtn.setForeground(Color.white);
		backBtn.setBackground(Color.red);
		backBtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		backBtn.setBorderPainted(false);

		searchB.addActionListener(e -> {
            String tempid = idField.getText();
            Customer cust = admin.searchCustomer(tempid);
            if (cust != null) {
                unitsField.setEditable(true);
				addUnits.setEnabled(true);
				JOptionPane.showMessageDialog(null, "User found");
            }
			else JOptionPane.showMessageDialog(null, "User not found");
        });

		addUnits.addActionListener(e -> {
			try {
				String temp = unitsField.getText();
				int units = Integer.parseInt(temp);
				emp.setNoOfUnits(units, idField.getText());
				JOptionPane.showMessageDialog(null, "Added successfully");
			}
			catch (Exception e3) {
				e3.toString();
			}
		});

		backBtn.addActionListener(e -> {
			frame.dispose();
			EmployeeGUI ep = new EmployeeGUI();
		});
	}
}