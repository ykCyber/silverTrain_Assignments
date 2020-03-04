package assignment12;

import java.util.Arrays;

public class Question56_left_shifted {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };
		modifiy(arr);
	}

	public static void modifiy(int[] arr) {
		int dummy;
		dummy = arr[arr.length - 1];
		arr[arr.length - 1] = arr[0];
		arr[0] = dummy;
		for (int i = 0; i < arr.length - 2; i++) {
			dummy = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = dummy;
		}
		System.out.println(Arrays.toString(arr));
	}

}
