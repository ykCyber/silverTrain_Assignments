package assingmentLab2;

import java.util.Scanner;

public class Question04_FemaleMalePercantage {

	public static void main(String[] args) {
		calculateGenderPercantage();
	}

	public static void calculateGenderPercantage() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of males :");
		float males = sc.nextInt();
		System.out.print("Enter number of females :");
		float females = sc.nextInt();
		float ratioOfMales = (males / (males + females)) * 100;
		float ratioOfFemales = (females / (males + females)) * 100;
		System.out.println("Percentage of Males : %" +ratioOfMales);
		System.out.println("Percentage of Females : %" + ratioOfFemales);
		sc.close();
	}
}
