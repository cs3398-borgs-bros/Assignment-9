package carcraft;

public class CarOptions implements ICar {
	
	protected ICar car;

	public CarOptions(ICar c) {
		this.car = c;
		System.out.print("Car Add-ons: \n");
	}
	
	@Override
	public String GetDescription() {
		return this.car.GetDescription();
	}

}
