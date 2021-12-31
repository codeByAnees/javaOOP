package JavaOOP.SemesterProject;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SearchGUI {
	//public static void main(String[] args) {
		protected JTextField idField;
		protected JButton searchBtn;
		Admin admin = new Admin();
		public SearchGUI() {
	// FRAME
		JFrame frame = new JFrame();
		frame.setSize(300, 250);
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
		JLabel searchLabel = new JLabel("Search");
		searchLabel.setBounds(100, 20, 100, 25);
		searchLabel.setForeground(Color.green);
		searchLabel.setFont(new Font("Serif", Font.BOLD, 25));
		panel.add(searchLabel);

		//Enter ID
		JLabel idLabel = new JLabel("Enter ID");
		idLabel.setBounds(103, 60, 60, 25);
		idLabel.setFont(new Font("Serif", Font.BOLD, 15));
		idLabel.setForeground(Color.BLACK);
		panel.add(idLabel);
		
		// TEXT FIELD
		idField = new JTextField();
		panel.add(idField);
		idField.setBounds(103, 90, 60, 25);
		idField.setVisible(true);
			
		// Search Button
		searchBtn = new JButton("Search");
		panel.add(searchBtn);
		searchBtn.setBounds(90, 140, 90, 25);
		searchBtn.setForeground(Color.WHITE);
		searchBtn.setBackground(Color.GREEN);
		searchBtn.setFont(new Font("Tahoma",Font.BOLD,15));
		searchBtn.setBorderPainted(false);
		searchBtn.addActionListener(e -> {
			String id = idField.getText();
			Customer cust = admin.searchCustomer(id);
			if (cust != null) {
				JOptionPane.showMessageDialog(null, cust.toString());
			}
			else JOptionPane.showMessageDialog(null, "User not found");
		});
	}
}