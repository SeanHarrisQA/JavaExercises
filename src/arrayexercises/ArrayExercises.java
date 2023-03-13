package arrayexercises;

public class ArrayExercises {

	public static void main(String[] args) {
		// Run exercises here
		arraysExercises();
		numbersExercise();
	}

	public static void arraysExercises() {
		int[] arry = new int[10];
		for (int i = 0; i < arry.length; i++) {
			arry[i] = i * 7;
			System.out.printf("Array[%d] : %3d%n", i, arry[i]);
		}

		for (int i = 0; i < arry.length; i++) {
			arry[i] *= 10;
			System.out.printf("Array[%d] : %3d%n", i, arry[i]);
		}
	}

	public static void numbersExercise() {
		/*
		 * addDigits(89); addDigits(99); addDigits(10); addDigits(54); addDigits(45);
		 */
		double randomNumber = 0;
		for (int i = 0; i < 1000; i++) {
			randomNumber = Math.random();
			if (randomNumber > 0.99) {
				System.out.printf("%4d : %s%n", i, fourDigitToString(i));
			}
		}

	}

	public static void addDigits(int number) {
		int digitsAddedTogether = (number / 10) + (number % 10);
		System.out.printf("The number %d gives %d%n", number, digitsAddedTogether);
	}

	public static String twoDigitToString(int number) {
		String stringRepresentation = null;
		int firstDigit = number / 10;
		int secondDigit = number % 10;

		switch (firstDigit) {
		case 0:
			switch (secondDigit) {
			case 0:
				stringRepresentation = "zero";
				break;
			case 1:
				stringRepresentation = "one";
				break;
			case 2:
				stringRepresentation = "two";
				break;
			case 3:
				stringRepresentation = "three";
				break;
			case 4:
				stringRepresentation = "four";
				break;
			case 5:
				stringRepresentation = "five";
				break;
			case 6:
				stringRepresentation = "six";
				break;
			case 7:
				stringRepresentation = "seven";
				break;
			case 8:
				stringRepresentation = "eight";
				break;
			case 9:
				stringRepresentation = "nine";
				break;
			}
			return stringRepresentation;
		case 1:
			switch (secondDigit) {
			case 0:
				stringRepresentation = "ten";
				break;
			case 1:
				stringRepresentation = "eleven";
				break;
			case 2:
				stringRepresentation = "twelve";
				break;
			case 3:
				stringRepresentation = "thirteen";
				break;
			case 4:
				stringRepresentation = "fourteen";
				break;
			case 5:
				stringRepresentation = "fifteen";
				break;
			case 6:
				stringRepresentation = "sixteen";
				break;
			case 7:
				stringRepresentation = "seventeen";
				break;
			case 8:
				stringRepresentation = "eighteen";
				break;
			case 9:
				stringRepresentation = "nineteen";
				break;
			}
			return stringRepresentation;
		case 2:
			stringRepresentation = "twenty";
			break;
		case 3:
			stringRepresentation = "thirty";
			break;
		case 4:
			stringRepresentation = "forty";
			break;
		case 5:
			stringRepresentation = "fifty";
			break;
		case 6:
			stringRepresentation = "sixty";
			break;
		case 7:
			stringRepresentation = "seventy";
			break;
		case 8:
			stringRepresentation = "eighty";
			break;
		case 9:
			stringRepresentation = "ninety";
			break;
		}
		switch (secondDigit) {
		case 0:
			break;
		case 1:
			stringRepresentation = stringRepresentation + "-one";
			break;
		case 2:
			stringRepresentation = stringRepresentation + "-two";
			break;
		case 3:
			stringRepresentation = stringRepresentation + "-three";
			break;
		case 4:
			stringRepresentation = stringRepresentation + "-four";
			break;
		case 5:
			stringRepresentation = stringRepresentation + "-five";
			break;
		case 6:
			stringRepresentation = stringRepresentation + "-six";
			break;
		case 7:
			stringRepresentation = stringRepresentation + "-seven";
			break;
		case 8:
			stringRepresentation = stringRepresentation + "-eight";
			break;
		case 9:
			stringRepresentation = stringRepresentation + "-nine";
			break;
		}
		return stringRepresentation;
	}

	public static String threeDigitToString(int number) {
		String stringRepresentation = null;
		int firstDigit = number / 100;
		switch (firstDigit) {
		case 0:
			break;
		case 1:
			stringRepresentation = "one hundred";
			break;
		case 2:
			stringRepresentation = "two hundred";
			break;
		case 3:
			stringRepresentation = "three hundred";
			break;
		case 4:
			stringRepresentation = "four hundred";
			break;
		case 5:
			stringRepresentation = "five hundred ";
			break;
		case 6:
			stringRepresentation = "six hundred";
			break;
		case 7:
			stringRepresentation = "seven hundred";
			break;
		case 8:
			stringRepresentation = "eight hundred";
			break;
		case 9:
			stringRepresentation = "nine hundred";
			break;
		}
		int checkCall = number - (firstDigit * 100);
		if (checkCall == 0) {
			return stringRepresentation;
		} else if (firstDigit != 0) {
			return stringRepresentation + " and " + twoDigitToString(checkCall);
		} else {
			return twoDigitToString(checkCall);
		}
	}

	public static String fourDigitToString(int number) {
		String stringRepresentation = "zero";
		int firstDigit = number / 1000;
		switch (firstDigit) {
		case 0:
			break;
		case 1:
			stringRepresentation = "one thousand";
			break;
		case 2:
			stringRepresentation = "two thousand";
			break;
		case 3:
			stringRepresentation = "three thousand";
			break;
		case 4:
			stringRepresentation = "four thousand";
			break;
		case 5:
			stringRepresentation = "five thousand ";
			break;
		case 6:
			stringRepresentation = "six thousand";
			break;
		case 7:
			stringRepresentation = "seven thousand";
			break;
		case 8:
			stringRepresentation = "eight thousand";
			break;
		case 9:
			stringRepresentation = "nine thousand";
			break;
		}
		int checkCall = number - (firstDigit * 1000);
		if (checkCall == 0) {
			return stringRepresentation;
		} else if (firstDigit != 0) {
			return stringRepresentation + " and " + threeDigitToString(checkCall);
		} else {
			return threeDigitToString(checkCall);
		}
	}
}
