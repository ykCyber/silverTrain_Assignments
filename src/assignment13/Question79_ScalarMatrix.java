package assignment13;

import java.util.Arrays;

public class Question79_ScalarMatrix{

	public static void main(String[] args) {
		int[][] matrix = { { 1, 1, 1 }, { 1, 1, 2 } };
		System.out.println(Arrays.deepToString(scalar(matrix, 5)));
	}
	public static int[][] scalar(int[][] matrix, int i) {
		for (int j = 0; j < matrix.length; j++) {
			for (int j2 = 0; j2 < matrix[j].length; j2++) {
				matrix[j][j2]=matrix[j][j2]*i;
			}
		}
		return matrix;
	}

}
