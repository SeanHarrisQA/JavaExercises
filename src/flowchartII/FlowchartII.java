package flowchartII;

public class FlowchartII {

	public static void main(String[] args) {
		// Appendix B flowchart
		for (int b = 100; b <= 200; b++) {
			System.out.println(b);
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

	}
}
