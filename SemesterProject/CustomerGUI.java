package JavaOOP.SemesterProject;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CustomerGUI {
	//public static void main(String[] args) {
		private JButton viewBtn;
		private JButton payBtn;
		private JButton cancelBtn;
		public CustomerGUI() {
// FRAME
		JFrame frame = new JFrame();
		frame.setSize(300, 450);
		frame.setLocation(530, 150);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
// PANEL
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.black);
		frame.add(panel);
		
// LABEL
		JLabel custLabel = new JLabel("CUSTOMER");
		custLabel.setBounds(69,20,200,25);
		custLabel.setForeground(Color.white);
		custLabel.setFont(new Font("Serif", Font.BOLD, 25));
		panel.add(custLabel);
		
// BUTTONS
		//1- View Profile	
		viewBtn = new JButton("VIEW PROFILE");
		viewBtn.setBounds(42, 100, 200, 40);
		viewBtn.setFont(new Font("Arial Black", Font.BOLD, 15));
		viewBtn.setForeground(Color.white);
		viewBtn.setBackground(Color.BLUE);
		viewBtn.setBorderPainted(false);
		panel.add(viewBtn);
		
		//2- Bill Payment
		payBtn = new JButton("BILL PAYMENT");
		payBtn.setBounds(42, 180, 200, 40);
		payBtn.setFont(new Font("Arial Black", Font.BOLD, 15));
		payBtn.setForeground(Color.white);
		payBtn.setBackground(Color.green);
		payBtn.setBorderPainted(false);
		panel.add(payBtn);
		
		//3- Cancel
		cancelBtn = new JButton("CANCEL");
		cancelBtn.setBounds(42, 260, 200, 40);
		cancelBtn.setFont(new Font("Arial Black", Font.BOLD, 15));
		cancelBtn.setForeground(Color.white);
		cancelBtn.setBackground(Color.RED);
		cancelBtn.setBorderPainted(false);
		panel.add(cancelBtn);

// Event handling
		cancelBtn.addActionListener(e -> {
			frame.dispose();
		});

		viewBtn.addActionListener(e -> {
			CustomerLogInGUI clog = new CustomerLogInGUI();
			String id = clog.idField.getText();
			Customer c = new Customer();
			Customer temp = c.customerProfile(id);
			ViewRecordGUI view = new ViewRecordGUI();
			if (temp != null) {
				view.textArea.append(temp.toString());
			}
			else JOptionPane.showMessageDialog(null, "User not found");
			ArrayList<Record> list = c.showBillRecord();
			for (int i = 0; i < list.size(); i++) {
				String listID = list.get(i).id;
				if (listID.equals(id)) {
					view.textArea.append(list.get(i).toString());
				}
			}
		});
	}
}