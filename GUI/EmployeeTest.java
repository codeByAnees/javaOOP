package JavaOOP.GUI;
import javax.swing.*;
public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeGUI frame = new EmployeeGUI();
        frame.setTitle("GUI Program");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}