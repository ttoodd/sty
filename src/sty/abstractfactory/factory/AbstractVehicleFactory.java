package sty.abstractfactory.factory;

import sty.abstractfactory.parts.body.Body;
import sty.abstractfactory.parts.chassis.Chassis;
import sty.abstractfactory.parts.window.Window;

public abstract class AbstractVehicleFactory {
	public abstract Body createBody();
	public abstract Chassis createChassis();
	public abstract Window createWindow();
}
