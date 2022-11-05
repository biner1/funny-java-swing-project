import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Panel extends JPanel implements ActionListener{

	private double num1;
	private int operator;
	private double num2;
	private double result;
	private JTextField text;
	private JButton zero,one,two,three,four,five,six,seven,eight,nine,point,plus,minus,mult,div,equal,clear;

	public Panel(){

		text = new JTextField(14);
		zero = new JButton("0");
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		point = new JButton(".");

		plus = new JButton("+");
		minus = new JButton("-");
		mult = new JButton("*");
		div = new JButton("/");
		equal = new JButton("=");
		clear = new JButton("C");


		setLayout(new BorderLayout());

		add(text,"North");
		// adding elements to panel

		// numbers

		JPanel buttonsPanel = new JPanel();



		buttonsPanel.add(zero);
		buttonsPanel.add(one);
		buttonsPanel.add(two);
		buttonsPanel.add(three);
		buttonsPanel.add(four);
		buttonsPanel.add(five);
		buttonsPanel.add(six);
		buttonsPanel.add(seven);
		buttonsPanel.add(eight);
		buttonsPanel.add(nine);
		buttonsPanel.add(point);

		// operations
		buttonsPanel.add(plus);
		buttonsPanel.add(minus);
		buttonsPanel.add(mult);
		buttonsPanel.add(div);
		buttonsPanel.add(equal);
		buttonsPanel.add(clear);

		add(buttonsPanel,"Center");


		// add action listener

		zero.addActionListener(this);
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		point.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		equal.addActionListener(this);
		clear.addActionListener(this);



		}



		public void actionPerformed(ActionEvent evt){

			Object source = evt.getSource();

			if(source==zero){
				text.setText(text.getText().concat("0"));
				}
			if(source==one){
				text.setText(text.getText().concat("1"));
				}
			if(source==two){
				text.setText(text.getText().concat("2"));
				}
			if(source==three){
				text.setText(text.getText().concat("3"));
				}
			if(source==four){
				text.setText(text.getText().concat("4"));
				}
			if(source==five){
				text.setText(text.getText().concat("5"));
				}
			if(source==six){
				text.setText(text.getText().concat("6"));
				}
			if(source==seven){
				text.setText(text.getText().concat("7"));
				}
			if(source==eight){
				text.setText(text.getText().concat("8"));
				}
			if(source==nine){
				text.setText(text.getText().concat("9"));
				}
			if(source==point){
				text.setText(text.getText().concat("."));
				}

				// if operator is chosen, text a assigned to number and textField=""
			if(source==plus){
				operator=1;
				num1=Double.parseDouble(text.getText());
				text.setText("");
				}
			if(source==minus){
				operator=2;
				num1=Double.parseDouble(text.getText());
				text.setText("");
				}
			if(source==mult){
				operator=3;
				num1=Double.parseDouble(text.getText());
				text.setText("");
				}
			if(source==div){
				operator=4;
				num1=Double.parseDouble(text.getText());
				text.setText("");
				}
			if(source==equal){
				num2=Double.parseDouble(text.getText());

				switch(operator){
					case 1:
						result=num1+num2;
						break;
					case 2:
						result=num1-num2;
						break;
					case 3:
						result=num1*num2;
						break;
					case 4:
						result=num1/num2;
						break;
					default:
						result=0;

					}
					text.setText(""+result);

				}// end of if == equal

			if(source==clear){
				text.setText("");
				}



			}// end of actionPerformed()


}