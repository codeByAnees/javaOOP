package JavaOOP.SemesterProject;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalBillGUI {
	private JComboBox selectMonth;
	private JTextField idText;
	private JButton searchb;
	private JButton backbutton;
	private JButton calbutton;
// FRAME
	public CalBillGUI() {
		Admin admin = new Admin();
		Employee emp = new Employee();
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
		
		// LABEL
		//SEARCHCustomer
		JLabel calBillLabel = new JLabel("Calculate Bill");
		calBillLabel.setBounds(65,20,170,25);
		calBillLabel.setForeground(Color.black);
		calBillLabel.setFont(new Font("Serif", Font.BOLD, 25));
		panel.add(calBillLabel);
		
		//Enter ID
		JLabel idLabel = new JLabel("Enter ID");
		idLabel.setBounds(20,80,60,25);
		idLabel.setFont(new Font("Serif", Font.BOLD, 15));
		idLabel.setForeground(Color.BLACK);
		panel.add(idLabel);
		
		//Select Month	
		JLabel monthLabel = new JLabel("Month");				
		monthLabel.setBounds(20,130,78,25);			
		monthLabel.setFont(new Font("Serif", Font.BOLD, 15));
		monthLabel.setForeground(Color.BLACK);
		panel.add(monthLabel);
		monthLabel.setEnabled(false);
		
		// TEXT FIELDS
		// ID
		idText = new JTextField();
		panel.add(idText);
		idText.setBounds(103,80,60,25);
		idText.setVisible(true);

		// MONTH
		String[] months = {"MTH","Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		selectMonth = new JComboBox(months);
		panel.add(selectMonth);
		selectMonth.setBounds(103,130,60,25);
		selectMonth.setVisible(true);
		selectMonth.setEnabled(false);

// BUTTONS		
		// Search Button
		searchb = new JButton("SEARCH");
		panel.add(searchb);
		searchb.setBounds(175, 80, 80, 23);
		searchb.setForeground(Color.black);
		searchb.setBackground(Color.GRAY);
		searchb.setFont(new Font("Tahoma",Font.BOLD,11));
		searchb.setBorderPainted(false);
		
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
		
		// Calculate Button
		calbutton = new JButton("CALCULATE");
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
                monthLabel.setEnabled(true);
				calbutton.setEnabled(true);
				JOptionPane.showMessageDialog(null, "User found");
            }
            else JOptionPane.showMessageDialog(null, "User not found");
        });

		selectMonth.addItemListener(e -> {
			String month = (String)selectMonth.getSelectedItem();
			String id = idText.getText();
			emp.calBill(id, month);
		});

		calbutton.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Done");
		});
	}
}

