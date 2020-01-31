package src.assignment04_If_StatementsSwitchStatement;

import java.util.Scanner;

public class Question14_BookSeller {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("How many books did you buy?");
		int quantity = sc.nextInt();
		int points = 0;
		switch (quantity) {
		case 0:
			points=0;
			break;
		case 1:
			points=5;
			break;
		case 2:
			points=15;
			break;
		case 3:
			points=30;
			break;
		case 4:
			points=60;
			break;
		default:
			break;
		}
		System.out.println("You bought "+quantity+" books in this month.\nYou gained "+points+" points.");
		sc.close();
	}


	}


