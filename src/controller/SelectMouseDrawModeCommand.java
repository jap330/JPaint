package controller;

import java.awt.Color;

import ControllerInterfaces.ICommand;
import viewInterfaces.UIModule;

public class SelectMouseDrawModeCommand implements ICommand {
	 private final MouseDrawMode _mouseDrawMode;
	    private final UIModule _uiModule;
	    SelectMouseDrawModeCommand(MouseDrawMode mouseDrawMode, UIModule uiModule){
	        _mouseDrawMode = mouseDrawMode;
	        _uiModule = uiModule;
	    }

	@Override
	public void run() {
		MouseMode mouseDrawMode = _uiModule.getDialogResponse(_mouseDrawMode);
        _mouseDrawMode.setMouseDrawMode(mouseDrawMode);

	}

}
