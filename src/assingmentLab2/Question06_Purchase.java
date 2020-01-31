package assingmentLab2;

import java.util.Scanner;

public class Question06_Purchase {

	public static void main(String[] args) {
		purchase();
	}

	public static void purchase() {
		System.out.print("Enter the amount $ : ");
		Scanner sc = new Scanner(System.in);
		double purchase = sc.nextInt();
		double countyTax = purchase * 2 / 100;
		double stateTax = purchase * 4 / 100;
		double totalBill = purchase + countyTax + stateTax;
		System.out.println("Count tax  : " + countyTax+"$");
		System.out.println("State tax  : " + stateTax+"$");
		System.out.println("Total Bill : " + totalBill+"$");
		sc.close();
	}
}
