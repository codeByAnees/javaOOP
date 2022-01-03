package JavaOOP.SemesterProject;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class BillPaymentGUI {
	private JComboBox selectMonth;
	private JButton backbutton;
	private JButton paybutton;
	private JRadioButton cash;
	private JRadioButton creditC;

	public BillPaymentGUI() {
		
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
		
// LABELS
		//SEARCHCustomer
		JLabel searchLabel = new JLabel("Payment");
		searchLabel.setBounds(92,20,170,25);
		searchLabel.setForeground(Color.blue);
		searchLabel.setFont(new Font("Serif", Font.BOLD, 25));
		panel.add(searchLabel);
		
		//Select Month		
		JLabel monthLabel = new JLabel("Month");				
		monthLabel.setBounds(75,80,60,25);			
		monthLabel.setFont(new Font("Serif", Font.BOLD, 15));
		monthLabel.setForeground(Color.BLACK);
		panel.add(monthLabel);

// TEXT FIELDS		
		String[] months = {"MTH","Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		selectMonth = new JComboBox(months);
		panel.add(selectMonth);
		selectMonth.setBounds(140,80,60,25);
		selectMonth.setVisible(true);
		selectMonth.setEditable(false);
		
// BUTTONS		
		// BACK Button
		backbutton = new JButton("BACK");
		panel.add(backbutton);
		backbutton.setBounds(38, 200, 100, 23);
		backbutton.setForeground(Color.white);
		backbutton.setBackground(Color.red);
		backbutton.setFont(new Font("Tahoma",Font.BOLD,11));
		backbutton.setBorderPainted(false);
		backbutton.addActionListener(e -> {
			frame.dispose();
		});
		
		// Pay BUtton
		paybutton = new JButton("PAY");
		panel.add(paybutton);
		paybutton.setBounds(138, 200, 100, 23);
		paybutton.setForeground(Color.white);
		paybutton.setBackground(Color.green);
		paybutton.setFont(new Font("Tahoma",Font.BOLD,11));
		paybutton.setBorderPainted(false);
		paybutton.setEnabled(false);
		
		// Payment Method radio Buttons	
		//CASH
		ButtonGroup bg = new ButtonGroup();
		cash = new JRadioButton(" Cash");
		panel.add(cash);
		bg.add(cash);
		cash.setBounds(50,130,60,25);
		cash.setFont(new Font("Serif",Font.BOLD,13));
		cash.setForeground(Color.black);
		cash.setBackground(Color.white);
		cash.setEnabled(false);
		
		// CREDIT CARD
		creditC = new JRadioButton(" Credit Card ");
		panel.add(creditC);
		bg.add(creditC);
		creditC.setBounds(130,130,100,25);
		creditC.setFont(new Font("Serif",Font.BOLD,13));
		creditC.setForeground(Color.black);
		creditC.setBackground(Color.white);
		creditC.setEnabled(false);
		
		selectMonth.addItemListener(e -> {
			String billMonth = (String)selectMonth.getSelectedItem();
			Customer c = new Customer();
			ArrayList<Record> list = c.payBill();
			String ID = CustomerLogInGUI.logID;
			int index = -1;
			String temp = "";
			for (int i = 0; i < list.size(); i++) {
				String rID = list.get(i).id;
				String rMonth = list.get(i).month;
				if (rID.equals(ID) && rMonth.equals(billMonth)) {
					cash.setEnabled(true);
					creditC.setEnabled(true);
					paybutton.setEnabled(true);
					temp = list.get(i).toString();
					index = 0;
					break;
				}
			}
			if (index == -1) {
				JOptionPane.showMessageDialog(null, "Bill not found");
			}
		});
	
		cash.addActionListener(e -> {
			cash.getSelectedIcon();
		});

		creditC.addActionListener(e -> {
			creditC.getSelectedIcon();
		});

		paybutton.addActionListener(e -> {
			if (cash.isSelected()) {
				creditC.setEnabled(false);
				JOptionPane.showMessageDialog(null, "Thank you!");
			}
			if (creditC.isSelected()) {
				cash.setEnabled(false);
				CreditCardGUI cc = new CreditCardGUI();
			}
		});
	}
}
