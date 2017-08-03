package controller;

import java.awt.Color;
import java.util.ArrayList;

import viewInterfaces.IDialogChoice;

public class SecondaryColor implements IDialogChoice {
	 private ColorAdapter secondaryColor;

	    void setSecondaryColor(ColorAdapter secondaryColor) {
	        this.secondaryColor = secondaryColor;
	    }

	    public ColorAdapter getSecondaryColor() {
	        return secondaryColor;
	    }

	    @Override
	    public String getDialogTitle() {
	        return "Select a Secondary Color";
	    }

	    @Override
	    public String getDialogText() {
	        return "Select a Secondary Color:";
	    }

	    @Override
	    public Object[] getDialogOptions() {
	    	ArrayList<Color> Colors = new ArrayList<Color>();
	    	Colors.add(Color.GREEN);
	    	Colors.add(Color.RED);
	    	Colors.add(Color.YELLOW);
	        return Colors.toArray(new Color[0]);
	    }

	    @Override
	    public Object getDefaultChoice() {
	        return getSecondaryColor();
	    }
	
}
