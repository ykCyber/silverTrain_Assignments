package assingmentLab2;

import java.util.Scanner;

public class IntegerSmall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter .first number..:");

		int yenisay� = sc.nextInt();
		int max = yenisay�;
		int min = yenisay�;
		
		String yesOrNo="yes";
		for (; yesOrNo.equalsIgnoreCase("yes"); System.out.println("go nogo yes  / no"), yesOrNo = scn.nextLine()) {

			System.out.print("Enter .next number..:");
			yenisay� = sc.nextInt();

			if (max < yenisay�) {
				max = yenisay�;
			}
			if (yenisay� < min) {
				min = yenisay�;
			}

		}

		System.out.println("Max number : " + max);
		System.out.println("Min number : " + min);
		sc.close();
	}

}
