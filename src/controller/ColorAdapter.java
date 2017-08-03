package controller;

import java.awt.Color;

public class ColorAdapter {
	
	public static ColorAdapter BLACK;
	public static ColorAdapter GREEN;
	private Color color;
	
	public ColorAdapter(Color color){
		this.color = color;
	}
	
	public Color getColor(){
		return color;
	}
	
	public String toString(){
		return color.toString();
	}

}
