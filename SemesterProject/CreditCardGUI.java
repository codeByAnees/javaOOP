package JavaOOP.SemesterProject;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreditCardGUI {
	private JTextField ccnText;
	private JTextField pinText;
	private JButton payBtn;
	private JButton pay;
	private JButton exit;

	public CreditCardGUI() {
//FRAME
		Payment payme = new Payment();
		JFrame frame = new JFrame();
		frame.setSize(600, 440);
		frame.setLocation(420,180);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		
	// PANEL
		//Main
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.black);
		
		//Background
		ImageIcon image = new ImageIcon("D:\\Visual Studio\\Java\\JavaOOP\\SemesterProject\\Darkred.jpg");
		JLabel background = new JLabel(image);
		panel.add(background);
		background.setBounds(0, 0, 600, 400);
		background.setIcon(image);

		//Credit Card
		ImageIcon image2 = new ImageIcon("D:\\Visual Studio\\Java\\JavaOOP\\SemesterProject\\Credit3.jpg");
		JLabel creditCardPic = new JLabel(image2);
		background.add(creditCardPic);
		creditCardPic.setBounds(375, 13, 200, 80);
		creditCardPic.setIcon(image2);
		
	// LABEL
		//CCN
		JLabel creditCardLabel = new JLabel("Enter CCN");
		background.add(creditCardLabel);
		creditCardLabel.setBounds(240,100,120,50);
		creditCardLabel.setForeground(Color.white);
		creditCardLabel.setFont(new Font("Serif", Font.BOLD, 20));
		
		// PIN
		JLabel pinLabel = new JLabel("Enter PIN");
		background.add(pinLabel);
		pinLabel.setBounds(243,180,120,50);
		pinLabel.setForeground(Color.white);
		pinLabel.setFont(new Font("Serif",Font.BOLD,20));
		
	//TEXTFIELD
		//CCN
		ccnText = new JTextField();
		background.add(ccnText);
		ccnText.setBounds(200, 145, 180, 30);
		ccnText.setBackground(Color.white);
		
		//PIN
		pinText = new JTextField();
		background.add(pinText);
		pinText.setBounds(200, 225, 180, 30);
		pinText.setBackground(Color.white);
		
	//BUTTONS
		//DESIGN 1
		payBtn = new JButton("  PAYMENT ");
		background.add(payBtn);
		payBtn.setBounds(20,35,170,20);
		payBtn.setFont(new Font("Serif",Font.BOLD,20));
		payBtn.setForeground(Color.black);
		payBtn.setBackground(Color.white);
		payBtn.setBorderPainted(false);
		
		//PAY
		pay = new JButton("P A Y");
		background.add(pay);
		pay.setBounds(287,290,100,34);
		pay.setFont(new Font("Serif", Font.PLAIN, 17));
		pay.setForeground(Color.white);
		pay.setBackground(Color.orange);
		pay.setBorderPainted(false);
		
		//EXIT
		exit = new JButton("E X I T");
		background.add(exit);
		exit.setBounds(187,290,100,34);
		exit.setFont(new Font("Serif", Font.PLAIN, 17));
		exit.setForeground(Color.white);
		exit.setBackground(Color.red);
		exit.setBorderPainted(false);

		exit.addActionListener(e1 -> {
			frame.dispose();
		});
		
		pay.addActionListener(e2 -> {
			String cc = ccnText.getText();
			boolean check = payme.isCCValid(cc);
			if (check) {
				JOptionPane.showMessageDialog(null, "Paid");
				frame.dispose();
			}
			else JOptionPane.showMessageDialog(null, "Invalid Credit Card");
		});
	}
}

