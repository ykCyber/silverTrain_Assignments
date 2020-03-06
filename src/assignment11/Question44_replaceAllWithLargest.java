package assignment11;

import java.util.Arrays;

public class Question44_replaceAllWithLargest {

	public static void main(String[] args) {
		int[][] arr = {{ 4, 3, 2, 44, 1,  55 },{1,2},{5,10}};
		int [][]newArr =replaceAllWithLargest(arr);
		System.out.println(Arrays.deepToString(newArr));
	}

	public static int[][] replaceAllWithLargest(int[][] arr) {
		int [][]newArr =arr;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(max<arr[i][j])max=arr[i][j];
			}
					}
		for (int i = 0; i < newArr.length; i++) {
			for (int j = 0; j < newArr[i].length; j++) {
				newArr[i][j]=max;
			}
		}
		return newArr;
	}

}
