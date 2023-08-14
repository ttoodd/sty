package sty.abstractfactory.factory;

import sty.abstractfactory.parts.body.Body;
import sty.abstractfactory.parts.body.CarBody;
import sty.abstractfactory.parts.chassis.CarChassis;
import sty.abstractfactory.parts.chassis.Chassis;
import sty.abstractfactory.parts.window.CarWindow;
import sty.abstractfactory.parts.window.Window;

public class CarFactory extends AbstractVehicleFactory{

	@Override
	public Body createBody() {
		return new CarBody();
	}

	@Override
	public Chassis createChassis() {
		return new CarChassis();
	}

	@Override
	public Window createWindow() {
		return new CarWindow();
	}

}
