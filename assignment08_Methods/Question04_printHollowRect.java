package assignment08_Methods;

public class Question04_printHollowRect {

	public static void main(String[] args) {
		printHollowRect(15);
	}
	public static void printHollowRect(int rows) {
		
		for (int j = 1; j <= rows; j++) {

			if (j == 1 || j == rows) {
				for (int i = 1; i <= rows; i++) {
					System.out.print("* ");
				}
				System.out.println();
			} else {
				for (int i = 1; i <= rows; i++) {
					if (i == 1 || i == rows) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
		
	}
}
