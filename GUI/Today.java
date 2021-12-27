package JavaOOP.GUI;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
public class Today extends JFrame {
    public Today() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        JTextField tf1 = new JTextField(8);
        add(tf1);
        JButton button1 = new JButton("1");
        add(button1);
        button1.addActionListener(e -> { tf1.setText("1");});
        String[] s1 = {"CS", "SE", "EE", "BIO"};
        JComboBox cb1 = new JComboBox(s1);
        add(cb1);
        cb1.addItemListener(e -> {
            JOptionPane.showMessageDialog(null, (String)cb1.getSelectedItem());
        });

        //RadioButton
        JRadioButton radioButton1 = new JRadioButton("Male");
        JRadioButton radioButton2 = new JRadioButton("Female");
        //grouping radiobuttons
        ButtonGroup b = new ButtonGroup();
        b.add(radioButton1);
        b.add(radioButton2);

    }
}
