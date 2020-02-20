package assingmentLab2;

import java.util.Scanner;

public class IntegerSmall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter .first number..:");

		int number = sc.nextInt();
		int max = number;
		int min = number;

		String yesOrNo = "yes";
		for (; yesOrNo.equalsIgnoreCase("yes"); System.out.println("continue? (yes  / no)"), yesOrNo = scn.nextLine()) {

			System.out.print("Enter .next number..:");
			number = sc.nextInt();

			if (max < number) {
				max = number;
			}
			if (number < min) {
				min = number;
			}

		}

		System.out.println("Max number : " + max);
		System.out.println("Min number : " + min);
		sc.close();
		scn.close();
	}

}
