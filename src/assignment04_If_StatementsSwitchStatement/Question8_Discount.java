package assignment04_If_StatementsSwitchStatement;

import java.util.Scanner;

public class Question8_Discount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantity :");
		int Q = sc.nextInt();
		int amount = Q * 99;// raw price
		System.out.println("Price      "+"$:"+amount);
		double discount = 0;
		if (Q >= 10 && Q <= 19) {
			discount = amount * 0.2d;
		} else if (Q >= 20 && Q <= 49) {
			discount = amount * 0.3d;
		} else if (Q >= 50 && Q <= 99) {
			discount = amount * 0.4d;
		} else if (Q >= 100) {
			discount = amount * 0.5d;
		} else {
			discount = 0;
			System.out.println(" Sorry!! No Discount. If you buy " + (10 - Q) + " more items you : You Gain 20% Discount!!");
		} 
		System.out.println("Quantitiy  :"+Q);
		System.out.println("Discount   :$"+" -"+discount);
		System.out.println("Total     :$"+(amount-discount));
		sc.close();
	}
}