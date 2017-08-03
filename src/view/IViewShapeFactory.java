package view;

import controller.Shape;
import controller.ShapeAttr;
import model.IViewShape;

public interface IViewShapeFactory {

	IViewShape createViewShape(Shape currentShape, ShapeAttr shape);

}
