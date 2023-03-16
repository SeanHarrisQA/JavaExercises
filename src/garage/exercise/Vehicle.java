package garage.exercise;

public class Vehicle {

	private int id = 0;

	private int riders = 0;

	private String make = null;

	private String model = null;

	public Vehicle() {

	}

	public Vehicle(int id, int riders, String make, String model) {
		setID(id);
		setRiders(riders);
		setMake(make);
		setModel(model);
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
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
		System.out.printf("Vehicle #%d: A %s %s can carry %d people%n", this.id, this.make, this.model, this.riders);
	}

}
