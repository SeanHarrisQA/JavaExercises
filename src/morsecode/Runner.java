package morsecode;

public class Runner {
	public static void main(String[] args) {
		MorseTranslator translator = new MorseTranslator();
		// The original message
		System.out.println(translator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
		// Just one letter
		System.out.println(translator.translate(".---"));
		// Message with leading spaces, fixed by trimming the message when translate is
		// called
		System.out.println(translator.translate("          .--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
		// Message with trailing spaces, fixed by trimming the message when translate is
		// called
		System.out.println(translator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-            "));
		// Multiple spaces between letters, fixed by adding the empty string as a key
		// with value also the empty string so it does not affect the output
		System.out.println(translator.translate(".---    .-"));
	}
}
