package assignment06_ForLoop;

public class Question10_pattern5 {

	public static void main(String[] args) {
		for (int i = 1; i < 7; i++) {
			System.out.print("#"); // prints first#
			for (int j = 1; j < i; j++) {
				System.out.print(" ");// prints " "
			}
			System.out.print("#");
			System.out.println();
		}
	}

}
