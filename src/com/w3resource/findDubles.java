package com.w3resource;

import java.util.Arrays;

public class findDubles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 5, 8, 10, 5, 5, 20, 8 };
		arrOnlyDubs(arr);
	}
	public static void arrOnlyDubs(int arr[]) {
		for (int j = 0; j < arr.length; j++) {
			
			findDubs(arr, arr[j]);
			System.out.println(Arrays.toString(findDubs(arr, arr[j])));
		}
		
	}
		public static int[] findDubs(int arr[], int i) {
	
		int counter = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == i) {
				counter++;
			}
		}

		int Dubs[] = new int[counter];
		int t = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == i) {
				Dubs[t] = i;
				t++;
			}
		}
		return Dubs;
	}
}
