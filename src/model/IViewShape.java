package model;

import java.awt.Color;

import controller.ColorAdapter;

public interface IViewShape {

	void displayOutline(ColorAdapter thisColor);


	void displayFilled(ColorAdapter primaryColor);

	ColorAdapter getPrimaryColor();
	
	ColorAdapter getSecondaryColor();




}
