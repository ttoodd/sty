package sty.builder;

import sty.commons.vehicle.Vehicle;

public class VanDirector extends VehicleDirector {

	@Override
	public Vehicle build(VehicleBuilder builder) {
		builder.buildBody();
		builder.buildBoot();
		builder.buildChassis();
		builder.buildReinforcedStorageArea();
		builder.buildWindows();
		return builder.getVehicle();
	}

}
