package assingmentLab2;

import java.util.Scanner;

public class Question05_CalculateTipTax {

	public static void main(String[] args) {
		calTaxTipCharge();
	}

	public static void calTaxTipCharge() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the charge for meal :");
		double charge = sc.nextInt();
		double tax = charge * 6.75 / 100d;
		double tip = (tax + charge) / 5;
		double totalBill = charge + tax + tip;
		System.out.println("Charge     : " + charge + "$");
		System.out.println("Tax        : " + tax + "$");
		System.out.println("Tip        : " + tip + "$");
		System.out.println("Total Bill : " + totalBill + "$");
		sc.close();

	}
}
