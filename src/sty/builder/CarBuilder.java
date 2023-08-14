package sty.builder;

import sty.commons.vehicle.AbstractCar;
import sty.commons.vehicle.Vehicle;

public class CarBuilder extends VehicleBuilder{
	private AbstractCar carInProgress = null;
	
	
	public CarBuilder(AbstractCar car) {
		super();
		this.carInProgress = car;
	}
	public void buildBody() {
		System.out.println("Building a car body");
	}
	public void buildBoot() {
		System.out.println("Building a car boot");
	}
	public void buildChassis() {
		System.out.println("Building a car chassis");
	}
	public void buildPassengerArea() {
		System.out.println("Buiding a car passenger area");
	}
	public void buildWindows() {
		System.out.println("Building a car windows");
	}

	@Override
	public Vehicle getVehicle() {
		return carInProgress;
	}

}
