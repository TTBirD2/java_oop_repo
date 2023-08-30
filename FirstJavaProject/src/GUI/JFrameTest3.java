package GUI;

import java.awt.*;
import javax.swing.*;

public class JFrameTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    JFrame frame = new JFrame();
    frame.setVisible(true);
    frame.setSize(new Dimension(800,550));
    frame.setLocation(new Point(300,200));
    frame.setBackground(Color.black);
    frame.setTitle("GrindLayout Page");
    frame.setIconImage(new ImageIcon("src/GUI/Car Rental.png").getImage());
    
    frame.setLayout(new GridLayout());
    
    JButton btnLogin = new JButton();
    btnLogin.setText("Login");
    btnLogin.setBackground(Color.red);
    frame.add(btnLogin);
    
    JButton btnCancle = new JButton();
    btnCancle.setText("Cancle");
    btnCancle.setBackground(Color.blue);
    frame.add(btnCancle);
    
    JLabel lbl = new JLabel();
    lbl.setText("Hello");
    lbl.setBackground(Color.green);
    frame.add(lbl);
    
    JButton btnOK = new JButton();
    btnOK.setText("OK");
    btnOK.setBackground(Color.yellow);
    frame.add(btnOK);
	}

}
