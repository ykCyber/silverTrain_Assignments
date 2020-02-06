package assingmentLab2;

import java.util.Scanner;

public class Question01_LargeSmallNumber {

	public static void main(String[] args) {
		largeSmallnumberDefiner();	
	}
	public static int minFinder(int a,int b) {
		if(a<b) return a;
		else return b;
	}
	public static int maxFinder(int a,int b) {
		if(a>b) return a;
		else return b;
	}
	
	public static void largeSmallnumberDefiner() {
		Scanner sc = new Scanner(System.in);
		int yesOrNo = 1;
		System.out.print("Enter your first number :");
		int number = sc.nextInt();
		int smallNumber = number;
		int largeNumber = number;
		while (yesOrNo !=0) {
			System.out.print("Enter your next number :");
			 number = sc.nextInt();
			
			smallNumber = Integer.min(number, smallNumber);
			largeNumber = Integer.max(number, largeNumber);
			
			System.out.print("Do you want to enter another number: 0-No, 1-Yes");
			yesOrNo = sc.nextInt();} 
		
		System.out.println("Small Number :" + smallNumber);
		System.out.println("Large Number :" + largeNumber);
		sc.close();
	}
}