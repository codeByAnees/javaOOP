package JavaOOP.SemesterProject;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainGUI {

public static void main(String[] args) {
	
	// Frame
			JFrame frame =new JFrame();
			frame.setSize(1000,710);
			frame.setLocation(170, 15);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// PANEL
			//Main
			JPanel panel=new JPanel();
			panel.setLayout(null);
			panel.setBackground(Color.black);
			ImageIcon image=new ImageIcon("D:\\Visual Studio\\Java\\JavaOOP\\SemesterProject\\a.jpg");
			JLabel background=new JLabel(image);
			
			background.setBounds(0, 120, 990, 500);
			background.setIcon(image);
			panel.add(background);
			frame.setVisible(true);
			frame.add(panel);
			
			
			// Upper Boundary
			
			JPanel upper =new JPanel();
			upper.setLayout(null);
			upper.setBounds(0, 20, 1000, 80);
			upper.setBackground(Color.black);
			panel.add(upper);
			
			
			// Lower Boundary
			JPanel lower =new JPanel();
			lower.setLayout(null);
			lower.setBounds(0, 550, 1000, 80);
			lower.setBackground(Color.black);
			panel.add(lower);
			
			
						
	// LABEL
			
			//1-UPPER
			
			JLabel upperlabel=new JLabel("ELECTRICITY  BILL  MANAGEMENT  SYSTEM");
			upper.add(upperlabel);
			upperlabel.setBounds(95, 17, 800, 50);
			upperlabel.setFont(new Font("Serif",Font.CENTER_BASELINE,35));
			upperlabel.setForeground(Color.white);
			
			//2-LOWER
			JLabel lowerlabel=new JLabel("-------------------------------------------------------------------------");
			background.add(lowerlabel);
			lowerlabel.setBounds(53, 400, 1000, 80);
			lowerlabel.setFont(new Font("Serif",Font.CENTER_BASELINE,35));
			lowerlabel.setForeground(Color.white);
			
			
	
			
	// BUTTONS
		
			
			
			JButton b1=new JButton("ADMIN");
			b1.setBounds(50,100,250,40);
			b1.setFont(new Font("Serif",Font.BOLD,25));
			b1.setForeground(Color.white);
			b1.setBackground(Color.black);
			b1.setBorderPainted(false);
			background.add(b1);
			
			
			//1- View Profile
			JButton b=new JButton("CUSTOMER");
			b.setBounds(50,180,250,40);
			b.setFont(new Font("Serif",Font.BOLD,25));
			b.setForeground(Color.white);
			b.setBackground(Color.black);
			b.setBorderPainted(false);
			background.add(b);
			
			//1- View Profile
			JButton b2=new JButton("EXIT");
			b2.setBounds(50,260,250,40);
			b2.setFont(new Font("Serif",Font.BOLD,25));
			b2.setForeground(Color.white);
			b2.setBackground(Color.black);
			b2.setBorderPainted(false);
			background.add(b2);
			b2.addActionListener(e->System.exit(0));
			

			
}

}
