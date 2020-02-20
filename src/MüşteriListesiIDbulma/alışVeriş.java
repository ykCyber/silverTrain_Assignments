package MüþteriListesiIDbulma;

import java.util.ArrayList;
import java.util.Scanner;

public class alýþVeriþ {
	static ArrayList<String> groceryList = new ArrayList<String>();

	public static void main(String[] args) {
		mainBody();
	}

	public static void mainBody() {
		System.out.println("Press");
		System.out.printf("%4d - To print choice options.\n", 0);
		System.out.printf("%4d - To print the list of grocery items.\n", 1);
		System.out.printf("%4d - To add an item the list.\n", 2);
		System.out.printf("%4d - To modify an item in the list.\n", 3);
		System.out.printf("%4d - To remove an item from the list.\n", 4);
		System.out.printf("%4d - To Search an item from the list.\n", 5);
		System.out.printf("%4d - To quit the application.\n", 6);
		enterSelection();
	}

	public static void enterSelection() {
		
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your choice :");
			int input = sc.nextInt();
			ApplicationMain(input);		
	}

	public static void ApplicationMain(int input) {
		switch (input) {
		case 0: {
			
			yield type;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
	}
}
