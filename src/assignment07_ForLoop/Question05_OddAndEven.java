package assignment07_ForLoop;

public class Question05_OddAndEven {

	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7 - i; j++) {
				System.out.print(1);
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}

			System.out.println();
		}

	}
}