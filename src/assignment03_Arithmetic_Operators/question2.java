package src.assignment03_Arithmetic_Operators;

import java.time.Year;
import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Question-2 Write a program - > Declare variables for your name and birth
		 * year, and the program will display:
		 * " Hello, Ozzy! Based on your input, your age is 15 :) "
		 */
		Scanner sc = new Scanner(System.in);
		int date, age;

		do {
			System.out.print("Please Enter YEAR Of Birth in YYYY format.....:");
			date = sc.nextInt();
			Year now = Year.now();
			age = now.getValue() - date + 1;
		} while (age <= 0);

		System.out.println("You are " + age + " years old.");

		sc.close();
	}

}
