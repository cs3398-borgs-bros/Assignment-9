package carcraft;

public class AirScoop extends CarOptions {

    public AirScoop(ICar car) {
        super(car);
        System.out.println(" Adding Air Scoop to vehicle..");
    }

    @Override
    public String GetDescription() {
		return super.GetDescription() + " AirScoop" ;
	}
}