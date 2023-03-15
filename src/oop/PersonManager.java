package oop;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {

	public List<Person> people = new ArrayList<>();

	public void introduceAll() {
		for (Person person : people)
			person.intro();
	}

	public Person find(String name) {
		for (Person person : people) {
			if (person.getName().equalsIgnoreCase(name))
				return person;
		}
		return null;
	}

}
