package assignment05_IF_StatementsSwitchStatement;

import java.util.Scanner;

public class Question05_Age {

	public static void main(String[] args) {
//		less than 2, ineligible
//		2, toddler
//		3-5, early childhood
//		6-7, young reader
//		8-10, elementary
//		11 and 12, middle
//		13, impossible
//		14-16, high school
//		17-18, scholar
//		greater than 18, ineligible
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age :");
		int age = sc.nextInt();
		String status = null;
		if (age < 2) {
			status = "ineligible";

		} else if (age == 2) {
			status = "toddler";
		} else if (age > 2 & age < 6) {
			status = " early childhood";
		} else if (age > 5 & age < 8) {
			status = "young reader";
		} else if (age > 7 & age < 11) {
			status = "elementery";
		} else if (age > 10 & age < 13) {
			status = "middle";
		} else if (age == 13) {
			status = "impossible";
		} else if (age > 13 & age < 17) {
			status = "high school";
		} else if (age > 16 & age < 19) {
			System.out.println("scholar");
		} else if (age > 18) {
			status = "ineligible";
		}
		System.out.println("Age :"+age+"\n"+status);
		sc.close();
	}

}
