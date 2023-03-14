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
}
