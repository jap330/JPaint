package view;

//import java.awt.Point;
import controller.Point;
import controller.ShadingType;
import controller.Shape;
import controller.ApplicationSettings;
import controller.ColorAdapter;
import controller.ShapeAttr;
import model.IViewShape;
import model.ShapeList;
import modelInterfaces.IDisplayableShape;
import modelInterfaces.IShapeFactory;

public class ShapeFactory implements IShapeFactory{
	private final ApplicationSettings settings;
	private final ShapeList shapeList;
	private final IViewShapeFactory viewShapeFactory;
	private final IDisplayableShapeFactory displayableShapeFactory;

	public ShapeFactory(ApplicationSettings settings, ShapeList shapeList, IViewShapeFactory viewShapeFactory,
			IDisplayableShapeFactory displayableShapeFactory) {
		this.settings = settings;
		this.shapeList = shapeList;
		this.viewShapeFactory = viewShapeFactory;
		this.displayableShapeFactory = displayableShapeFactory;
	}
	@Override
	public void create(Point startingPoint, Point endingPoint) throws Exception{
	
	Point adjustedStartingPoint = getAdjustedStartingPoint(startingPoint, endingPoint);
	Point adjustedEndingPoint = getAdjustedEndingPoint(startingPoint, endingPoint);
	IViewShape viewShape = getIViewShape(adjustedStartingPoint, adjustedEndingPoint);
	IDisplayableShape displayableShape = getIDisplayableShape(viewShape);
	shapeList.addToList(displayableShape);
}
	private Point getAdjustedEndingPoint(Point startingPoint, Point endingPoint) {
		int endingX = (int) Math.min(startingPoint.getX(), endingPoint.getX());
		int endingY = (int) Math.min(startingPoint.getY(), endingPoint.getY());
		
		return new Point(endingX, endingY);
		
	}
	private Point getAdjustedStartingPoint(Point startingPoint, Point endingPoint) {
		int startingX = (int) Math.min(startingPoint.getX(), endingPoint.getX());
		int startingY = (int) Math.min(startingPoint.getY(), endingPoint.getY());
		
		return new Point(startingX, startingY);
	}
	
	private IViewShape getIViewShape (Point startingPoint, Point endingPoint) throws Exception{
		Shape currentShape = settings.getDrawShapeSettings().getCurrentShape();
		ShapeAttr shape = createShape(startingPoint, endingPoint);
		return viewShapeFactory.createViewShape(currentShape, shape);
	}
	
	private IDisplayableShape getIDisplayableShape(IViewShape viewShape) throws Exception{
		ShadingType currentShading = settings.getCurrentShade().getCurrentShade();
		return displayableShapeFactory.createDisplayableShape(currentShading, viewShape);
	}
	private ShapeAttr createShape(Point startingPoint, Point endingPoint){
		ColorAdapter primaryColor = settings.getPrimaryColor().getPrimaryColor();
		ColorAdapter secondaryColor = settings.getSecondaryColor().getSecondaryColor();
		return new ShapeAttr(primaryColor, secondaryColor, startingPoint, endingPoint);
	}
}