package carcraft;

public class CarOptions implements ICar {

	public CarOptions() {
		System.out.print("  with Car Options: \n");
	}
	
	@Override
	public String GetDescription() {
		return " with the following Options: " ;
	}

}
