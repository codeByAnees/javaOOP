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
	private JLabel userlabel;
	private JTextField userText;
	private JLabel passLabel;
	private JPasswordField passText;
	private JButton b;
		//public static void main(String[] args) {
		public AdminLogInGUI() {
		Customer cust = new Customer();

		// Creating window:
		frame =new JFrame();
		
		frame.setSize(300, 200);
		frame.setLocation(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Creating layout (Invisible Borders):
		panel = new JPanel();
		panel.setLayout(null);
		frame.add(panel);
		
		panel.setBackground(Color.WHITE);
		
		// Creating User Label 1: 
		userlabel = new JLabel("ID"); // Passing name of text field
		userlabel.setBounds(10,20,80,25);
		userlabel.setFont(new Font("Serif",Font.BOLD,15));
		panel.add(userlabel);
		
		
		// Creating Text Field for USer Label: 
		userText=new JTextField(20);// Passing the length of this text field
		userText.setBounds(100,20,165,25);
		panel.add(userText);
		
		
		// Creating password label:
	    passLabel=new JLabel("Password");
						 //(x axis, y axis, width , height)
		passLabel.setBounds(10, 50, 80, 25);
		passLabel.setFont(new Font("Serif",Font.BOLD,15));
		panel.add(passLabel);
		
		
		// Creating text field for Password Label:
	    passText=new JPasswordField();
		passText.setBounds(100,50,165,25);
		panel.add(passText);
		frame.setVisible(true);
		
		
		// Adding LogIn Button
	    b = new JButton("Login");
		b.setBounds(100,100,80,25);
		b.setBackground(Color.BLACK);
		b.setFont(new Font("Tahoma",Font.BOLD,15));
		b.setForeground(Color.white);
		b.setBorderPainted(false);
		panel.add(b);
		b.addActionListener(e-> {
			String ID = userText.getText();
			String pass = new String(passText.getPassword());
			if (ID.equals("admin") && pass.equals("12345")) {
				AdminGUI admin = new AdminGUI();
			}
			else JOptionPane.showMessageDialog(null, "Invalid password or id");

		});
	}
}