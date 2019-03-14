package carcraft;

public class CarMain {

	public static void main(String[] args) {

		System.out.println("Starting: Creating Cars using Decorator Pattern\n");

		ICar carA = new SuperCharger(new AirScoop (new BasicCar()));
		System.out.println("Car1: " + carA.GetDescription());
		System.out.println();

		ICar carB = new AirScoop (new PaintColor(new BasicCar()));
		System.out.println("Car2: " + carB.GetDescription());
		System.out.println();

		ICar carC = new SportWheels(new AirScoop (new BasicCar()));
		System.out.println("Car3: " + carC.GetDescription());
		System.out.println();

		ICar carD = new SuperCharger(new SportWheels(new AirScoop (new BasicCar())));
		System.out.println("Car4: " + carD.GetDescription());
		System.out.println();

		ICar carE = new PaintColor(new SuperCharger (new BasicCar()));
		System.out.println("Car5: " + carE.GetDescription());
		System.out.println();

		ICar carF = new SuperCharger(new AirScoop (new SportWheels (new PaintColor(new BasicCar()))));
		System.out.println("Car6: " + carF.GetDescription());
		System.out.println();

	}

}

