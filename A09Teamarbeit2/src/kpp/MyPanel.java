package kpp;
import javax.swing.*;
import java.io.*;


public class MyPanel extends JPanel {

	private MyController myController;
	private MyModel myModel;
	static JTextField textFieldA;
	private JLabel jLabelA;
	JTextArea textArea;
	JButton jB;

	public MyPanel(MyController mc, MyModel mm) { 
		this.myController = mc;
		this.myModel = mm;

		//textFieldA = new JTextField( , ); // int 
		//JLabelA = new JLabel("");

		textArea = new JTextArea(60, 20);
		textArea.setEditable(false);

		jB = new JButton("");

		add(jLabelA);
		add(textFieldA);
	}

}