package assignment05_IF_StatementsSwitchStatement;

import java.util.Scanner;

public class Question01_otel_room {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int startPrice;
		do {
			System.out.print("Select the number of bedrooms 1/2/3..:");
			number = sc.nextInt();
			if (number < 1 || number > 3) {
				System.out.println("No such Bedrooms aviable\n" + "Starting Price: value\n");
			}
		} while (number < 1 || number > 3);
		switch (number) {
		case 1: {
			System.out.println("One Bedroom Selected");
			startPrice = 1100;
			break;
		}
		case 2: {
			System.out.println("Two Bedroom Selected");
			startPrice = 1850;
			break;
		}
		case 3: {
			System.out.println("Three Bedroom Selected");
			startPrice = 2550;
			break;
		}
		}
		sc.close();
	}

}
