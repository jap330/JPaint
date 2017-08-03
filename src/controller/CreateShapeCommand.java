package controller;

import view.GuiUiModule.IStartAndEndPointCommand;
import modelInterfaces.IShapeFactory;

public class CreateShapeCommand implements IStartAndEndPointCommand {
	private final IShapeFactory shapeFactory;
	
	public CreateShapeCommand(IShapeFactory shapeFactory){
		this.shapeFactory = shapeFactory;
	}
	
	@Override
	public void run(Point startingPoint, Point endingPoint)throws Exception{
		shapeFactory.create(startingPoint, endingPoint);
	}

}
