package assingmentLab2;

import java.util.Scanner;

public class Question03_SumToNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumToNum();
	}

	public static void sumToNum() {
		System.out.print("Enter number to sum all numbers from 1 to your number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result=0;
		for (int i = 1; i <= num; i++) {
			
			result = result + i;
		}
		System.out.print(result);
		sc.close();
	}

}
