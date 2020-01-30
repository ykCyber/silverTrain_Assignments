package assignment04_If_StatementsSwitchStatement;

import java.util.Scanner;

public class Question12_internet_Bill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pack;
		float bill = 0;
		do {
			System.out.print("Enter Your Package Code (A/B/C:)");
			pack = sc.nextLine();
			pack = pack.toLowerCase();
			if (!pack.equalsIgnoreCase("a") && !pack.equalsIgnoreCase("b") && !pack.equalsIgnoreCase("c") == true) {
				System.out.println("Please Enter A/B/C. You entered :" + pack.toUpperCase());
			}
		} while (!pack.equalsIgnoreCase("a") && !pack.equalsIgnoreCase("b") && !pack.equalsIgnoreCase("c"));

		{
			System.out.print("Enter number of hours that you used:");
		}
		int hour = sc.nextInt();
		switch (pack) {
		case "a":
			if (hour <= 10) {
				bill = 9.95f;
			} else if (hour > 10) {
				bill = 9.95f + (hour - 10) * 2;
			}
			break;
		case "b":
			if (hour <= 20) {
				bill = 13.95f;
			} else if (hour > 20) {
				bill = 13.95f + (hour - 20) * 1;
			}
			break;
		case "c":
			bill = 19.95f;
			break;
		default:
			break;
		}
		System.out.println("Package :" + pack.toUpperCase() + "\n Bill :" + bill +"$ \n Hours :" + hour);
		sc.close();
	}

}
