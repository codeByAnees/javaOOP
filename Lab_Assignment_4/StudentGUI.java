package JavaOOP.Lab_Assignment_4;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class StudentGUI extends JFrame {
    private JTextField nameField;
    private JRadioButton buttonM;
    private JRadioButton buttonF;
    private JCheckBox enrolledBox;
    private JTextField marksField;
    private JTextField percentageField;

    private JButton saveButton;
    private JButton percentageBtn;
    private JButton searchBtn;

    ArrayList<Student> stu = new ArrayList<>();
    public StudentGUI() {
        Student s = new Student();
        setLayout(new GridLayout(5, 0, 0, 0));
        JPanel panel1 = new JPanel(new GridLayout(1, 1, 0, 0));
        JPanel panel2 = new JPanel(new GridLayout(1, 1, 0, 0));
        JPanel panel3 = new JPanel(new GridLayout(1, 3, 0, 0));
        JPanel panel4 = new JPanel(new GridLayout(3, 2, 0, 0));
        JPanel panel5 = new JPanel(new GridLayout(1, 3, 0, 0));

        JLabel label1 = new JLabel("Student");
        label1.setHorizontalAlignment(JLabel.CENTER);
        panel1.add(label1);
       
        JLabel label2 = new JLabel("Name");
        panel2.add(label2);
        nameField = new JTextField(8);
        panel2.add(nameField);

        JLabel label3 = new JLabel("Gender");
        panel3.add(label3);
        buttonM = new JRadioButton("Male");
        buttonF = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(buttonM);
        bg.add(buttonF);
        panel3.add(buttonM);
        panel3.add(buttonF);

        JLabel label4 = new JLabel("Enrolled");
        panel4.add(label4);
        enrolledBox = new JCheckBox();
        panel4.add(enrolledBox);

        JLabel label5 = new JLabel("Marks");
        panel4.add(label5);
        marksField = new JTextField(8);
        panel4.add(marksField);

        JLabel label6 = new JLabel("Percentage");
        panel4.add(label6);
        percentageField = new JTextField(8);
        panel4.add(percentageField);


        saveButton = new JButton("Save");
        panel5.add(saveButton);
        percentageBtn = new JButton("Percentage");
        panel5.add(percentageBtn);
        searchBtn = new JButton("Search");
        panel5.add(searchBtn);

        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);

        nameField.addActionListener(e -> {
            String name = nameField.getText();
            s.setName(name);
        });

        buttonM.addActionListener(e -> {
            if (buttonM.isSelected()) {
                s.setGender("Male");
            }
        });
        buttonF.addActionListener(e -> {
            if (buttonF.isSelected()) {
                s.setGender("Female");
            }
        });

        enrolledBox.addItemListener(e -> {
            if (e.getStateChange() == 1) {
                s.setEnrolled(true);
            }
        });

        marksField.addActionListener(e -> {
            String marks = marksField.getText();
            double temp = Double.parseDouble(marks);
            s.setMarks(temp);
        });

        percentageBtn.addActionListener(e -> {
            Double percent = s.calPercent();
            s.setPercentage(percent);
            percentageField.setText(percent.toString());
        });

        saveButton.addActionListener(e -> {
            stu.add(s);
        });

        searchBtn.addActionListener(e -> {
            String name = nameField.getText();
        });
    }
}
