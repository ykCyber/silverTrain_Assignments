package com.w3resource;

import java.util.Arrays;

public class Task_07 {

	public static void main(String[] args) {
		// Write a Java program to remove a specific element from an array.
		int[] arr = { 1, 5, 8, 10, 5, 5, 20 };
		int[] newArr = remove(arr, 5);
		System.out.println(Arrays.toString(newArr));
	}

	private static int[] remove(int[] arr, int i) {
		int counter = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == i) {
				counter++;
			}
		}
		int newArr[] = new int[arr.length - counter];
		int k = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != i) {
				newArr[k] = arr[j];
				k++;
			}
		}
		
		return newArr;
	}

}
