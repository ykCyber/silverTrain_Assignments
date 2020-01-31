package assignment05_IF_StatementsSwitchStatement;

import java.util.Scanner;

public class Question03_check_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 :");
		int num1 = sc.nextInt();
		if (num1 == 0) {
			System.out.println("num1  :" + num1 + "\n" +  "it is zero.");
		} else if (num1 > 0) {
			System.out.println("num1  :" + num1 + "\n" + num1 + " is positive ");
		} else if (num1 < 0) {
			System.out.println("num1  :" + num1 + "\n" + num1 + " is negative ");
		}
		sc.close();
	}

}
