package sty.factorymethod.factory;

import sty.factorymethod.vehicle.Coupe;
import sty.factorymethod.vehicle.Saloon;
import sty.factorymethod.vehicle.Sport;
import sty.factorymethod.vehicle.Vehicle;

public class CarFactory extends VehicleFactory{
	@Override
	protected Vehicle selectVehicle(DriveStyle style) {
		Vehicle result = null;
		String engine = "";
		switch(style){
			case ECONOMICAL:
				engine = "Standard engine 1300cc";
				result = new Saloon();
				result.setEngine(engine);
				break;
			case MIDRANGE:
				engine = "Standard engine 2000cc";
				result = new Coupe();
				result.setEngine(engine);
				break;
			case POWERFUL:
				engine = "Turbo engine 3000cc";
				result = new Sport();
				result.setEngine(engine);
				break;
		}
		return result;
	}

}
