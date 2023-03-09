package report;

public class Report {

	public static short chemistryMark = 30;
	public static short physicsMark = 30;
	public static short biologyMark = 90;
	public static short totalMark = 0;
	public static double percentageGrade = 0;

	public static void main(String[] args) {
		totalMark = calculateTotal();
		percentageGrade = calculatePercentage(totalMark);
		if (percentageGrade < 60) {
			System.out.println("you suck");
		}
		if ((chemistryMark * 100.0 / 150.0) < 60) {
			System.out.println("you suck at chemistry");
		}
		if ((physicsMark * 100.0 / 150.0) < 60) {
			System.out.println("you suck at physics");
		}
		if ((biologyMark * 100.0 / 150.0) < 60) {
			System.out.println("you suck at chemistry");
		}
	}

	public static short calculateTotal() {
		short total = (short) (chemistryMark + biologyMark + physicsMark);
		System.out.println("Chemistry Mark: " + chemistryMark);
		System.out.println("  Physics Mark: " + physicsMark);
		System.out.println("  Biology Mark: " + biologyMark);
		System.out.println("    Total Mark: " + total);
		return total;
	}

	public static double calculatePercentage(short totalMarks) {
		double percentage = totalMarks * 100 / 450.0;
		System.out.printf("    Percentage: %.2f%n", percentage);
		return percentage;
	}
}
