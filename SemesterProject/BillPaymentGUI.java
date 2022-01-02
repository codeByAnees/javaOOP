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
import javax.swing.JTextField;

public class BillPaymentGUI {

	
//public static void main(String[] args) {
	public BillPaymentGUI() {
		
		// FRAME
		Filing filing = new Filing();
		JFrame frame=new JFrame();
		frame.setSize(300, 300);
		frame.setLocation(530, 150);
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		
		// PANEL
		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.white);
		frame.add(panel);
		
		
		
										// LABELS
		
		
		
		//SEARCHCustomer
		JLabel l=new JLabel("Payment");
		l.setBounds(92,20,170,25);
		l.setForeground(Color.blue);
		l.setFont(new Font("Serif",Font.BOLD,25));
		panel.add(l);
		
		
		//Select Month
				
		JLabel l2=new JLabel("Month");				
		l2.setBounds(75,80,60,25);			
		l2.setFont(new Font("Serif",Font.BOLD,15));
		l2.setForeground(Color.BLACK);
		panel.add(l2);
		
		
		
		
		
			
		
		
										// TEXT FIELDS
		
		
		
		// MONTH
		
		String []months= {"MTH","Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		JComboBox selectMonth=new JComboBox(months);

		panel.add(selectMonth);
		selectMonth.setBounds(140,80,60,25);
		selectMonth.setVisible(true);
		selectMonth.setEditable(false);
		
		
		
											// BUTTONS
			
		
	
		
		// BACK Button
		
		JButton backbutton=new JButton("BACK");
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
		JButton paybutton=new JButton("PAY");
		panel.add(paybutton);
		paybutton.setBounds(138, 200, 100, 23);
		paybutton.setForeground(Color.white);
		paybutton.setBackground(Color.green);
		paybutton.setFont(new Font("Tahoma",Font.BOLD,11));
		paybutton.setBorderPainted(false);
		paybutton.setEnabled(false);
		
		
		// Payment Method radio Buttons
		
			//CASH
		
		ButtonGroup bg=new ButtonGroup();
		JRadioButton r1=new JRadioButton(" Cash");
		panel.add(r1);
		bg.add(r1);
		r1.setBounds(50,130,60,25);
		r1.setFont(new Font("Serif",Font.BOLD,13));
		r1.setForeground(Color.black);
		r1.setBackground(Color.white);
		r1.setEnabled(false);
		
		   // CREDIT CARD
		
		JRadioButton r2=new JRadioButton(" Credit Card ");
		panel.add(r2);
		bg.add(r2);
		r2.setBounds(130,130,100,25);
		r2.setFont(new Font("Serif",Font.BOLD,13));
		r2.setForeground(Color.black);
		r2.setBackground(Color.white);
		r2.setEnabled(false);
		
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
					r1.setEnabled(true);
					r2.setEnabled(true);
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
	
		r1.addActionListener(e -> {
			r1.getSelectedIcon();
		});

		r2.addActionListener(e -> {
			r2.getSelectedIcon();
		});

		paybutton.addActionListener(e -> {
			if (r1.isSelected()) {
				r2.setEnabled(false);
				JOptionPane.showMessageDialog(null, "Thank you!");
			}
			if (r2.isSelected()) {
				r1.setEnabled(false);
				CreditCardGUI cc = new CreditCardGUI();
			}
		});
	}
}
