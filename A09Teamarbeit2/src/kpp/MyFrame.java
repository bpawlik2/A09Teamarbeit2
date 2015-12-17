package kpp;

import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;
 
/**
 * Das Frame der GUI
 * 
 * @author Jakub Kopanski
 * @version 17.12.2015
 */
public class MyFrame extends JFrame {

	private MyPanel myPanel;
	
	/**
	 * Konstruktor von MyFrame
	 * 
	 * @param mp mypanel
	 * @param title der titel
	 */
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