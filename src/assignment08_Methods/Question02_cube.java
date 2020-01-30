package assignment08_Methods;

import java.util.Scanner;

public class Question02_cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cube();
	}
	public static int cube() {
		System.out.println("Enter a number to calculate it's cube.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Num : ");
		int number= sc.nextInt();
		System.out.println(number*number*number);
		sc.close();
		return number*number*number;
		
	}

}
