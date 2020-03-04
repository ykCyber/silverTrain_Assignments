package assignment11;

import java.util.Arrays;

public class Question50_DoubleLenght {
	public static void main(String[] args) {
		int arr[]= {1,2,3,100};
		doubleLength(arr);
//		System.out.println(Arrays.toString(arr));
	}

	public static void doubleLength(int[] arr) {
		int newArr []= new int[arr.length*2];
		newArr[newArr.length -1]=arr[arr.length-1];
		System.out.println(Arrays.toString(newArr));
	}
}
