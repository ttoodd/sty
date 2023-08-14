import sty.builder.CarBuilder;
import sty.builder.CarDirector;
import sty.builder.VehicleBuilder;
import sty.builder.VehicleDirector;
import sty.commons.Color;
import sty.commons.VehicleType;
import sty.commons.vehicle.AbstractCar;
import sty.commons.vehicle.Saloon;
import sty.commons.vehicle.Vehicle;
import sty.factorymethod.factory.CarFactory;
import sty.factorymethod.factory.VanFactory;
import sty.factorymethod.factory.VehicleFactory.DriveStyle;

public class StyMain {

	public static void main(String[] args) {
		/* ####### Abstract factory calls - Start #######*/
		/*VehicleType whatToMake = VehicleType.Car;
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
		
		/* ####### Builder calls - Start #######*/
		AbstractCar car = new Saloon();
		VehicleBuilder builder = new CarBuilder(car);
		VehicleDirector director = new CarDirector();
		Vehicle vehicleToBuild = director.build(builder);
		System.out.println(vehicleToBuild);
		/* ####### Builder calls - End #######*/
	}

}
