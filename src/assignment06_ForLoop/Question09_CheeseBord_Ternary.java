package assignment06_ForLoop;

public class Question09_CheeseBord_Ternary {

	public static void main(String[] args) {
		char c = 'W';
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				c = j % 2 == 1 ^ i % 2 == 1 ? 'W' : 'B';
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}