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
    private JButton btn_4;
    private JButton btn_5;
    private JButton btn_6;
    private JButton btn_7;
    private JButton btn_8;
    private JButton btn_9;
    private JButton btn_0;
    private JButton btnPlus;
    private JButton btnEqual;
    private JButton btnClear;
    private JButton btnMul;
    private JButton btnSub;
    private JButton btnDiv;
    private JButton btnBacksp;
    private JButton btnDec;
    private JButton btnRem;
    private JButton btnSq;

    private double leftOp;
    private double rightOp;
    private char operation;
    private Double result;
    public MyCalculator() {
        setLayout(new GridLayout(2, 1, 10, 10));
        JPanel panel1 = new JPanel(new GridLayout(1, 1, 0, 0));
        JPanel panel2 = new JPanel(new GridLayout(5, 4, 5, 5));
        tf1 = new JTextField(8);
        panel1.add(tf1);
        btnClear = new JButton("c");
        btnClear.addActionListener(new MyHandler());
        btnDiv = new JButton("÷");
        btnDiv.addActionListener(new MyHandler());
        btnMul = new JButton("x");
        btnMul.addActionListener(new MyHandler());
        btnBacksp = new JButton("⌫");
        btnBacksp.addActionListener(new MyHandler());
        btn_7 = new JButton("7");
        btn_7.addActionListener(new MyHandler());
        btn_8 = new JButton("8");
        btn_8.addActionListener(new MyHandler());
        btn_9 = new JButton("9");
        btn_9.addActionListener(new MyHandler());
        btnSub = new JButton("-");
        btnSub.addActionListener(new MyHandler());
        btn_4 = new JButton("4");
        btn_4.addActionListener(new MyHandler());
        btn_5 = new JButton("5");
        btn_5.addActionListener(new MyHandler());
        btn_6 = new JButton("6");
        btn_6.addActionListener(new MyHandler());
        btnPlus = new JButton("+");
        btnPlus.addActionListener(new MyHandler());
        btn_1 = new JButton("1");
        btn_1.addActionListener(new MyHandler());
        btn_2 = new JButton("2");
        btn_2.addActionListener(new MyHandler());
        btn_3 = new JButton("3");
        btn_3.addActionListener(new MyHandler());
        btnSq = new JButton("√");
        btnSq.addActionListener(new MyHandler());
        btnRem = new JButton("%");
        btnRem.addActionListener(new MyHandler());
        btn_0 = new JButton("0");
        btn_0.addActionListener(new MyHandler());
        btnDec = new JButton(".");
        btnDec.addActionListener(new MyHandler());
        btnEqual = new JButton("=");
        btnEqual.addActionListener(new MyHandler());
        
        add(panel1);
        panel2.add(btnClear);
        panel2.add(btnDiv);
        panel2.add(btnMul);
        panel2.add(btnBacksp);
        panel2.add(btn_7);
        panel2.add(btn_8);
        panel2.add(btn_9);
        panel2.add(btnSub);
        panel2.add(btn_4);
        panel2.add(btn_5);
        panel2.add(btn_6);
        panel2.add(btnPlus);
        panel2.add(btn_1);
        panel2.add(btn_2);
        panel2.add(btn_3);
        panel2.add(btnSq);
        panel2.add(btnRem);
        panel2.add(btn_0);
        panel2.add(btnDec);
        panel2.add(btnEqual);
        add(panel2);
    }
    // inner class
    class MyHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btn_1) {
                if (tf1.getText().equals("Error")) {
                    tf1.setText("1");
                }
                else {
                    tf1.setText(tf1.getText() + "1");
                }
            }
            if (e.getSource() == btn_2) {
                if (tf1.getText().equals("Error")) {
                    tf1.setText("2");
                }
                else {
                    tf1.setText(tf1.getText() + "2");
                }
            }
            if (e.getSource() == btn_3) {
                if (tf1.getText().equals("Error")) {
                    tf1.setText("3");
                }
                else {
                    tf1.setText(tf1.getText() + "3");
                }
            }
            if (e.getSource() == btn_4) {
                if (tf1.getText().equals("Error")) {
                    tf1.setText("4");
                }
                else {
                    tf1.setText(tf1.getText() + "4");
                }
            }
            if (e.getSource() == btn_5) {
                if (tf1.getText().equals("Error")) {
                    tf1.setText("5");
                }
                else {
                    tf1.setText(tf1.getText() + "5");
                }
            }
            if (e.getSource() == btn_6) {
                if (tf1.getText().equals("Error")) {
                    tf1.setText("6");
                }
                else {
                    tf1.setText(tf1.getText() + "6");
                }
            }
            if (e.getSource() == btn_7) {
                if (tf1.getText().equals("Error")) {
                    tf1.setText("7");
                }
                else {
                    tf1.setText(tf1.getText() + "7");
                }
            }
            if (e.getSource() == btn_8) {
                if (tf1.getText().equals("Error")) {
                    tf1.setText("8");
                }
                else {
                    tf1.setText(tf1.getText() + "8");
                }
            }
            if (e.getSource() == btn_9) {
                if (tf1.getText().equals("Error")) {
                    tf1.setText("9");
                }
                else {
                    tf1.setText(tf1.getText() + "9");
                }
            }
            if (e.getSource() == btn_0) {
                if (tf1.getText().equals("Error")) {
                    tf1.setText("0");
                }
                else {
                    tf1.setText(tf1.getText() + "0");
                }
            }
            if (e.getSource() == btnDec) {
                if (tf1.getText().equals("Error")) {
                    tf1.setText(".");
                }
                else {
                    tf1.setText(tf1.getText() + ".");
                }
            }
            if (e.getSource() == btnPlus) {
                String temp = tf1.getText();
                if (tf1.getText().length() == 0 || tf1.getText().equals("Error")) {
                    tf1.setText("Error");
                }
                else if ((temp.indexOf("-") != temp.length() - 1 && temp.indexOf("-") != -1) ||
                    (temp.indexOf("+") != temp.length() - 1 && temp.indexOf("+") != -1) ||
                    (temp.indexOf("x") != temp.length() - 1 && temp.indexOf("x") != -1) ||
                    (temp.indexOf("%") != temp.length() - 1 && temp.indexOf("%") != -1) ||
                    (temp.indexOf("÷") != temp.length() - 1 && temp.indexOf("÷") != -1)) {
                    tf1.setText(temp);
                }
                else {
                    operation = '+';
                    if (temp.contains("-") || temp.contains("x") || temp.contains("÷") || 
                        temp.contains("+") || temp.contains("%")) {
                        temp = temp.substring(0, temp.length() - 1);
                        leftOp = Double.parseDouble(temp);
                        tf1.setText(temp + operation);
                    }
                    else {
                        leftOp = Double.parseDouble(tf1.getText());
                        tf1.setText(tf1.getText() + operation);
                    }
                }
            }
            if (e.getSource() == btnSub) {
                String temp = tf1.getText();
                if (tf1.getText().length() == 0 || tf1.getText().equals("Error")) {
                    tf1.setText("Error");
                }
                else if ((temp.indexOf("-") != temp.length() - 1 && temp.indexOf("-") != -1) ||
                    (temp.indexOf("+") != temp.length() - 1 && temp.indexOf("+") != -1) ||
                    (temp.indexOf("x") != temp.length() - 1 && temp.indexOf("x") != -1) ||
                    (temp.indexOf("%") != temp.length() - 1 && temp.indexOf("%") != -1) ||
                    (temp.indexOf("÷") != temp.length() - 1 && temp.indexOf("÷") != -1)) {
                    tf1.setText(temp);
                }
                else {
                    operation = '-';
                    if (temp.contains("-") || temp.contains("x") || temp.contains("÷") || 
                        temp.contains("+") || temp.contains("%")) {
                        temp = temp.substring(0, temp.length() - 1);
                        leftOp = Double.parseDouble(temp);
                        tf1.setText(temp + operation);
                    }
                    else {
                        leftOp = Double.parseDouble(tf1.getText());
                        tf1.setText(tf1.getText() + operation);
                    }
                }
            }
            if (e.getSource() == btnMul) {
                String temp = tf1.getText();
                if (tf1.getText().length() == 0 || tf1.getText().equals("Error")) {
                    tf1.setText("Error");
                }
                else if ((temp.indexOf("-") != temp.length() - 1 && temp.indexOf("-") != -1) ||
                    (temp.indexOf("+") != temp.length() - 1 && temp.indexOf("+") != -1) ||
                    (temp.indexOf("x") != temp.length() - 1 && temp.indexOf("x") != -1) ||
                    (temp.indexOf("%") != temp.length() - 1 && temp.indexOf("%") != -1) ||
                    (temp.indexOf("÷") != temp.length() - 1 && temp.indexOf("÷") != -1)) {
                    tf1.setText(temp);
                }
                else {
                    operation = 'x';
                    if (temp.contains("-") || temp.contains("x") || temp.contains("÷") || 
                        temp.contains("+") || temp.contains("%")) {
                        temp = temp.substring(0, temp.length() - 1);
                        leftOp = Double.parseDouble(temp);
                        tf1.setText(temp + operation);
                    }
                    else {
                        leftOp = Double.parseDouble(tf1.getText());
                        tf1.setText(tf1.getText() + operation);
                    }
                }
            }
            if (e.getSource() == btnDiv) {
                String temp = tf1.getText();
                if (tf1.getText().length() == 0 || tf1.getText().equals("Error")) {
                    tf1.setText("Error");
                }
                else if ((temp.indexOf("-") != temp.length() - 1 && temp.indexOf("-") != -1) ||
                    (temp.indexOf("+") != temp.length() - 1 && temp.indexOf("+") != -1) ||
                    (temp.indexOf("x") != temp.length() - 1 && temp.indexOf("x") != -1) ||
                    (temp.indexOf("%") != temp.length() - 1 && temp.indexOf("%") != -1) ||
                    (temp.indexOf("÷") != temp.length() - 1 && temp.indexOf("÷") != -1)) {
                    tf1.setText(temp);
                }
                else {
                    operation = '÷';
                    if (temp.contains("-") || temp.contains("x") || temp.contains("÷") || 
                        temp.contains("+") || temp.contains("%")) {
                        temp = temp.substring(0, temp.length() - 1);
                        leftOp = Double.parseDouble(temp);
                        tf1.setText(temp + operation);
                    }
                    else {
                        leftOp = Double.parseDouble(tf1.getText());
                        tf1.setText(tf1.getText() + operation);
                    }
                }
            }
            if (e.getSource() == btnRem) {
                String temp = tf1.getText();
                if (tf1.getText().length() == 0 || tf1.getText().equals("Error")) {
                    tf1.setText("Error");
                }
                else if ((temp.indexOf("-") != temp.length() - 1 && temp.indexOf("-") != -1) ||
                    (temp.indexOf("+") != temp.length() - 1 && temp.indexOf("+") != -1) ||
                    (temp.indexOf("x") != temp.length() - 1 && temp.indexOf("x") != -1) ||
                    (temp.indexOf("%") != temp.length() - 1 && temp.indexOf("%") != -1) ||
                    (temp.indexOf("÷") != temp.length() - 1 && temp.indexOf("÷") != -1)) {
                    tf1.setText(temp);
                }
                else {
                    operation = '%';
                    if (temp.contains("-") || temp.contains("x") || temp.contains("÷") || 
                        temp.contains("+") || temp.contains("%")) {
                        temp = temp.substring(0, temp.length() - 1);
                        leftOp = Double.parseDouble(temp);
                        tf1.setText(temp + operation);
                    }
                    else {
                        leftOp = Double.parseDouble(tf1.getText());
                        tf1.setText(tf1.getText() + operation);
                    }
                }
            }
            if (e.getSource() == btnSq) {
                operation = '√';
                tf1.setText(tf1.getText() + operation);
            }
            if (e.getSource() == btnEqual) {
                if (tf1.getText().length() == 0 || tf1.getText().equals("Error")) {
                    tf1.setText("Error");
                }
                else {
                    String temp = tf1.getText();
                    int operatorIndex = temp.indexOf(operation);
                    if (operatorIndex == temp.length() - 1) {
                        tf1.setText("Error");
                    }
                    else {
                        String right = temp.substring(operatorIndex + 1);
                        rightOp = Double.parseDouble(right);
                        if (operation == '+') {
                            result = leftOp + rightOp;
                            tf1.setText(result.toString());
                        }
                        if (operation == '-') {
                            result = leftOp - rightOp;
                            tf1.setText(result.toString());
                        }
                        if (operation == 'x') {
                            result = leftOp * rightOp;
                            tf1.setText(result.toString());
                        }
                        if (operation == '÷') {
                            result = leftOp / rightOp;
                            tf1.setText(result.toString());
                        }
                        if (operation == '%') {
                            result = leftOp % rightOp;
                            tf1.setText(result.toString());
                        }
                        if (operation == '√') {
                            result = Math.sqrt(rightOp);
                            tf1.setText(result.toString());
                        }
                    }
                }
            }
            if (e.getSource() == btnBacksp) {
                if (tf1.getText().length() == 0 || tf1.getText().equals("Error")) {
                    tf1.setText("");
                }
                else {
                    String temp = tf1.getText();
                    tf1.setText(temp.substring(0, temp.length() - 1));
                }
            }
            if (e.getSource() == btnClear) {
                tf1.setText("");
            }
        }
    }
}
