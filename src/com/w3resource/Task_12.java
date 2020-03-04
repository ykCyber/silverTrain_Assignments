package com.w3resource;

public class Task_12 {

	public static void main(String[] args) {
		// Find dublicates values of an array;
		int[] arr = { 1, 5, 8, 10, 5, 5, 20, 8 };
		findDubs(arr);

	}

	private static void findDubs(int[] arr) {
		int counter = 1;

		for (int j = 0; j < arr.length; j++) {
			for (int j2 = j + 1; j2 < arr.length; j2++) {
				if (arr[j] == arr[j2]) {
					counter++;
				}
			}
			System.out.println(arr[j] + " appears " + counter + " times.");
			counter = 1;
		}
	}
}
