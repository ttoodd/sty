package sty.builder;

import sty.commons.vehicle.Vehicle;

public abstract class VehicleDirector {
	public abstract Vehicle build(VehicleBuilder builder);
}
