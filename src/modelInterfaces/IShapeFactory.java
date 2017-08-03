package modelInterfaces;

import controller.Point;

public interface IShapeFactory {
	void create(Point startingPoint, Point endingPoint) throws Exception;

	//void create(java.awt.Point startingPoint, java.awt.Point endingPoint) throws Exception;

}
