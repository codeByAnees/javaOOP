package JavaOOP.SemesterProject;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainGUI {
	public static void main(String[] args) {
// Frame
		JFrame frame = new JFrame();
		frame.setSize(1000, 710);
		frame.setLocation(170, 15);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// PANEL
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.black);
		ImageIcon image = new ImageIcon("D:\\Visual Studio\\Java\\JavaOOP\\SemesterProject\\a.jpg");
		JLabel background = new JLabel(image);
		background.setBounds(0, 120, 990, 500);
		background.setIcon(image);
		panel.add(background);
		frame.setVisible(true);
		frame.add(panel);
		
		// Upper Boundary
		JPanel upper = new JPanel();
		upper.setLayout(null);
		upper.setBounds(0, 20, 1000, 80);
		upper.setBackground(Color.black);
		panel.add(upper);
		
		// Lower Boundary
		JPanel lower = new JPanel();
		lower.setLayout(null);
		lower.setBounds(0, 550, 1000, 80);
		lower.setBackground(Color.black);
		panel.add(lower);
					
// LABEL
		//1-UPPER
		JLabel upperlabel = new JLabel("ELECTRICITY  BILL  MANAGEMENT  SYSTEM");
		upper.add(upperlabel);
		upperlabel.setBounds(95, 17, 800, 50);
		upperlabel.setFont(new Font("Serif", Font.CENTER_BASELINE, 35));
		upperlabel.setForeground(Color.white);
		
		//2-LOWER
		JLabel lowerlabel = new JLabel("-------------------------------------------------------------------------");
		background.add(lowerlabel);
		lowerlabel.setBounds(53, 400, 1000, 80);
		lowerlabel.setFont(new Font("Serif", Font.CENTER_BASELINE, 35));
		lowerlabel.setForeground(Color.white);
			
// BUTTONS
		//admin
		JButton adminBtn = new JButton("ADMIN");
		adminBtn.setBounds(50, 100, 250, 40);
		adminBtn.setFont(new Font("Serif", Font.BOLD, 25));
		adminBtn.setForeground(Color.white);
		adminBtn.setBackground(Color.black);
		adminBtn.setBorderPainted(false);
		background.add(adminBtn);
		
		//Customer
		JButton customerBtn = new JButton("CUSTOMER");
		customerBtn.setBounds(50, 180, 250, 40);
		customerBtn.setFont(new Font("Serif", Font.BOLD, 25));
		customerBtn.setForeground(Color.white);
		customerBtn.setBackground(Color.black);
		customerBtn.setBorderPainted(false);
		background.add(customerBtn);
		
		//exit
		JButton exitBtn = new JButton("EXIT");
		exitBtn.setBounds(50, 260, 250, 40);
		exitBtn.setFont(new Font("Serif", Font.BOLD, 25));
		exitBtn.setForeground(Color.white);
		exitBtn.setBackground(Color.black);
		exitBtn.setBorderPainted(false);
		background.add(exitBtn);
		exitBtn.addActionListener(e -> {
			frame.dispose();
			
		});

		adminBtn.addActionListener(e -> {
			AdminLogInGUI admin = new AdminLogInGUI();
		});

		customerBtn.addActionListener(e -> {
			CustomerLogInGUI custLogin = new CustomerLogInGUI();
		}); 
	}
}
