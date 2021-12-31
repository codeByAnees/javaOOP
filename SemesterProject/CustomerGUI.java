package JavaOOP.SemesterProject;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CustomerGUI {
	//public static void main(String[] args) {
		// FRAME
		public CustomerGUI() {
		JFrame frame=new JFrame();
		frame.setSize(300, 450);
		frame.setLocation(530, 150);
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// PANEL
		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.black);
		frame.add(panel);
		
		// LABEL
		JLabel l=new JLabel("CUSTOMER");
		l.setBounds(69,20,200,25);
		l.setForeground(Color.white);
		l.setFont(new Font("Serif",Font.BOLD,25));
		panel.add(l);
		
		
		// BUTTONS
		
		//1- Bill Payment		
		JButton b1=new JButton("VIEW PROFILE");
		b1.setBounds(42,100,200,40);
		b1.setFont(new Font("Arial Black",Font.BOLD,15));
		b1.setForeground(Color.white);
		b1.setBackground(Color.BLUE);
		b1.setBorderPainted(false);
		panel.add(b1);
		
		
		//1- View Profile
		JButton b=new JButton("BILL PAYMENT");
		b.setBounds(42,180,200,40);
		b.setFont(new Font("Arial Black",Font.BOLD,15));
		b.setForeground(Color.white);
		b.setBackground(Color.green);
		b.setBorderPainted(false);
		panel.add(b);
		
		//1- View Profile
		JButton b2=new JButton("CANCEL");
		b2.setBounds(42,260,200,40);
		b2.setFont(new Font("Arial Black",Font.BOLD,15));
		b2.setForeground(Color.white);
		b2.setBackground(Color.RED);
		b2.setBorderPainted(false);
		panel.add(b2);
		b2.addActionListener(e->System.exit(0));

		b1.addActionListener(e -> {

		});
	}
}

