package carcraft;


public class CarMain {

	public static void main(String[] args) {

		System.out.println("Starting: Creating Cars using Decorator Pattern\n");

		ICar carA = new AirScoop(new BasicCar());
		System.out.println("First Car" + carA.GetDescription());

	}

}

