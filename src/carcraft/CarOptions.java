package carcraft;

public class CarOptions implements ICar {

	public CarOptions() {
		System.out.print("Getting Car Options: \n");
	}
	
	@Override
	public String GetDescription() {
		return "Car Options: " ;
	}

}
