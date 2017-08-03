package view.GuiUiModule;
import modelInterfaces.IShape;


import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.*;
import java.util.List;

import javax.swing.JComponent;

public class PaintCanvas extends JComponent {
	Point drawStart;
	Point drawEnd;
	
	public PaintCanvas()
	{
		
		}
	

	@Override
	public void paint(Graphics graphics){
        //if(this.drawStart != null && drawEnd != null){
        Graphics2D graphics2d = (Graphics2D)graphics;
        graphics2d.setColor(Color.black);
        graphics2d.fillRect(15,30,200,400);
        graphics2d.setStroke(new BasicStroke(5));
        graphics2d.setColor(Color.blue);
        graphics2d.drawRect(15, 30, 200, 400);}


	public Graphics2D getGraphics2D() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
