package assignment07_ForLoop;

public class Question04_Pattern4 {

	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j%2);
			}
			System.out.println();
		}
	}
}
