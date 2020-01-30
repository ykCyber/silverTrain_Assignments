package assignment03_Arithmetic_Operators;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Question-1 Write a program to convert gallons into Liters and display it.
		 * Sample output: 15 gallon is 56.7812 liter
		 */
		Scanner input = new Scanner(System.in);

		System.out.print("Please provide values to convert gallon to liter....:");

		float gallon, liter;
		gallon = input.nextFloat();
		liter = 3.7854f * gallon;
		System.out.println(gallon + " gallon is " + liter + " liters.");
		input.close();
	}

}
