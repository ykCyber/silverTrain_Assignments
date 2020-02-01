package assingmentLab2;

import java.util.Scanner;

public class IntegerSmall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter .first number..:");

		int yenisayý = sc.nextInt();
		int max = yenisayý;
		int min = yenisayý;
		
		String yesOrNo="yes";
		for (; yesOrNo.equalsIgnoreCase("yes"); System.out.println("go nogo yes  / no"), yesOrNo = scn.nextLine()) {

			System.out.print("Enter .next number..:");
			yenisayý = sc.nextInt();

			if (max < yenisayý) {
				max = yenisayý;
			}
			if (yenisayý < min) {
				min = yenisayý;
			}

		}

		System.out.println("Max number : " + max);
		System.out.println("Min number : " + min);
		sc.close();
	}

}
