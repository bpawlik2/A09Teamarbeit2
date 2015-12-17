package kpp;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;

public class MyController {
	//Attribute
	private MyModel model;
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
		model = new MyModel();
		myPanel = new MyPanel(this,model);
		myFrame = new MyFrame(myPanel,"Lights out");
	}
	
	/**
	 * Hier werden die Listener zu den Buttons programmiert
	 * @param arg0
	 */
	public void actionPerformed(ActionEvent arg0) {
		
		switch(arg0.getActionCommand()){
			case"1":
				myPanel.button2.changeColor();
				myPanel.button6.changeColor();
			break;
			
			case"2":
				myPanel.button1.changeColor();
				myPanel.button3.changeColor();
				myPanel.button7.changeColor();
				break;
				
			case"3":
				myPanel.button2.changeColor();
				myPanel.button4.changeColor();	
				myPanel.button8.changeColor();
			break;
				
			case"4":
				myPanel.button5.changeColor();
				myPanel.button3.changeColor();
				myPanel.button9.changeColor();
				break;
				
			case"5":
				myPanel.button4.changeColor();
				myPanel.button10.changeColor();
				break;
				
			case"6":
				myPanel.button1.changeColor();
				myPanel.button7.changeColor();
				myPanel.button11.changeColor();
				break;
				
			case"7":
				myPanel.button2.changeColor();
				myPanel.button8.changeColor();
				myPanel.button6.changeColor();
				myPanel.button12.changeColor();
				break;
				
			case"8":
				myPanel.button3.changeColor();
				myPanel.button9.changeColor();
				myPanel.button7.changeColor();
				myPanel.button13.changeColor();
				break;
				
			case"9":
				myPanel.button4.changeColor();
				myPanel.button10.changeColor();
				myPanel.button8.changeColor();
				myPanel.button14.changeColor();
				break;
				
			case"10":
				myPanel.button5.changeColor();
				myPanel.button9.changeColor();
				myPanel.button15.changeColor();
				break;
				
			case"11":
				myPanel.button6.changeColor();
				myPanel.button12.changeColor();
				myPanel.button16.changeColor();
				break;
				
			case"12":
				myPanel.button7.changeColor();
				myPanel.button13.changeColor();
				myPanel.button11.changeColor();
				myPanel.button17.changeColor();
				break;
				
			case"13":
				myPanel.button8.changeColor();
				myPanel.button14.changeColor();
				myPanel.button12.changeColor();
				myPanel.button18.changeColor();
				break;
				
			case"14":
				myPanel.button9.changeColor();
				myPanel.button15.changeColor();
				myPanel.button13.changeColor();
				myPanel.button19.changeColor();
				break;
				
			case"15":
				myPanel.button10.changeColor();
				myPanel.button14.changeColor();
				myPanel.button20.changeColor();
				break;
				
			case"16":
				myPanel.button11.changeColor();
				myPanel.button17.changeColor();
				myPanel.button21.changeColor();
				
				break;
				
			case"17":
				myPanel.button12.changeColor();
				myPanel.button16.changeColor();
				myPanel.button18.changeColor();
				myPanel.button22.changeColor();
				break;
				
			case"18":
				myPanel.button13.changeColor();
				myPanel.button17.changeColor();
				myPanel.button19.changeColor();
				myPanel.button23.changeColor();
				break;
				
			case"19":
				myPanel.button14.changeColor();
				myPanel.button18.changeColor();
				myPanel.button20.changeColor();
				myPanel.button24.changeColor();
				break;
				
			case"20":
				myPanel.button15.changeColor();
				myPanel.button19.changeColor();
				myPanel.button25.changeColor();
				break;
				
			case"21":
				myPanel.button16.changeColor();
				myPanel.button22.changeColor();
				break;
				
			case"22":
				myPanel.button17.changeColor();
				myPanel.button23.changeColor();
				myPanel.button21.changeColor();
				break;
				
			case"23":
				myPanel.button18.changeColor();
				myPanel.button24.changeColor();
				myPanel.button22.changeColor();
				break;
				
			case"24":
				myPanel.button19.changeColor();
				myPanel.button25.changeColor();
				myPanel.button23.changeColor();
				break;
				
			case"25":
				myPanel.button20.changeColor();
				myPanel.button24.changeColor();
				break;
		}
	}
}

