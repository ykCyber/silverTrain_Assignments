package assignment_7_ForLoop.copy;

public class Question03_Pattern3 {
	public static void main(String[] args) {
		for (int j = 7; j > 0; j--) {
			for (int k = j; k < 7; k++)
				System.out.print(" ");
			for (int i = j; i > 0; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for (int j = 2; j < 7; j++) {
			for (int k = j; k < 7; k++)
				System.out.print(" ");
			for (int i = j; i > 0; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}