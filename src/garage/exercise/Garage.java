package garage.exercise;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	public List<Vehicle> garage = new ArrayList<>();

	public Vehicle find(String make, String model) {
		for (Vehicle vehicle : garage) {
			if (vehicle.getMake().equals(make)) {
				if (vehicle.getModel().equals(model)) {
					return vehicle;
				}
			}
		}
		return null;
	}

	public void showOff() {
		for (Vehicle vehicle : garage) {
			vehicle.printInfo();
		}
	}

}
