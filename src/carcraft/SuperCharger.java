package carcraft;

public class SuperCharger extends CarOptions{
	
	public String SuperCharger;
	
	public SuperCharger(ICar c) {
		super(c);
		System.out.println("SuperCharger added.");
		SuperCharger = "SuperCharger";
	}
	
    @Override
    public String GetDescription()
  	{
    	return super.GetDescription() + " with " + SuperCharger;
  	}
}
