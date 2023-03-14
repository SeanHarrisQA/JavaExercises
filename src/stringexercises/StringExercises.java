package stringexercises;

public class StringExercises {

	public static void main(String[] args) {
		// playingWithString();
		countWords("This is a well formatted sentence");
		countWords("      This   is    not");
		countWords("");
		countWords("Theoneabovethisisempty");
		countWords("                  ");
		countWords("[]'[';;    ;''.;]]    !!!!!!!!@@         ");

		printVertical("This is a well formatted sentence");
		printVertical("      This   is    not");
		printVertical("");
		printVertical("Theoneabovethisisempty");
		printVertical("                  ");
		printVertical("[]'[';;    ;''.;]]    !!!!!!!!@@         ");

		findString("      This   is    not", "not");
		findString("      This   is    not", " n");
		findString("      This   is    not", "numpty");
		findString("      This   is    not", "      ");
		findString("      This   is    not", "This");
		findString("      This   is    not", "this");
		findString("      This   is    not", "Hey ya");
		findString("      This   is    not", "      This   is    not");

	}

	public static void playingWithString() {
		String yesterday = "yesterday it was raining";
		String today = "today it is sunny";

		// Concatenate and capitalise both strings
		String answer = today.toUpperCase() + ", " + yesterday.toUpperCase();
		System.out.println(answer);

		// Print out a substring
		System.out.println(answer.substring(0, (answer.indexOf("SUNNY")))
				+ answer.substring(answer.indexOf("RAINING"), answer.length()));
	}

	public static int countWords(String sentence) {
		// For now, making the assumption that these are normal English sentences not
		// starting with whitespace and only one space between words
		int count = 0;
		boolean lookingForWord = true;
		// Loop over the characters of the string, where you find a space add 1 to the
		// count
		for (int i = 0; i < sentence.length(); i++) {
			if (lookingForWord) {
				if (!(sentence.charAt(i) == ' ')) {
					// New word beginning
					count++;
					lookingForWord = false;
				}
			} else {
				if (sentence.charAt(i) == ' ') {
					lookingForWord = true;
				}
			}

		}
		System.out.printf("The sentence {%s} has %d words%n", sentence, count);
		return count;
	}

	public static void printVertical(String sentence) {
		System.out.printf("%nThe sentence {%s} printed vertically:%n", sentence);
		boolean lookingForWord = true;
		int currentWordStart = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (lookingForWord) {
				if (!(sentence.charAt(i) == ' ')) {
					// New word beginning
					lookingForWord = false;
					currentWordStart = i;
				}
			} else {
				if (sentence.charAt(i) == ' ') {
					lookingForWord = true;
					System.out.println(sentence.substring(currentWordStart, i));
				}
			}
		}
		// Will print the last word of the sentence if the sentence doesn't end with
		// whitespace, will not be called if sentence ends with whitespace
		if (!(lookingForWord)) {
			System.out.println(sentence.substring(currentWordStart));
		}
	}

	public static void printVerticalReverse(String sentence) {
		System.out.printf("%nThe sentence {%s} printed vertically in reverse:%n", sentence);
		boolean lookingForWord = true;
		int currentWordEnd = 0;
		for (int i = sentence.length(); i < 0; --i) {
			if (lookingForWord) {
				if (!(sentence.charAt(i) == ' ')) {
					// New word beginning
					lookingForWord = false;
					currentWordEnd = i;
				}
			} else {
				if (sentence.charAt(i) == ' ') {
					lookingForWord = true;
					System.out.println(sentence.substring(i, currentWordEnd));
				}
			}
		}
		// Will print the last word of the sentence if the sentence doesn't end with
		// whitespace, will not be called if sentence ends with whitespace
		if (!(lookingForWord)) {
			System.out.println(sentence.substring(0, currentWordEnd));
		}
	}

	public static boolean findString(String sentence, String targetString) {
		System.out.printf("%nDoes {%s} contain {%s}? ", sentence, targetString);
		// how long is the sentence
		int lengthOfSentence = sentence.length();
		// how long is the string you are looking for
		int lengthOfTargetString = targetString.length();
		String partOfSentence = null;
		for (int i = lengthOfTargetString; i < lengthOfSentence; i++) {
			partOfSentence = sentence.substring((i - lengthOfTargetString), i);
			if (partOfSentence.equals(targetString)) {
				System.out.printf(" YES!!!%n");
				return true;
			}
		}
		// Make sure the end of the sentence isn't the target string, checking this in
		// the for loop will cause an indexOutOfBound exception
		partOfSentence = sentence.substring(lengthOfSentence - lengthOfTargetString);
		if (partOfSentence.equals(targetString)) {
			System.out.printf(" YES!!!%n");
			return true;
		}
		System.out.printf(" nope.%n");
		return false;
	}
}
