package controller;

import java.awt.Color;

import ControllerInterfaces.ICommand;
import viewInterfaces.UIModule;

public class SelectSecondaryColorCommand implements ICommand {
	 private final SecondaryColor _secondaryColor;
	    private final UIModule _uiModule;
	    SelectSecondaryColorCommand(SecondaryColor secondaryColor, UIModule uiModule){
	        _secondaryColor = secondaryColor;
	        _uiModule = uiModule;
	    }
	@Override
	public void run() {
		ColorAdapter colorChoice = _uiModule.getDialogResponse(_secondaryColor);
        _secondaryColor.setSecondaryColor(colorChoice);

	}

}
