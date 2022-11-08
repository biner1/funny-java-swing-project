import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class PaintCanvasPanel extends JPanel{

	private Graphics g;
 	private int x1, y1, x2, y2;

	// constructor
 	public PaintCanvasPanel(){

 		// addKeyListener()
		this.setLayout(new BorderLayout());

	}


	public void paintComponent(Graphics g){
		super.paintComponent(g);

	}

	public void setPoints1(int x,int y){
		x1=x;
		y1=y;
	}
	public void setPoints2(int x,int y){
		x2=x;
		y2=y;
	}


	public void drawLine(){
		g=getGraphics();
		g.drawLine(x1-9,y1-90,x2-9,y2-90);
	}

	public void drawOval(){
		g=getGraphics();
		int width=Math.abs(x2-x1); // these negatives is for making the mouse motion and action handler getX() equal
		int height=Math.abs(y2-y1);

		g.drawOval(x1-9,y1-90,width,height);
	}

	public void drawSquare(){
		g=getGraphics();
		int width=Math.abs(x2-x1);
		int height=Math.abs(y2-y1);

		g.drawRect(x1-9,y1-90,width,height);
	}



}