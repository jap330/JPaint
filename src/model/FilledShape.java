package model;

import modelInterfaces.IDisplayableShape;

public class FilledShape implements IDisplayableShape{
	private final IViewShape viewShape;
	
	public FilledShape(IViewShape viewShape){
		this.viewShape = viewShape;
	}
	@Override
	public void display(){
		 viewShape.displayFilled(viewShape.getPrimaryColor());
	}
}
