package taxes;

public class Taxes {

	public static void main(String[] args) {
		int pretaxIncome = 14999;
		System.out.printf("The tax rate is %s for an income of %d%n", taxRate(pretaxIncome), pretaxIncome);
		System.out.printf("Which gives a net income of £%.2f%n", incomeAfterTax(pretaxIncome));
		pretaxIncome = 19999;
		System.out.printf("The tax rate is %s for an income of %d%n", taxRate(pretaxIncome), pretaxIncome);
		System.out.printf("Which gives a net income of £%.2f%n", incomeAfterTax(pretaxIncome));
		pretaxIncome = 29999;
		System.out.printf("The tax rate is %s for an income of %d%n", taxRate(pretaxIncome), pretaxIncome);
		System.out.printf("Which gives a net income of £%.2f%n", incomeAfterTax(pretaxIncome));
		pretaxIncome = 44999;
		System.out.printf("The tax rate is %s for an income of %d%n", taxRate(pretaxIncome), pretaxIncome);
		System.out.printf("Which gives a net income of £%.2f%n", incomeAfterTax(pretaxIncome));
		pretaxIncome = 45000;
		System.out.printf("The tax rate is %s for an income of %d%n", taxRate(pretaxIncome), pretaxIncome);
		System.out.printf("Which gives a net income of £%.2f%n", incomeAfterTax(pretaxIncome));

	}

	public static String taxRate(int income) {
		if (income < 15000) {
			return "0%";
		} else if (income < 20000) {
			return "10%";
		} else if (income < 30000) {
			return "15%";
		} else if (income < 45000) {
			return "20%";
		} else {
			return "25%";
		}
	}

	public static double incomeAfterTax(int income) {
		String taxRate = taxRate(income);
		switch (taxRate) {
		case "0%":
			return income;
		case "10%":
			return 14999 + (income - 14999) * 0.9;
		case "15%":
			return 14999 + (19999 - 14999) * 0.9 + (income - 19999) * 0.85;
		case "20%":
			return 14999 + (19999 - 14999) * 0.9 + (29999 - 19999) * 0.85 + (income - 29999) * 0.8;
		case "25%":
			return 14999 + (19999 - 14999) * 0.9 + (29999 - 19999) * 0.85 + (44999 - 29999) * 0.8
					+ (income - 44999) * 0.75;
		}
		return 0;
	}
}
