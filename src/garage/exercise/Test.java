package garage.exercise;

public class Test {

	public static void main(String[] args) {
		Car c1 = new Car(4, 5, "Seat", "Ibiza", true);
		Car c2 = new Car(4, 5, "Citroen", "Picasso", true);
		Motorbike m2 = new Motorbike(2, 2, "Harley Davidson", "Picasso");
		Motorbike m3 = new Motorbike(1, 2, "Piaggio", "Vespa");
		Garage garage = new Garage();
		Boat b1 = new Boat(0, 22, "Warship", "HMS Victory");

		System.out.println("Add vehicles using addVehicle() in garage-------");
		garage.addVehicle(m2);
		garage.addVehicle(c2);
		garage.addVehicle(m3);
		garage.addVehicle(b1);
		garage.showOff();

		System.out.println("Test running costs-------");
		garage.runningCosts();

		System.out.println("Add vehicles using addVehicle() in garage-------");
		garage.addVehicle(m2);
		garage.addVehicle(c2);
		garage.addVehicle(m3);
		garage.addVehicle(b1);
		garage.showOff();

		System.out.println("Remove vehicles by type-------");
		garage.removeThisType(m2);
		garage.showOff();

		System.out.println("Add vehicles using addVehicle() in garage-------");
		garage.addVehicle(m2);
		garage.addVehicle(c2);
		garage.addVehicle(m3);
		garage.addVehicle(b1);
		garage.showOff();

		System.out.println("Remove vehicles by id (2)-------");
		garage.removeById(2);
		garage.showOff();

		System.out.println("Add vehicles using addVehicle() in garage-------");
		garage.addVehicle(m2);
		garage.addVehicle(c2);
		garage.addVehicle(m3);
		garage.addVehicle(b1);
		garage.showOff();

		System.out.println("Remove all-------");
		garage.emptyGarage();
		garage.showOff();
	}

}
