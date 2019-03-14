package carcraft; 

public class PaintColor extends CarOptions {

public PaintColor(ICar car)
{
	System.out.println("Adding paint color to vechile..");
}

@Override
public String GetDescription(){
	return super.GetDescription() + " Paint Color";
}






}
