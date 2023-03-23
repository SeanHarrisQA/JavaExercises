package streams;

import java.util.List;

public class StreamRunner {

	public static void main(String[] args) {
		List<String> register = List.of("Michael", "Dean", "James", "Chris");

		register.stream().filter(name -> !(name.equals("James"))).forEach(name -> System.out.println("Hello " + name));

	}
}
