package taxes;

public class Taxes {

	public static void main(String[] args) {
		int pretaxIncome = 14999;
		System.out.printf("The tax rate is %s for an income of %d%n", taxRate(pretaxIncome), pretaxIncome);
		pretaxIncome = 19999;
		System.out.printf("The tax rate is %s for an income of %d%n", taxRate(pretaxIncome), pretaxIncome);
		pretaxIncome = 29999;
		System.out.printf("The tax rate is %s for an income of %d%n", taxRate(pretaxIncome), pretaxIncome);
		pretaxIncome = 44999;
		System.out.printf("The tax rate is %s for an income of %d%n", taxRate(pretaxIncome), pretaxIncome);
		pretaxIncome = 45000;
		System.out.printf("The tax rate is %s for an income of %d%n", taxRate(pretaxIncome), pretaxIncome);

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

	public static void incomeAfterTax(int income) {

	}
}
