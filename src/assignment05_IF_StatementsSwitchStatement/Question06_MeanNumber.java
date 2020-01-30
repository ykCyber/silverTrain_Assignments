package assignment05_IF_StatementsSwitchStatement;

import java.util.Scanner;

public class Question06_MeanNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num 1 ");
		int a1 = sc.nextInt();
		System.out.println("enter a num 2");
		int a2 = sc.nextInt();
		System.out.println("enter a num 3");
		int a3 = sc.nextInt();
		if (a1 > a2 && a1 > a3) {
			System.out.print(a1);
		} else if (a2 > a1 && a2 > a3) {
			System.out.print(a2);
		} else
			System.out.print(a3);
		System.out.println(" is the biggest of  " + a1 + "/" + a2 + "/" + a3);
		if (a1 < a2 && a1 < a3) {
			System.out.print(a1);
		} else if (a2 < a1 && a2 < a3) {
			System.out.print(a2);
		} else
			System.out.print(a3);
		System.out.println(" is the smallest of " + a1 + "/" + a2 + "/" + a3);
		if (a2 > a1 & a2 < a3 | a2 < a1 & a2 > a3) {
			System.out.println(a2 +  " mean number of "+ a1 + "/" + a2 + "/" + a3);
		} else if (a1 < a3 & a1 > a2 | a1 > a3 & a1 < a2) {
			System.out.println(a1 + " mean number of "+ a1 + "/" + a2 + "/" + a3);
		} else {
			System.out.println(a3 + " mean number of "+ a1 + "/" + a2 + "/" + a3);
		}
		sc.close();
	}

}
