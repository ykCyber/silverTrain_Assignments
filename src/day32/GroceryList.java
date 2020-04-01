package day32;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class GroceryList {
	static ArrayList<String> groceryList = new ArrayList<String>();

	public static void main(String[] args) {
		mainMenu();

	}

	public static void mainMenu() {
		System.out.println("Press");
		System.out.printf("%4d - To print choice options.\n", 0);
		System.out.printf("%4d - To print the list of grocery items.\n", 1);
		System.out.printf("%4d - To add an item the list.\n", 2);
		System.out.printf("%4d - To modify an item in the list.\n", 3);
		System.out.printf("%4d - To remove an item from the list.\n", 4);
		System.out.printf("%4d - To Search an item from the list.\n", 5);
		System.out.printf("%4d - To quit the application.\n", 6);
		reCall();
	}

	public static void getGroceryList() {
		LinkedHashSet<String> hashSet = new LinkedHashSet<>(groceryList);
		ArrayList<String> listWithoutDuplicates = new ArrayList<>(hashSet);
		System.out.println("You have " + groceryList.size() + " items in your list.");
		for (int i = 0; i < listWithoutDuplicates.size(); i++) {

			System.out.printf("%4d -%s   X%-3d\n", (i + 1), listWithoutDuplicates.get(i).toUpperCase(),
					Collections.frequency(groceryList, listWithoutDuplicates.get(i).toUpperCase()));
		}
	}

	public static void setGroceryList() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the grocery item. ");
		String item = sc.nextLine();
		groceryList.add(item.toUpperCase());

	}

	public static void application(int input) {
		switch (input) {
		case 0: {
			mainMenu();
			break;
		}
		case 1: {

			getGroceryList();
			reCall();
			break;
		}
		case 2: {
			setGroceryList();
			reCall();
			break;
		}
		case 3: {
			replaceGroceryList();//
			reCall();
			break;
		}
		case 4: {
			removeGroceryList();
			reCall();
			break;
		}
		case 5: {
			searchGroceryList();
			reCall();
			break;
		}
		case 6: {
			System.out.println("Have Nice Week Bye!" + " User closed the application.");
			break;
		}
		default:
			System.err.println("Enter a number between 0-6");
			reCall();

		}
	}

	public static void replaceGroceryList() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter item name or num: ");
		String userInput = sc.nextLine();
		System.out.print("Enter replacement item: ");
		String newItem = sc.nextLine();
		// if user input is integer
		if (Character.isDigit(userInput.charAt(0))) {
			int itemPosition = Integer.parseInt(userInput)-1;
			if(itemPosition>groceryList.size()) {
				System.out.println("Wrong Number");
				replaceGroceryList();
			}else
			replaceGroceryList((itemPosition), newItem);
		} else {
			int itemPosition = groceryList.indexOf(userInput);
			replaceGroceryList(itemPosition, newItem);
		}
	}

	public static void replaceGroceryList(int itemPosition, String newItem) {
		groceryList.set((itemPosition), newItem);
	}

	public static void replaceGroceryList(String itemName, String newItem) {
		replaceGroceryList(groceryList.indexOf((itemName)), newItem);
	}

	private static void searchGroceryList() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do I have ... in my list :");
		String searchItem = sc.nextLine();
		boolean flag = groceryList.contains(searchItem.toUpperCase());
		if (flag) {
			System.out.println("You have " + searchItem.toUpperCase() + " in your list.");
		} else {
			System.out.print("You don't have ");
			System.err.print(searchItem.toUpperCase());
			System.out.println(" in your list.");
			System.out.println("If you want to add " + searchItem.toUpperCase() + " to your list" + " press 9.");
			String addCheck = sc.next();
			if (addCheck.contentEquals("9")) {
				groceryList.add(searchItem);

			}
		}
	}

	public static void removeGroceryList() {
		Scanner sc = new Scanner(System.in);
		getGroceryList();
		System.out.print("Enter item num to remove from grocery list :");
		int itemRemove = sc.nextInt();
		if (itemRemove > groceryList.size()) {
			System.err.println("Enter a number smaller than " + (groceryList.size() + 1));
			removeGroceryList();
		}
		System.out.println("You removed " + groceryList.get(itemRemove - 1).toUpperCase() + " from your list.");
		groceryList.remove(itemRemove - 1);
	}

	public static void reCall() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice :");
		String input = sc.nextLine();
		// input=" "+input;
		if (input.length() == 0 || !Character.isDigit(input.charAt(0))) {
			System.err.println("Enter a number between 0-6");
			reCall();
		} else
			application(Integer.parseInt(input));
	}
}