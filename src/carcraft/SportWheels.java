package carcraft;


public class SportWheels extends CarOptions{
	public SportWheels(ICar car) {
		super(car);
		System.out.println(" Adding sport wheels to vehicle...");
	}
	//
	@Override
	public String GetDescription() {
		return super.GetDescription() + " sport wheel";
	}
}