package calculator;

public class Calculator {

	public static void main(String args[]) {
		// Code here
		int test = add(2, 2);
		System.out.println("Result of addition: " + test);
		test = subtract(10, 5);
		System.out.println("Result of subtraction: " + test);
		test = multiply(8, 8);
		System.out.println("Result of multiplication: " + test);
		double divisionTest = divide(10, 5);
		System.out.println("Result of division: " + divisionTest);
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int subtract(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static double divide(double a, double b) {
		return a / b;
	}
}
