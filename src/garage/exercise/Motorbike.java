package garage.exercise;

public class Motorbike extends Vehicle {

	public Motorbike(int wheels, int riders, String make, String model) {
		super(wheels, riders, make, model);
	}

	public Motorbike() {
		super();
	}

	public void popAWheely() {
		System.out.println("Woooo");
	}

}
