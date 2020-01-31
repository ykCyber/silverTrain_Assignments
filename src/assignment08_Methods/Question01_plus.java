package assignment08_Methods;

import java.util.Scanner;

public class Question01_plus {

	public static void main(String[] args) {
		plus();
	}

	public static void plus() {
		System.out.println("Enter two numbers to sum them.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int num1= sc.nextInt();
		System.out.print("Enter num2 : ");
		int num2= sc.nextInt();
		int result= num1 + num2;
		System.out.print("result : "+result);
		sc.close();
	}
}
