package view;

import controller.ShadingType;
import model.FilledAndOutLineShape;
import model.FilledShape;
import model.IViewShape;
import modelInterfaces.IDisplayableShape;
import model.OutLineShape;

public class DisplayableShapeFactory implements IDisplayableShapeFactory {
	
	@Override
	public IDisplayableShape createDisplayableShape(ShadingType currentShading, IViewShape viewShape ) throws Exception{
		switch(currentShading){
		case OUTLINE:
			return new OutLineShape(viewShape);
		case FILLED_IN:
			return new FilledAndOutLineShape(viewShape);
		case OUTLINE_AND_FILLED_IN:
			return new FilledShape(viewShape);
		default:
			throw new Exception("Incorrect ShadingType");
		}
		
	}

}
