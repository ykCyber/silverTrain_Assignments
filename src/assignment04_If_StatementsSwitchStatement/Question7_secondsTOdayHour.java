package assignment04_If_StatementsSwitchStatement;

import java.util.Scanner;

public class Question7_secondsTOdayHour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter SECONDS :");
		int seconds = sc.nextInt();
		if (seconds >= 0 & seconds < 3600) {
			System.out.println(seconds / 60 + " minutes are in "+seconds+" seconds.");
		}
		else if (seconds >= 3600 && seconds < 86400) {
			System.out.println(seconds / 3600 + " hours are in " +seconds+" seconds.");
		}
		else if (seconds >= 86400) {
			System.out.println(seconds / 86400 + " days are in "+seconds+" seconds.");
		} else {
			System.out.println("enter a valid data secons >0");
		}
		sc.close();
	}

}
