package sty.abstractfactory.factory;

import sty.abstractfactory.parts.body.Body;
import sty.abstractfactory.parts.body.VanBody;
import sty.abstractfactory.parts.chassis.Chassis;
import sty.abstractfactory.parts.chassis.VanChassis;
import sty.abstractfactory.parts.window.VanWindow;
import sty.abstractfactory.parts.window.Window;

public class VanFactory extends AbstractVehicleFactory{

	@Override
	public Body createBody() {
		return new VanBody();
	}

	@Override
	public Chassis createChassis() {
		return new VanChassis();
	}

	@Override
	public Window createWindow() {
		return new VanWindow();
	}

}
