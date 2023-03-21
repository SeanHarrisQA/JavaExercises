package morsecode;

import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {

	public Map<String, String> alphabet = new HashMap<>();

	public MorseTranslator() {
		super();
		initialiseMap();
	}

	private void initialiseMap() {
		alphabet.put(".---", "J");
		alphabet.put(".-", "A");
		alphabet.put("...-", "V");
		alphabet.put("/", " ");
		alphabet.put("..", "I");
		alphabet.put("...", "S");
		alphabet.put("-.-.", "C");
		alphabet.put("---", "O");
		alphabet.put(".-..", "L");
		alphabet.put("-.-", "K");
		alphabet.put("", "");
	}

	public String translate(String message) {
		message = message.trim();
		// Find the index of the next space, will return -1 if there are no more spaces
		int nextSpace = message.indexOf(' ');
		int previousSpace = 0;
		String nextCharacter;
		String translation = "";
		// If the string has no spaces then only one character so translate the whole
		// message
		// !!!! Might not need this as will be checked by edge case
//		if (nextSpace == -1) {
//			System.out.println("NO SPACES");
//			return alphabet.get(message);
//		}
		while (nextSpace != -1) {
			nextCharacter = message.substring(previousSpace, nextSpace);
			nextCharacter = nextCharacter.trim();
			translation += alphabet.get(nextCharacter);
			previousSpace = nextSpace;
			// Find next space starting after the index of the previous space (if you run it
			// without the plus one it will be an infinite while loop
			nextSpace = message.indexOf(' ', previousSpace + 1);
		}
		// This catches the last character, and also any sequence which is one character
		// long
		nextCharacter = message.substring(previousSpace);
		nextCharacter = nextCharacter.trim();
		translation += alphabet.get(nextCharacter);

		return translation;
	}
}
