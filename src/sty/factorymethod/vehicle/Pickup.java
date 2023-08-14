package sty.factorymethod.vehicle;

import sty.commons.Color;

public class Pickup extends AbstractVan {

	@Override
	public void setEngine(String engine) {
		this.engine = engine;
		
	}

	@Override
	public String getEngine() {
		return this.engine;
	}

	@Override
	public void setColor(Color color) {
		this.color = color;
		
	}

	@Override
	public Color getColor() {
		return this.color;
	}

	public String toString() {
		return "Class: " + this.getClass().toString() + "\n"
				+ "Engine: " + this.getEngine() + "\n"
				+ "Color: " + this.getColor();
	}
}
