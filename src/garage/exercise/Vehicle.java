package garage.exercise;

public class Vehicle {

	private int wheels = 0;

	private int riders = 0;

	private String make = null;

	private String model = null;

	public Vehicle() {

	}

	public Vehicle(int wheels, int riders, String make, String model) {
		setWheels(wheels);
		setRiders(riders);
		setMake(make);
		setModel(model);
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getRiders() {
		return riders;
	}

	public void setRiders(int riders) {
		this.riders = riders;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void printInfo() {
		System.out.printf("A %s %s has %d wheels and can carry %d people%n", this.make, this.model, this.riders,
				this.wheels);
	}

}
