package assignment05_IF_StatementsSwitchStatement;

import java.util.Scanner;

public class Question02_Num_Sorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 :");
		int num1 = sc.nextInt();
		System.out.print("Enter num1 :");
		int num2 = sc.nextInt();
		if (num1 == num2) {
			System.out.println("num1  :" + num1 + "\nnum2  :" + num2 + "\n" + num1 + " and " + num2 + " are equal.");
		} else if (num1 > num2) {
			System.out.println("num1  :" + num1 + "\nnum2  :" + num2 + "\n" + num1 + " is grater than " + num2);
		} else if (num1 < num2) {
			System.out.println("num1  :" + num1 + "\nnum2  :" + num2 + "\n" + num2 + " is grater than " + num1);
		}
		sc.close();
	}
}
