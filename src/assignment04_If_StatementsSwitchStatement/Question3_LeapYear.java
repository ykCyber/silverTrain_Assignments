package assignment04_If_StatementsSwitchStatement;

import java.util.Scanner;

public class Question3_LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year...:");
		int year = sc.nextInt();

		if (year % 400 == 0) {
			System.out.println(year + " leap year");
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + " leap year");
		} else {
			System.out.println(year + " NOT A LEAP YEAR");
		}
		sc.close();

	}
}
