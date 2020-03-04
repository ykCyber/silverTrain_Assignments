package assignment12;

import java.util.Arrays;

public class Question55_CheesBoard {

	public static void main(String[] args) {
		cheesBoard();
	}

	public static void cheesBoard() {
		String cheesBoard[][] = new String[8][8];
		for (int i = 0; i < cheesBoard.length; i++) {
			for (int j = 0; j < cheesBoard.length; j++) {
				cheesBoard[j][i] = "" + (j + 1) + (char) (i + 97);
			}
		}
		for (int i = 0; i < cheesBoard.length; i++) {

			System.out.println(Arrays.toString(cheesBoard[i]));
		}
	}

}
