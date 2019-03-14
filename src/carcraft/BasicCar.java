
package carcraft;

public class BasicCar implements ICar {

    public BasicCar() {
		System.out.print("Basic Car Constructor\n");
	}

    @Override
    public String GetDescription() {
        return "A Basic Car";
    }
}

