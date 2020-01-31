package src.assignment04_If_StatementsSwitchStatement;

import java.util.Scanner;

public class Question5_MagicDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("EXAMPLE (M)06 (D)31 (Y)05");
		System.out.println("Enter MONTH in MM format :");
		int mont = sc.nextInt();
		System.out.println("Enter DAY in DD format :");
		int day = sc.nextInt();
		System.out.println("Enter YEAR in YY format :");
		int year = sc.nextInt();
		if (mont * day == year) {
			System.out.println("MAGICAL YEAR");
		} else System.out.println("NOT MAGICAL YEAR SO SORRY!");
		sc.close();
	}
}
