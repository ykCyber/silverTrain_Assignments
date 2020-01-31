package assignment05_IF_StatementsSwitchStatement;

import java.util.Scanner;


public class Question09_integer_char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num1=sc.nextInt();
		String abc = Integer.toString(num1);
		int i = abc.length();
		for (int j=0;j<=i-1;j++) {
		char a = abc.charAt(j);
		System.out.println(a);
		sc.close();
		}
	}
}