package model;

import modelInterfaces.IDisplayableShape;

public class OutLineShape implements IDisplayableShape {
	private final IViewShape viewShape;
	
	public OutLineShape(IViewShape viewShape){
		this.viewShape = viewShape;
	}

	@Override
	public void display() {
		viewShape.displayOutline(viewShape.getPrimaryColor());

	}

}
