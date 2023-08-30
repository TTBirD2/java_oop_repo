package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    JFrame frame = new JFrame();
    
    frame.setVisible(true);
    
    frame.setSize(new Dimension(800,550));
    frame.setLocation(new Point(300,200));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBackground(Color.black);
    frame.setTitle("Login Form");
    
    frame.setLayout(new FlowLayout());
    
    JButton btn = new JButton();
    btn.setText("Click Me");
    btn.setSize(new Dimension(50,80));
    btn.setBackground(Color.yellow);
    btn.setForeground(Color.BLUE);
    frame.add(btn);
    
    JLabel lbl = new JLabel();
    lbl.setText("Enter your name");
    lbl.setForeground(Color.red);
    frame.add(lbl);
    
    JTextField txt = new JTextField();
    txt.setText("Su Su");
    txt.setSize(new Dimension(300,300));
    frame.add(txt);
    
    JButton btn2 = new JButton();
    btn2.addActionListener(new ActionListener(){
    	public void actionperformed(ActionEvent agrs0) {
    		String name = txt.getText();
    		JOptionPane.showMessageDialog(null, name+ " is login successfully");
    	}
    });
    
    btn2.setText("Login");
    btn2.setForeground(Color.red);
    frame.add(btn2);
	}

}
