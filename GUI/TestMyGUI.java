package JavaOOP.GUI;
import javax.swing.*;
public class TestMyGUI {
    public static void main(String[] args) {
        My_GUI frame = new My_GUI();
        frame.setTitle("GUI First Program");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
