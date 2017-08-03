package controller;

public class ShapeAttr {
	private ColorAdapter primaryColor;
	private ColorAdapter secondaryColor;
	private Point startPoint;
	private Point endPoint;
	
	public ShapeAttr(ColorAdapter primaryColor, ColorAdapter secondaryColor,Point startPoint, Point endPoint){
		this.primaryColor = primaryColor;
		this.secondaryColor = secondaryColor;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public ColorAdapter getPrimaryColor(){
		return primaryColor;
	}
	
	public ColorAdapter getSecondaryColor(){
		return secondaryColor;
	}
	
	public int getStartX(){
		return startPoint.getX();
	}
	
	public int getStartY(){
		return startPoint.getY();
	}
	
	public int getEndX(){
		return endPoint.getY();
	}
	public int getEndY(){
		return endPoint.getY();
	}
	
	public int getWidth(){
		return endPoint.getX() - startPoint.getX();
	}
	
	public int getHeight(){
		return endPoint.getY() - startPoint.getY();
	}

}
