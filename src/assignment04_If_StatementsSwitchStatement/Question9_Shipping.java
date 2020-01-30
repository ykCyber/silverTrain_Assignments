package assignment_4_If_StatementsSwitchStatement;

import java.util.Scanner;

public class Question9_Shipping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter distance :");
		int mile = sc.nextInt();
		int ratio = (mile / 500) + 1;
		System.out.print("Enter weight : ");
		int weight = sc.nextInt();
		double price = 0;
		if (weight <= 2) {
			price = 1.10;
		} else if (weight > 2 & weight <= 6) {
			price = 2.2;
		} else if (weight > 6 & weight <= 10) {
			price = 3.70;
		} else if (weight > 10) {
			price = 3.8;
		}
		System.out.println("Price $"+(float)(ratio*price));
		sc.close();
	}
}