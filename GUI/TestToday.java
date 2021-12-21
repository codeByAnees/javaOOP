package JavaOOP.GUI;

import javax.swing.*;
public class TestToday {
    public static void main(String[] args) {
        Today frame = new Today();
        frame.setTitle("GUI Program");
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}