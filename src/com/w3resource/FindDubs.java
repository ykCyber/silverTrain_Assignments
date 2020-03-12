package com.w3resource;

public class FindDubs {

	public static void main(String[] args) {
		int arr[] = { 5, 5,0,1, 1, 5, 1, 5, 1 ,6,7,7,7};
		findDubs(arr);
	}

	private static void findDubs(int[] arr) {
		int counter = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					counter++;
					break;
				}
			}
		}
		System.out.println(arr.length-counter);

	}
}