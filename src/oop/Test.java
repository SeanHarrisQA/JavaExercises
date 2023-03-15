package oop;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("Sean", (byte) 24, "Software Engineer");
		p1.intro();
		Person p2 = new Person("Billy", (byte) 25, "Claims Handler");
		p2.intro();
		Person p3 = new Person();
		p3.intro();

		PersonManager manager = new PersonManager();
		manager.people.add(p1);
		manager.people.add(p2);
		manager.people.add(p3);

		System.out.println("Manager:");
		manager.introduceAll();

		Person found = manager.find("sean");
		System.out.println("FOUND: ");
		found.intro();
	}

}
