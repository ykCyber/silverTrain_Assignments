package assignment12;

import java.util.Arrays;

public class Question59_ {

	public static void main(String[] args) {
		int[] arr = { 8, 2, 3 };
		int arr2[] = { 4, 5, 6 };
		mergeTwo(arr, arr2);
	}

	public static void mergeTwo(int[] arr, int[] arr2) {
	
		int arr3[] = new int[arr.length+arr2.length];
	 for (int i = 0; i < arr.length; i++) {
		arr3[i]=arr[i];
	}
	 for (int i =0; i < arr2.length; i++) {
		 arr3[i+arr.length]=arr2[i];
	 }
	 System.out.println(Arrays.toString(arr3));
	}

}
