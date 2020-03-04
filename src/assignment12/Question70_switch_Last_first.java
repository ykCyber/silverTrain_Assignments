package assignment12;

import java.util.Arrays;

public class Question70_switch_Last_first {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };
		switchLastFirst(arr);
	}

	public static void switchLastFirst(int[] arr) {
		int dummy;
		dummy = arr[arr.length - 1];
		arr[arr.length - 1] = arr[0];
		arr[0] = dummy;
	System.out.println(Arrays.toString(arr));
	}
	

}
