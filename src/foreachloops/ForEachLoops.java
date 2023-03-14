package foreachloops;

public class ForEachLoops {

	public static void main(String[] args) {
		String[] xmasTreats = { "Chocolate Orange", "Turkey", "Potatoes", "Sprouts", "Cranberry Sauce" };
		for (String treat : xmasTreats) {
			System.out.println(treat);
		}

		int[] oneToTwenty = new int[20];
		for (int i = 0; i < oneToTwenty.length; i++) {
			oneToTwenty[i] = i + 1;
		}

		for (int number : oneToTwenty) {
			if (checkEven(number)) {
				System.out.println(Math.pow(number, 3));
			} else {
				System.out.println(Math.pow(number, 2));
			}
		}
	}

	public static boolean checkEven(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
