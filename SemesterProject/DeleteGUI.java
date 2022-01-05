package JavaOOP.SemesterProject;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class DeleteGUI {
    private JTextField idText;
    private JButton delBtn;
    private JButton backBtn;
    private JRadioButton custBtn;
    private JRadioButton empBtn;

    public DeleteGUI() {
        Filing filing = new Filing();
// FRAME
        JFrame frame = new JFrame();
        frame.setSize(300, 320);
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
        JLabel delLabel = new JLabel("Delete");
        delLabel.setBounds(100, 20, 100, 25);
        delLabel.setForeground(Color.red);
        delLabel.setFont(new Font("Serif", Font.BOLD, 25));
        panel.add(delLabel);

        //Label 
        JLabel type = new JLabel("Type");
        panel.add(type);
        type.setBounds(15, 65, 60, 25);
        type.setForeground(Color.black);
        type.setFont(new Font("Serif",Font.BOLD,15));

        //Enter ID
        JLabel idLabel = new JLabel("Enter ID");
        idLabel.setBounds(103,90,60,25);
        idLabel.setFont(new Font("Serif",Font.BOLD,15));
        idLabel.setForeground(Color.BLACK);
        panel.add(idLabel);

        //radio buttons
        ButtonGroup bg = new ButtonGroup();
        custBtn = new JRadioButton("Customer");
        custBtn.setBounds(70, 65, 85, 25);
	custBtn.setForeground(Color.black);
	custBtn.setBackground(Color.white);
        panel.add(custBtn);
	bg.add(custBtn);
        empBtn = new JRadioButton("Employee");
        empBtn.setBounds(170, 65, 85, 25);
        empBtn.setForeground(Color.black);
	empBtn.setBackground(Color.white);
        panel.add(empBtn);
        bg.add(empBtn);

// TEXT FIELD
        idText = new JTextField();
        panel.add(idText);
        idText.setBounds(103,120,60,25);
        idText.setVisible(true);
            
// Delete Button
        delBtn = new JButton("Delete");
        panel.add(delBtn);
        delBtn.setBounds(90, 170, 90, 25);
        delBtn.setForeground(Color.WHITE);
        delBtn.setBackground(Color.red);
        delBtn.setFont(new Font("Tahoma",Font.BOLD,15));
        delBtn.setBorderPainted(false);
        delBtn.addActionListener(e -> {
            if (custBtn.isSelected()) {
                String id = idText.getText();
                ArrayList<Customer> list = filing.readCustomerFile();
                int index = -1;
                for (int i = 0; i < list.size(); i++) {
                String temp = list.get(i).getID();
                if (temp.equals(id)) {
                        index = i;
                        }
                }
                if (index != -1) {
                        list.remove(index);
                        filing.writeFileCustomer(list);
                        JOptionPane.showMessageDialog(null, "Done");
                }
                else JOptionPane.showMessageDialog(null, "Record not found");
            }
            else if (empBtn.isSelected()) {
                String id = idText.getText();
                ArrayList<Employee> list = filing.readEmployeeFile();
                int index = -1;
                for (int i = 0; i < list.size(); i++) {
                        String temp = list.get(i).getID();
                        if (temp.equals(id)) {
                                index = i;
                        }
                }
                if (index != -1) {
                        list.remove(index);
                        filing.writeFileEmployee(list);
                        JOptionPane.showMessageDialog(null, "Done");
                }
                else JOptionPane.showMessageDialog(null, "Record not found");   
            }
        });

// BACK Button
        backBtn = new JButton("Back");
        panel.add(backBtn);
        backBtn.setBounds(90, 210, 90, 25);
        backBtn.setForeground(Color.WHITE);
        backBtn.setBackground(Color.black);
        backBtn.setFont(new Font("Tahoma",Font.BOLD,15));
        backBtn.setBorderPainted(false);

        backBtn.addActionListener(e->{
                frame.dispose();
                AdminGUI a = new AdminGUI();
        });

    }
}
