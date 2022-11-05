import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Frame extends JFrame{

	public Frame(){

		setTitle("Calculator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200,254);
		setLocation(400,200);
	//	setResizable(false);
		add(new Panel());

	}



}