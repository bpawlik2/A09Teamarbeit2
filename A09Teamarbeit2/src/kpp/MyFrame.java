package kpp;

import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;
 

public class MyFrame extends JFrame {

	private MyPanel myPanel;

	public MyFrame(MyPanel mp, String title) {
		this.myPanel = mp; 
		this.setTitle(title);
		this.setPreferredSize(new Dimension(400, 400));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(myPanel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}