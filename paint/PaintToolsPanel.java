import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class PaintToolsPanel extends JPanel implements KeyListener,ActionListener{

	private final JButton pen, line_button, circle_button, square_button;
	private JButton current_tool;

	// constructor
	PaintToolsPanel(){

		setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setBorder(BorderFactory.createTitledBorder(BorderFactory.createRaisedBevelBorder(),"Tools"));

		//this.setFocusable(true);

		// creating the tool buttons
		pen = new JButton("pen");
		line_button = new JButton("line_button");
		circle_button = new JButton("circle_button");
		square_button = new JButton("square_button");
		current_tool = pen;

		// adding the buttons to the panel
		add(pen);
		add(line_button);
		add(circle_button);
		add(square_button);

		// adding actionListeners
		pen.addActionListener(this);
		line_button.addActionListener(this);
		circle_button.addActionListener(this);
		square_button.addActionListener(this);

		// setFocusable(false) for all buttons
		pen.setFocusable(false);
		line_button.setFocusable(false);
		circle_button.setFocusable(false);
		square_button.setFocusable(false);


		// add keyListener
		addKeyListener(this);


		} // end of PaintToolsPanel constructor

	public JButton getCurrentTool(){
		return current_tool;
	}

	// creating events
	public void actionPerformed(ActionEvent evt){

		Object source = evt.getSource(); // get event source

		if(source ==pen){
			current_tool = pen;

		}
		if(source ==line_button){
			current_tool = line_button;

		}
		if(source==circle_button){
			current_tool = circle_button;

		}
		if(source==square_button){
			current_tool = square_button;

		}
		System.out.println(current_tool.getText()+" is clicked");

	} // end of actionPerformed


	// key listener implementation
	public void keyTyped(KeyEvent e){ }

	public void keyPressed(KeyEvent e){
		int keyCode=e.getKeyCode();

		if(keyCode==KeyEvent.VK_C){
			current_tool = circle_button;
		}

		if(keyCode==KeyEvent.VK_L){
			current_tool = line_button;
		}

		if(keyCode==KeyEvent.VK_S){
			current_tool = square_button;
		}

		if(keyCode==KeyEvent.VK_P){
			current_tool = pen;
		}

	} // end of keyPressed()

	public void keyReleased(KeyEvent e){ } // end of keyReleased()

}