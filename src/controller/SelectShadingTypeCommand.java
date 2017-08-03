package controller;

import java.awt.Color;

import ControllerInterfaces.ICommand;
import viewInterfaces.UIModule;

public class SelectShadingTypeCommand implements ICommand {
	private final ShadingTypeSettings _currentShade;
    private final UIModule _uiModule;
    SelectShadingTypeCommand(ShadingTypeSettings currentShade, UIModule uiModule){
        _currentShade = currentShade;
        _uiModule = uiModule;
    }

	@Override
	public void run() {
		ShadingType currentShade = _uiModule.getDialogResponse(_currentShade);
        _currentShade.setCurrentShade(currentShade);

	}

}
