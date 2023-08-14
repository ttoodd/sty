package sty.builder;

import sty.commons.vehicle.Vehicle;

public class CarDirector extends VehicleDirector {

	@Override
	public Vehicle build(VehicleBuilder builder) {
		builder.buildBody();
		builder.buildBoot();
		builder.buildChassis();
		builder.buildPassengerArea();
		builder.buildWindows();
		return builder.getVehicle();
	}

}
