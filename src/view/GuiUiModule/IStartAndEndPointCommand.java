package view.GuiUiModule;

import java.awt.Point;

public interface IStartAndEndPointCommand {

	public default void run(Point startingPoint, Point endingPoint) {
		// TODO Auto-generated method stub
		
	}

	void run(controller.Point startingPoint, controller.Point endingPoint) throws Exception;

}
