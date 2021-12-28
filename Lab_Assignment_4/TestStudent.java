package JavaOOP.Lab_Assignment_4;
import javax.swing.*;
public class TestStudent {
    public static void main(String[] args) {
        StudentGUI frame = new StudentGUI();
        frame.setTitle("GUI Program");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
