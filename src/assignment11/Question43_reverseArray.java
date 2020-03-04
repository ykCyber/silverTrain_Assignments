package assignment11;

import java.util.Arrays;

public class Question43_reverseArray {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 44, 1, 100, 55 };
		reverse(arr);

	}

	public static void reverse(int[] arr) {
		int[] arrNew = new int[arr.length];
		int j = 0;
		for (int i = arr.length-1; i >-1 ; j++, i--) {
			arrNew[j] = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrNew));
	}

}
