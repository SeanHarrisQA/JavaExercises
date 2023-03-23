package lambdas;

public class Runner {

	public static void main(String[] args) {

		int s = 8;
		int t = 2;

		// This is the long version of a lambda
		CalculatorII calc = new CalculatorII() {
			@Override
			public int calculate(int a, int b) {
				return a + b;
			}
		};

		System.out.println(calc.calculate(s, t));

		// The easier ways
		CalculatorII addition = (a, b) -> a + b;
		System.out.println(addition.calculate(s, t));

		CalculatorII subtraction = (a, b) -> a - b;
		System.out.println(subtraction.calculate(s, t));

		CalculatorII multiplication = (a, b) -> a * b;
		System.out.println(multiplication.calculate(s, t));

		CalculatorII division = (a, b) -> a / b;
		System.out.println(division.calculate(s, t));

	}

}
