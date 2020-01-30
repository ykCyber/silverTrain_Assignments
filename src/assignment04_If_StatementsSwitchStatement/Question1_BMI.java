package assignment_4_If_StatementsSwitchStatement;

import java.util.Scanner;

class values {
	static int inch, feet, weight;
	static float bmi, cm, kg;
	static String risk = null;

	static void cal() {
		cm = feet * 30.5f + inch * 2.5f;
		kg = weight / 2.2f;
		bmi = 10000 * kg / (cm * cm);

		if (bmi >= 30) {
			risk = "Obese";
		} else if (bmi >= 25 && bmi < 30) {
			risk = "Overweight";
		} else if (bmi >= 18.5 && bmi < 25) {
			risk = "Normal Weight";
		} else if (bmi < 18.5) {
			risk = "Underweight";
		}
	}

	static void print() {
		System.out.println("Your weight in pounds :" + weight);
		System.out.println("Your height is :" + feet + " " + inch);
		System.out.println("Your BMI is :" + bmi);
		System.out.println("Your risk factor...: " + risk);
	}
}

public class Question1_BMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to BMI CALCULATOR");
		
		System.out.println("Please enter your WEIGHT in pounds...:");
		values.weight = sc.nextInt();

		System.out.println("Please enter your Height in Feet...:");
		values.feet = sc.nextInt();
		
		System.out.println("Please enter your Height in Inchs...:");
		values.inch = sc.nextInt();
		
		values.cal();
		values.print();
		sc.close();
	}
}
