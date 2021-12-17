package JavaOOP.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyCalculator extends JFrame {
    private JTextField tf1;
    private JButton btn_1;
    private JButton btn_2;
    private JButton btn_3;
    private JButton btnPlus;
    private JButton btnEqual;
    private JButton btnClear;
    private float leftOp;
    private float rightOp;
    private char operation;
    private Float result;
    public MyCalculator() {
        setLayout(new GridLayout(2, 1, 10, 10));
        JPanel panel1 = new JPanel(new GridLayout(1, 1, 0, 0));
        JPanel panel2 = new JPanel(new GridLayout(2, 3, 5, 5));
        tf1 = new JTextField(8);
        btn_1 = new JButton("1");
        btn_1.addActionListener(new MyHandler());
        btn_2 = new JButton("2");
        btn_2.addActionListener(new MyHandler());
        btn_3 = new JButton("3");
        btn_3.addActionListener(new MyHandler());
        btnPlus = new JButton("+");
        btnPlus.addActionListener(new MyHandler());
        btnEqual = new JButton("=");
        btnEqual.addActionListener(new MyHandler());
        btnClear = new JButton("C");
        btnClear.addActionListener(new MyHandler());
        panel1.add(tf1);
        add(panel1);
        panel2.add(btn_1);
        panel2.add(btn_2);
        panel2.add(btn_3);
        panel2.add(btnPlus);
        panel2.add(btnEqual);
        panel2.add(btnClear);
        add(panel2);
    }
    // inner class
    class MyHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btn_1) {
                tf1.setText("1");
            }
            if (e.getSource() == btn_2) {
                tf1.setText("2");
            }
            if (e.getSource() == btn_3) {
                tf1.setText("3");
            }
            if (e.getSource() == btnPlus) {
                leftOp = Float.parseFloat(tf1.getText());
                operation = '+';
                tf1.setText("");
            }
            if (e.getSource() == btnEqual) {
                rightOp = Float.parseFloat(tf1.getText());
                if (operation == '+') {
                    result = leftOp + rightOp;
                    tf1.setText(result.toString());
                }
            }
            if (e.getSource() == btnClear) {
                tf1.setText("C");
            }
        }
    }
}
