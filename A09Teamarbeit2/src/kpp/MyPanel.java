package kpp;

import java.awt.GridLayout;

import javax.swing.*;
import java.awt.event.*;
public class MyPanel extends JPanel {

	private MyController myController;
	private MyModel myModel;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b10;
	JButton b11;
	JButton b12;
	JButton b13;
	JButton b14;
	JButton b15;
	JButton b16;
	JButton b17;
	JButton b18;
	JButton b19;
	JButton b20;
	JButton b21;
	JButton b22;
	JButton b23;
	JButton b24;
	JButton b25;

	public MyPanel(MyController mc, MyModel mm) {
		this.myController = mc;
		this.myModel = mm;
		init();
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		b5 = new JButton();
		b6 = new JButton();
		b7 = new JButton();
		b8 = new JButton();
		b9 = new JButton();
		b10 = new JButton();
		b11 = new JButton();
		b12 = new JButton();
		b13 = new JButton();
		b14 = new JButton();
		b15 = new JButton();
		b16 = new JButton();
		b17 = new JButton();
		b18 = new JButton();
		b19 = new JButton();
		b20 = new JButton();
		b21 = new JButton();
		b22 = new JButton();
		b23 = new JButton();
		b24 = new JButton();
		b25 = new JButton();
		

		this.setLayout(new GridLayout(5, 5));
		
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(b7);
		this.add(b8);
		this.add(b9);
		this.add(b10);
		this.add(b11);
		this.add(b12);
		this.add(b13);
		this.add(b14);
		this.add(b15);
		this.add(b16);
		this.add(b17);
		this.add(b18);
		this.add(b19);
		this.add(b20);
		this.add(b21);
		this.add(b22);
		this.add(b23);
		this.add(b24);
		this.add(b25);
		
	}
	public void init(){
		b1.addActionListener((ActionListener) myController);
		b1.setActionCommand("1");
	}
}