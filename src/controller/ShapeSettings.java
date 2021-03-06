package controller;

import viewInterfaces.IDialogChoice;

import java.util.Arrays;

public class ShapeSettings implements IDialogChoice {
    private Shape currentShape;

    void setCurrentShape(Shape currentShape) {
        this.currentShape = currentShape;
    }

    public Shape getCurrentShape() {
        return currentShape;
    }

    @Override
    public String getDialogTitle() {
        return "Select a Shape";
    }

    @Override
    public String getDialogText() {
        return "Select a Shape:";
    }

    @Override
    public Object[] getDialogOptions() {
        return Shape.values();
    }

    @Override
    public Object getDefaultChoice() {
        return getCurrentShape();
    }
}
