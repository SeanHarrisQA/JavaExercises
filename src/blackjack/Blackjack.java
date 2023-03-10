package blackjack;

public class Blackjack {

	public static void main(String[] args) {
		int winner = playBlackJack(10, 21);
		System.out.println("And the winner is " + winner);
		winner = playBlackJack(20, 18);
		System.out.println("And the winner is " + winner);
		winner = playBlackJack(1, 22);
		System.out.println("And the winner is " + winner);
		winner = playBlackJack(22, 23);
		System.out.println("And the winner is " + winner);
	}

	public static int playBlackJack(int h1, int h2) {
		System.out.printf("We have a hand of %d and %d%n", h1, h2);
		int hHigher = Math.max(h1, h2);
		if (hHigher <= 21) {
			return hHigher;
		} else {
			int hLower = Math.min(h1, h2);
			if (hLower <= 21) {
				return hLower;
			}
			return 0;
		}
	}

}
