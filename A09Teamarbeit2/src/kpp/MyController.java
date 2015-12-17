package kpp;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;

public class MyController {
	//Attribute
	private MyModel myModel;
	private MyFrame myFrame;
	private MyPanel myPanel;
	
	/**
	 * main-startet den Konstruktor
	 * @param args
	 * @since 14.12.2015
	 */
	public static void main(String[] args) {
		new MyController();
	}
	
	/**
	 * Konstruktor-erzeugt die objekte/verbindet das MVC
	 * @since 14.12.2015
	 */
	public MyController(){
		myModel = new MyModel();
		myPanel = new MyPanel(this,myModel);
		myFrame = new MyFrame(myPanel,"Lights out");
	}
	
	
	
	
	/**
	 * Hier werden die Listener zu den Buttons programmiert
	 * @param arg0
	 */
	public void actionPerformed(ActionEvent arg0) {
		
		switch(arg0.getActionCommand()){
			case"1":
				myPanel.b2.changeColor();
				myPanel.b6.changeColor();
			break;
			
			case"2":
				myPanel.b1.changeColor();
				myPanel.b3.changeColor();
				myPanel.b7.changeColor();
				break;
				
			case"3":
				myPanel.b2.changeColor();
				myPanel.b4.changeColor();	
				myPanel.b8.changeColor();
			break;
				
			case"4":
				myPanel.b5.changeColor();
				myPanel.b3.changeColor();
				myPanel.b9.changeColor();
				break;
				
			case"5":
				myPanel.b4.changeColor();
				myPanel.b10.changeColor();
				break;
				
			case"6":
				myPanel.b1.changeColor();
				myPanel.b7.changeColor();
				myPanel.b11.changeColor();
				break;
				
			case"7":
				myPanel.b2.changeColor();
				myPanel.b8.changeColor();
				myPanel.b6.changeColor();
				myPanel.b12.changeColor();
				break;
				
			case"8":
				myPanel.b3.changeColor();
				myPanel.b9.changeColor();
				myPanel.b7.changeColor();
				myPanel.b13.changeColor();
				break;
				
			case"9":
				myPanel.b4.changeColor();
				myPanel.b10.changeColor();
				myPanel.b8.changeColor();
				myPanel.b14.changeColor();
				break;
				
			case"10":
				myPanel.b5.changeColor();
				myPanel.b9.changeColor();
				myPanel.b15.changeColor();
				break;
				
			case"11":
				myPanel.b6.changeColor();
				myPanel.b12.changeColor();
				myPanel.b16.changeColor();
				break;
				
			case"12":
				myPanel.b7.changeColor();
				myPanel.b13.changeColor();
				myPanel.b11.changeColor();
				myPanel.b17.changeColor();
				break;
				
			case"13":
				myPanel.b8.changeColor();
				myPanel.b14.changeColor();
				myPanel.b12.changeColor();
				myPanel.b18.changeColor();
				break;
				
			case"14":
				myPanel.b9.changeColor();
				myPanel.b15.changeColor();
				myPanel.b13.changeColor();
				myPanel.b19.changeColor();
				break;
				
			case"15":
				myPanel.b10.changeColor();
				myPanel.b14.changeColor();
				myPanel.b20.changeColor();
				break;
				
			case"16":
				myPanel.b11.changeColor();
				myPanel.b17.changeColor();
				myPanel.b21.changeColor();
				
				break;
				
			case"17":
				myPanel.b12.changeColor();
				myPanel.b16.changeColor();
				myPanel.b18.changeColor();
				myPanel.b22.changeColor();
				break;
				
			case"18":
				myPanel.b13.changeColor();
				myPanel.b17.changeColor();
				myPanel.b19.changeColor();
				myPanel.b23.changeColor();
				break;
				
			case"19":
				myPanel.b14.changeColor();
				myPanel.b18.changeColor();
				myPanel.b20.changeColor();
				myPanel.b24.changeColor();
				break;
				
			case"20":
				myPanel.b15.changeColor();
				myPanel.b19.changeColor();
				myPanel.b25.changeColor();
				break;
				
			case"21":
				myPanel.b16.changeColor();
				myPanel.b22.changeColor();
				break;
				
			case"22":
				myPanel.b17.changeColor();
				myPanel.b23.changeColor();
				myPanel.b21.changeColor();
				break;
				
			case"23":
				myPanel.b18.changeColor();
				myPanel.b24.changeColor();
				myPanel.b22.changeColor();
				break;
				
			case"24":
				myPanel.b19.changeColor();
				myPanel.b25.changeColor();
				myPanel.b23.changeColor();
				break;
				
			case"25":
				myPanel.b20.changeColor();
				myPanel.b24.changeColor();
				break;
		}
	}
}

