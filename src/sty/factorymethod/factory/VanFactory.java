package sty.factorymethod.factory;

import sty.factorymethod.vehicle.BoxVan;
import sty.factorymethod.vehicle.Pickup;
import sty.factorymethod.vehicle.Vehicle;

public class VanFactory extends VehicleFactory{

	@Override
	protected Vehicle selectVehicle(DriveStyle style) {
		Vehicle result = null;
		String engine = "";
		switch (style){
			case ECONOMICAL:
			case MIDRANGE:
				engine = "Standard engine 1800cc";
				result = new BoxVan();
				result.setEngine(engine);
				break;
			case POWERFUL:
				engine = "Standard engine 2200cc";
				result = new Pickup();
				result.setEngine(engine);
				break;
		}
		return result;
	}

}
