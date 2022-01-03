package JavaOOP.SemesterProject;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddEmployeeGUI {
        private JTextField idField;
        private JTextField passField;
        private JTextField nameField;
        private JTextField adrField;
        private JTextField cnicField;
        private JTextField ageField;
        private JTextField jobTitleField;
        private JTextField salaryField;
        private JButton addBtn;
        private JButton cancelBtn;

    public AddEmployeeGUI() {
        Admin admin = new Admin();
        JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setLocation(450, 150);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);

// Panel
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.black);
		frame.add(panel);
	
// Labels		
		// Label Front:(ADD Customer)
		JLabel front = new JLabel("ADD RECORD");
		front.setBounds(180, 20, 200, 25);
		front.setFont(new Font("Serif", Font.BOLD,20));
		front.setForeground(Color.WHITE);
		panel.add(front);
		
		// Label Id:
		JLabel id = new JLabel("ID");
		id.setBounds(10, 90, 80, 25);
		id.setFont(new Font("Serif", Font.BOLD,15));
		id.setForeground(Color.white);
		panel.add(id);
		
		// Label Password
		JLabel pass = new JLabel("Password");
		pass.setBounds(250, 90, 80, 25);
		pass.setFont(new Font("Serif", Font.BOLD,15));
		pass.setForeground(Color.white);
		panel.add(pass);
		
		// Label 1: (Name)
		JLabel name = new JLabel("Name");
		name.setBounds(10, 130, 80, 25);
		name.setFont(new Font("Serif", Font.BOLD,15));
		name.setForeground(Color.white);
		panel.add(name);
		
		// Label 2: (ADDRESS)
		JLabel adr = new JLabel("Address");
		adr.setBounds(10, 170, 80, 25);
		adr.setFont(new Font("Serif", Font.BOLD,15));
		adr.setForeground(Color.white);
		panel.add(adr);
		
		// Label 3: (CNIC)
		JLabel enr = new JLabel("CNIC");
		enr.setBounds(10, 210, 80, 25);
		enr.setFont(new Font("Serif", Font.BOLD,15));
		enr.setForeground(Color.white);
		panel.add(enr);
		
		// Label 4: (AGE)
		JLabel age = new JLabel("Age");
		panel.add(age);
		age.setBounds(10, 250, 80, 25);
		age.setFont(new Font("Serif", Font.BOLD,15));
		age.setForeground(Color.white);
		
		// Label 5: 
		JLabel conT = new JLabel("Job Title");
		panel.add(conT);
		conT.setBounds(10, 290, 100, 25);
		conT.setForeground(Color.white);
		conT.setFont(new Font("Serif", Font.BOLD,15));

        // label 6
        JLabel sal = new JLabel("Salary");
        panel.add(sal);
        sal.setBounds(10, 330, 120, 25);
        sal.setForeground(Color.white);
        sal.setFont(new Font("Serif", Font.BOLD, 15));
	
		
// Creating TEXT FIELDS
		//For Id:
		idField = new JTextField();
		panel.add(idField);
		idField.setBounds(105, 90, 60, 25);
		
		//For Password:
		passField = new JTextField();
		panel.add(passField);
		passField.setBounds(330, 90, 100, 25);
		
		// For Label 1: 
		nameField = new JTextField();
		panel.add(nameField);
		nameField.setBounds(105, 130, 150, 25);
		
		// For Label 2:
		adrField = new JTextField();
		panel.add(adrField);
		adrField.setBounds(105, 170, 150, 25);
		
		// For Label 3:
		cnicField = new JTextField();
		panel.add(cnicField);
		cnicField.setBounds(105, 210, 110, 25);
		
	    // For Label 4:
		ageField = new JTextField();
		panel.add(ageField);
		ageField.setBounds(105, 250, 30, 25);

        //For label 5
        jobTitleField = new JTextField();
        panel.add(jobTitleField);
        jobTitleField.setBounds(105, 290, 140, 25);

        //For label 6
        salaryField = new JTextField();
        panel.add(salaryField);
        salaryField.setBounds(105, 330, 140, 25);

        Employee emp = new Employee();
        // Creating Buttons
		addBtn = new JButton("Add");
		panel.add(addBtn);
		addBtn.setBounds(120, 400, 90, 25);
		addBtn.setFont(new Font("Serif", Font.BOLD,18));
		addBtn.setBackground(Color.green);
		addBtn.setForeground(Color.white);
		addBtn.setBorderPainted(false);
        addBtn.addActionListener(e -> {
            emp.setID(idField.getText());
            emp.setPassword(passField.getText());
            emp.setName(nameField.getText());
            emp.setAddress(adrField.getText());
            emp.setAge(ageField.getText());
            emp.setJobTitle(jobTitleField.getText());
            emp.setCNIC(cnicField.getText());
            emp.setSalary(salaryField.getText());
            admin.addNewUser(emp);
            JOptionPane.showMessageDialog(null, "Done");
        });

        // Cancel button
		cancelBtn = new JButton("Back");
		panel.add(cancelBtn);
		cancelBtn.setBounds(270, 400, 90, 25);
		cancelBtn.setFont(new Font("Serif", Font.BOLD,18));
		cancelBtn.setBackground(Color.RED);
		cancelBtn.setForeground(Color.white);
		cancelBtn.setBorderPainted(false);
		cancelBtn.addActionListener(e -> {
			frame.dispose();
			AdminGUI adm = new AdminGUI();
		});
    }
}
