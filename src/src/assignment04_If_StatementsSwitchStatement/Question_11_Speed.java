package src.assignment04_If_StatementsSwitchStatement;

import java.util.Scanner;


public class Question_11_Speed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String area;
		do {
			System.out.print("Enter Area (Air/Water/Steel).....:)");
			area = sc.nextLine();
			area = area.toLowerCase();
			if (!area.equalsIgnoreCase("steel") && !area.equalsIgnoreCase("water")
					&& !area.equalsIgnoreCase("air") == true) {
				System.out.println("You entered different medium.");
			}
		} while (!area.equalsIgnoreCase("steel") && !area.equalsIgnoreCase("water") && !area.equalsIgnoreCase("air"));

		{
			System.out.print("Enter distance in feet.....:");
		}
		int distance = sc.nextInt();

		switch (area) {
		case "air":
			System.out.println("Travel time is ..:" + (double) distance / 1100 + " seconds");
			break;
		case "water":
			System.out.println("Travel time is ..:" + (double) distance / 4900 + " seconds");
			break;
		case "steel":
			System.out.println("Travel time is ..:" + (double) distance / 16400 + " seconds");
			break;
		default:
			break;
		}
		sc.close();
	}
}
