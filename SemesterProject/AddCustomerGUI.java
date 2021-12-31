package JavaOOP.SemesterProject;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AddCustomerGUI {
//public static void main(String[] args) {
	protected JTextField idText;
	protected JTextField passText;
	protected JTextField nameText;
	protected JTextField adrText;
	protected JTextField cnText;
	protected JTextField ageText;
	protected JComboBox cb;
	protected JRadioButton r1;
	protected JRadioButton r2;
	protected JButton b2;
	protected JButton b3;

	public AddCustomerGUI() {	
		Admin admin = new Admin();

		// Frame
		JFrame frame =new JFrame();
		frame.setSize(500,500);
		frame.setLocation(450, 150);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		// Panel
		JPanel panel =new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.black);
		frame.add(panel);
	
		
		
		
		
		// Label Front:(ADD Customer)
		JLabel front=new JLabel("ADD RECORD");
		front.setBounds(180,20,200,25);
		front.setFont(new Font("Serif",Font.BOLD,20));
		front.setForeground(Color.WHITE);
		panel.add(front);
		
		
		// Label Id:
		JLabel id= new JLabel("ID");
		id.setBounds(10,90,80,25);
		id.setFont(new Font("Serif",Font.BOLD,15));
		id.setForeground(Color.white);
		panel.add(id);
		
		// Label Password
		JLabel pass= new JLabel("Password");
		pass.setBounds(250,90,80,25);
		pass.setFont(new Font("Serif",Font.BOLD,15));
		pass.setForeground(Color.white);
		panel.add(pass);
		
		
		// Label 1: (Name)
		JLabel name= new JLabel("Name");
		name.setBounds(10,130,80,25);
		name.setFont(new Font("Serif",Font.BOLD,15));
		name.setForeground(Color.white);
		panel.add(name);
		
		// Label 2: (ADDRESS)
		JLabel adr=new JLabel("Address");
		adr.setBounds(10,170,80,25);
		adr.setFont(new Font("Serif",Font.BOLD,15));
		adr.setForeground(Color.white);
		panel.add(adr);
		
		// Label 3: (CNIC)
		JLabel enr=new JLabel("CNIC");
		enr.setBounds(10,210,80,25);
		enr.setFont(new Font("Serif",Font.BOLD,15));
		enr.setForeground(Color.white);
		
		panel.add(enr);
		
		// Label 4: (AGE)
		JLabel age=new JLabel("Age");
		panel.add(age);
		age.setBounds(10,250,80,25);
		age.setFont(new Font("Serif",Font.BOLD,15));
		age.setForeground(Color.white);
		
		
		
		// Label 5: (Conn Type)
		JLabel conT=new JLabel("Connec. Type");
		panel.add(conT);
		conT.setBounds(10,290,100,25);
		conT.setForeground(Color.white);
		conT.setFont(new Font("Serif",Font.BOLD,15));
		
		// Label 6: (Load)
		JLabel load=new JLabel("Load");
		panel.add(load);
		load.setBounds(10,330,100,25);
		load.setForeground(Color.white);
		load.setFont(new Font("Serif",Font.BOLD,15));
		
		
		
		
								// Creating TEXT FIELDS
		
		Customer c = new Customer();
		//For Id:
		idText = new JTextField();
		panel.add(idText);
		idText.setBounds(105,90,60,25);
		
		
		//For Password:
		passText = new JTextField();
		panel.add(passText);
		passText.setBounds(330,90,100,25);
		
		
		// For Label 1: 
		nameText = new JTextField();
		panel.add(nameText);
		nameText.setBounds(105, 130, 150, 25);
		
		// For Label 2:
		adrText=new JTextField();
		panel.add(adrText);
		adrText.setBounds(105, 170, 150, 25);
		
		
		
		// For Label 3:
		cnText=new JTextField();
		panel.add(cnText);
		cnText.setBounds(105, 210, 110, 25);
		

	        
	    // For Label 4:
		ageText=new JTextField();
		panel.add(ageText);
		ageText.setBounds(105, 250, 30, 25);
		
			
		// For Label 5:
		
	
		String[] conn = {"Select" ,"Residential","Commercial"};
		
		cb = new JComboBox(conn);
		cb.setForeground(Color.black);
		
		panel.add(cb);
		cb.setBounds(105,290,100,25);
		cb.addItemListener(e -> {
			c.setConnectionType((String)cb.getSelectedItem());
		});
		// For Label 6:
		ButtonGroup bg=new ButtonGroup();
		r1=new JRadioButton(" < 5 ");
		panel.add(r1);
		bg.add(r1);
		r1.setBounds(105,332,60,25);
		r1.setForeground(Color.white);
		r1.setBackground(Color.black);
		r2=new JRadioButton(" > 5 ");
		panel.add(r2);
		bg.add(r2);
		r2.setBounds(160,332,60,25);
		r2.setForeground(Color.white);
		r2.setBackground(Color.black);
		r1.addActionListener(e -> {
			if (r1.isSelected())
				c.setLaod(4);
			else c.setLaod(6);
		});
		r2.addActionListener(e -> {
			if (r2.isSelected())
				c.setLaod(6);
			else c.setLaod(4);
		});
		
		
									// Creating Buttons
		
		
		b2=new JButton("Add");
		panel.add(b2);
		b2.setBounds(120,400,90,25);
		b2.setFont(new Font("Serif",Font.BOLD,18));
		b2.setBackground(Color.green);
		b2.setForeground(Color.white);
		b2.setBorderPainted(false);
		b2.addActionListener(e -> {
			c.setID(idText.getText());
			c.setPassword(passText.getText());
			c.setName(nameText.getText());
			c.setAddress(adrText.getText());
			c.setCNIC(cnText.getText());
			c.setAge(ageText.getText());
			admin.addNewUser(c);
		});
		
		
		b3=new JButton("Cancel");
		panel.add(b3);
		b3.setBounds(270,400,90,25);
		b3.setFont(new Font("Serif",Font.BOLD,18));
		b3.setBackground(Color.RED);
		b3.setForeground(Color.white);
		b3.setBorderPainted(false);
		b3.addActionListener(e -> {
			frame.dispose();
		});	
	}
}
