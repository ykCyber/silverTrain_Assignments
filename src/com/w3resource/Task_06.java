package com.w3resource;

public class Task_06 {

	public static void main(String[] args) {
		// Write a Java program to find the index of an array element.
		int[] arr = { 1, 5, 8, 10 };
		int index = contain(arr, 10);
		System.out.println(index);

	}

	private static int contain(int[] arr, int i) {
		int index = -1;
		for (int j = 0; j < arr.length; j++) {
			if (i == arr[j]) {
				index = j;
				break;
			}
		}
		if(index==-1) {
			System.out.println("Not found");
		}
		return index;
	}

}
