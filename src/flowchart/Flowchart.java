package flowchart;

public class Flowchart {

	public static void main(String[] args) {
		int a = 4586;
		if (a > 2000) {
			System.out.printf("A ");
			if (a > 6000) {
				System.out.printf("C ");
			} else {
				System.out.printf("B ");
				if (a > 4000) {
					System.out.printf("D ");
				} else {
					System.out.printf("E ");
				}
			}
		} else {
			System.out.printf("1 ");
			if (a > 100) {
				System.out.printf("3 ");
				if (a > 600) {
					System.out.printf("5 ");
				}
			}
		}
	}
}
