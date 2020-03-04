package assignment11;

import java.util.Arrays;

public class Question49FirstTwo {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 0, 7, 3, 2, 7, 1 };
		firstTwo(arr);
	}

	public static void firstTwo(int[] arr) {
		int newArr[]=  new int [2];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i]=arr[i];
		}
		System.out.println(Arrays.toString(newArr));
	}

}
