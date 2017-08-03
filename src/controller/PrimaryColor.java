package controller;

import java.awt.Color;
import java.util.ArrayList;

import viewInterfaces.IDialogChoice;


public class PrimaryColor implements IDialogChoice{
	 private ColorAdapter primaryColor;

	    void setPrimaryColor(ColorAdapter primaryColor) {
	        this.primaryColor = primaryColor;
	    }

	    public ColorAdapter getPrimaryColor() {
	        return primaryColor;
	    }

	    @Override
	    public String getDialogTitle() {
	        return "Select a Primary Color";
	    }

	    @Override
	    public String getDialogText() {
	        return "Select a Primary Color:";
	    }

	    @Override
	    public Object[] getDialogOptions() {
	    	ArrayList<Color> Colors = new ArrayList<Color>();
	    	Colors.add(Color.BLACK);
	    	Colors.add(Color.BLUE);
	    	Colors.add(Color.ORANGE);
	        return Colors.toArray(new Color[0]);
	    }


		@Override
	    public Object getDefaultChoice() {
	        return getPrimaryColor();
	    }
}
