package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQuestions {

	public static void main(String[] args) {
		List<String> utdXI = new ArrayList<>();
		utdXI.add("Rooney");
		utdXI.add("Fletcher");
		utdXI.add("Vidic");
		utdXI.add("Ferdinand");

		for (String player : utdXI) {
			System.out.println(player);
		}

	}

}
