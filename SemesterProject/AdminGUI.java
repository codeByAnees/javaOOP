package JavaOOP.SemesterProject;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AdminGUI {
	public static void main(String[] args) {
		
        Admin admin = new Admin();
        Filing filing = new Filing();
	    // FRAME	
        JFrame frame=new JFrame();
        frame.setSize(300, 500);
        frame.setLocation(530, 150);
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        // PANEL
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        frame.add(panel);
        
        // LABEL
        
        JLabel l=new JLabel("ADMIN");
        l.setBounds(97,20,100,25);
        l.setForeground(Color.orange);
        l.setFont(new Font("Serif",Font.BOLD,25));
        panel.add(l);
        
        
        // BUTTONS
        
        //1-Add Customer
        JButton b1=new JButton("Add Customer");
        b1.setBounds(65,80,152,30);
        b1.setFont(new Font("Arial Black",Font.BOLD,12));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.black);
        b1.setBorderPainted(false);
        panel.add(b1);
        
        //2-Delete Customer
        
        JButton b2=new JButton("Delete Customer");
        b2.setBounds(65,120,152,30);
        b2.setFont(new Font("Arial Black",Font.BOLD,12));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.black);
        b2.setBorderPainted(false);
        panel.add(b2);
        
        //3-Edit Customer
        
        JButton b3=new JButton("Edit Customer");
        b3.setBounds(65,160,152,30);
        b3.setFont(new Font("Arial Black",Font.BOLD,12));
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.black);
        b3.setBorderPainted(false);
        panel.add(b3);
        
        //4-Search Customer
        
        JButton b4=new JButton("Search Customer");
        b4.setBounds(65,200,153,30);
        b4.setFont(new Font("Arial Black",Font.BOLD,12));
        b4.setForeground(Color.WHITE);
        b4.setBackground(Color.black);
        b4.setBorderPainted(false);
        panel.add(b4);
        
        //5-View Customer
		
        JButton b5=new JButton("View Customers");
        b5.setBounds(65,240,152,30);
        b5.setFont(new Font("Arial Black",Font.BOLD,12));
        b5.setForeground(Color.WHITE);
        b5.setBackground(Color.black);
        b5.setBorderPainted(false);
        panel.add(b5);

        //6- Calculate Bill
        JButton b6=new JButton("CALCULATE BILL");
        b6.setBounds(27,340,230,80);
        b6.setFont(new Font("Arial Black",Font.BOLD,17));
        b6.setForeground(Color.white);
        b6.setBackground(Color.ORANGE);
        b6.setBorderPainted(false);
        panel.add(b6);


	//7-Enter Customer Units
			
        JButton b7=new JButton("Enter Units");
        b7.setBounds(65,280,152,30);
        b7.setFont(new Font("Arial Black",Font.BOLD,12));
        b7.setForeground(Color.WHITE);
        b7.setBackground(Color.black);
        b7.setBorderPainted(false);
        panel.add(b7);
        
        

        b1.addActionListener(e -> {
            AddCustomerGUI add = new AddCustomerGUI();
        });

        b2.addActionListener(e -> {
            DeleteGUI del = new DeleteGUI();
        });

        b3.addActionListener(e -> {
            EditGUI edit = new EditGUI();
        });

        b4.addActionListener(e -> {
            SearchGUI s = new SearchGUI();
        });

        b5.addActionListener(e -> {
            ViewRecordGUI view = new ViewRecordGUI();
            ArrayList<Customer> list = filing.readCustomerFile();
            for (int i = 0; i < list.size(); i++) {
                Customer custt = list.get(i);
                view.textArea.append("\n***************************\n");
                view.textArea.append(custt.toString());
            }
        });

        b7.addActionListener(e -> {
            SetUnitsGUI units = new SetUnitsGUI();
        });
	}
}