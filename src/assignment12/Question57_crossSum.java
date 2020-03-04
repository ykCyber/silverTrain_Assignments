package assignment12;

public class Question57_crossSum {

	public static void main(String[] args) {
		int[][] arr = { { 100, 0, 0, 8 }, { 1, 5, 3, 3 }, //
				{ 1, 2, 3, 8 }, { 105, 2, 3, 28 } };
		checkCrossSum(arr);
	}

	public static void checkCrossSum(int[][] arr) {
		int k = arr.length;
		int j = 0;
		int toRightSum = 0;
		int toLeftSum = 0;
		for (int i = 0; i < arr.length; i++, k--, j++) {
			toRightSum = toRightSum + arr[i][j];
			toLeftSum = toLeftSum + arr[i][k - 1];
		}
		System.out.println("Diffrecence between right and left cross sum\n" + "Right - Left\n" + toRightSum + "-"
				+ toLeftSum + ":" + (toRightSum - toLeftSum));
	}

}
