package view;

import controller.ShadingType;
import model.IViewShape;
import modelInterfaces.IDisplayableShape;

public interface IDisplayableShapeFactory {

	IDisplayableShape createDisplayableShape(ShadingType currentShading, IViewShape viewShape) throws Exception;

}
