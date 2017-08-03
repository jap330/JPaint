package view.GuiUiModule;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

import controller.ColorAdapter;
import controller.Shape;
import controller.ShapeAttr;
import model.IViewShape;

public class GuiEllipse implements IViewShape{
	
	private ShapeAttr shape;
	private PaintCanvas canvas;
	
	public GuiEllipse(ShapeAttr shape, PaintCanvas canvas){
		this.shape = shape;
		this.canvas = canvas;
	}

	@Override
	public void displayOutline(ColorAdapter color) {
		Graphics2D graphics = canvas.getGraphics2D();
		graphics.setStroke(new BasicStroke(5));
		graphics.setColor(color.getColor());
		graphics.drawOval(shape.getStartX(), shape.getStartY(),shape.getWidth(), shape.getHeight());
	}

	@Override
	public void displayFilled(ColorAdapter primaryColor) {
		Graphics2D graphics = canvas.getGraphics2D();
		graphics.setColor(primaryColor.getColor());
		graphics.fillOval(shape.getStartX(),  shape.getStartY(), shape.getWidth(), shape.getHeight());
		
		
	}

	@Override
	public ColorAdapter getPrimaryColor() {
		
		return shape.getPrimaryColor();
	}

	@Override
	public ColorAdapter getSecondaryColor() {
		
		return shape.getSecondaryColor();
	}

	

}
