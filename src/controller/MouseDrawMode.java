package controller;

import java.awt.Color;

import viewInterfaces.IDialogChoice;

public class MouseDrawMode implements IDialogChoice {
	private MouseMode mouseDrawMode;

    void setMouseDrawMode(MouseMode mouseDrawMode2) {
        this.mouseDrawMode = mouseDrawMode2;
    }

    MouseMode getMouseDrawMode() {
        return mouseDrawMode;
    }

	@Override
	public String getDialogTitle() {
		return "Select a Mouse Draw Mode";
	}

	@Override
	public String getDialogText() {
		// TODO Auto-generated method stub
		return "Select a Mouse Draw Mode";
	}

	@Override
	public Object[] getDialogOptions() {
		return MouseMode.values();
	}

	@Override
	public Object getDefaultChoice() {
		return getMouseDrawMode();
	}

}
