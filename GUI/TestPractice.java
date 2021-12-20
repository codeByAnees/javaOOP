package JavaOOP.GUI;
import javax.swing.*;
public class TestPractice {
    public static void main(String[] args) {
        Practice frame = new Practice();
        frame.setTitle("GUI Program");
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
