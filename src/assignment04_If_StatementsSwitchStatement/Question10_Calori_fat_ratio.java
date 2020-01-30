package assignment_4_If_StatementsSwitchStatement;

import java.util.Scanner;

public class Question10_Calori_fat_ratio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Total Calories :");
		float tc = sc.nextFloat();
		System.out.println("Enter Fat Grams :");
		float fatgram = sc.nextFloat();
		float fatcal = fatgram * 9;

		float fatratio = (fatcal) / (tc);// The percentage of calories from fat

		if (fatratio < 0.30) {
			System.out.print("Food is low in fat.");
		} else if (fatratio >= 0.3 & fatratio <= 1) {
			System.out.print("Food is high in fat.");
		}
		if (fatratio > 1) {
			System.out.println("Invalid input: Total Cal: (" + tc + ") smaller than fat calories : (" + fatcal + ")");
		}
		System.out.println(fatratio * 100 + "% Fat Ratio");
		sc.close();
	}
}
