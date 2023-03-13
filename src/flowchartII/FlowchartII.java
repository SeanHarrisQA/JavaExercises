package flowchartII;

public class FlowchartII {

	public static void main(String[] args) {
		// Appendix B flowchart
		for (int a = 100; a <= 200; a++) {
			System.out.println(a);
		}

		System.out.printf("%n%n%n----------%n%n%n%n");

		// Appendix C flowchart
		for (int a = 100; a <= 200; a++) {
			if (a % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}

		System.out.printf("%n%n%n----------%n%n%n%n");

		// Print out 1-10 ten times each
		for (int i = 1; i <= 10; i++) {
			for (int n = 10; n > 0; n--) {
				System.out.printf("%2d ", i);
			}
			System.out.println();
		}

		System.out.printf("%n%n%n----------%n%n%n%n");

		// Print out 1-10 as many times as the value of that number
		for (int i = 1; i <= 10; i++) {
			for (int n = i; n > 0; n--) {
				System.out.printf("%2d ", i);
			}
			System.out.println();
		}

	}
}
