package assignment09;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		// tipCalculator which accepts parameters:
		tipCalculator();
	}

	public static void tipCalculator() {
		boolean isSplit = false;
		int numberPeople;
		double checkAmount;
		String serviceQuality;
		String split;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.print("Is Split (YES\\NO)?");
			 split = sc.nextLine();

			if (split.equalsIgnoreCase("yes")) {
				isSplit = true;
				flag = false;
				break;
			}
			if (split.equalsIgnoreCase("no")) {
				isSplit = false;
				flag = false;
				break;
			}
		} while (flag);
		System.out.print("Enter number of people : ");
		numberPeople = sc.nextInt();
		System.out.print("Enter amount of check : ");
		checkAmount = sc.nextDouble();
		boolean flag2 = true;
		double tipPercent = 0;
		do {
			System.out.print("How was service quality ?\r\n" + "Poor \r\n" + "Fair \r\n" + "Good  \r\n" + "Great \r\n"
					+ "Excellent\r\n");
			serviceQuality = sc.nextLine();
			if (serviceQuality.equalsIgnoreCase("poor")) {
				flag2 = false;
				tipPercent = 0.05;
				break;
			}
			if (serviceQuality.equalsIgnoreCase("fair")) {
				flag2 = false;
				tipPercent = 0.1;
				break;
			}
			if (serviceQuality.equalsIgnoreCase("good")) {
				flag2 = false;
				tipPercent = 0.15;
				break;
			}
			if (serviceQuality.equalsIgnoreCase("great")) {
				flag2 = false;
				tipPercent = 0.2;
				break;
			}
			if (serviceQuality.equalsIgnoreCase("excellent")) {
				flag2 = false;
				tipPercent = 0.25;
				break;
			} else {
				System.out.println("re enter service");
			}
		} while (flag2);
		double totalToPay = checkAmount+checkAmount*tipPercent;
		System.out.println("Split              : "+split.toUpperCase());
		System.out.println("Service qualtiy    : "+serviceQuality.toUpperCase());
		System.out.println("Number of people   : "+numberPeople);
		System.out.println("Total to pay       : "+totalToPay);
		System.out.println("Total tip          : "+tipPercent*checkAmount);
		System.out.println("Total per person   : "+totalToPay/numberPeople);
		System.out.println("Tip per person     : "+tipPercent*checkAmount/numberPeople);
		
	}

}
