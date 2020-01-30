package assignment03_Arithmetic_Operators;

import java.util.Scanner;

public class question7 {

	public static void main(String[] args) {
		/*
		 * Write a program that determines the change to be dispensed from a vending
		 * machine. An item in the machine can cost between 25 cents and 1 dollar, in
		 * 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), and the machine
		 * accepts only a single dollar bill to pay for the item. Sample output Price in
		 * cents : 95 Your change is 0 quarters, 0 dimes, and 1 nickles
		 */
		int price;
		do {
		System.out.print("Enter item's price in cents...:");
		Scanner sc = new Scanner(System.in);
		price = sc.nextInt(); }
		
		while(price%5!=0||price>100);// price should be MAX 1 $(100cents) and 5-cent increments
		int  quarter, dime, nickles, change = 100 - price; // change is calculated
		quarter = change / 25; // Quarters calculated
		dime = change%25/ 10; // dime calculated 
		nickles = change%25%10 / 5;//Nickels calculated
		System.out.println("Price...:"+price+" cents.\r"+"Your change is "+change+" cents\r" + quarter + " Quarters, \r" + dime + " Dimes, \r" + nickles + " Nickles.");
		

	}

}
