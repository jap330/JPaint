package controller;

import java.awt.Color;

import ControllerInterfaces.ICommand;
import viewInterfaces.UIModule;

public class SelectPrimaryColorCommand implements ICommand {
	 private final PrimaryColor _primaryColor;
	    private final UIModule _uiModule;
	    SelectPrimaryColorCommand(PrimaryColor primaryColor, UIModule uiModule){
	        _primaryColor = primaryColor;
	        _uiModule = uiModule;
	    }

	@Override
	public void run() {
		ColorAdapter colorChoice = _uiModule.getDialogResponse(_primaryColor);
        _primaryColor.setPrimaryColor(colorChoice);

	}

}
