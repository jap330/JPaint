package controller;

import java.awt.Color;

import viewInterfaces.EventName;
import viewInterfaces.UIModule;

public class JPaintController implements IPaintController {
    private final UIModule _uiModule;
    private final ApplicationSettings _settings ;

    public JPaintController(UIModule uiModule, ApplicationSettings settings){
    	_settings = settings;
        _uiModule = uiModule;
        _settings.getDrawShapeSettings().setCurrentShape(Shape.ELLIPSE);
        _settings.getPrimaryColor().setPrimaryColor(ColorAdapter.BLACK);
        _settings.getSecondaryColor().setSecondaryColor(ColorAdapter.GREEN);
        _settings.getCurrentShade().setCurrentShade(ShadingType.OUTLINE);
        _settings.getMouseDrawMode().setMouseDrawMode(MouseMode.DRAW);
    }

    @Override
    public void run() {
        _uiModule.addEvent(EventName.CHOOSE_SHAPE, new SelectShapeCommand(_settings.getDrawShapeSettings(), _uiModule));
        _uiModule.addEvent(EventName.CHOOSE_PRIMARY_COLOR, new SelectPrimaryColorCommand(_settings.getPrimaryColor(), _uiModule));
        _uiModule.addEvent(EventName.CHOOSE_SECONDARY_COLOR, new SelectSecondaryColorCommand(_settings.getSecondaryColor(), _uiModule));
        _uiModule.addEvent(EventName.CHOOSE_SHADING_TYPE, new SelectShadingTypeCommand(_settings.getCurrentShade(), _uiModule));
        _uiModule.addEvent(EventName.CHOOSE_MOUSE_MODE, new SelectMouseDrawModeCommand(_settings.getMouseDrawMode(), _uiModule));
    }
}
