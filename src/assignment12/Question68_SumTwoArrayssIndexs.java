package assignment12;

import java.util.Arrays;

public class Question68_SumTwoArrayssIndexs {

	public static void main(String[] args) {

		int arr1[] = { 1, 0, 0, 8, 2, 5 };
		int arr2[] = { 1, 5, 3, 3, 4, 5 };
		int arr3[] = addElements(arr1,arr2);
		System.out.println(Arrays.toString(arr3));
	}

	private static int[] addElements(int[] arr1, int[] arr2) {
		int arr3[] = new int[arr1.length];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i]=arr1[i]+arr2[i];
		}
		return arr3;
	}

}
