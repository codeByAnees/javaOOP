package JavaOOP.SemesterProject;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DeleteGUI {
	//public static void main(String[] args) {
        protected JTextField idText;

        Admin admin = new Admin();
        public DeleteGUI() {
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
        //Delete Customer
        JLabel l = new JLabel("Delete");
        l.setBounds(100,20,100,25);
        l.setForeground(Color.red);
        l.setFont(new Font("Serif",Font.BOLD,25));
        panel.add(l);
        //Enter ID
        JLabel l1 = new JLabel("Enter ID");
        l1.setBounds(103,60,60,25);
        l1.setFont(new Font("Serif",Font.BOLD,15));
        l1.setForeground(Color.BLACK);
        panel.add(l1);
        
        
        // TEXT FIELD
        idText = new JTextField();
        panel.add(idText);
        idText.setBounds(103,90,60,25);
        idText.setVisible(true);
            
        
        // Delete Button
        
        JButton b = new JButton("Delete");
        panel.add(b);
        b.setBounds(90, 140, 90, 25);
        b.setForeground(Color.WHITE);
        b.setBackground(Color.red);
        b.setFont(new Font("Tahoma",Font.BOLD,15));
        b.setBorderPainted(false);
        b.addActionListener(e-> {
            String id = idText.getText();
            admin.delCustomer(id);
        });
    }
}
