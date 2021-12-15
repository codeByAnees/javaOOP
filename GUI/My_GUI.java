package JavaOOP.GUI;
import javax.swing.*;
import java.awt.*;

public class My_GUI extends JFrame {
    public My_GUI() {

        // Flow Layout
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
        JLabel label1 = new JLabel("First Name");
        add(label1);
        JTextField tf1 = new JTextField(8);
        add(tf1);
        JLabel label2 = new JLabel("Last Name");
        add(label2);
        JTextField tf2 = new JTextField(8);
        add(tf2);

        // Grid Layout
        // setLayout(new GridLayout(2, 2, 10, 10));
        // JLabel label1 = new JLabel("First Name");
        // add(label1);
        // JTextField tf1 = new JTextField(8);
        // add(tf1);
        // JLabel label2 = new JLabel("Last Name");
        // add(label2);
        // JTextField tf2 = new JTextField(8);
        // add(tf2);

        // Border Layout
        // setLayout(new BorderLayout(10, 10));
        // JLabel label1 = new JLabel("First Name");
        // add(label1, BorderLayout.NORTH);
        // JTextField tf1 = new JTextField(8);
        // add(tf1, BorderLayout.WEST);
        // JLabel label2 = new JLabel("Last Name");
        // add(label2, BorderLayout.SOUTH);
        // JTextField tf2 = new JTextField(8);
        // add(tf2, BorderLayout.EAST);
        // JLabel label3 = new JLabel("Middle Name");
        // add(label3, BorderLayout.CENTER);
        // JTextField tf3 = new JTextField(8);
        // add(tf3, BorderLayout.CENTER);

        // CheckBox
        JCheckBox c1 = new JCheckBox("Check");
        add(c1);
        
        // RadioButton
        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");
        add(rb1);
        add(rb2);
        //grouping radiobuttons
        ButtonGroup b = new ButtonGroup();
        b.add(rb1);
        b.add(rb2);

        // Buttons
        JButton button1 = new JButton("Clear");
        add(button1);

        //Combo Box
        String[] s1 = {"CS", "SE", "EE", "BIO"};
        JComboBox cb1 = new JComboBox(s1);
        add(cb1);
    }
}
