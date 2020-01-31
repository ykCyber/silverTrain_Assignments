package assignment04_If_StatementsSwitchStatement;

import java.util.Scanner;

public class Question6_NEWTON {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Mass in KG...:");
		double weight = sc.nextDouble() * 9.81d;
		System.out.println(weight+"");
		if (weight < 10) {
			System.out.println("Too Light");
		} else if (weight > 1000) {
			System.out.println("Too Heavy");
		} else {
			System.out.println("Normal");
		}
		sc.close();
	}
}
