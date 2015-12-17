package kpp;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller des MVC's, beinhaltet dieses mal auch die Logik (Model wäre umständlich)
 * @author Piasecki Martin
 * @version 17.12.2015
 */
public class MyController implements ActionListener {
	//Attribute
	private MyModel myModel;
	private MyFrame myFrame;
	private MyPanel myPanel;
	
	/**
	 * main-startet den Konstruktor und somit das ganze Programm
	 * @param args
	 * @since 14.12.2015
	 */
	public static void main(String[] args) {
		new MyController();
	}
	
	/**
	 * Konstruktor-erzeugt die objekte/verbindet das MVC/ und fügt die Listener hinzu
	 * @since 14.12.2015
	 */
	public MyController(){
		myModel = new MyModel();
		myPanel = new MyPanel(this,myModel);
		myFrame = new MyFrame(myPanel,"Lights out");
		
		myPanel.b1.addActionListener(this);
		myPanel.b1.setActionCommand("1");
		myPanel.b2.addActionListener(this);
		myPanel.b2.setActionCommand("2");
		myPanel.b3.addActionListener(this);
		myPanel.b3.setActionCommand("3");
		myPanel.b4.addActionListener(this);
		myPanel.b4.setActionCommand("4");
		myPanel.b5.addActionListener(this);
		myPanel.b5.setActionCommand("5");
		myPanel.b6.addActionListener(this);
		myPanel.b6.setActionCommand("6");
		myPanel.b7.addActionListener(this);
		myPanel.b7.setActionCommand("7");
		myPanel.b8.addActionListener(this);
		myPanel.b8.setActionCommand("8");
		myPanel.b9.addActionListener(this);
		myPanel.b9.setActionCommand("9");
		myPanel.b10.addActionListener(this);
		myPanel.b10.setActionCommand("10");
		myPanel.b11.addActionListener(this);
		myPanel.b11.setActionCommand("11");
		myPanel.b12.addActionListener(this);
		myPanel.b12.setActionCommand("12");
		myPanel.b13.addActionListener(this);
		myPanel.b13.setActionCommand("13");
		myPanel.b14.addActionListener(this);
		myPanel.b14.setActionCommand("14");
		myPanel.b15.addActionListener(this);
		myPanel.b15.setActionCommand("15");
		myPanel.b16.addActionListener(this);
		myPanel.b16.setActionCommand("16");
		myPanel.b17.addActionListener(this);
		myPanel.b17.setActionCommand("17");
		myPanel.b18.addActionListener(this);
		myPanel.b18.setActionCommand("18");
		myPanel.b19.addActionListener(this);
		myPanel.b19.setActionCommand("19");
		myPanel.b20.addActionListener(this);
		myPanel.b20.setActionCommand("20");
		myPanel.b21.addActionListener(this);
		myPanel.b21.setActionCommand("21");
		myPanel.b22.addActionListener(this);
		myPanel.b22.setActionCommand("22");
		myPanel.b23.addActionListener(this);
		myPanel.b23.setActionCommand("23");
		myPanel.b24.addActionListener(this);
		myPanel.b24.setActionCommand("24");
		myPanel.b25.addActionListener(this);
		myPanel.b25.setActionCommand("25");
		
	}
	
	/**
	 * Schaltet das Licht ein bzw. aus, je nachdem welche farbe es hat (gelb an/schwarz aus)
	 * @param b der button der gedrückt wird
	 * @return damit er aufhört und nicht die farbe zurückwechselt
	 */
	public int changeColor(JButton b){
		if(b.getBackground()==Color.YELLOW){
			b.setBackground(Color.BLACK);
			return 0;
		}
		
		if(b.getBackground()==Color.BLACK){
			b.setBackground(Color.YELLOW);
			return 1;
		}
		return 0;
	}
	
	
	/**
	 * Hier werden die Listener zu den Buttons programmiert
	 * @param arg0
	 */
	public void actionPerformed(ActionEvent arg0) {
		
		switch(arg0.getActionCommand()){
			case"1":
				changeColor(myPanel.b1);
				changeColor(myPanel.b2);
				changeColor(myPanel.b6);
			break;
			
			case"2":
				changeColor(myPanel.b2);
				changeColor(myPanel.b1);
				changeColor(myPanel.b3);
				changeColor(myPanel.b7);
				break;
				
			case"3":
				changeColor(myPanel.b3);
				changeColor(myPanel.b2);
				changeColor(myPanel.b4);	
				changeColor(myPanel.b8);
			break;
				
			case"4":
				changeColor(myPanel.b4);
				changeColor(myPanel.b5);
				changeColor(myPanel.b3);
				changeColor(myPanel.b9);
				break;
				
			case"5":
				changeColor(myPanel.b5);
				changeColor(myPanel.b4);
				changeColor(myPanel.b10);
				break;
				
			case"6":
				changeColor(myPanel.b6);
				changeColor(myPanel.b1);
				changeColor(myPanel.b7);
				changeColor(myPanel.b11);
				break;
				
			case"7":
				changeColor(myPanel.b7);
				changeColor(myPanel.b2);
				changeColor(myPanel.b8);
				changeColor(myPanel.b6);
				changeColor(myPanel.b12);
				break;
				
			case"8":
				changeColor(myPanel.b8);
				changeColor(myPanel.b3);
				changeColor(myPanel.b9);
				changeColor(myPanel.b7);
				changeColor(myPanel.b13);
				break;
				
			case"9":
				changeColor(myPanel.b9);
				changeColor(myPanel.b4);
				changeColor(myPanel.b10);
				changeColor(myPanel.b8);
				changeColor(myPanel.b14);
				break;
				
			case"10":
				changeColor(myPanel.b10);
				changeColor(myPanel.b5);
				changeColor(myPanel.b9);
				changeColor(myPanel.b15);
				break;
				
			case"11":
				changeColor(myPanel.b11);
				changeColor(myPanel.b6);
				changeColor(myPanel.b12);
				changeColor(myPanel.b16);
				break;
				
			case"12":
				changeColor(myPanel.b12);
				changeColor(myPanel.b7);
				changeColor(myPanel.b13);
				changeColor(myPanel.b11);
				changeColor(myPanel.b17);
				break;
				
			case"13":
				changeColor(myPanel.b13);
				changeColor(myPanel.b8);
				changeColor(myPanel.b14);
				changeColor(myPanel.b12);
				changeColor(myPanel.b18);
				break;
				
			case"14":
				changeColor(myPanel.b14);
				changeColor(myPanel.b9);
				changeColor(myPanel.b15);
				changeColor(myPanel.b13);
				changeColor(myPanel.b19);
				break;
				
			case"15":
				changeColor(myPanel.b15);
				changeColor(myPanel.b10);
				changeColor(myPanel.b14);
				changeColor(myPanel.b20);
				break;
				
			case"16":
				changeColor(myPanel.b16);
				changeColor(myPanel.b11);
				changeColor(myPanel.b17);
				changeColor(myPanel.b21);
				
				break;
				
			case"17":
				changeColor(myPanel.b17);
				changeColor(myPanel.b12);
				changeColor(myPanel.b16);
				changeColor(myPanel.b18);
				changeColor(myPanel.b22);
				break;
				
			case"18":
				changeColor(myPanel.b18);
				changeColor(myPanel.b13);
				changeColor(myPanel.b17);
				changeColor(myPanel.b19);
				changeColor(myPanel.b23);
				break;
				
			case"19":
				changeColor(myPanel.b19);
				changeColor(myPanel.b14);
				changeColor(myPanel.b18);
				changeColor(myPanel.b20);
				changeColor(myPanel.b24);
				break;
				
			case"20":
				changeColor(myPanel.b20);
				changeColor(myPanel.b15);
				changeColor(myPanel.b19);
				changeColor(myPanel.b25);
				break;
				
			case"21":
				changeColor(myPanel.b21);
				changeColor(myPanel.b16);
				changeColor(myPanel.b22);
				break;
				
			case"22":
				changeColor(myPanel.b22);
				changeColor(myPanel.b17);
				changeColor(myPanel.b23);
				changeColor(myPanel.b21);
				break;
				
			case"23":
				changeColor(myPanel.b23);
				changeColor(myPanel.b18);
				changeColor(myPanel.b24);
				changeColor(myPanel.b22);
				break;
				
			case"24":
				changeColor(myPanel.b24);
				changeColor(myPanel.b19);
				changeColor(myPanel.b25);
				changeColor(myPanel.b23);
				break;
				
			case"25":
				changeColor(myPanel.b25);
				changeColor(myPanel.b20);
				changeColor(myPanel.b24);
				break;
		}
	}
}

