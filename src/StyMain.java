import sty.abstractfactory.factory.*;
import sty.abstractfactory.parts.body.Body;
import sty.abstractfactory.parts.chassis.Chassis;
import sty.abstractfactory.parts.window.Window;
import sty.commons.Color;
import sty.commons.VehicleType;
import sty.factorymethod.factory.VehicleFactory.DriveStyle;
import sty.factorymethod.vehicle.Vehicle;
import sty.factorymethod.factory.CarFactory;
import sty.factorymethod.factory.VanFactory;

public class StyMain {

	public static void main(String[] args) {
		/* ####### Abstract factory calls - Start #######*/
		/*VehicleType whatToMake = VehicleType.VAN;
		AbstractVehicleFactory factory = null;
		
		if(whatToMake.equals(VehicleType.CAR)) {
			factory = new CarFactory();
		} else {
			factory = new VanFactory();
		}
		Body body = factory.createBody();
		Chassis chassis = factory.createChassis();
		Window window = factory.createWindow();
		System.out.println(body.getBodyParts());
		System.out.println(chassis.getChassisParts());
		System.out.println(window.getWindowParts());*/
		/* ####### Abstract factory calls - End #######*/
		
		/* ####### Factory Method calls - Start #######*/
		VehicleType type = VehicleType.VAN;
		DriveStyle style = DriveStyle.MIDRANGE;
		Color color = Color.BLUE;
		Vehicle vehicle = null;
		switch (type) {
			case CAR:
				CarFactory carFactory = new CarFactory();
				vehicle = carFactory.build(style, color);
				break;
			case VAN:
				VanFactory vanFactory = new VanFactory();
				vehicle = vanFactory.build(style, color);
		}
		System.out.println(vehicle);
		
		/* ####### Factory Method calls - End #######*/
	}

}
