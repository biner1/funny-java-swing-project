import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class PaintFrame extends JFrame{

	private Graphics g;
	private int x1, y1, x2, y2;
	PaintToolsPanel tools=new PaintToolsPanel();
	PaintCanvasPanel canvas= new PaintCanvasPanel();

	// constructor
	public PaintFrame(){

			setTitle("Paint");
			setSize(800,580);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocation(10,10);


			add(tools,"North");
			add(canvas);
			canvas.setBorder(BorderFactory.createLineBorder(Color.red));

			// handlers
			MyMouseHandler	handler  = new MyMouseHandler();
			this.addMouseListener(handler);
			this.addMouseMotionListener(handler);
			tools.setFocusable(true);
			//canvas.setFocusable(true);



		} // end of PaintFrame constructor


	private class MyMouseHandler extends MouseAdapter{

	    public void mousePressed(MouseEvent e ){


	      	x1 = e.getX();
	      	y1 = e.getY();
			g=getGraphics();
			canvas.setPoints1(x1,y1);

			x2=x1;
			y2=y1;


	    } // end of mousePressed

	    public void mouseDragged(MouseEvent e ){
	      x1 = e.getX();
	      y1 = e.getY();
	      String tool =tools.getCurrentTool().getText();

	      if(tool.equals("pen")){
	      	g.drawLine(x1,y1,x2,y2);
	      }

	      x2=x1;
	      y2=y1;

	    } // end of mouseDragged

		public void mouseReleased(MouseEvent e ){
			x2 = e.getX();
			y2 = e.getY();
			String tool =tools.getCurrentTool().getText();

			if(tool.equals("line_button")){
				canvas.setPoints2(x2,y2);
				canvas.drawLine();
				System.out.println("line");
			}
			if(tool.equals("circle_button")){
				canvas.setPoints2(x2,y2);
				canvas.drawOval();
			}
			if(tool.equals("square_button")){
				canvas.setPoints2(x1,y1);
				canvas.drawSquare();
			}

		} //end of mouse released
  } // end of handler class

}