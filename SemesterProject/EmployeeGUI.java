package JavaOOP.SemesterProject;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class EmployeeGUI {
    private JButton viewBtn;
	private JButton setUnits;
    private JButton calBtn;
	private JButton cancelBtn;

	public EmployeeGUI() {
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
		JLabel custLabel = new JLabel("EMPLOYEE");
		custLabel.setBounds(69,40,200,25);
		custLabel.setForeground(Color.white);
		custLabel.setFont(new Font("Serif", Font.BOLD, 25));
		panel.add(custLabel);
		
// BUTTONS
		//1- View Profile	
		viewBtn = new JButton("VIEW PROFILE");
		viewBtn.setBounds(42, 100, 200, 40);
		viewBtn.setFont(new Font("Arial Black", Font.BOLD, 15));
		viewBtn.setForeground(Color.white);
		viewBtn.setBackground(Color.gray);
		viewBtn.setBorderPainted(false);
		panel.add(viewBtn);
		
		//2- Set units
		setUnits = new JButton("SET UNITS");
		setUnits.setBounds(42, 170, 200, 40);
		setUnits.setFont(new Font("Arial Black", Font.BOLD, 15));
		setUnits.setForeground(Color.white);
		setUnits.setBackground(Color.orange);
		setUnits.setBorderPainted(false);
		panel.add(setUnits);

        //3 - Cal btn
        calBtn = new JButton("CALCULATE BILL");
		calBtn.setBounds(42, 240, 200, 40);
		calBtn.setFont(new Font("Arial Black", Font.BOLD, 15));
		calBtn.setForeground(Color.white);
		calBtn.setBackground(Color.MAGENTA);
		calBtn.setBorderPainted(false);
		panel.add(calBtn);

		//4- Cancel
		cancelBtn = new JButton("CANCEL");
		cancelBtn.setBounds(42, 310, 200, 40);
		cancelBtn.setFont(new Font("Arial Black", Font.BOLD, 15));
		cancelBtn.setForeground(Color.white);
		cancelBtn.setBackground(Color.RED);
		cancelBtn.setBorderPainted(false);
		panel.add(cancelBtn);
		cancelBtn.addActionListener(e -> {
			frame.dispose();
		});

        viewBtn.addActionListener(e -> {
			Employee emp = new Employee();
			String id = EmployeeLogInGUI.emplogID;
			Employee temp = emp.EmpProfile(id);
			if (temp == null) {
				JOptionPane.showMessageDialog(null, "User not found");
			}
			else {
                JOptionPane.showMessageDialog(null, temp.toString());
			}
		});

        setUnits.addActionListener(e -> {
            SetUnitsGUI units = new SetUnitsGUI();
			frame.dispose();
        });

        calBtn.addActionListener(e -> {
            CalBillGUI calBill = new CalBillGUI();
			frame.dispose();
        });
    }
}
