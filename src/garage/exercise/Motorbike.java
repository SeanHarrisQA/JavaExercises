package garage.exercise;

public class Motorbike extends Vehicle {

	public Motorbike(int id, int riders, String make, String model) {
		super(id, riders, make, model);
	}

	public Motorbike() {
		super();
	}

	public void popAWheely() {
		System.out.println("Woooo");
	}

}
