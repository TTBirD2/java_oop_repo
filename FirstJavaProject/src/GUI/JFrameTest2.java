package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
	    
	    frame.setVisible(true);
	    
	    frame.setSize(new Dimension(800,550));
	    frame.setLocation(new Point(300,200));
	    frame.setBackground(Color.black);
	    frame.setTitle("Window Page");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    
	    frame.setIconImage(new ImageIcon("src/GUI/Car Rental.png").getImage());
	    frame.setLayout(new BorderLayout());
	    
	    JButton btnlogin = new JButton();
	    btnlogin.setText("Login Button");
	    btnlogin.setBackground(Color.blue);
	    
	    frame.add(btnlogin, BorderLayout.EAST);
	    
	    JButton btncancle = new JButton();
	    btncancle.setText("Cancle");
	    btncancle.setBackground(Color.red);
	    
	    frame.add(btncancle, BorderLayout.NORTH);
	    
	    JButton btnok = new JButton();
	    btnok.setText("OK");
	    btnok.setBackground(Color.gray);
	    
	    frame.add(btnok, BorderLayout.SOUTH);
	    
	    JButton btnclick = new JButton();
	    btnclick.setText("Click me");
	    btnclick.setBackground(Color.cyan);
	    
	    frame.add(btnclick, BorderLayout.CENTER);
	    
	    JButton btnadmin = new JButton();
	    btnadmin.setText("Admin");
	    btnadmin.setBackground(Color.YELLOW);
	    
	    frame.add(btnadmin, BorderLayout.WEST);
	}

}
