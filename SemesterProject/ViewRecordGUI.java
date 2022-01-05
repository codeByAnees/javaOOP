package JavaOOP.SemesterProject;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ViewRecordGUI {

    private JTextArea textArea;
    public ViewRecordGUI() {
	// Frame
		JFrame frame = new JFrame();
		frame.setSize(1000, 650);
		frame.setLocation(160, 15);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);

	// Panel 1
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.gray);
		frame.add(panel);
		
	// Panel 2
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(0, 30, 1000, 80);
		panel2.setBackground(Color.black);
		panel.add(panel2);
		
		// BORDERS
	//Panel 3
		JPanel border1 = new JPanel();
		border1.setLayout(null);
		border1.setBounds(30, 0, 5, 710);
		border1.setBackground(Color.black);
		panel.add(border1);
	// Panel 4
		JPanel border2 = new JPanel();
		border2.setLayout(null);
		border2.setBounds(950, 0, 5, 710);
		border2.setBackground(Color.black);
		panel.add(border2);
		
	// TEXT AREA
		textArea = new JTextArea();
		panel.add(textArea);
		textArea.setBounds(100, 130, 780, 500);
        textArea.setEditable(false);
	
	// LABEL
		JLabel viewlabel = new JLabel("USER  RECORD");
		panel2.add(viewlabel);
		viewlabel.setBounds(410, 17, 280, 50);
		viewlabel.setFont(new Font("Serif",Font.CENTER_BASELINE,23));
		viewlabel.setForeground(Color.white);
		
		
		//Design1:
		JLabel design1 = new JLabel("` * ` * ` * ` * ` * `");
		panel2.add(design1);
		design1.setBounds(50, 17, 262, 50);
		design1.setFont(new Font("Serif",Font.CENTER_BASELINE,25));
		design1.setForeground(Color.yellow);
		//Design2
		JLabel design2 = new JLabel("` * ` * ` * ` * ` * `");
		panel2.add(design2);
		design2.setBounds(750, 17, 262, 50);
		design2.setFont(new Font("Serif",Font.CENTER_BASELINE,25));
		design2.setForeground(Color.yellow);
    }

	public JTextArea getArea() {
		return textArea;
	}
}