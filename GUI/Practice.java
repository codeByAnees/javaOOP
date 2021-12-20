package JavaOOP.GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
public class Practice extends JFrame {
    private JCheckBox checkBox;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JComboBox comboBox; 
    public Practice() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        checkBox = new JCheckBox("Happy");
        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == 1) {
                    JOptionPane.showMessageDialog(null, "I am Happy");
                }
            }
        });
        add(checkBox);
        
        // RadioButton
        radioButton1 = new JRadioButton("Male");
        radioButton2 = new JRadioButton("Female");
        //grouping radiobuttons
        ButtonGroup b = new ButtonGroup();
        b.add(radioButton1);
        b.add(radioButton2);
        radioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AbstractButton ab = (AbstractButton)e.getSource();
                JOptionPane.showMessageDialog(null, ab.getText());
            }
        });
        radioButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AbstractButton ab = (AbstractButton)e.getSource();
                JOptionPane.showMessageDialog(null, ab.getText());
            }
        });
        add(radioButton1);
        add(radioButton2);

        //Combo Box
        String[] s1 = {"CS", "SE", "EE", "BIO"};
        comboBox = new JComboBox(s1);
        add(comboBox);
        comboBox.addItemListener(new comboHandler());
    }
    class comboHandler implements ItemListener {
        public void itemStateChanged(ItemEvent ie) {
            JOptionPane.showMessageDialog(null, (String)comboBox.getSelectedItem());
        }
    }
}
