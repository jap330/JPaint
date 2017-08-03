package controller;

import viewInterfaces.IDialogChoice;

public class ShadingTypeSettings implements IDialogChoice {
	private ShadingType currentShade;

    void setCurrentShade(ShadingType currentShade) {
        this.currentShade = currentShade;
    }

    public ShadingType getCurrentShade() {
        return currentShade;
    }

	@Override
	public String getDialogTitle() {
		return "Select a Shade";
	}

	@Override
	public String getDialogText() {
		return "Select a Shade";
	}

	@Override
	public Object[] getDialogOptions() {
		return ShadingType.values();
	}

	@Override
	public Object getDefaultChoice() {
		// TODO Auto-generated method stub
		return getCurrentShade();
	}

}
