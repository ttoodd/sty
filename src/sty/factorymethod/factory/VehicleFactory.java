package sty.factorymethod.factory;

import sty.commons.Color;
import sty.commons.vehicle.Vehicle;

public abstract class VehicleFactory {
	public enum DriveStyle {ECONOMICAL, MIDRANGE, POWERFUL};
	

	public Vehicle build(DriveStyle style, Color color) {
		Vehicle result = selectVehicle(style);
		result.setColor(color);
		return result;
		
	}

	protected abstract Vehicle selectVehicle(DriveStyle style);
}
