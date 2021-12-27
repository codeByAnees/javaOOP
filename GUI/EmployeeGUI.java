package JavaOOP.GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class EmployeeGUI extends JFrame {
    private JTextField id;
    private JTextField name;
    private JRadioButton male;
    private JRadioButton female;
    private JComboBox designation;
    private JTextField salary;
    private JRadioButton hourly;
    private JRadioButton monthly;
    private JTextField tax;

    private JButton save;
    private JButton delete;
    private JButton calTax;
    private JButton clear;
    private ArrayList<Employee> empList = new ArrayList<>();
    public EmployeeGUI() {
        Employee emp = new Employee();
        setLayout(new GridLayout(7, 0, 0, 0));
        JPanel panel1 = new JPanel(new GridLayout(1, 1, 0, 0));
        JLabel label = new JLabel("Employee Information System");
        panel1.add(label);
        add(panel1);

        JPanel panel2 = new JPanel(new GridLayout(2, 2, 0, 0));
        JLabel label1 = new JLabel("ID");
        panel2.add(label1);
        id = new JTextField(8);
        panel2.add(id);
        JLabel label2 = new JLabel("Name");
        panel2.add(label2);
        name = new JTextField(8);
        panel2.add(name);
        add(panel2);
        id.addActionListener(e -> {
            emp.setID(id.getText());
        });
        name.addActionListener(e -> {
            emp.setName(name.getText());
        });

        JPanel panel3 = new JPanel(new GridLayout(1, 3, 0, 0));
        JLabel label3 = new JLabel("Gender");
        panel3.add(label3);
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        ButtonGroup b = new ButtonGroup();
        b.add(male);
        b.add(female);
        panel3.add(male);
        panel3.add(female);
        add(panel3);
        male.addActionListener(e -> {
            if (male.isSelected()) {
                emp.setGender(male.getText());
            }
            else emp.setGender(female.getText());
        });

        JPanel panel4 = new JPanel(new GridLayout(2, 2, 0, 0));
        JLabel label4 = new JLabel("Designation");
        panel4.add(label4);
        String[] s = {"Manager", "Programmer", "Accountant"};
        designation = new JComboBox(s);
        panel4.add(designation);

        JLabel label5 = new JLabel("Salary");
        panel4.add(label5);
        salary = new JTextField(8);
        panel4.add(salary);
        add(panel4);
        designation.addItemListener(e -> {
            emp.setJobTitle((String)designation.getSelectedItem());
        });
        salary.addActionListener(e -> {
            emp.setSalary((Double.parseDouble(salary.getText())));
        });

        JPanel panel5 = new JPanel(new GridLayout(1, 3, 0, 0));
        JLabel label6 = new JLabel("Status");
        panel5.add(label6);
        hourly = new JRadioButton("Hourly");
        monthly = new JRadioButton("Monthly");
        ButtonGroup c = new ButtonGroup();
        c.add(hourly);
        c.add(monthly);
        panel5.add(hourly);
        panel5.add(monthly);
        add(panel5);
        hourly.addActionListener(e -> {
            emp.setStatus("Hourly");
        });
        monthly.addActionListener(e -> {
            emp.setStatus("Monthly");
        });

        JPanel panel6 = new JPanel(new GridLayout(1, 2, 0, 0));
        JLabel label7 = new JLabel("Tax");
        panel6.add(label7);
        tax = new JTextField(6);
        panel6.add(tax);
        add(panel6);
        tax.addActionListener(e -> {
            String temp = emp.getStatus();
            if (temp.equals("Hourly")) {
                emp.setTax((emp.getSalary() * 100) / 3);
            }
            else emp.setTax((emp.getSalary() * 100) / 5);
        });

        JPanel panel7 = new JPanel(new GridLayout(1, 4, 0, 0));
        save = new JButton("Save");
        panel7.add(save);
        delete = new JButton("Delete");
        panel7.add(delete);
        calTax = new JButton("CalTax");
        panel7.add(calTax);
        clear = new JButton("Clear");
        panel7.add(clear);
        add(panel7);
        save.addActionListener(e -> {
            empList.add(emp);
        });
        calTax.addActionListener(e -> {
            tax.setText(emp.getTax() + "");
        });
    }
}
