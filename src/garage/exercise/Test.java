package garage.exercise;

public class Test {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(4, 5, "Citroen", "Picasso", true);
		c1.printInfo();
		c2.printInfo();
		c2.setMake("Ferrari");
		c2.printInfo();
		Motorbike m2 = new Motorbike(4, 5, "Harley Davidson", "Picasso");
		Garage garage = new Garage();
		garage.garage.add(m2);
		garage.garage.add(c2);
		garage.showOff();
	}

}
