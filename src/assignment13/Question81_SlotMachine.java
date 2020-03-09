package assignment13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Question81_SlotMachine {

	public static void main(String[] args) {
			play();
			
		}
	

	public static void play() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount of money you want to enter into the slot machine :");
		int moneyAmount = sc.nextInt();
		String[] objects = { "Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars" };
		Random rn = new Random();
		ArrayList<String> result = new ArrayList<>();
		for (int i = 0; i < 3; i++) {

			int number = rn.nextInt(6) + 0;
			switch (number) {
			case 0: {
				result.add(objects[0])  ;
				break;
			}
			case 1: {
				result.add(objects[1]);
				break;
			}
			case 2: {
				result.add(objects[2]);
				break;
			}
			case 3: {
				result.add(objects[3]);
				break;
			}
			case 4: {
				result.add(objects[4]);
				break;
			}

			case 5: {
				result.add(objects[5]);
				break;
			}
			}
		}
		System.out.println(result);
		if(Collections.frequency(result,result.get(0))==3) {
			System.out.println("You won :"+3*moneyAmount+"$");
		}
		else if(Collections.frequency(result,result.get(0))==2||Collections.frequency(result,result.get(1))==2) {
			System.out.println("You won :"+2*moneyAmount+"$");
		}
		else if(Collections.frequency(result,result.get(0))==1||Collections.frequency(result,result.get(1))==1) {
			System.err.println("No Match You won "+0*moneyAmount+"$");
		}
		playAgain();
	}

	public static void playAgain() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you wanna play again?(Yes/No)");
		String answer = sc.nextLine();
		if (answer.equalsIgnoreCase("Yes")) {
			play();
		}
		else if(answer.equalsIgnoreCase("No")) {
			System.out.println("See you later Thanks....");
		}
		else playAgain();
		
	}
}
