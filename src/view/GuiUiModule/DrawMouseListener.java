package view.GuiUiModule;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputAdapter;

public class DrawMouseListener extends MouseInputAdapter{
	private Point startingPoint;
	private Point endingPoint;
	//private final IStartAndEndPointCommand command;
	private final PaintCanvas paintCanvas;
	
	//public DrawMouseListener(IStartAndEndPointCommand command)
	public DrawMouseListener(PaintCanvas paintCanvas){
		this.paintCanvas = paintCanvas;
	}
	
	@Override
	public void mousePressed(MouseEvent mouseEvent){
		startingPoint = new Point(mouseEvent.getX(), mouseEvent.getY());
	}
	
	@Override
	public void mouseReleased(MouseEvent mouseEvent){
		//Graphics2D newShape = (Graphics2D) paintGraphics.getGraphics();
		endingPoint = new Point(mouseEvent.getX(), mouseEvent.getY());
		paintCanvas.getGraphics().drawRect((int)startingPoint.getX(),(int)startingPoint.getY(),(int) endingPoint.getX()- (int)startingPoint.getX(),(int) endingPoint.getY() -(int) startingPoint.getY());
		/*try{
			command.run(startingPoint, endingPoint);
		}catch(Exception e){
			e.printStackTrace();
		}*/
	}

}
