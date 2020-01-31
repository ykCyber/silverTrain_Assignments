package assignment06_ForLoop;

public class Question05_OddAndEven {

	public static void main(String[] args) {
		int i;
		for (i = 0; i <= 100; i++) {
			if (i % 2 == 0)
				System.out.print(i + ", ");
		}
		System.out.println();
		for (i = 0; i < 100; i++) {
			i=i%2==1?i:i+1;
			System.out.print(i + ", ");

		}
	}
}