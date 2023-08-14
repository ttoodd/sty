import sty.abstractfactory.factory.AbstractVehicleFactory;
import sty.abstractfactory.factory.CarFactory;
import sty.abstractfactory.factory.VanFactory;
import sty.abstractfactory.parts.body.Body;
import sty.abstractfactory.parts.chassis.Chassis;
import sty.abstractfactory.parts.window.Window;

public class StyMain {

	public static void main(String[] args) {
		/* ####### Abstract factory calls - Start #######*/
		VehicleType whatToMake = VehicleType.Car;
		AbstractVehicleFactory factory = null;
		
		if(whatToMake.equals(VehicleType.Car)) {
			factory = new CarFactory();
		} else {
			factory = new VanFactory();
		}
		Body body = factory.createBody();
		Chassis chassis = factory.createChassis();
		Window window = factory.createWindow();
		System.out.println(body.getBodyParts());
		System.out.println(chassis.getChassisParts());
		System.out.println(window.getWindowParts());
		/* ####### Abstract factory calls - End #######*/
	}

}
