package model;

import modelInterfaces.IDisplayableShape;

public class FilledAndOutLineShape implements IDisplayableShape {
	private final IViewShape viewShape;
	
	public FilledAndOutLineShape(IViewShape viewShape){
		this.viewShape = viewShape;
	}

	@Override
	public void display() {
		viewShape.displayFilled(viewShape.getPrimaryColor());
		viewShape.displayOutline(viewShape.getSecondaryColor());

	}

}
