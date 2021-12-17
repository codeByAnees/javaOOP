package JavaOOP.GUI;
import javax.swing.*;
public class TestCalculator {
    public static void main(String[] args) {
        MyCalculator frame = new MyCalculator();
        frame.setTitle("Calculator");
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
