package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamRunner {

	public static void main(String[] args) {
		List<String> register = List.of("Michael", "Dean", "James", "Chris");

		register.stream().filter(name -> !(name.equals("James"))).forEach(name -> System.out.println("Hello " + name));

		List<Integer> nums = List.of(3, 4, 7, 8, 12);

		// Need to use .get() as reduce() returns an optional
		System.out.println(nums.stream().reduce((a, b) -> a * b).get());
		System.out.println(3 * 4 * 7 * 8 * 12);

		// Create a list of the numbers 1 to 100
		List<Integer> fiftyToHundred = IntStream.range(50, 101).boxed().collect(Collectors.toList());
		// Print them out (could just print the list
		fiftyToHundred.stream().forEach(num -> System.out.printf("%d ", num));
		System.out.println();
		System.out.println(fiftyToHundred);

		// Find the max
		System.out.println(fiftyToHundred.stream().reduce(Math::max).get());
		// Find the min
		System.out.println(fiftyToHundred.stream().reduce(Math::min).get());
		// Both the previous are shortcuts for
		System.out.println(fiftyToHundred.stream().reduce((a, b) -> Math.min(a, b)).get());
		// Remove odd numbers
		fiftyToHundred.stream().filter(a -> a % 2 == 0).forEach(System.out::println);
		// Remove even numbers
		fiftyToHundred.stream().filter(a -> a % 2 == 1).forEach(System.out::println);
		// Sum all the numbers
		System.out.println(fiftyToHundred.stream().reduce((a, b) -> a + b).get());
		// Square all the numbers remove the even numbers and then return the minimum
		System.out.println(fiftyToHundred.stream().map(a -> a * a).filter(a -> a % 2 == 1).reduce(Math::min).get());
	}
}
