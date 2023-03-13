package coins;

import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double received = -1;
		double cost = -1;

		// Finish scanner
		do {
			System.out.println("Enter the cost of the item(s) you wish to buy");
			cost = scan.nextDouble();
			System.out.println("Enter the money you are handing over");
			received = scan.nextDouble();
		} while (cost > received);

		double change = received - cost;
		System.out.printf("Items cost £%.2f and we have recived £%.2f, so the change we will give"
				+ " is £%.2f with the following coins:%n", cost, received, change);

		while (change > 20) {
			System.out.printf("£%d, ", 20);
			change -= 20;
		}
		while (change > 10) {
			System.out.printf("£%d, ", 10);
			change -= 10;
		}
		while (change > 5) {
			System.out.printf("£%d, ", 5);
			change -= 5;
		}
		while (change > 2) {
			System.out.printf("£%d, ", 2);
			change -= 2;
		}
		while (change > 1) {
			System.out.printf("£%.2f, ", 1);
			change -= 1;
		}
		while (change > 0.50) {
			System.out.printf("£%.2f, ", 0.50);
			change -= 0.50;
		}
		while (change > 0.20) {
			System.out.printf("£%.2f, ", 0.20);
			change -= 0.20;
		}
		while (change > 0.10) {
			System.out.printf("£%.2f, ", 0.10);
			change -= 0.10;
		}
		while (change > 0.05) {
			System.out.printf("£%.2f, ", 0.05);
			change -= 0.05;
		}
		while (change > 0.02) {
			System.out.printf("£%.2f, ", 0.02);
			change -= 0.02;
		}
		while (change > 0.01) {
			System.out.printf("£%.2f.", 0.01);
			change -= 0.01;
		}

	} // main
}
