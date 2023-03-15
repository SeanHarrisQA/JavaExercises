package oop;

public class Person {
	private String name = null;

	private byte age = 0;

	private String job = null;

	public Person() {

	}

	public Person(String name, byte age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}

	public void intro() {
		System.out.printf("%s is a %d year old %s.%n", this.name, this.age, this.job);
	}

//	
//	public void List<Person> createList() {
//		add
//	}

	public void setAge(byte age) {
		if (0 <= age) {
			this.age = age;
		} else {
			System.out.println("Age msut be non=negative");
		}
	}

	public byte getAge() {
		return this.age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getJob() {
		return this.job;
	}
}
