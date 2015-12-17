package kpp;

import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;


public class MyFrame extends JFrame {

	private MyPanel myPanel;

	public MyFrame(MyPanel mp, String title) {
		this.myPanel = mp;
		this.setTitle(title);
		this.setPreferredSize(new Dimension(800, 500));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.getContentPane().add(BorderLayout.CENTER, [myPanel.xy]);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}