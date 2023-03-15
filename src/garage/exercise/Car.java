package garage.exercise;

public class Car extends Vehicle {

	private boolean hasBoot = false;

	public Car(int wheels, int riders, String make, String model, boolean hasBoot) {
		super(wheels, riders, make, model);
		setHasBoot(hasBoot);
	}

	public Car() {
		super();
	}

	public boolean isHasBoot() {
		return hasBoot;
	}

	public void setHasBoot(boolean hasBoot) {
		this.hasBoot = hasBoot;
	}

}
