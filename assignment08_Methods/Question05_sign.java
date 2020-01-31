package assignment08_Methods;

import java.util.Scanner;

public class Question05_sign {

	public static void main(String[] args) {
		sign();
	}

	public static int sign() {
		System.out.println("Enter a number check it's sign.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int sign = sc.nextInt();

		 sign = sign == 0 ? 0 : sign > 0 ? 1 : -1;
		 System.out.println(sign);
		 sc.close();
		 return sign;
	}

}
