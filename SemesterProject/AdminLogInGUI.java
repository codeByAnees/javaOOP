package JavaOOP.SemesterProject;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminLogInGUI {
	private JFrame frame;
	private JPanel panel;
	private JTextField idField;
	private JPasswordField passField;
	private JButton logInBtn;

	public AdminLogInGUI() {
		Customer cust = new Customer();
// Creating window:
		frame = new JFrame();
		frame.setSize(300, 200);
		frame.setLocation(500, 200);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
// Creating layout (Invisible Borders):
		panel = new JPanel();
		panel.setLayout(null);
		frame.add(panel);
		panel.setBackground(Color.WHITE);
		
// Creating User Label 1: 
		JLabel userlabel = new JLabel("ID");
		userlabel.setBounds(10,20,80,25);
		userlabel.setFont(new Font("Serif", Font.BOLD, 15));
		panel.add(userlabel);
		
		// Creating Text Field for User Label: 
		idField = new JTextField(20);
		idField.setBounds(100, 20, 165, 25);
		panel.add(idField);
		
		// Creating password label:
	    JLabel passLabel = new JLabel("Password");
						 //(x axis, y axis, width , height)
		passLabel.setBounds(10, 50, 80, 25);
		passLabel.setFont(new Font("Serif", Font.BOLD, 15));
		panel.add(passLabel);
		
		// Creating text field for Password Label:
	    passField = new JPasswordField();
		passField.setBounds(100, 50, 165, 25);
		panel.add(passField);
		frame.setVisible(true);
		
// Adding LogIn Button
	    logInBtn = new JButton("Login");
		logInBtn.setBounds(100, 100, 80, 25);
		logInBtn.setBackground(Color.BLACK);
		logInBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		logInBtn.setForeground(Color.white);
		logInBtn.setBorderPainted(false);
		panel.add(logInBtn);
		logInBtn.addActionListener(e -> {
			String ID = idField.getText();
			String pass = new String(passField.getPassword());
			if (ID.equals("admin") && pass.equals("12345")) {
				AdminGUI admin = new AdminGUI();
				frame.dispose();
			}
			else JOptionPane.showMessageDialog(null, "Invalid password or id");
		});
	}
}