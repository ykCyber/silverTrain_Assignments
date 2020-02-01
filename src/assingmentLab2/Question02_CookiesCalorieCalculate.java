package assingmentLab2;

import java.util.Scanner;

public class Question02_CookiesCalorieCalculate {

	public static void main(String[] args) {
		cokkieCaloriCalculater();
	}

	public static void cokkieCaloriCalculater() {
		System.out.print("Enter number of cookies to calculate calories : ");
		Scanner sc = new Scanner(System.in);
		int quantitiy = sc.nextInt();
		int caloriOfcookies = quantitiy * 30;
		System.out.println("Total calories of " + quantitiy + " cookies : " + caloriOfcookies + "cal");
		sc.close();
	}
}