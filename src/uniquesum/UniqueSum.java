package uniquesum;

public class UniqueSum {

	public static void main(String[] args) {
		System.out.println(uniqueSum(1, 2, 3));
		System.out.println(uniqueSum(3, 3, 3));
		System.out.println(uniqueSum(1, 1, 2));

	}

	public static int uniqueSum(int a, int b, int c) {
		System.out.printf("Input(%d, %d, %d) --> ", a, b, c);
		if (a == b) {
			if (a == c) {
				// All the numbers are the same return 0
				return 0;
			} else {
				// c is unique but a == b so return c
				return c;
			}
		} else if (a == c) {
			// a != b but a == c so return b
			return b;
		} else if (b == c) {
			// a is unique but b == c so return a
			return a;
		} else {
			// all the numbers are unique so return their sum
			return a + b + c;
		}
	}
}
