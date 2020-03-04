package assignment12;

import java.util.Arrays;

public class Question58_maxReplace {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 0, 8, 2, 5 };
		replaceWithMax(arr);
	}

	public static void replaceWithMax(int[] arr) {

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			max = Integer.max(arr[i], max);
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i]=max;
		}
		System.out.println(Arrays.toString(arr));
	}
}
