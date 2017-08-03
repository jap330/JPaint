package controller;

import viewInterfaces.IDialogChoice;

public class ApplicationSettings {
    private ShapeSettings drawShapeSettings = new ShapeSettings();
    

    public ShapeSettings getDrawShapeSettings() {
        return drawShapeSettings;
        
    }
    
    
private  PrimaryColor primaryColor = new PrimaryColor();

	public PrimaryColor getPrimaryColor() {
    
    return primaryColor;
}


	private  SecondaryColor secondaryColor = new SecondaryColor();

	public SecondaryColor getSecondaryColor() {
    
		return secondaryColor;
    
	}
	
	private  ShadingTypeSettings shadingType = new ShadingTypeSettings();

	public ShadingTypeSettings getCurrentShade() {
    
		return shadingType;
    
	}
	private  MouseDrawMode mouseDrawMode = new MouseDrawMode();

	public MouseDrawMode getMouseDrawMode() {
    
		return mouseDrawMode;
    
	}

	
}