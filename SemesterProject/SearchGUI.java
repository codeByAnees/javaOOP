package JavaOOP.SemesterProject;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SearchGUI {
	private JTextField idField;
	private JButton searchBtn;
	private JButton backBtn;
	private JRadioButton custBtn;
    private JRadioButton empBtn;

	public SearchGUI() {
		Admin admin = new Admin();
	// FRAME
		JFrame frame = new JFrame();
		frame.setSize(300, 320);
		frame.setLocation(530, 150);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	// PANEL
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.white);
		frame.add(panel);
		
	// LABEL
		//SEARCHCustomer
		JLabel searchLabel = new JLabel("Search");
		searchLabel.setBounds(100, 20, 100, 25);
		searchLabel.setForeground(Color.green);
		searchLabel.setFont(new Font("Serif", Font.BOLD, 25));
		panel.add(searchLabel);

		//Label Enter Type:
		JLabel type = new JLabel("Type");
		panel.add(type);
		type.setBounds(15, 65, 60, 25);
		type.setForeground(Color.black);
		type.setFont(new Font("Serif",Font.BOLD,15));

		//Enter ID
		JLabel idLabel = new JLabel("Enter ID");
		idLabel.setBounds(103,90,60,25);
		idLabel.setFont(new Font("Serif", Font.BOLD, 15));
		idLabel.setForeground(Color.BLACK);
		panel.add(idLabel);
		
		// TEXT FIELD
		idField = new JTextField();
		panel.add(idField);
		idField.setBounds(103,120,60,25);
		idField.setVisible(true);
			
		//radio buttons
		ButtonGroup bg = new ButtonGroup();
		custBtn = new JRadioButton("Customer");
		custBtn.setBounds(70, 65, 85, 25);
		custBtn.setForeground(Color.black);
		custBtn.setBackground(Color.white);
		panel.add(custBtn);
		bg.add(custBtn);
		empBtn = new JRadioButton("Employee");
		empBtn.setBounds(170, 65, 85, 25);
		empBtn.setForeground(Color.black);
		empBtn.setBackground(Color.white);
		panel.add(empBtn);
		bg.add(empBtn);

		// Search Button
		searchBtn = new JButton("Search");
		panel.add(searchBtn);
		searchBtn.setBounds(90, 170, 90, 25);
		searchBtn.setForeground(Color.WHITE);
		searchBtn.setBackground(Color.GREEN);
		searchBtn.setFont(new Font("Tahoma",Font.BOLD,15));
		searchBtn.setBorderPainted(false);
		searchBtn.addActionListener(e -> {
			if (custBtn.isSelected()) {
				String id = idField.getText();
				Customer cust = admin.searchCustomer(id);
				if (cust != null) {
					JOptionPane.showMessageDialog(null, cust.toString());
				}
				else JOptionPane.showMessageDialog(null, "User not found");
			}
			else if (empBtn.isSelected()) {
				String id = idField.getText();
				Employee empp = admin.searchEmployee(id);
				if (empp != null) {
					JOptionPane.showMessageDialog(null, empp.toString());
				}
				else JOptionPane.showMessageDialog(null, "Employee not found");
			}
		});
	
		// BACK BUTTON
		backBtn = new JButton("Back");
		panel.add(backBtn);
		backBtn.setBounds(90, 210, 90, 25);
		backBtn.setForeground(Color.WHITE);
		backBtn.setBackground(Color.RED);
		backBtn.setFont(new Font("Tahoma",Font.BOLD,15));
		backBtn.setBorderPainted(false);
		backBtn.addActionListener(e -> {
			frame.dispose();
			AdminGUI ad = new AdminGUI();
	});
	
	}
}