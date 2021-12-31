package JavaOOP.SemesterProject;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalBillGUI {
//public static void main(String[] args) {
	
    
		
		// FRAME
	public CalBillGUI() {
		Admin admin = new Admin();
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
		JLabel l=new JLabel("Calculate Bill");
		l.setBounds(65,20,170,25);
		l.setForeground(Color.black);
		l.setFont(new Font("Serif",Font.BOLD,25));
		panel.add(l);
		
		//Enter ID
		JLabel l1=new JLabel("Enter ID");
		l1.setBounds(20,80,60,25);
		l1.setFont(new Font("Serif",Font.BOLD,15));
		l1.setForeground(Color.BLACK);
		panel.add(l1);
		
		//Select Month
				
		JLabel l2=new JLabel("Month");				
		l2.setBounds(20,130,78,25);			
		l2.setFont(new Font("Serif",Font.BOLD,15));
		l2.setForeground(Color.BLACK);
		panel.add(l2);
		l2.setEnabled(false);
		
		
			
		
		
										// TEXT FIELDS
		
		
		// ID
		JTextField idText=new JTextField();
		panel.add(idText);
		idText.setBounds(103,80,60,25);
		idText.setVisible(true);
		
		// MONTH
		
		String []months= {"MTH","Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		JComboBox selectMonth=new JComboBox(months);

		panel.add(selectMonth);
		selectMonth.setBounds(103,130,60,25);
		selectMonth.setVisible(true);
		selectMonth.setEnabled(false);

		
							
		
		
		
											// BUTTONS
			
		
		// Search Button
		
		JButton searchb=new JButton("SEARCH");
		panel.add(searchb);
		searchb.setBounds(175, 80, 80, 23);
		
		searchb.setForeground(Color.black);
		searchb.setBackground(Color.GRAY);
		searchb.setFont(new Font("Tahoma",Font.BOLD,11));
		searchb.setBorderPainted(false);
		
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
		
		
		// Calculate Button
		JButton calbutton=new JButton("CALCULATE");
		panel.add(calbutton);
		calbutton.setBounds(138, 200, 100, 23);
		calbutton.setForeground(Color.white);
		calbutton.setBackground(Color.black);
		calbutton.setFont(new Font("Tahoma",Font.BOLD,11));
		calbutton.setBorderPainted(false);
		calbutton.setEnabled(false);
		
	
        searchb.addActionListener(e -> {
            String id = idText.getText();
			Customer cust = admin.searchCustomer(id);
            if (cust != null) {
                selectMonth.setEnabled(true);
                l2.setEnabled(true);
				calbutton.setEnabled(true);
            }
            else JOptionPane.showMessageDialog(null, "User not found");
        });

		selectMonth.addItemListener(e -> {
			String month = (String)selectMonth.getSelectedItem();
			String id = idText.getText();
			admin.calBill(id, month);
			selectMonth.getSelectedItem();
		});

		calbutton.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Done");
		});
	}
}

