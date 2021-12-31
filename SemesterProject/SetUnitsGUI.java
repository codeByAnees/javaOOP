package JavaOOP.SemesterProject;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SetUnitsGUI {

	Admin admin = new Admin();
	
	//public static void main(String[] args) {
	public SetUnitsGUI() {

		
		// FRAME
		
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
		
		
		
		// LABEL
		//SEARCHCustomer
		JLabel l=new JLabel("Customer Units");
		l.setBounds(50,20,170,25);
		l.setForeground(Color.DARK_GRAY);
		l.setFont(new Font("Serif",Font.BOLD,25));
		panel.add(l);
		//Enter ID
		JLabel l1=new JLabel("Enter ID");
		l1.setBounds(103,60,60,25);
		l1.setFont(new Font("Serif",Font.BOLD,15));
		l1.setForeground(Color.BLACK);
		panel.add(l1);
		//Enter Units
				
		JLabel l2=new JLabel("Enter Units");				
		l2.setBounds(95,130,78,25);			
		l2.setFont(new Font("Serif",Font.BOLD,15));
		l2.setForeground(Color.BLACK);
		panel.add(l2);
		
		
		// TEXT FIELD
		// ID
		JTextField idText=new JTextField();
		panel.add(idText);
		idText.setBounds(103,90,60,25);
		idText.setVisible(true);
		
		// UNITS
		JTextField unitsText=new JTextField();
		panel.add(unitsText);
		unitsText.setBounds(103,160,60,25);
		unitsText.setVisible(true);
		unitsText.setEditable(false);
			
		
		// Search Button
		
		JButton b=new JButton("Search");
		panel.add(b);
		b.setBounds(90, 200, 90, 25);
		
		b.setForeground(Color.WHITE);
		b.setBackground(Color.DARK_GRAY);
		b.setFont(new Font("Tahoma",Font.BOLD,15));
		b.setBorderPainted(false);
		b.addActionListener(e -> {
            String tempid = idText.getText();
            Customer cust = admin.searchCustomer(tempid);
            if (cust != null) {
                unitsText.setEditable(true);
                String temp = unitsText.getText();
                try {
                int units = Integer.parseInt(temp);
                admin.setNoOfUnits(units, tempid);
                }
                catch (Exception e3) {
                    e3.toString();
                }
            } 
        });
	}
}