package sty.builder;

import sty.commons.vehicle.AbstractVan;
import sty.commons.vehicle.Vehicle;

public class VanBuilder extends VehicleBuilder {
	private AbstractVan vanInProgress = null;
	public void buildBody() {
		System.out.println("Building a van body");
	}
	public void buildBoot() {
		System.out.println("Building a van boot");
	}
	public void buildChassis() {
		System.out.println("Building a van chassis");
	}
	public void buildReinforcedStorageArea() {
		System.out.println("Buidling a van Storage Area");
	}
	public void buildWindows() {
		System.out.println("Building a van window");
	}
	@Override
	public Vehicle getVehicle() {
		return vanInProgress;
	}

}
