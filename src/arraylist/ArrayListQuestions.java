package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListQuestions {

	public static void main(String[] args) {
		List<String> utdXI = new ArrayList<>();

		System.out.println("Add four players and print using for-each loop");
		utdXI.add("Rooney");
		utdXI.add("Fletcher");
		utdXI.add("Vidic");
		utdXI.add("Ferdinand");
		for (String player : utdXI) {
			System.out.println(player);
		}
		System.out.println();

		System.out.println("Add two more players and then print again");
		utdXI.add("Joshua");
		utdXI.add("Clichy");
		for (int i = 0; i < utdXI.size(); i++) {
			System.out.println(i + " : " + utdXI.get(i));
		}
		System.out.println();

		System.out.println("Remove one player and edit the other");
		utdXI.remove(4);
		utdXI.set(4, "Evra");
		System.out.println(utdXI);
		System.out.println();

		System.out.println("Sort the array");
		Collections.sort(utdXI);
		System.out.println(utdXI);
	}

}
