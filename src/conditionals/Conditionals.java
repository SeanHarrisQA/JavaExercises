package conditionals;

public class Conditionals {

	public static void main(String[] args) {
		// Code to test my method here
		System.out.println(conditional(1, 2, true));
		System.out.println(conditional(3, 3, false));
		System.out.println(conditional(1, 1, true));
		System.out.println(conditional(2, 1, true));
		System.out.println(conditional(2, 2, true));
	}

	public static int conditional(int a, int b, boolean p) {
		if ((a % 2 == 0) || (b % 2 == 0)) {
			return 0;
		} else if (p) {
			return a + b;
		} else {
			return a * b;
		}
	}
}
